package druid;// Generated from DruidQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DruidQuery}.
 */
public interface DruidQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DruidQuery#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DruidQuery.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DruidQuery#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DruidQuery.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DruidQuery#columList}.
	 * @param ctx the parse tree
	 */
	void enterColumList(DruidQuery.ColumListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DruidQuery#columList}.
	 * @param ctx the parse tree
	 */
	void exitColumList(DruidQuery.ColumListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DruidQuery#nameOprand}.
	 * @param ctx the parse tree
	 */
	void enterNameOprand(DruidQuery.NameOprandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DruidQuery#nameOprand}.
	 * @param ctx the parse tree
	 */
	void exitNameOprand(DruidQuery.NameOprandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 */
	void enterMulName(DruidQuery.MulNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 */
	void exitMulName(DruidQuery.MulNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AggregationName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 */
	void enterAggregationName(DruidQuery.AggregationNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AggregationName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 */
	void exitAggregationName(DruidQuery.AggregationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 */
	void enterAddName(DruidQuery.AddNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 */
	void exitAddName(DruidQuery.AddNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LRName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 */
	void enterLRName(DruidQuery.LRNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LRName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 */
	void exitLRName(DruidQuery.LRNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(DruidQuery.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link DruidQuery#name}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(DruidQuery.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DruidQuery#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(DruidQuery.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DruidQuery#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(DruidQuery.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DruidQuery#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(DruidQuery.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DruidQuery#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(DruidQuery.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 */
	void enterIdEle(DruidQuery.IdEleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 */
	void exitIdEle(DruidQuery.IdEleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 */
	void enterIntEle(DruidQuery.IntEleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 */
	void exitIntEle(DruidQuery.IntEleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 */
	void enterFloatEle(DruidQuery.FloatEleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 */
	void exitFloatEle(DruidQuery.FloatEleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 */
	void enterStringEle(DruidQuery.StringEleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringEle}
	 * labeled alternative in {@link DruidQuery#identity}.
	 * @param ctx the parse tree
	 */
	void exitStringEle(DruidQuery.StringEleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DruidQuery#tableRef}.
	 * @param ctx the parse tree
	 */
	void enterTableRef(DruidQuery.TableRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DruidQuery#tableRef}.
	 * @param ctx the parse tree
	 */
	void exitTableRef(DruidQuery.TableRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DruidQuery#whereCluaster}.
	 * @param ctx the parse tree
	 */
	void enterWhereCluaster(DruidQuery.WhereCluasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DruidQuery#whereCluaster}.
	 * @param ctx the parse tree
	 */
	void exitWhereCluaster(DruidQuery.WhereCluasterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNameOpr(DruidQuery.NameOprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNameOpr(DruidQuery.NameOprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqOpr(DruidQuery.EqOprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqOpr(DruidQuery.EqOprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lrExpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterLrExpr(DruidQuery.LrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lrExpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitLrExpr(DruidQuery.LrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndOpr(DruidQuery.AndOprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndOpr(DruidQuery.AndOprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrOpr(DruidQuery.OrOprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orOpr}
	 * labeled alternative in {@link DruidQuery#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrOpr(DruidQuery.OrOprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DruidQuery#groupCluaster}.
	 * @param ctx the parse tree
	 */
	void enterGroupCluaster(DruidQuery.GroupCluasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DruidQuery#groupCluaster}.
	 * @param ctx the parse tree
	 */
	void exitGroupCluaster(DruidQuery.GroupCluasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DruidQuery#orderCluaster}.
	 * @param ctx the parse tree
	 */
	void enterOrderCluaster(DruidQuery.OrderCluasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DruidQuery#orderCluaster}.
	 * @param ctx the parse tree
	 */
	void exitOrderCluaster(DruidQuery.OrderCluasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DruidQuery#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(DruidQuery.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DruidQuery#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(DruidQuery.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DruidQuery#limitCluaster}.
	 * @param ctx the parse tree
	 */
	void enterLimitCluaster(DruidQuery.LimitCluasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DruidQuery#limitCluaster}.
	 * @param ctx the parse tree
	 */
	void exitLimitCluaster(DruidQuery.LimitCluasterContext ctx);
}