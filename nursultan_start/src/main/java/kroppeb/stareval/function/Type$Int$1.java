/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.Type$Int;

class Type$Int$1
extends ConstantExpression {
    final /* synthetic */ int val$value;

    Type$Int$1(Type.Int intVal, Type type, int n) {
        this.val$value = n;
        super(type);
    }

    @Override
    public void evaluateTo(FunctionContext functionContext, FunctionReturn functionReturn) {
        functionReturn.intReturn = this.val$value;
    }
}

