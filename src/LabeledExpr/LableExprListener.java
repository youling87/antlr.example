package LabeledExpr;// Generated from LableExpr.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LableExprParser}.
 */
public interface LableExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LableExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LableExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LableExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LableExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LableExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(LableExprParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LableExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(LableExprParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LableExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LableExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LableExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LableExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LableExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LableExprParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LableExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LableExprParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LableExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LableExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LableExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LableExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LableExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LableExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LableExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LableExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LableExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(LableExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LableExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(LableExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LableExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(LableExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LableExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(LableExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LableExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(LableExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LableExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(LableExprParser.IntContext ctx);
}