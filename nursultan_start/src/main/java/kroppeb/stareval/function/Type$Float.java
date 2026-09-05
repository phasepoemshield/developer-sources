/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type$Float$1;
import kroppeb.stareval.function.Type$Primitive;

public class Type$Float
extends Type$Primitive {
    @Override
    public String toString() {
        return "float";
    }

    @Override
    public ConstantExpression createConstant(FunctionReturn functionReturn) {
        float f = functionReturn.floatReturn;
        return new Type$Float$1(this, this, f);
    }

    @Override
    public Object createArray(int n) {
        return new float[n];
    }

    @Override
    public void getValueFromArray(Object object, int n, FunctionReturn functionReturn) {
        float[] fArray = (float[])object;
        functionReturn.floatReturn = fArray[n];
    }

    @Override
    public void setValueFromReturn(Object object, int n, FunctionReturn functionReturn) {
        float[] fArray = (float[])object;
        fArray[n] = functionReturn.floatReturn;
    }
}

