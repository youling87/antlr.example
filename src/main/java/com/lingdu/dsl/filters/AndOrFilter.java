package com.lingdu.dsl.filters;

import java.beans.ConstructorProperties;
import java.util.List;

public class AndOrFilter
implements Filter
{
private String type;
private List<Filter> fields;

public void setType(String type)
{
  this.type = type;
}

public void setFields(List<Filter> fields)
{
  this.fields = fields;
}

public String toString()
{
  return "AndOrFilter(type=" + getType() + ", fields=" + getFields() + ")";
}

@ConstructorProperties({"type", "fields"})
public AndOrFilter(String type, List<Filter> fields)
{
  this.type = type;this.fields = fields;
}

public boolean equals(Object o)
{
  if (o == this) {
    return true;
  }
  if (!(o instanceof AndOrFilter)) {
    return false;
  }
  AndOrFilter other = (AndOrFilter)o;
  if (!other.canEqual(this)) {
    return false;
  }
  Object thistype = getType();Object othertype = other.getType();
  if (thistype == null ? othertype != null : !thistype.equals(othertype)) {
    return false;
  }
  Object thisfields = getFields();Object otherfields = other.getFields();return thisfields == null ? otherfields == null : thisfields.equals(otherfields);
}

protected boolean canEqual(Object other)
{
  return other instanceof AndOrFilter;
}

public int hashCode()
{
  int PRIME = 59;int result = 1;Object type = getType();result = result * 59 + (type == null ? 0 : type.hashCode());Object fields = getFields();result = result * 59 + (fields == null ? 0 : fields.hashCode());return result;
}

public String getType()
{
  return this.type;
}

public List<Filter> getFields()
{
  return this.fields;
}
}
