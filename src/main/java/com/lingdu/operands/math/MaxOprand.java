package com.lingdu.operands.math;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

import com.lingdu.dsl.aggregators.IAggregator;
import com.lingdu.dsl.aggregators.MathAggregator;
import com.lingdu.operands.NameOprand;
import com.lingdu.operands.Oprand;

public class MaxOprand
implements Oprand
{
private final String type;
private final List<NameOprand> nameList;

public String toString()
{
  return "MaxOprand(type=" + getType() + ", name=" + getName() + ")";
}

@ConstructorProperties({"type", "name"})
public MaxOprand(String type, List nameList)//<NameOprand>
{
  this.type = type;this.nameList = nameList;
}

public boolean equals(Object o)
{
  if (o == this) {
    return true;
  }
  if (!(o instanceof MaxOprand)) {
    return false;
  }
  MaxOprand other = (MaxOprand)o;
  if (!other.canEqual(this)) {
    return false;
  }
  Object thistype = getType();Object othertype = other.getType();
  if (thistype == null ? othertype != null : !thistype.equals(othertype)) {
    return false;
  }
  Object thisname = getName();Object othername = other.getName();return thisname == null ? othername == null : thisname.equals(othername);
}

public List<NameOprand> getName() {
    return nameList;
}
public List<String> getParamList(){
   List<String> list = new ArrayList<>();
   if(getName()!=null){
       for(NameOprand n:getName()){
           list.add(n.getColumn());
       }
   }
   return list;
}

protected boolean canEqual(Object other)
{
  return other instanceof MaxOprand;
}

public int hashCode()
{
  int PRIME = 59;int result = 1;Object type = getType();result = result * 59 + (type == null ? 0 : type.hashCode());Object name = getName();result = result * 59 + (name == null ? 0 : name.hashCode());return result;
}

public String getType()
{
  return this.type;
}

public IAggregator getAggregator()
{
  return new MathAggregator(this.type, null, getParamList());
}
}

