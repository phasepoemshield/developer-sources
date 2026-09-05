/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.resolver;

import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.resolver.ExpressionResolver;

class ExpressionResolver$4
extends ConstantExpression {
    final /* synthetic */ float val$res;

    ExpressionResolver$4(ExpressionResolver expressionResolver, Type type, float f) {
        this.val$res = f;
        super(type);
    }

    @Override
    public void evaluateTo(FunctionContext functionContext, FunctionReturn functionReturn) {
        functionReturn.floatReturn = this.val$res;
    }
}

