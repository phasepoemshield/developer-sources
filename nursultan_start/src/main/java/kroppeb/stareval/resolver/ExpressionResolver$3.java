/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.resolver;

import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.resolver.ExpressionResolver;

class ExpressionResolver$3
extends ConstantExpression {
    final /* synthetic */ int val$val;

    ExpressionResolver$3(ExpressionResolver expressionResolver, Type type, int n) {
        this.val$val = n;
        super(type);
    }

    @Override
    public void evaluateTo(FunctionContext functionContext, FunctionReturn functionReturn) {
        functionReturn.intReturn = this.val$val;
    }
}

