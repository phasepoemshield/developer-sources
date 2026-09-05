/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.expression;

import java.util.Collection;
import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.expression.VariableExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.TypedFunction;

public class CallExpression
implements Expression {
    private final TypedFunction function;
    private final Expression[] arguments;

    public CallExpression(TypedFunction typedFunction, Expression[] expressionArray) {
        this.function = typedFunction;
        this.arguments = expressionArray;
    }

    @Override
    public Expression partialEval(FunctionContext functionContext, FunctionReturn functionReturn) {
        if (this.function.isPure() && this.isConstant()) {
            this.evaluateTo(functionContext, functionReturn);
            return this.function.getReturnType().createConstant(functionReturn);
        }
        Expression[] expressionArray = new Expression[this.arguments.length];
        boolean bl = true;
        boolean bl2 = true;
        for (int i = 0; i < this.arguments.length; ++i) {
            Expression expression = this.arguments[i].partialEval(functionContext, functionReturn);
            if (expression instanceof ConstantExpression) {
                bl2 = false;
            } else {
                bl = false;
                if (expression != this.arguments[i]) {
                    bl2 = false;
                }
            }
            expressionArray[i] = expression;
        }
        if (this.function.isPure() && bl) {
            this.function.evaluateTo(expressionArray, functionContext, functionReturn);
            return this.function.getReturnType().createConstant(functionReturn);
        }
        if (bl2) {
            return this;
        }
        return new CallExpression(this.function, expressionArray);
    }

    @Override
    public void listVariables(Collection<? super VariableExpression> collection) {
        for (Expression expression : this.arguments) {
            expression.listVariables(collection);
        }
    }

    @Override
    public void evaluateTo(FunctionContext functionContext, FunctionReturn functionReturn) {
        this.function.evaluateTo(this.arguments, functionContext, functionReturn);
    }

    private boolean isConstant() {
        for (Expression expression : this.arguments) {
            if (expression instanceof ConstantExpression) continue;
            return false;
        }
        return true;
    }
}

