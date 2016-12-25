package com.pihui.nbsp.dsl.filters;

import java.beans.ConstructorProperties;

public class NotFilter
implements Filter
{
public String toString()
{
  return "NotFilter(type=" + getType() + ", field=" + getField() + ")";
}

@ConstructorProperties({"field"})
public NotFilter(Filter field)
{
  this.field = field;
}

public boolean equals(Object o)
{
  if (o == this) {
    return true;
  }
  if (!(o instanceof NotFilter)) {
    return false;
  }
  NotFilter other = (NotFilter)o;
  if (!other.canEqual(this)) {
    return false;
  }
  Object thistype = getType();Object othertype = other.getType();
  if (thistype == null ? othertype != null : !thistype.equals(othertype)) {
    return false;
  }
  Object thisfield = getField();Object otherfield = other.getField();return thisfield == null ? otherfield == null : thisfield.equals(otherfield);
}

protected boolean canEqual(Object other)
{
  return other instanceof NotFilter;
}

public int hashCode()
{
  int PRIME = 59;int result = 1;Object type = getType();result = result * 59 + (type == null ? 0 : type.hashCode());Object field = getField();result = result * 59 + (field == null ? 0 : field.hashCode());return result;
}

public String getType()
{
  getClass();return "not";
}

private final String type = "not";
private final Filter field;

public Filter getField()
{
  return this.field;
}
}

