package com.pihui.nbsp.operands;

import com.pihui.nbsp.dsl.aggregators.IAggregator;

public abstract interface Oprand
{
  public abstract IAggregator getAggregator();
}
