/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.Type$Float;

class Type$Float$1
extends ConstantExpression {
    final /* synthetic */ float val$value;

    Type$Float$1(Type.Float float_, Type type, float f) {
        this.val$value = f;
        super(type);
    }

    @Override
    public void evaluateTo(FunctionContext functionContext, FunctionReturn functionReturn) {
        functionReturn.floatReturn = this.val$value;
    }
}

