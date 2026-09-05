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
public interface F2IFunction
extends TypedFunction {
    public int eval(float var1);

    @Override
    default public Type getReturnType() {
        return Type.Int;
    }

    @Override
    default public TypedFunction$Parameter[] getParameters() {
        return new TypedFunction$Parameter[]{Type.FloatParameter};
    }

    @Override
    default public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        functionReturn.intReturn = this.eval(functionReturn.floatReturn);
    }
}

