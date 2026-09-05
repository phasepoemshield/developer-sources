/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.function.AbstractTypedFunction
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  org.joml.Vector2f
 */
package net.irisshaders.iris.parsing;

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.AbstractTypedFunction;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import org.joml.Vector2f;

class IrisFunctions$18
extends AbstractTypedFunction {
    IrisFunctions$18(Type type, Type[] typeArray) {
        super(type, typeArray);
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        functionReturn.floatReturn = ((Vector2f)functionReturn.objectReturn).x;
    }
}

