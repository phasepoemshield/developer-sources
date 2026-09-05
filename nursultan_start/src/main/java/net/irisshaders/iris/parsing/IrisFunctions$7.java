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

class IrisFunctions$7
extends AbstractTypedFunction {
    final /* synthetic */ int val$finalLength;

    IrisFunctions$7(Type type, Type[] typeArray, int n) {
        this.val$finalLength = n;
        super(type, typeArray);
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        for (int i = 0; i < this.val$finalLength; i += 2) {
            expressionArray[i].evaluateTo(functionContext, functionReturn);
            if (functionReturn.booleanReturn) {
                expressionArray[i + 1].evaluateTo(functionContext, functionReturn);
                return;
            }
            expressionArray[this.val$finalLength].evaluateTo(functionContext, functionReturn);
        }
    }
}

