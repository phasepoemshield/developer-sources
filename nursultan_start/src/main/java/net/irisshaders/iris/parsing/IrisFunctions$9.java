/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.function.AbstractTypedFunction
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  kroppeb.stareval.function.TypedFunction$Parameter
 */
package net.irisshaders.iris.parsing;

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.AbstractTypedFunction;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.TypedFunction;
import net.irisshaders.iris.parsing.SmoothFloat;

class IrisFunctions$9
extends AbstractTypedFunction {
    private final SmoothFloat smoothFloat = new SmoothFloat();

    IrisFunctions$9(Type type, TypedFunction.Parameter[] parameterArray, int n, boolean bl) {
        super(type, parameterArray, n, bl);
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[1].evaluateTo(functionContext, functionReturn);
        float f = functionReturn.floatReturn;
        functionReturn.floatReturn = this.smoothFloat.updateAndGet(f, 1.0f, 1.0f);
    }
}

