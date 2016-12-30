package com.lingdu.operands;

import java.beans.ConstructorProperties;

import com.lingdu.dsl.aggregators.IAggregator;

public class NameOprand
implements Oprand
{
private final String table;
private final String column;
private final String alias;

public String toString()
{
  return "NameOprand(table=" + getTable() + ", column=" + getColumn() + ")";
}

@ConstructorProperties({"table", "column"})
public NameOprand(String table, String column)
{
  this.table = table;this.column = column;
  alias = null;
}
@ConstructorProperties({"table", "column"})
public NameOprand(String table, String column,String alias)
{
  this.table = table;this.column = column;
  this.alias =alias;
}

public boolean equals(Object o)
{
  if (o == this) {
    return true;
  }
  if (!(o instanceof NameOprand)) {
    return false;
  }
  NameOprand other = (NameOprand)o;
  if (!other.canEqual(this)) {
    return false;
  }
  Object thistable = getTable();Object othertable = other.getTable();
  if (thistable == null ? othertable != null : !thistable.equals(othertable)) {
    return false;
  }
  Object thiscolumn = getColumn();Object othercolumn = other.getColumn();return thiscolumn == null ? othercolumn == null : thiscolumn.equals(othercolumn);
}

protected boolean canEqual(Object other)
{
  return other instanceof NameOprand;
}

public int hashCode()
{
  int PRIME = 59;int result = 1;Object table = getTable();result = result * 59 + (table == null ? 0 : table.hashCode());Object column = getColumn();result = result * 59 + (column == null ? 0 : column.hashCode());return result;
}

public String getTable()
{
  return this.table;
}

public String getColumn()
{
  return this.column;
}

public IAggregator getAggregator()
{
  return null;
}
}
