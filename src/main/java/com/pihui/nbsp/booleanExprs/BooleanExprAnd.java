package com.pihui.nbsp.booleanExprs;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

import com.pihui.nbsp.dsl.filters.AndOrFilter;
import com.pihui.nbsp.dsl.filters.Filter;

public class BooleanExprAnd implements IBooleanExpr {
    private final IBooleanExpr left;
    private final IBooleanExpr right;

    public String toString() {
        return "BooleanExprAnd(left=" + getLeft() + ", right=" + getRight() + ")";
    }

    @ConstructorProperties({ "left", "right" })
    public BooleanExprAnd(IBooleanExpr left, IBooleanExpr right) {
        this.left = left;
        this.right = right;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BooleanExprAnd)) {
            return false;
        }
        BooleanExprAnd other = (BooleanExprAnd) o;
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
        return other instanceof BooleanExprAnd;
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

    public IBooleanExpr getLeft() {
        return this.left;
    }

    public IBooleanExpr getRight() {
        return this.right;
    }

    public Filter getFilter() {
        Filter f = this.left.getFilter();
        if ((AndOrFilter.class.isInstance(f)) && (((AndOrFilter) f).getType().equalsIgnoreCase("and"))) {
            ((AndOrFilter) f).getFields().add(this.right.getFilter());
            return f;
        }
        List<Filter> filters = new ArrayList();
        filters.add(this.left.getFilter());
        filters.add(this.right.getFilter());
        return new AndOrFilter("and", filters);
    }
}
