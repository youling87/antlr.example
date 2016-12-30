package com.pihui.nbsp.booleanExprs;

import com.pihui.nbsp.dsl.filters.Filter;

public abstract interface IBooleanExpr
{
  public abstract Filter getFilter();
}
