/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.function.AbstractTypedFunction
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 */
package net.irisshaders.iris.parsing;

import java.util.function.BiConsumer;
import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.AbstractTypedFunction;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.parsing.VectorType$JOMLVector;

class IrisFunctions$37
extends AbstractTypedFunction {
    private final T vector;
    final /* synthetic */ VectorType$JOMLVector val$type;
    final /* synthetic */ BiConsumer val$function;

    IrisFunctions$37(Type type, Type[] typeArray, VectorType$JOMLVector vectorType$JOMLVector, BiConsumer biConsumer) {
        this.val$type = vectorType$JOMLVector;
        this.val$function = biConsumer;
        super(type, typeArray);
        this.vector = this.val$type.create();
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        Object object = functionReturn.objectReturn;
        this.val$function.accept(object, this.vector);
        functionReturn.objectReturn = this.vector;
    }
}

