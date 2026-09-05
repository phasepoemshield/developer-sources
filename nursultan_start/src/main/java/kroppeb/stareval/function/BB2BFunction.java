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
public interface BB2BFunction
extends TypedFunction {
    public boolean eval(boolean var1, boolean var2);

    @Override
    default public Type getReturnType() {
        return Type.Boolean;
    }

    @Override
    default public TypedFunction$Parameter[] getParameters() {
        return new TypedFunction$Parameter[]{Type.BooleanParameter, Type.BooleanParameter};
    }

    @Override
    default public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        boolean bl = functionReturn.booleanReturn;
        expressionArray[1].evaluateTo(functionContext, functionReturn);
        boolean bl2 = functionReturn.booleanReturn;
        functionReturn.booleanReturn = this.eval(bl, bl2);
    }
}

