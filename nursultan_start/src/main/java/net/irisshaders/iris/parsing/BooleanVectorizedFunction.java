/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  kroppeb.stareval.function.Type$Primitive
 *  kroppeb.stareval.function.TypedFunction
 *  kroppeb.stareval.function.TypedFunction$Parameter
 */
package net.irisshaders.iris.parsing;

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.TypedFunction;
import net.irisshaders.iris.parsing.BooleanVectorizedFunction$ElementAccessExpression;
import net.irisshaders.iris.parsing.VectorType;

public class BooleanVectorizedFunction
implements TypedFunction {
    final TypedFunction inner;
    final int size;
    final TypedFunction.Parameter[] parameters;
    private final BooleanVectorizedFunction$ElementAccessExpression[] vectorAccessors;
    int index;

    public BooleanVectorizedFunction(TypedFunction typedFunction, int n) {
        this.inner = typedFunction;
        this.size = n;
        TypedFunction.Parameter[] parameterArray = typedFunction.getParameters();
        this.parameters = new TypedFunction.Parameter[parameterArray.length];
        this.vectorAccessors = new BooleanVectorizedFunction$ElementAccessExpression[parameterArray.length];
        for (int i = 0; i < parameterArray.length; ++i) {
            this.parameters[i] = new TypedFunction.Parameter((Type)VectorType.of((Type.Primitive)parameterArray[i].type(), n));
            this.vectorAccessors[i] = new BooleanVectorizedFunction$ElementAccessExpression(this, parameterArray[i].type());
        }
    }

    public Type getReturnType() {
        return Type.Boolean;
    }

    public TypedFunction.Parameter[] getParameters() {
        return this.parameters;
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        int n;
        for (n = 0; n < expressionArray.length; ++n) {
            Expression expression = expressionArray[n];
            expression.evaluateTo(functionContext, functionReturn);
            this.vectorAccessors[n].vector = functionReturn.objectReturn;
        }
        n = 0;
        while (n < this.size) {
            this.index = n++;
            this.inner.evaluateTo((Expression[])this.vectorAccessors, functionContext, functionReturn);
            if (functionReturn.booleanReturn) continue;
            return;
        }
    }
}

