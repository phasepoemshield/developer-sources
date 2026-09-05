/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.expression;

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.expression.VariableExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;

public class BasicVariableExpression
implements VariableExpression {
    private final String name;
    private final Type type;

    public BasicVariableExpression(String string, Type type) {
        this.name = string;
        this.type = type;
    }

    @Override
    public Expression partialEval(FunctionContext functionContext, FunctionReturn functionReturn) {
        if (functionContext.hasVariable(this.name)) {
            functionContext.getVariable(this.name).evaluateTo(functionContext, functionReturn);
            return this.type.createConstant(functionReturn);
        }
        return this;
    }

    @Override
    public void evaluateTo(FunctionContext functionContext, FunctionReturn functionReturn) {
        functionContext.getVariable(this.name).evaluateTo(functionContext, functionReturn);
    }
}

