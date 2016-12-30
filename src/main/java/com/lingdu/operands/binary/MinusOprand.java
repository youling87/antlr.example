package com.lingdu.operands.binary;

import com.lingdu.operands.Oprand;

public class MinusOprand
extends BinaryOprand
{
public MinusOprand(Oprand left, Oprand right)
{
  super(left, right, "-");
}
}