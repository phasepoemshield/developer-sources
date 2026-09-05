/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.resolver;

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.expression.VariableExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;

class ExpressionResolver$2
implements VariableExpression {
    final /* synthetic */ String val$name;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    ExpressionResolver$2() {
        void var2_-1;
        this.val$name = var2_-1;
    }

    @Override
    public Expression partialEval(FunctionContext functionContext, FunctionReturn functionReturn) {
        return functionContext.hasVariable(this.val$name) ? functionContext.getVariable(this.val$name) : this;
    }

    @Override
    public void evaluateTo(FunctionContext functionContext, FunctionReturn functionReturn) {
        functionContext.getVariable(this.val$name).evaluateTo(functionContext, functionReturn);
    }
}

