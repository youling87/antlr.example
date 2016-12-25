package com.pihui.nbsp.operands;

import java.beans.ConstructorProperties;

import com.pihui.nbsp.dsl.aggregators.CountAggregator;
import com.pihui.nbsp.dsl.aggregators.IAggregator;

public class CountOprand
implements Oprand
{
private final String type;
private final Oprand name;
private final String alias;

public String toString()
{
  return "CountOprand(type=" + getType() + ", name=" + getName() + ",alias="+alias+")";
}

@ConstructorProperties({"type", "name"})
public CountOprand(String type, Oprand name)
{
  this.type = type;this.name = name;
  alias = null;
}
@ConstructorProperties({"type", "name"})
public CountOprand(String type, Oprand name,String alias)
{
  this.type = type;this.name = name;
  this.alias = alias;
}

public boolean equals(Object o)
{
  if (o == this) {
    return true;
  }
  if (!(o instanceof CountOprand)) {
    return false;
  }
  CountOprand other = (CountOprand)o;
  if (!other.canEqual(this)) {
    return false;
  }
  Object thistype = getType();Object othertype = other.getType();
  if (thistype == null ? othertype != null : !thistype.equals(othertype)) {
    return false;
  }
  Object thisname = getName();Object othername = other.getName();return thisname == null ? othername == null : thisname.equals(othername);
}

protected boolean canEqual(Object other)
{
  return other instanceof CountOprand;
}

public int hashCode()
{
  int PRIME = 59;int result = 1;Object type = getType();result = result * 59 + (type == null ? 0 : type.hashCode());Object name = getName();result = result * 59 + (name == null ? 0 : name.hashCode());return result;
}

public String getType()
{
  return this.type;
}

public Oprand getName()
{
  return this.name;
}

public IAggregator getAggregator()
{
  return new CountAggregator();
}
}

