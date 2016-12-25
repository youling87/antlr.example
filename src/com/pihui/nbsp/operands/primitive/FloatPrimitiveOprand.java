package com.pihui.nbsp.operands.primitive;

import java.beans.ConstructorProperties;

import com.pihui.nbsp.dsl.aggregators.IAggregator;

public class FloatPrimitiveOprand
implements PrimitiveOprand
{
private final String value;
private final String alias;

public String toString()
{
  return "FloatPrimitiveOprand(value=" + getValue() +",alias="+alias+ ")";
}

@ConstructorProperties({"value"})
public FloatPrimitiveOprand(String value,String alias)
{
  this.value = value;
  this.alias =alias;
}

public boolean equals(Object o)
{
  if (o == this) {
    return true;
  }
  if (!(o instanceof FloatPrimitiveOprand)) {
    return false;
  }
  FloatPrimitiveOprand other = (FloatPrimitiveOprand)o;
  if (!other.canEqual(this)) {
    return false;
  }
  Object thisvalue = getValue();Object othervalue = other.getValue();return thisvalue == null ? othervalue == null : thisvalue.equals(othervalue);
}

protected boolean canEqual(Object other)
{
  return other instanceof FloatPrimitiveOprand;
}

public int hashCode()
{
  int PRIME = 59;int result = 1;Object value = getValue();result = result * 59 + (value == null ? 0 : value.hashCode());return result;
}

public String getValue()
{
  return this.value;
}

public IAggregator getAggregator()
{
  return null;//new ConstPostAggregator(null, this.value);
}
}
