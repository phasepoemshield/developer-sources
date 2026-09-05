/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.function.AbstractTypedFunction
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.parsing;

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.AbstractTypedFunction;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import org.joml.Matrix4f;
import org.joml.Vector4f;

class IrisFunctions$36
extends AbstractTypedFunction {
    final /* synthetic */ int val$finalI;

    IrisFunctions$36(Type type, Type[] typeArray, int n) {
        this.val$finalI = n;
        super(type, typeArray);
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        functionReturn.objectReturn = ((Matrix4f)functionReturn.objectReturn).getColumn(this.val$finalI, new Vector4f());
    }
}

