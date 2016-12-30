package com.lingdu.parser.function;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.lingdu.operands.math.MaxOprand;
import com.lingdu.operands.math.MinOprand;

public class FuncationManager
{
  private static final Map<String, Funcation> funs = new ConcurrentHashMap();
  
  static
  {
    funs.put("max", new CommonFuncation(MaxOprand.class, "max"));
    funs.put("min", new CommonFuncation(MinOprand.class, "min"));
    funs.put("sum", new SumFuncation());
    funs.put("count", new CountFuncation());
  }
  
  public static Funcation getFuncation(String funcationname)
  {
    if (!funs.containsKey(funcationname.toLowerCase())) {
      throw new RuntimeException("parse sql error:not found " + funcationname + " funcation");
    }
    return (Funcation)funs.get(funcationname.toLowerCase());
  }
}

