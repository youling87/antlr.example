package caculator;// Generated from Expr.g4 by ANTLR 4.5.1

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ExprVisitor}, which can
 * be extended to create a visitor which only needs to handle a subset of the
 * available methods.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class ExprBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ExprVisitor<T> {
    /**
     * {@inheritDoc}
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public T visitProg(ExprParser.ProgContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public T visitStat(ExprParser.StatContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public T visitExpr(ExprParser.ExprContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public T visitOperator(ExprParser.OperatorContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public T visitFunction_expression(ExprParser.Function_expressionContext ctx) {
        ctx.argument_list();
        ctx.ID();
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public T visitArgument_list(ExprParser.Argument_listContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public T visitArgument_expression(ExprParser.Argument_expressionContext ctx) {
        return visitChildren(ctx);
    }
}