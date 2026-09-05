/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.function.AbstractTypedFunction
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 */
package net.irisshaders.iris.parsing;

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.AbstractTypedFunction;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;

class IrisFunctions$4
extends AbstractTypedFunction {
    IrisFunctions$4(Type type, Type[] typeArray) {
        super(type, typeArray);
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        int n = functionReturn.intReturn;
        for (int i = 1; i < expressionArray.length; ++i) {
            expressionArray[1].evaluateTo(functionContext, functionReturn);
            n = Math.max(n, functionReturn.intReturn);
        }
        functionReturn.intReturn = n;
    }
}

