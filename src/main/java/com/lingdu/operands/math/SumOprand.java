package com.lingdu.operands.math;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

import com.lingdu.dsl.aggregators.IAggregator;
import com.lingdu.dsl.aggregators.MathAggregator;
import com.lingdu.operands.NameOprand;
import com.lingdu.operands.Oprand;

public class SumOprand implements Oprand {
    private final String type;
    private final NameOprand name;
    private final String alias;
    @ConstructorProperties({ "type", "name" })
    public SumOprand(String type, NameOprand name) {
        this.type = type;
        this.name = name;
        alias = null;
    }
    @ConstructorProperties({ "type", "name" })
    public SumOprand(String type, NameOprand name,String alias) {
        this.type = type;
        this.name = name;
        this.alias = alias;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SumOprand)) {
            return false;
        }
        SumOprand other = (SumOprand) o;
        if (!other.canEqual(this)) {
            return false;
        }
        Object thistype = getType();
        Object othertype = other.getType();
        if (thistype == null ? othertype != null : !thistype.equals(othertype)) {
            return false;
        }
        Object thisname = getName();
        Object othername = other.getName();
        return thisname == null ? othername == null : thisname.equals(othername);
    }

    protected boolean canEqual(Object other) {
        return other instanceof SumOprand;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object type = getType();
        result = result * 59 + (type == null ? 0 : type.hashCode());
        Object name = getName();
        result = result * 59 + (name == null ? 0 : name.hashCode());
        return result;
    }

    public String toString() {
        return "SumOprand(type=" + getType() + ", name=" + getName() + ",alias="+alias+")";
    }

    public String getType() {
        return this.type;
    }

    public NameOprand getName() {
        return this.name;
    }

    public IAggregator getAggregator() {
        List<String> list = new ArrayList<>();
        list.add(name.getColumn());
        return new MathAggregator(this.type, null, list);
    }
}
