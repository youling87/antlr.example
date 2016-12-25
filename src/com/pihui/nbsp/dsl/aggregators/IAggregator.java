package com.pihui.nbsp.dsl.aggregators;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public abstract interface IAggregator
{
  public abstract String getType();
  
  public abstract String getName();
  
  public abstract void setNameList(List<String> paramString);
  
  @JSONField(deserialize=false, serialize=false)
  public abstract boolean isPostAggregator();
}