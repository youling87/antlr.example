package com.pihui.nbsp.dsl.aggregators;

import java.beans.ConstructorProperties;
import java.util.List;

import lombok.NonNull;

public class MathAggregator extends AbstractAggregator {
    @NonNull
    private final String type;
    private String name;
    @NonNull
    private List<String> fieldNameList;

    

    @ConstructorProperties({ "type", "name", "fieldName" })
    public MathAggregator(@NonNull String type, String name, @NonNull List<String> fieldNameList) {
        if (type == null) {
            throw new NullPointerException("type");
        }
        if (fieldNameList == null) {
            throw new NullPointerException("fieldName");
        }
        this.type = type;
        this.name = name;
        this.fieldNameList = fieldNameList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MathAggregator)) {
            return false;
        }
        MathAggregator other = (MathAggregator) o;
        if (!other.canEqual(this)) {
            return false;
        }
        Object thistype = getType();
        Object othertype = other.getType();
        if (thistype == null ? othertype != null : !thistype.equals(othertype)) {
            return false;
        }
        Object thisfieldName = getFieldNameList();
        Object otherfieldName = other.getFieldNameList();
        return thisfieldName == null ? otherfieldName == null : thisfieldName.equals(otherfieldName);
    }

    protected boolean canEqual(Object other) {
        return other instanceof MathAggregator;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object type = getType();
        result = result * 59 + (type == null ? 0 : type.hashCode());
        Object fieldNameList = getFieldNameList();
        result = result * 59 + (fieldNameList == null ? 0 : fieldNameList.hashCode());
        return result;
    }

    @NonNull
    public String getType() {
        return this.type;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return String.format("%s_%s", new Object[] { this.type, this.fieldNameList });
    }
    @NonNull
    public List<String> getFieldNameList() {
        return fieldNameList;
    }

    @Override
    public void setNameList(List<String> fieldNameList) {
        this.fieldNameList = fieldNameList;
    }
}
