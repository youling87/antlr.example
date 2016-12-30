package com.lingdu.operands.binary;

import com.lingdu.operands.Oprand;

public class MultiplyOprand
  extends BinaryOprand
{
  public MultiplyOprand(Oprand left, Oprand right)
  {
    super(left, right, "*");
  }
}
