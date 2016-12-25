package com.pihui.nbsp.parser.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.pihui.nbsp.booleanExprs.BooleanExprAnd;
import com.pihui.nbsp.booleanExprs.BooleanExprEq;
import com.pihui.nbsp.booleanExprs.BooleanExprOr;
import com.pihui.nbsp.booleanExprs.IBooleanExpr;
import com.pihui.nbsp.operands.AliasOprand;
import com.pihui.nbsp.operands.LimitOprand;
import com.pihui.nbsp.operands.NameOprand;
import com.pihui.nbsp.operands.Oprand;
import com.pihui.nbsp.operands.OrderByOprand;
import com.pihui.nbsp.operands.binary.AddOprand;
import com.pihui.nbsp.operands.binary.DividOprand;
import com.pihui.nbsp.operands.binary.MinusOprand;
import com.pihui.nbsp.operands.binary.MultiplyOprand;
import com.pihui.nbsp.operands.binary.QuotientOprand;
import com.pihui.nbsp.operands.primitive.FloatPrimitiveOprand;
import com.pihui.nbsp.operands.primitive.IntPrimitiveOprand;
import com.pihui.nbsp.operands.primitive.StringPrimitiveOprand;
import com.pihui.nbsp.parser.Query;
import com.pihui.nbsp.parser.SQLQuery;
import com.pihui.nbsp.parser.SQLQuery.ArgumentContext;
import com.pihui.nbsp.parser.SQLQuery.Argument_listContext;
import com.pihui.nbsp.parser.SQLQuery.FilterCluasterContext;
import com.pihui.nbsp.parser.SQLQuery.NameContext;
import com.pihui.nbsp.parser.SQLQueryVisitor;
import com.pihui.nbsp.parser.function.FuncationManager;

public class SQLQueryVisitorImpl implements SQLQueryVisitor<Boolean> {
    private Stack<Object> stack;
    private Query query;
    private Query.QueryBuilder builder;
    private TableRef defaultTableName;
    public static class TableRef{
        private String tableName;
        private String alias;
        public TableRef(String tableName,String alias){
            this.tableName = tableName;
            this.alias = alias;
        }
    }
    public Query getQuery() {
        return this.query;
    }

    public SQLQueryVisitorImpl() {
        this.stack = new Stack();
        this.builder = Query.builder();
    }

    public Boolean visit(ParseTree parseTree) {
        if (((parseTree instanceof SQLQuery.ProgContext)) && (visitProg((SQLQuery.ProgContext) parseTree))) {
            this.query = this.builder.build();
            return true;
        }
        return false;
    }

    public Boolean visitChildren(RuleNode arg0) {
        return null;
    }

    public Boolean visitErrorNode(ErrorNode arg0) {
        return false;
    }

    public Boolean visitTerminal(TerminalNode arg0) {
        return null;
    }

    public Boolean visitProg(SQLQuery.ProgContext ctx) {
        if (ctx.tableRef() != null) {
            if (!visitTableRef(ctx.tableRef())) {
                return false;
            }
            TableRef tableRef = (TableRef)this.stack.pop();
            this.builder.table(String.valueOf(tableRef.tableName));
        }
        if (ctx.columList() != null) {
            if (!visitColumList(ctx.columList())) {
                return false;
            }
            this.builder.columns((List) this.stack.pop());
        }
        if (ctx.whereCluaster() != null) {
            if (!visitWhereCluaster(ctx.whereCluaster())) {
                return false;
            }
            this.builder.whereClause((IBooleanExpr) this.stack.pop());
        }
        if (ctx.filterCluaster() != null) {
            if (!visitFilterCluaster(ctx.filterCluaster())) {
                return false;
            }
            this.builder.filterClause((IBooleanExpr) this.stack.pop());
        }
        if (ctx.groupCluaster() != null) {
            if (!visitGroupCluaster(ctx.groupCluaster())) {
                return false;
            }
            this.builder.groupBys((List) this.stack.pop());
        }
        if (ctx.orderCluaster() != null) {
            if (!visitOrderCluaster(ctx.orderCluaster())) {
                return false;
            }
            this.builder.orderBy((List) this.stack.pop());
        }
        if (ctx.limitCluaster() != null) {
            if (!visitLimitCluaster(ctx.limitCluaster())) {
                return false;
            }
            this.builder.limit((LimitOprand) this.stack.pop());
        }
        return true;
    }

    public Boolean visitColumList(SQLQuery.ColumListContext ctx) {
        List<Oprand> oprands = new ArrayList();
        List<SQLQuery.NameOprandContext> list = ctx.nameOprand();
        for (SQLQuery.NameOprandContext nameOprandContext : list) {
            if (!visitNameOprand(nameOprandContext)) {
                return false;
            }
            Oprand oprand = (Oprand) this.stack.pop();
            oprands.add(oprand);
        }
        this.stack.push(oprands);
        return true;
    }

    public Boolean visitNameOprand(SQLQuery.NameOprandContext ctx) {
        //this.stack.push(this.defaultTableName);
        if (ctx.tableName != null) {
            String tableName = ctx.tableName.getText();
            String alais = ctx.alias.getText();
            this.defaultTableName = new TableRef(tableName, alais);
        }
        //System.out.println(ctx.getText());
        //System.out.println(ctx.alias.getText());
        if (visitName(ctx.columnName,ctx.alias)) {
            Oprand inOprand = (Oprand) this.stack.pop();
            //this.defaultTableName = (TableRef)this.stack.pop();
            //if (ctx.alias != null) {
            //    this.stack.push(new AliasOprand(inOprand, ctx.alias.getText()));
            //} else {
                this.stack.push(inOprand);
            //}
            return true;
        }
        return false;
    }

    public Boolean visitTableRef(SQLQuery.TableRefContext ctx) {
        String alias = ctx.alias!=null?ctx.alias.getText():null;
        
        String tableName = ctx.tableName.getText();
        //TODO 记录table的alias
        this.defaultTableName = new TableRef(tableName, alias);
        this.stack.push(this.defaultTableName);
        return true;
    }

    public Boolean visitWhereCluaster(SQLQuery.WhereCluasterContext ctx) {

        SQLQuery.BoolExprContext boolExpr = ctx.boolExpr();
        if (boolExpr != null) {
            return visitBoolExpr(ctx.boolExpr());
        }
        this.stack.push(null);
        return true;
    }

    public Boolean visitBoolExpr(SQLQuery.BoolExprContext ctx) {
        if ((ctx instanceof SQLQuery.LrExprContext)) {
            return visitLrExpr((SQLQuery.LrExprContext) ctx);
        }
        if ((ctx instanceof SQLQuery.EqOprContext)) {
            return visitEqOpr((SQLQuery.EqOprContext) ctx);
        }
        if ((ctx instanceof SQLQuery.AndOprContext)) {
            return visitAndOpr((SQLQuery.AndOprContext) ctx);
        }
        if ((ctx instanceof SQLQuery.OrOprContext)) {
            return visitOrOpr((SQLQuery.OrOprContext) ctx);
        }
        if ((ctx instanceof SQLQuery.NameOprContext)) {
            return visitNameOpr((SQLQuery.NameOprContext) ctx);
        }
        return false;
    }

    public Boolean visitLrExpr(SQLQuery.LrExprContext ctx) {
        return visitBoolExpr(ctx.boolExpr());
    }

    public Boolean visitEqOpr(SQLQuery.EqOprContext ctx) {
        if (visitBoolExpr(ctx.left)) {
            Oprand left = (Oprand) this.stack.pop();
            if (visitBoolExpr(ctx.right)) {
                Oprand right = (Oprand) this.stack.pop();
                this.stack.push(new BooleanExprEq(left, right));
                return true;
            }
        }
        return false;
    }

    public Boolean visitAndOpr(SQLQuery.AndOprContext ctx) {
        if (visitBoolExpr(ctx.left)) {
            IBooleanExpr left = (IBooleanExpr) this.stack.pop();
            if (visitBoolExpr(ctx.right)) {
                IBooleanExpr right = (IBooleanExpr) this.stack.pop();
                this.stack.push(new BooleanExprAnd(left, right));
                return true;
            }
        }
        return false;
    }

    public Boolean visitOrOpr(SQLQuery.OrOprContext ctx) {
        if (visitBoolExpr(ctx.left)) {
            IBooleanExpr left = (IBooleanExpr) this.stack.pop();
            if (visitBoolExpr(ctx.right)) {
                IBooleanExpr right = (IBooleanExpr) this.stack.pop();
                this.stack.push(new BooleanExprOr(left, right));
                return true;
            }
        }
        return false;
    }

    public Boolean visitNameOpr(SQLQuery.NameOprContext ctx) {
        return visitName(ctx.name(),null);
    }

    public Boolean visitGroupCluaster(SQLQuery.GroupCluasterContext ctx) {
        List<Oprand> groupBys = new ArrayList();
        List<SQLQuery.NameContext> names = ctx.name();
        for (SQLQuery.NameContext name : names) {
            if (!visitName(name,null)) {
                return false;
            }
            Oprand inOprand = (Oprand) this.stack.pop();
            groupBys.add(inOprand);
        }
        this.stack.push(groupBys);
        return true;
    }

    public Boolean visitOrderCluaster(SQLQuery.OrderCluasterContext ctx) {
        List<OrderByOprand> orderbys = new ArrayList();
        List<SQLQuery.OrderContext> orders = ctx.order();
        for (SQLQuery.OrderContext orderContext : orders) {
            if (!visitOrder(orderContext)) {
                return false;
            }
            OrderByOprand inOprand = (OrderByOprand) this.stack.pop();
            orderbys.add(inOprand);
        }
        this.stack.push(orderbys);
        return true;
    }

    public Boolean visitOrder(SQLQuery.OrderContext ctx) {
        boolean isDesc = false;
        if (ctx.type != null) {
            isDesc = ctx.type.getType() == 72;
        }
        if (visitName(ctx.name(),null)) {
            this.stack.push(new OrderByOprand((Oprand) this.stack.pop(), isDesc));
            return true;
        }
        return false;
    }

    public Boolean visitLimitCluaster(SQLQuery.LimitCluasterContext ctx) {
        int offset = 0;
        int resultCount = Integer.valueOf(ctx.resultCount.getText()).intValue();
        if (ctx.offset != null) {
            offset = Integer.valueOf(ctx.offset.getText()).intValue();
        }
        this.stack.push(new LimitOprand(offset, resultCount));
        return true;
    }

    public Boolean visitName(SQLQuery.NameContext ctx,Token alias) {
        
        if ((ctx instanceof SQLQuery.LRNameContext)) {
            return visitLRName((SQLQuery.LRNameContext) ctx);
        }
        if ((ctx instanceof SQLQuery.MulNameContext)) {
            return visitMulName((SQLQuery.MulNameContext) ctx);
        }
        if ((ctx instanceof SQLQuery.AddNameContext)) {
            return visitAddName((SQLQuery.AddNameContext) ctx);
        }
        if ((ctx instanceof SQLQuery.AggregationNameContext)) {
            if(alias!=null)
            return visitAggregationName((SQLQuery.AggregationNameContext) ctx,alias.getText());
            else
                return visitAggregationName((SQLQuery.AggregationNameContext) ctx);
        }
        if ((ctx instanceof SQLQuery.ColumnNameContext)) {
            return visitColumnName((SQLQuery.ColumnNameContext) ctx,alias==null?null:alias.getText());
        }
        return false;
    }

    public Boolean visitLRName(SQLQuery.LRNameContext ctx) {
        return visitName(ctx.name(),null);
    }

    public Boolean visitMulName(SQLQuery.MulNameContext ctx) {
        if (visitName(ctx.left,null)) {
            Oprand left = (Oprand) this.stack.pop();
            if (visitName(ctx.right,null)) {
                Oprand right = (Oprand) this.stack.pop();
                int type = ctx.op.getType();
                switch (type) {
                    case 124:
                        this.stack.push(new MultiplyOprand(left, right));
                        return true;
                    case 125:
                        this.stack.push(new DividOprand(left, right));
                        return true;
                    case 135:
                        this.stack.push(new QuotientOprand(left, right));
                        return true;
                }
            }
        }
        return false;
    }

    public Boolean visitAddName(SQLQuery.AddNameContext ctx) {
        if (visitName(ctx.left,null)) {
            Oprand left = (Oprand) this.stack.pop();
            if (visitName(ctx.right,null)) {
                Oprand right = (Oprand) this.stack.pop();
                int type = ctx.op.getType();
                switch (type) {
                    case 122:
                        this.stack.push(new AddOprand(left, right));
                        return true;
                    case 123:
                        this.stack.push(new MinusOprand(left, right));
                        return true;
                }
            }
        }
        return false;
    }

    public Boolean visitColumnName(SQLQuery.ColumnNameContext ctx) {
        SQLQuery.IdentityContext identity = ctx.identity().get(0);
        return visitIdentify(identity);
    }
    public Boolean visitColumnName(SQLQuery.ColumnNameContext ctx,String alias) {
        SQLQuery.IdentityContext identity = ctx.identity().get(0);
        return visitIdentify(identity,alias);
    }

    private boolean visitIdentify(SQLQuery.IdentityContext identity,String alias) {
        if ((identity instanceof SQLQuery.IdEleContext)) {
            
            return visitIdEle((SQLQuery.IdEleContext) identity,alias);
        }
        if ((identity instanceof SQLQuery.IntEleContext)) {
            return visitIntEle((SQLQuery.IntEleContext) identity,alias);
        }
        if ((identity instanceof SQLQuery.FloatEleContext)) {
            return visitFloatEle((SQLQuery.FloatEleContext) identity,alias);
        }
        if ((identity instanceof SQLQuery.StringEleContext)) {
            return visitStringEle((SQLQuery.StringEleContext) identity,alias);
        }
        return false;
    }
    private boolean visitIdentify(SQLQuery.IdentityContext identity) {
        if ((identity instanceof SQLQuery.IdEleContext)) {
            
            return visitIdEle((SQLQuery.IdEleContext) identity,null);
        }
        if ((identity instanceof SQLQuery.IntEleContext)) {
            return visitIntEle((SQLQuery.IntEleContext) identity,null);
        }
        if ((identity instanceof SQLQuery.FloatEleContext)) {
            return visitFloatEle((SQLQuery.FloatEleContext) identity,null);
        }
        if ((identity instanceof SQLQuery.StringEleContext)) {
            return visitStringEle((SQLQuery.StringEleContext) identity,null);
        }
        return false;
    }
    public Boolean visitIdEle(SQLQuery.IdEleContext ctx) {
        //System.out.println(ctx.getText());
        String columnName=ctx.ID().getText();
        this.stack.push(new NameOprand(this.defaultTableName.tableName, columnName));
        if(!columnName.equals(this.defaultTableName.tableName)&&!columnName.equals(this.defaultTableName.alias)){
          // 移除tablename和tablealias
            this.builder.addSelectedColumnNameList(columnName);
        }
        return true;
    }
    public Boolean visitIdEle(SQLQuery.IdEleContext ctx,String alias) {
        //System.out.println(ctx.getText());
        String columnName=ctx.ID().getText();
        this.stack.push(new NameOprand(this.defaultTableName.tableName, columnName));
        if(!columnName.equals(this.defaultTableName.tableName)&&!columnName.equals(this.defaultTableName.alias)){
          // 移除tablename和tablealias
            this.builder.addSelectedColumnNameList(columnName);
        }
        return true;
    }

    public Boolean visitIntEle(SQLQuery.IntEleContext ctx,String alias) {
        this.stack.push(new IntPrimitiveOprand(ctx.getText(),alias));
        return true;
    }
    public Boolean visitIntEle(SQLQuery.IntEleContext ctx) {
        this.stack.push(new IntPrimitiveOprand(ctx.getText(),null));
        return true;
    }

    public Boolean visitFloatEle(SQLQuery.FloatEleContext ctx,String alias) {
        this.stack.push(new FloatPrimitiveOprand(ctx.getText(),alias));
        return true;
    }
    public Boolean visitFloatEle(SQLQuery.FloatEleContext ctx) {
        this.stack.push(new FloatPrimitiveOprand(ctx.getText(),null));
        return true;
    }

    public Boolean visitStringEle(SQLQuery.StringEleContext ctx,String alias) {
        String str = ctx.STRING().getText();
        this.stack.push(new StringPrimitiveOprand(str.substring(1, str.length() - 1),alias));
        return true;
    }
    public Boolean visitStringEle(SQLQuery.StringEleContext ctx) {
        String str = ctx.STRING().getText();
        this.stack.push(new StringPrimitiveOprand(str.substring(1, str.length() - 1),null));
        return true;
    }
    public Boolean visitAggregationName(SQLQuery.AggregationNameContext ctx) {

        // SQLQuery.AggregationNameContext aggregation = ctx;
        // if (visitName(aggregation.ID()))
        // {
        // String aggFun = aggregation.ID().getText();
        //
        // Oprand inOprand = (Oprand)this.stack.pop();
        //
        // Oprand aggregationOprand =
        // (Oprand)FuncationManager.getFuncation(aggFun).call(new Object[] {
        // inOprand });
        //
        // this.stack.push(aggregationOprand);
        // return true;
        // }

        List<Oprand> oprands = new ArrayList();
        Argument_listContext argsContext = ctx.argument_list();
        for (SQLQuery.ArgumentContext nameOprandContext : argsContext.argument()) {
            if (!visitArgument(nameOprandContext)) {
                return false;
            }
            Oprand oprand = (Oprand) this.stack.pop();
            oprands.add(oprand);
        }

        this.stack.push(oprands);
        SQLQuery.AggregationNameContext aggregation = ctx;
        String aggFun = aggregation.ID().getText();
        List<Oprand> inOprand = (List<Oprand>) this.stack.pop();

        Oprand aggregationOprand = (Oprand) FuncationManager.getFuncation(aggFun).call(new Object[] { inOprand });

        this.stack.push(aggregationOprand);
        return true;
    }
    public Boolean visitAggregationName(SQLQuery.AggregationNameContext ctx,String alias) {

        // SQLQuery.AggregationNameContext aggregation = ctx;
        // if (visitName(aggregation.ID()))
        // {
        // String aggFun = aggregation.ID().getText();
        //
        // Oprand inOprand = (Oprand)this.stack.pop();
        //
        // Oprand aggregationOprand =
        // (Oprand)FuncationManager.getFuncation(aggFun).call(new Object[] {
        // inOprand });
        //
        // this.stack.push(aggregationOprand);
        // return true;
        // }

        List<Oprand> oprands = new ArrayList();
        Argument_listContext argsContext = ctx.argument_list();
        for (SQLQuery.ArgumentContext nameOprandContext : argsContext.argument()) {
            if (!visitArgument(nameOprandContext)) {
                return false;
            }
            Oprand oprand = (Oprand) this.stack.pop();
            oprands.add(oprand);
        }

        this.stack.push(oprands);
        SQLQuery.AggregationNameContext aggregation = ctx;
        String aggFun = aggregation.ID().getText();
        List<Oprand> inOprand = (List<Oprand>) this.stack.pop();

        Oprand aggregationOprand = (Oprand) FuncationManager.getFuncation(aggFun).call(new Object[] { inOprand,alias });

        this.stack.push(aggregationOprand);
        return true;
    }

    @Override
    public Boolean visitArgument_list(Argument_listContext ctx) {
        List<Oprand> oprands = new ArrayList();
        List<ArgumentContext> list = ctx.argument();
        if (list != null && list.isEmpty())
            for (ArgumentContext arg : list) {
                if (!visitArgument(arg)) {
                    return false;
                }
                Oprand oprand = (Oprand) this.stack.pop();
                oprands.add(oprand);
            }
        return true;
    }

    /**
     * identity will match like [test(111),ttt,111] name wile match like
     * [t1.ttt]
     */
    @Override
    public Boolean visitArgument(ArgumentContext ctx) {
        if (ctx.name() != null) {// 处理函数调用的表达式和库名点表名的情况
            if (".".equals(ctx.name().getChild(1).getText())) {// 库名点表名的情况
                return visitName(ctx.name(),null);
            } else if ("(".equals(ctx.name().getChild(1).getText())) {// 处理函数调用的表达式
                return dealWithFunctionInveke(ctx.name());
            }
        } else if (ctx.identity() != null) {// 处理常量和不带点的简单变量名
            return visitIdentify(ctx.identity());
        }
        return false;
        // 计算argument的值
    }

    private Boolean dealWithFunctionInveke(NameContext name) {
        String functionName = name.getChild(0).getText();
        Argument_listContext argsContext = (Argument_listContext) name.getChild(2);
        List<Oprand> oprands = new ArrayList();
        if (argsContext != null && !argsContext.isEmpty()) {

            for (SQLQuery.ArgumentContext nameOprandContext : argsContext.argument()) {
                if (!visitArgument(nameOprandContext)) {
                    return false;
                }
                Oprand oprand = (Oprand) this.stack.pop();
                oprands.add(oprand);

            }
        }
        this.stack.push(oprands);
        String aggFun = functionName;
        Oprand aggregationOprand = (Oprand) FuncationManager.getFuncation(aggFun).call(new Object[] { oprands });
        this.stack.push(aggregationOprand);
        return true;
    }

    @Override
    public Boolean visitFilterCluaster(FilterCluasterContext ctx) {
        SQLQuery.BoolExprContext boolExpr = ctx.boolExpr();
        if (boolExpr != null) {
            return visitBoolExpr(ctx.boolExpr());
        }
        this.stack.push(null);
        return true;
    }
}
