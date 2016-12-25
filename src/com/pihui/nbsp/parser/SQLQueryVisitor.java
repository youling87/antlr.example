package com.pihui.nbsp.parser;// Generated from DruidQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLQuery}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLQuery#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SQLQuery.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQuery#columList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumList(SQLQuery.ColumListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQuery#nameOprand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameOprand(SQLQuery.NameOprandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulName(SQLQuery.MulNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AggregationName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationName(SQLQuery.AggregationNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddName(SQLQuery.AddNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LRName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLRName(SQLQuery.LRNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link SQLQuery#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(SQLQuery.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQuery#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(SQLQuery.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQuery#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(SQLQuery.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdEle(SQLQuery.IdEleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntEle(SQLQuery.IntEleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatEle(SQLQuery.FloatEleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringEle}
	 * labeled alternative in {@link SQLQuery#identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringEle(SQLQuery.StringEleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQuery#tableRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRef(SQLQuery.TableRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQuery#whereCluaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereCluaster(SQLQuery.WhereCluasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQuery#filterCluaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterCluaster(SQLQuery.FilterCluasterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameOpr(SQLQuery.NameOprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOpr(SQLQuery.EqOprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lrExpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLrExpr(SQLQuery.LrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOpr(SQLQuery.AndOprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orOpr}
	 * labeled alternative in {@link SQLQuery#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOpr(SQLQuery.OrOprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQuery#groupCluaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupCluaster(SQLQuery.GroupCluasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQuery#orderCluaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderCluaster(SQLQuery.OrderCluasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQuery#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(SQLQuery.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQuery#limitCluaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitCluaster(SQLQuery.LimitCluasterContext ctx);
}