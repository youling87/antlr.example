package com.pihui.nbsp.dsl.aggregators;

import java.util.List;

public class CountAggregator extends AbstractAggregator {
    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CountAggregator)) {
            return false;
        }
        CountAggregator other = (CountAggregator) o;
        if (!other.canEqual(this)) {
            return false;
        }
        Object thistype = getType();
        Object othertype = other.getType();
        return thistype == null ? othertype == null : thistype.equals(othertype);
    }

    protected boolean canEqual(Object other) {
        return other instanceof CountAggregator;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object type = getType();
        result = result * 59 + (type == null ? 0 : type.hashCode());
        return result;
    }

    public String getType() {
        getClass();
        return "count";
    }

    private final String type = "count";
    private String name;

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "count";
    }

    @Override
    public void setNameList(List<String> paramString) {
        if(paramString!=null&&paramString.isEmpty()){
            setName(paramString.get(0));
        }
        
    }
}
