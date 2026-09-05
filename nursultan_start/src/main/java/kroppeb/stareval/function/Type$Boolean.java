/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type$Boolean$1;
import kroppeb.stareval.function.Type$Primitive;

public class Type$Boolean
extends Type$Primitive {
    @Override
    public String toString() {
        return "bool";
    }

    @Override
    public ConstantExpression createConstant(FunctionReturn functionReturn) {
        boolean bl = functionReturn.booleanReturn;
        return new Type$Boolean$1(this, this, bl);
    }

    @Override
    public Object createArray(int n) {
        return new boolean[n];
    }

    @Override
    public void getValueFromArray(Object object, int n, FunctionReturn functionReturn) {
        boolean[] blArray = (boolean[])object;
        functionReturn.booleanReturn = blArray[n];
    }

    @Override
    public void setValueFromReturn(Object object, int n, FunctionReturn functionReturn) {
        boolean[] blArray = (boolean[])object;
        blArray[n] = functionReturn.booleanReturn;
    }
}

