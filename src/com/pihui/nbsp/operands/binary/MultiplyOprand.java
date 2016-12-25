package com.pihui.nbsp.operands.binary;

import com.pihui.nbsp.operands.Oprand;

public class MultiplyOprand
  extends BinaryOprand
{
  public MultiplyOprand(Oprand left, Oprand right)
  {
    super(left, right, "*");
  }
}
