package com.pihui.nbsp.booleanExprs;

import java.beans.ConstructorProperties;

import com.pihui.nbsp.dsl.filters.Filter;
import com.pihui.nbsp.dsl.filters.SelectorFilter;
import com.pihui.nbsp.operands.NameOprand;
import com.pihui.nbsp.operands.Oprand;
import com.pihui.nbsp.operands.primitive.PrimitiveOprand;

public class SimpleBooleanExpr implements IBooleanExpr {
    private final Oprand left;
    private final ExpressionType type;
    private final Oprand right;

    public String toString() {
        return "BooleanExprEq(left=" + getLeft() + ", right=" + getRight() + ")";
    }

    @ConstructorProperties({ "left", "right" })
    public SimpleBooleanExpr(Oprand left, ExpressionType type, Oprand right) {
        this.left = left;
        this.type = type;
        this.right = right;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SimpleBooleanExpr)) {
            return false;
        }
        SimpleBooleanExpr other = (SimpleBooleanExpr) o;
        if (!other.canEqual(this)) {
            return false;
        }
        Object thisleft = getLeft();
        Object otherleft = other.getLeft();
        if (thisleft == null ? otherleft != null : !thisleft.equals(otherleft)) {
            return false;
        }
        Object thisright = getRight();
        Object otherright = other.getRight();
        return thisright == null ? otherright == null : thisright.equals(otherright);
    }

    protected boolean canEqual(Object other) {
        return other instanceof SimpleBooleanExpr;
    }

    public int hashCode() {
        int result = 1;
        Object left = getLeft();
        result = result * 59 + (left == null ? 0 : left.hashCode());

        Object type = getType();
        result = result * 59 + (type == null ? 0 : type.hashCode());

        Object right = getRight();
        result = result * 59 + (right == null ? 0 : right.hashCode());
        return result;
    }

    public Oprand getLeft() {
        return this.left;
    }
    public ExpressionType getType() {
        return this.type;
    }
    public Oprand getRight() {
        return this.right;
    }

    public Filter getFilter() {
        NameOprand op = (NameOprand) (NameOprand.class.isInstance(this.left) ? this.left : this.right);
        
        PrimitiveOprand pop = (PrimitiveOprand) (PrimitiveOprand.class.isInstance(this.left) ? this.left : this.right);
        return new SelectorFilter(op.getColumn(), pop.getValue());
    }
}
