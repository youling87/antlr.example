package com.lingdu.operands;

import java.beans.ConstructorProperties;

import com.lingdu.dsl.aggregators.IAggregator;

public class OrderByOprand
implements Oprand
{
private final Oprand oprand;
private final boolean desc;

public String toString()
{
  return "OrderByOprand(oprand=" + getOprand() + ", desc=" + isDesc() + ")";
}

public boolean equals(Object o)
{
  if (o == this) {
    return true;
  }
  if (!(o instanceof OrderByOprand)) {
    return false;
  }
  OrderByOprand other = (OrderByOprand)o;
  if (!other.canEqual(this)) {
    return false;
  }
  Object thisoprand = getOprand();Object otheroprand = other.getOprand();
  if (thisoprand == null ? otheroprand != null : !thisoprand.equals(otheroprand)) {
    return false;
  }
  return isDesc() == other.isDesc();
}

protected boolean canEqual(Object other)
{
  return other instanceof OrderByOprand;
}

public int hashCode()
{
  int PRIME = 59;int result = 1;Object oprand = getOprand();result = result * 59 + (oprand == null ? 0 : oprand.hashCode());result = result * 59 + (isDesc() ? 79 : 97);return result;
}

@ConstructorProperties({"oprand", "desc"})
public OrderByOprand(Oprand oprand, boolean desc)
{
  this.oprand = oprand;this.desc = desc;
}

public Oprand getOprand()
{
  return this.oprand;
}

public boolean isDesc()
{
  return this.desc;
}

public IAggregator getAggregator()
{
  return null;
}
}
