/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.Util
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.function.AbstractTypedFunction
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 */
package net.irisshaders.iris.parsing;

import java.util.Arrays;
import kroppeb.stareval.Util;
import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.AbstractTypedFunction;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.parsing.VectorType$ArrayVector;

public class VectorConstructor
extends AbstractTypedFunction {
    public VectorConstructor(Type type, int n) {
        super((Type)new VectorType$ArrayVector(type, n), (Type[])Util.make((Object)new Type[n], typeArray -> Arrays.fill(typeArray, type)));
    }

    public VectorType$ArrayVector getReturnType() {
        return (VectorType$ArrayVector)super.getReturnType();
    }

    public void evaluateTo(Expression[] expressionArray2, FunctionContext functionContext2, FunctionReturn functionReturn2) {
        VectorType$ArrayVector vectorType$ArrayVector = this.getReturnType();
        vectorType$ArrayVector.map(expressionArray2, functionContext2, functionReturn2, (n, expressionArray, functionContext, functionReturn) -> expressionArray[n].evaluateTo(functionContext, functionReturn));
    }
}

