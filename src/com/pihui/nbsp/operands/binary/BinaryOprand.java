package com.pihui.nbsp.operands.binary;

import java.beans.ConstructorProperties;

import com.pihui.nbsp.dsl.aggregators.IAggregator;
import com.pihui.nbsp.operands.Oprand;

public abstract class BinaryOprand
implements Oprand
{
private final Oprand left;
private final Oprand right;
private final String oprator;

public String toString()
{
  return "BinaryOprand(left=" + getLeft() + ", right=" + getRight() + ", oprator=" + getOprator() + ")";
}

@ConstructorProperties({"left", "right", "oprator"})
public BinaryOprand(Oprand left, Oprand right, String oprator)
{
  this.left = left;this.right = right;this.oprator = oprator;
}

public boolean equals(Object o)
{
  if (o == this) {
    return true;
  }
  if (!(o instanceof BinaryOprand)) {
    return false;
  }
  BinaryOprand other = (BinaryOprand)o;
  if (!other.canEqual(this)) {
    return false;
  }
  Object thisleft = getLeft();Object otherleft = other.getLeft();
  if (thisleft == null ? otherleft != null : !thisleft.equals(otherleft)) {
    return false;
  }
  Object thisright = getRight();Object otherright = other.getRight();
  if (thisright == null ? otherright != null : !thisright.equals(otherright)) {
    return false;
  }
  Object thisoprator = getOprator();Object otheroprator = other.getOprator();return thisoprator == null ? otheroprator == null : thisoprator.equals(otheroprator);
}

protected boolean canEqual(Object other)
{
  return other instanceof BinaryOprand;
}

public int hashCode()
{
  int PRIME = 59;int result = 1;Object left = getLeft();result = result * 59 + (left == null ? 0 : left.hashCode());Object right = getRight();result = result * 59 + (right == null ? 0 : right.hashCode());Object oprator = getOprator();result = result * 59 + (oprator == null ? 0 : oprator.hashCode());return result;
}

public Oprand getLeft()
{
  return this.left;
}

public Oprand getRight()
{
  return this.right;
}

public String getOprator()
{
  return this.oprator;
}

public IAggregator getAggregator()
{
  return null;//new ArithmeticPostAggregator(null, this.oprator, Arrays.asList(new IAggregator[] { this.left.getAggregator(), this.right.getAggregator() }));
}
}

