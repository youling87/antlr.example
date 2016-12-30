package com.lingdu.parser;// Generated from DruidQuery.g4 by ANTLR 4.5.1

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.lingdu.parser.SQLQuery.TableRefContext;
import com.lingdu.parser.SQLQuery.WhereCluasterContext;

/**
 * This class provides an empty implementation of {@link SQLQueryListener},
 * which can be extended to create a listener which only needs to handle a
 * subset of the available methods.
 */
public class SQLQueryBaseListener implements SQLQueryListener {
    public SQLQueryBaseListener(SQLQuery parser) {
        // TODO Auto-generated constructor stub
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterProg(SQLQuery.ProgContext ctx) {
        System.out.println(ctx);
        ctx.getParent();
        List<Object> dataList = getData(ctx.whereCluaster(), ctx.tableRef());
    }

    private List<Object> getData(WhereCluasterContext whereCluaster, TableRefContext tableRef) {
        // TODO
        return null;
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitProg(SQLQuery.ProgContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterColumList(SQLQuery.ColumListContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitColumList(SQLQuery.ColumListContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterNameOprand(SQLQuery.NameOprandContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitNameOprand(SQLQuery.NameOprandContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterMulName(SQLQuery.MulNameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitMulName(SQLQuery.MulNameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterAggregationName(SQLQuery.AggregationNameContext ctx) {
    System.out.println();
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitAggregationName(SQLQuery.AggregationNameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterAddName(SQLQuery.AddNameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitAddName(SQLQuery.AddNameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterLRName(SQLQuery.LRNameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitLRName(SQLQuery.LRNameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterColumnName(SQLQuery.ColumnNameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitColumnName(SQLQuery.ColumnNameContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterIdEle(SQLQuery.IdEleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitIdEle(SQLQuery.IdEleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterIntEle(SQLQuery.IntEleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitIntEle(SQLQuery.IntEleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterFloatEle(SQLQuery.FloatEleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitFloatEle(SQLQuery.FloatEleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterStringEle(SQLQuery.StringEleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitStringEle(SQLQuery.StringEleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterTableRef(SQLQuery.TableRefContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitTableRef(SQLQuery.TableRefContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterWhereCluaster(SQLQuery.WhereCluasterContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitWhereCluaster(SQLQuery.WhereCluasterContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterNameOpr(SQLQuery.NameOprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitNameOpr(SQLQuery.NameOprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterEqOpr(SQLQuery.EqOprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitEqOpr(SQLQuery.EqOprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterLrExpr(SQLQuery.LrExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitLrExpr(SQLQuery.LrExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterAndOpr(SQLQuery.AndOprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitAndOpr(SQLQuery.AndOprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterOrOpr(SQLQuery.OrOprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitOrOpr(SQLQuery.OrOprContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterGroupCluaster(SQLQuery.GroupCluasterContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitGroupCluaster(SQLQuery.GroupCluasterContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterOrderCluaster(SQLQuery.OrderCluasterContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitOrderCluaster(SQLQuery.OrderCluasterContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterOrder(SQLQuery.OrderContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitOrder(SQLQuery.OrderContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterLimitCluaster(SQLQuery.LimitCluasterContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitLimitCluaster(SQLQuery.LimitCluasterContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation does nothing.
     * </p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}