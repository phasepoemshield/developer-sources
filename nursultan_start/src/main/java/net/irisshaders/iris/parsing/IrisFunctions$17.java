/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.function.AbstractTypedFunction
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.parsing;

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.AbstractTypedFunction;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import org.joml.Vector4f;

class IrisFunctions$17
extends AbstractTypedFunction {
    IrisFunctions$17(Type type, Type[] typeArray) {
        super(type, typeArray);
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        float f = functionReturn.floatReturn;
        expressionArray[1].evaluateTo(functionContext, functionReturn);
        float f2 = functionReturn.floatReturn;
        expressionArray[2].evaluateTo(functionContext, functionReturn);
        float f3 = functionReturn.floatReturn;
        expressionArray[3].evaluateTo(functionContext, functionReturn);
        float f4 = functionReturn.floatReturn;
        functionReturn.objectReturn = new Vector4f(f, f2, f3, f4);
    }
}

