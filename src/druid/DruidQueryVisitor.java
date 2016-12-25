package druid;// Generated from DruidQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DruidQuery}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DruidQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DruidQuery#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(DruidQuery.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DruidQuery#columList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumList(DruidQuery.ColumListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DruidQuery#nameOprand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameOprand(DruidQuery.NameOprandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulName(DruidQuery.MulNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AggregationName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationName(DruidQuery.AggregationNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddName(DruidQuery.AddNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LRName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLRName(DruidQuery.LRNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(DruidQuery.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DruidQuery#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(DruidQuery.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DruidQuery#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(DruidQuery.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdEle(DruidQuery.IdEleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntEle(DruidQuery.IntEleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatEle(DruidQuery.FloatEleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringEle(DruidQuery.StringEleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DruidQuery#tableRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRef(DruidQuery.TableRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DruidQuery#whereCluaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereCluaster(DruidQuery.WhereCluasterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameOpr(DruidQuery.NameOprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOpr(DruidQuery.EqOprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lrExpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLrExpr(DruidQuery.LrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOpr(DruidQuery.AndOprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOpr(DruidQuery.OrOprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DruidQuery#groupCluaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupCluaster(DruidQuery.GroupCluasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DruidQuery#orderCluaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderCluaster(DruidQuery.OrderCluasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DruidQuery#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(DruidQuery.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DruidQuery#limitCluaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitCluaster(DruidQuery.LimitCluasterContext ctx);
}