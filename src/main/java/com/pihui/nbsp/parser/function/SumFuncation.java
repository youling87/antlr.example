package com.pihui.nbsp.parser.function;

import java.util.List;

import com.pihui.nbsp.operands.NameOprand;
import com.pihui.nbsp.operands.math.SumOprand;

class SumFuncation
implements Funcation
{
public Object call(Object... args)
{
    NameOprand op = null; 
    if(args[0] instanceof List){
        op = (NameOprand)((List)args[0]).get(0);
    }
    String alias = null;
    if(args.length==2){
        alias = args[1].toString();
    }
  return new SumOprand("sum", op,alias);
}
}
