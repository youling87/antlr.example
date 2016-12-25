package com.pihui.nbsp.parser;// Generated from DruidQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLQuery}.
 */
public interface SQLQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLQuery#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SQLQuery.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQuery#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SQLQuery.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQuery#columList}.
	 * @param ctx the parse tree
	 */
	void enterColumList(SQLQuery.ColumListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQuery#columList}.
	 * @param ctx the parse tree
	 */
	void exitColumList(SQLQuery.ColumListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQuery#nameOprand}.
	 * @param ctx the parse tree
	 */
	void enterNameOprand(SQLQuery.NameOprandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQuery#nameOprand}.
	 * @param ctx the parse tree
	 */
	void exitNameOprand(SQLQuery.NameOprandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 */
	void enterMulName(SQLQuery.MulNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 */
	void exitMulName(SQLQuery.MulNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AggregationName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 */
	void enterAggregationName(SQLQuery.AggregationNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AggregationName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 */
	void exitAggregationName(SQLQuery.AggregationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 */
	void enterAddName(SQLQuery.AddNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 */
	void exitAddName(SQLQuery.AddNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LRName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 */
	void enterLRName(SQLQuery.LRNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LRName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 */
	void exitLRName(SQLQuery.LRNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SQLQuery.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SQLQuery.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 */
	void enterIdEle(SQLQuery.IdEleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 */
	void exitIdEle(SQLQuery.IdEleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 */
	void enterIntEle(SQLQuery.IntEleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 */
	void exitIntEle(SQLQuery.IntEleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 */
	void enterFloatEle(SQLQuery.FloatEleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 */
	void exitFloatEle(SQLQuery.FloatEleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 */
	void enterStringEle(SQLQuery.StringEleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 */
	void exitStringEle(SQLQuery.StringEleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQuery#tableRef}.
	 * @param ctx the parse tree
	 */
	void enterTableRef(SQLQuery.TableRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQuery#tableRef}.
	 * @param ctx the parse tree
	 */
	void exitTableRef(SQLQuery.TableRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQuery#whereCluaster}.
	 * @param ctx the parse tree
	 */
	void enterWhereCluaster(SQLQuery.WhereCluasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQuery#whereCluaster}.
	 * @param ctx the parse tree
	 */
	void exitWhereCluaster(SQLQuery.WhereCluasterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNameOpr(SQLQuery.NameOprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNameOpr(SQLQuery.NameOprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqOpr(SQLQuery.EqOprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqOpr(SQLQuery.EqOprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lrExpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterLrExpr(SQLQuery.LrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lrExpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitLrExpr(SQLQuery.LrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndOpr(SQLQuery.AndOprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndOpr(SQLQuery.AndOprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrOpr(SQLQuery.OrOprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrOpr(SQLQuery.OrOprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQuery#groupCluaster}.
	 * @param ctx the parse tree
	 */
	void enterGroupCluaster(SQLQuery.GroupCluasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQuery#groupCluaster}.
	 * @param ctx the parse tree
	 */
	void exitGroupCluaster(SQLQuery.GroupCluasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQuery#orderCluaster}.
	 * @param ctx the parse tree
	 */
	void enterOrderCluaster(SQLQuery.OrderCluasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQuery#orderCluaster}.
	 * @param ctx the parse tree
	 */
	void exitOrderCluaster(SQLQuery.OrderCluasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQuery#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(SQLQuery.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQuery#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(SQLQuery.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQuery#limitCluaster}.
	 * @param ctx the parse tree
	 */
	void enterLimitCluaster(SQLQuery.LimitCluasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQuery#limitCluaster}.
	 * @param ctx the parse tree
	 */
	void exitLimitCluaster(SQLQuery.LimitCluasterContext ctx);
}