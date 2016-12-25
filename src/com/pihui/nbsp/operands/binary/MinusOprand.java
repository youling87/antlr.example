package com.pihui.nbsp.operands.binary;

import com.pihui.nbsp.operands.Oprand;

public class MinusOprand
extends BinaryOprand
{
public MinusOprand(Oprand left, Oprand right)
{
  super(left, right, "-");
}
}