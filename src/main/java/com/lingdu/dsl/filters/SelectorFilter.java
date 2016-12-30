package com.lingdu.dsl.filters;

import java.beans.ConstructorProperties;

public class SelectorFilter implements Filter {
    public String toString() {
        return "SelectorFilter(type=" + getType() + ", dimension=" + getDimension() + ", value=" + getValue() + ")";
    }

    @ConstructorProperties({ "dimension", "value" })
    public SelectorFilter(String dimension, String value) {
        this.dimension = dimension;
        this.value = value;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SelectorFilter)) {
            return false;
        }
        SelectorFilter other = (SelectorFilter) o;
        if (!other.canEqual(this)) {
            return false;
        }
        Object thistype = getType();
        Object othertype = other.getType();
        if (thistype == null ? othertype != null : !thistype.equals(othertype)) {
            return false;
        }
        Object thisdimension = getDimension();
        Object otherdimension = other.getDimension();
        if (thisdimension == null ? otherdimension != null : !thisdimension.equals(otherdimension)) {
            return false;
        }
        Object thisvalue = getValue();
        Object othervalue = other.getValue();
        return thisvalue == null ? othervalue == null : thisvalue.equals(othervalue);
    }

    protected boolean canEqual(Object other) {
        return other instanceof SelectorFilter;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object type = getType();
        result = result * 59 + (type == null ? 0 : type.hashCode());
        Object dimension = getDimension();
        result = result * 59 + (dimension == null ? 0 : dimension.hashCode());
        Object value = getValue();
        result = result * 59 + (value == null ? 0 : value.hashCode());
        return result;
    }

    public String getType() {
        getClass();
        return "selector";
    }

    private final String type = "selector";
    private final String dimension;
    private final String value;

    public String getDimension() {
        return this.dimension;
    }

    public String getValue() {
        return this.value;
    }
}
