/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.TypedFunction;
import kroppeb.stareval.function.TypedFunction$Parameter;

@FunctionalInterface
public interface FFF2FFunction
extends TypedFunction {
    public float eval(float var1, float var2, float var3);

    @Override
    default public Type getReturnType() {
        return Type.Float;
    }

    @Override
    default public TypedFunction$Parameter[] getParameters() {
        return new TypedFunction$Parameter[]{Type.FloatParameter, Type.FloatParameter, Type.FloatParameter};
    }

    @Override
    default public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        float f = functionReturn.floatReturn;
        expressionArray[1].evaluateTo(functionContext, functionReturn);
        float f2 = functionReturn.floatReturn;
        expressionArray[2].evaluateTo(functionContext, functionReturn);
        float f3 = functionReturn.floatReturn;
        functionReturn.floatReturn = this.eval(f, f2, f3);
    }
}

