/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.Type$Boolean;

class Type$Boolean$1
extends ConstantExpression {
    final /* synthetic */ boolean val$value;

    Type$Boolean$1(Type.Boolean boolean_, Type type, boolean bl) {
        this.val$value = bl;
        super(type);
    }

    @Override
    public void evaluateTo(FunctionContext functionContext, FunctionReturn functionReturn) {
        functionReturn.booleanReturn = this.val$value;
    }
}

