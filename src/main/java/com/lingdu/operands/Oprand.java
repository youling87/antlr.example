package com.lingdu.operands;

import com.lingdu.dsl.aggregators.IAggregator;

public abstract interface Oprand
{
  public abstract IAggregator getAggregator();
}
