/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type$Int$1;
import kroppeb.stareval.function.Type$Primitive;

public class Type$Int
extends Type$Primitive {
    @Override
    public String toString() {
        return "int";
    }

    @Override
    public ConstantExpression createConstant(FunctionReturn functionReturn) {
        int n = functionReturn.intReturn;
        return new Type$Int$1(this, this, n);
    }

    @Override
    public Object createArray(int n) {
        return new int[n];
    }

    @Override
    public void getValueFromArray(Object object, int n, FunctionReturn functionReturn) {
        int[] nArray = (int[])object;
        functionReturn.intReturn = nArray[n];
    }

    @Override
    public void setValueFromReturn(Object object, int n, FunctionReturn functionReturn) {
        int[] nArray = (int[])object;
        nArray[n] = functionReturn.intReturn;
    }
}

