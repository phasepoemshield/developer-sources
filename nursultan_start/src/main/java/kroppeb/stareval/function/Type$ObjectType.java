/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.Type$ObjectType$1;

public class Type$ObjectType
extends Type {
    @Override
    public String toString() {
        return "Object";
    }

    @Override
    public ConstantExpression createConstant(FunctionReturn functionReturn) {
        Object object = functionReturn.objectReturn;
        return new Type$ObjectType$1(this, this, object);
    }

    @Override
    public Object createArray(int n) {
        return new Object[n];
    }

    @Override
    public void getValueFromArray(Object object, int n, FunctionReturn functionReturn) {
        Object[] objectArray = (Object[])object;
        functionReturn.objectReturn = objectArray[n];
    }

    @Override
    public void setValueFromReturn(Object object, int n, FunctionReturn functionReturn) {
        Object[] objectArray = (Object[])object;
        objectArray[n] = functionReturn.objectReturn;
    }
}

