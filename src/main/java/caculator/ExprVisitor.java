package caculator;// Generated from Expr.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ExprParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(ExprParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_expression(ExprParser.Function_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(ExprParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#argument_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_expression(ExprParser.Argument_expressionContext ctx);
}