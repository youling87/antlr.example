package com.lingdu.booleanExprs;

import java.beans.ConstructorProperties;

import com.lingdu.dsl.filters.Filter;
import com.lingdu.dsl.filters.SelectorFilter;
import com.lingdu.operands.NameOprand;
import com.lingdu.operands.Oprand;
import com.lingdu.operands.primitive.PrimitiveOprand;

public class BooleanExprEq implements IBooleanExpr {
    private final Oprand left;
    private final Oprand right;

    public String toString() {
        return "BooleanExprEq(left=" + getLeft() + ", right=" + getRight() + ")";
    }

    @ConstructorProperties({ "left", "right" })
    public BooleanExprEq(Oprand left, Oprand right) {
        this.left = left;
        this.right = right;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BooleanExprEq)) {
            return false;
        }
        BooleanExprEq other = (BooleanExprEq) o;
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
        return other instanceof BooleanExprEq;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object left = getLeft();
        result = result * 59 + (left == null ? 0 : left.hashCode());
        Object right = getRight();
        result = result * 59 + (right == null ? 0 : right.hashCode());
        return result;
    }

    public Oprand getLeft() {
        return this.left;
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
