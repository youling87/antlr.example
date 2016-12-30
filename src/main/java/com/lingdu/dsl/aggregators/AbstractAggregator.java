package com.lingdu.dsl.aggregators;

public abstract class AbstractAggregator
implements IAggregator
{
public boolean isPostAggregator()
{
  return false;
}
}
