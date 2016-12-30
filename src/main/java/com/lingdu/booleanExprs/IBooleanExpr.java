package com.lingdu.booleanExprs;

import com.lingdu.dsl.filters.Filter;

public abstract interface IBooleanExpr
{
  public abstract Filter getFilter();
}
