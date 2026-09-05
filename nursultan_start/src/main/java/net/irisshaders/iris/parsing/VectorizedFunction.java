/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  kroppeb.stareval.function.TypedFunction
 *  kroppeb.stareval.function.TypedFunction$Parameter
 */
package net.irisshaders.iris.parsing;

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.TypedFunction;
import net.irisshaders.iris.parsing.VectorType$ArrayVector;
import net.irisshaders.iris.parsing.VectorType$ArrayVector$IntObjectObjectObjectConsumer;
import net.irisshaders.iris.parsing.VectorizedFunction$ElementAccessExpression;

public class VectorizedFunction
implements TypedFunction {
    final TypedFunction inner;
    final int size;
    final VectorType$ArrayVector returnType;
    final TypedFunction.Parameter[] parameters;
    private final VectorizedFunction$ElementAccessExpression[] vectorAccessors;
    int index;
    private final VectorType$ArrayVector$IntObjectObjectObjectConsumer<VectorizedFunction, FunctionContext, FunctionReturn> mapper = (n, vectorizedFunction, functionContext, functionReturn) -> {
        vectorizedFunction.index = n;
        vectorizedFunction.inner.evaluateTo((Expression[])vectorizedFunction.vectorAccessors, functionContext, functionReturn);
    };

    public VectorizedFunction(TypedFunction typedFunction, int n2) {
        this.inner = typedFunction;
        this.size = n2;
        this.returnType = new VectorType$ArrayVector(typedFunction.getReturnType(), n2);
        TypedFunction.Parameter[] parameterArray = typedFunction.getParameters();
        this.parameters = new TypedFunction.Parameter[parameterArray.length];
        this.vectorAccessors = new VectorizedFunction$ElementAccessExpression[parameterArray.length];
        for (int i = 0; i < parameterArray.length; ++i) {
            this.parameters[i] = new TypedFunction.Parameter((Type)new VectorType$ArrayVector(parameterArray[i].type(), n2));
            this.vectorAccessors[i] = new VectorizedFunction$ElementAccessExpression(this, parameterArray[i].type());
        }
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public TypedFunction.Parameter[] getParameters() {
        return this.parameters;
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        for (int i = 0; i < expressionArray.length; ++i) {
            Expression expression = expressionArray[i];
            expression.evaluateTo(functionContext, functionReturn);
            this.vectorAccessors[i].vector = functionReturn.objectReturn;
        }
        this.returnType.map(this, functionContext, functionReturn, this.mapper);
    }
}

