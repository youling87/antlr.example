package com.pihui.nbsp.operands.math;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

import com.pihui.nbsp.dsl.aggregators.IAggregator;
import com.pihui.nbsp.dsl.aggregators.MathAggregator;
import com.pihui.nbsp.operands.NameOprand;
import com.pihui.nbsp.operands.Oprand;


public class MinOprand
implements Oprand
{
private final String type;
private final List<NameOprand> nameList;

public String toString()
{
  return "MinOprand(type=" + getType() + ", name=" + getName() + ")";
}

@ConstructorProperties({"type", "name"})
public MinOprand(String type, List name)//<NameOprand>
{
  this.type = type;this.nameList = name;
}

public boolean equals(Object o)
{
  if (o == this) {
    return true;
  }
  if (!(o instanceof MinOprand)) {
    return false;
  }
  MinOprand other = (MinOprand)o;
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
  return other instanceof MinOprand;
}

public int hashCode()
{
  int PRIME = 59;int result = 1;Object type = getType();result = result * 59 + (type == null ? 0 : type.hashCode());Object name = getName();result = result * 59 + (name == null ? 0 : name.hashCode());return result;
}

public String getType()
{
  return this.type;
}

public List<NameOprand> getName()
{
  return this.nameList;
}

public IAggregator getAggregator()
{
    List<String> list = new ArrayList<>();
    list.add(nameList.get(0).getColumn());
  return new MathAggregator(this.type, null, list);
}
}

