package com.lingdu.parser.function;

import java.lang.reflect.Constructor;
import java.util.List;

import com.lingdu.operands.Oprand;
class CommonFuncation implements Funcation {
    private Constructor<? extends Oprand> constructor;
    private String type;

    public CommonFuncation(Class<? extends Oprand> oprandClazz, String type) {
        try {
            this.constructor = oprandClazz.getConstructor(new Class[] { String.class, List.class });
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        this.type = type;
    }

    public Object call(Object... args) {
        try {
            return this.constructor.newInstance(new Object[] { this.type,  args[0] });
        } catch (Exception localException) {
            localException.printStackTrace();
            throw new RuntimeException("parser sql aggregators error type["+type+"]");
        }
    }
}
