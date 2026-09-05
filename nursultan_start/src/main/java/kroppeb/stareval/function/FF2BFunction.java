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
public interface FF2BFunction
extends TypedFunction {
    public boolean eval(float var1, float var2);

    @Override
    default public Type getReturnType() {
        return Type.Boolean;
    }

    @Override
    default public TypedFunction$Parameter[] getParameters() {
        return new TypedFunction$Parameter[]{Type.FloatParameter, Type.FloatParameter};
    }

    @Override
    default public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        float f = functionReturn.floatReturn;
        expressionArray[1].evaluateTo(functionContext, functionReturn);
        float f2 = functionReturn.floatReturn;
        functionReturn.booleanReturn = this.eval(f, f2);
    }
}

