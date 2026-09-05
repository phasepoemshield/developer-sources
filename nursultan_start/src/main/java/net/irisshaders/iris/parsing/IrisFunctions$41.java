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

import java.util.function.Consumer;
import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.TypedFunction;

class IrisFunctions$41
implements TypedFunction {
    final /* synthetic */ Type val$to;
    final /* synthetic */ Type val$from;
    final /* synthetic */ Consumer val$function;

    IrisFunctions$41() {
        this.val$to = var1_1;
        this.val$from = var2_2;
        this.val$function = var3_3;
    }

    public Type getReturnType() {
        return this.val$to;
    }

    public TypedFunction.Parameter[] getParameters() {
        return new TypedFunction.Parameter[]{new TypedFunction.Parameter(this.val$from)};
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        this.val$function.accept(functionReturn);
    }
}

