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
public interface V2FFunction
extends TypedFunction {
    public float eval();

    @Override
    default public Type getReturnType() {
        return Type.Float;
    }

    @Override
    default public TypedFunction$Parameter[] getParameters() {
        return new TypedFunction$Parameter[0];
    }

    @Override
    default public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        functionReturn.floatReturn = this.eval();
    }
}

