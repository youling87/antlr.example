package com.pihui.nbsp.operands;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

import com.pihui.nbsp.dsl.aggregators.IAggregator;

public class AliasOprand
implements Oprand
{
private final Oprand oprand;
private final String alias;

public String toString()
{
  return "AliasOprand(oprand=" + getOprand() + ", alias=" + getAlias() + ")";
}

@ConstructorProperties({"oprand", "alias"})
public AliasOprand(Oprand oprand, String alias)
{
  this.oprand = oprand;this.alias = alias;
}

public boolean equals(Object o)
{
  if (o == this) {
    return true;
  }
  if (!(o instanceof AliasOprand)) {
    return false;
  }
  AliasOprand other = (AliasOprand)o;
  if (!other.canEqual(this)) {
    return false;
  }
  Object thisoprand = getOprand();Object otheroprand = other.getOprand();
  if (thisoprand == null ? otheroprand != null : !thisoprand.equals(otheroprand)) {
    return false;
  }
  Object thisalias = getAlias();Object otheralias = other.getAlias();return thisalias == null ? otheralias == null : thisalias.equals(otheralias);
}

protected boolean canEqual(Object other)
{
  return other instanceof AliasOprand;
}

public int hashCode()
{
  int PRIME = 59;int result = 1;Object oprand = getOprand();result = result * 59 + (oprand == null ? 0 : oprand.hashCode());Object alias = getAlias();result = result * 59 + (alias == null ? 0 : alias.hashCode());return result;
}

public Oprand getOprand()
{
  return this.oprand;
}

public String getAlias()
{
  return this.alias;
}

public IAggregator getAggregator()
{
  IAggregator agg = this.oprand.getAggregator();
  List<String> list = new ArrayList<>();
  list.add(alias);
  agg.setNameList(list);
  return agg;
}
}

