package com.pihui.nbsp.operands;

import java.beans.ConstructorProperties;

import com.pihui.nbsp.dsl.aggregators.IAggregator;

public class LimitOprand
implements Oprand
{
private final int offeset;
private final int resultCount;

public String toString()
{
  return "LimitOprand(offeset=" + getOffeset() + ", resultCount=" + getResultCount() + ")";
}

@ConstructorProperties({"offeset", "resultCount"})
public LimitOprand(int offeset, int resultCount)
{
  this.offeset = offeset;this.resultCount = resultCount;
}

public boolean equals(Object o)
{
  if (o == this) {
    return true;
  }
  if (!(o instanceof LimitOprand)) {
    return false;
  }
  LimitOprand other = (LimitOprand)o;
  if (!other.canEqual(this)) {
    return false;
  }
  if (getOffeset() != other.getOffeset()) {
    return false;
  }
  return getResultCount() == other.getResultCount();
}

protected boolean canEqual(Object other)
{
  return other instanceof LimitOprand;
}

public int hashCode()
{
  int PRIME = 59;int result = 1;result = result * 59 + getOffeset();result = result * 59 + getResultCount();return result;
}

public int getOffeset()
{
  return this.offeset;
}

public int getResultCount()
{
  return this.resultCount;
}

public int getMaxSize()
{
  return this.offeset + this.resultCount;
}

public IAggregator getAggregator()
{
  return null;
}
}

