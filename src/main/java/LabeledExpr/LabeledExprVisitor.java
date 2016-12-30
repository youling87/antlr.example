package LabeledExpr;

public interface LabeledExprVisitor<T>{
    T visitId(LableExprParser.IdContext ctx); // from label id
    T visitAssign(LableExprParser.AssignContext ctx); // from label assign
    T visitMulDiv(LableExprParser.MulDivContext ctx); // from label MulDiv
}
