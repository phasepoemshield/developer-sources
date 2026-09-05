/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.Type$ObjectType;

class Type$ObjectType$1
extends ConstantExpression {
    final /* synthetic */ Object val$object;

    Type$ObjectType$1(Type.ObjectType objectType, Type type, Object object) {
        this.val$object = object;
        super(type);
    }

    @Override
    public void evaluateTo(FunctionContext functionContext, FunctionReturn functionReturn) {
        functionReturn.objectReturn = this.val$object;
    }
}

