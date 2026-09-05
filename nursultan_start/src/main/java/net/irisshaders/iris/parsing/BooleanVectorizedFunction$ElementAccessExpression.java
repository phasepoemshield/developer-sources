/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.expression.VariableExpression
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 */
package net.irisshaders.iris.parsing;

import java.util.Collection;
import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.expression.VariableExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.parsing.BooleanVectorizedFunction;

class BooleanVectorizedFunction$ElementAccessExpression
implements Expression {
    final Type parameterType;
    Object vector;
    final /* synthetic */ BooleanVectorizedFunction this$0;

    BooleanVectorizedFunction$ElementAccessExpression(BooleanVectorizedFunction booleanVectorizedFunction, Type type) {
        this.this$0 = booleanVectorizedFunction;
        this.parameterType = type;
    }

    public void listVariables(Collection<? super VariableExpression> collection) {
        throw new IllegalStateException();
    }

    public void evaluateTo(FunctionContext functionContext, FunctionReturn functionReturn) {
        this.parameterType.getValueFromArray(this.vector, this.this$0.index, functionReturn);
    }
}

