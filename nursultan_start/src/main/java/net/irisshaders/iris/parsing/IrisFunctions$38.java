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

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.AbstractTypedFunction;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.parsing.IrisFunctions$TriConsumer;
import net.irisshaders.iris.parsing.VectorType$JOMLVector;

class IrisFunctions$38
extends AbstractTypedFunction {
    private final T vector;
    final /* synthetic */ VectorType$JOMLVector val$type;
    final /* synthetic */ IrisFunctions$TriConsumer val$function;

    IrisFunctions$38(Type type, Type[] typeArray, VectorType$JOMLVector vectorType$JOMLVector, IrisFunctions$TriConsumer triConsumer) {
        this.val$type = vectorType$JOMLVector;
        this.val$function = triConsumer;
        super(type, typeArray);
        this.vector = this.val$type.create();
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        Object object = functionReturn.objectReturn;
        expressionArray[1].evaluateTo(functionContext, functionReturn);
        Object object2 = functionReturn.objectReturn;
        this.val$function.accept(object, object2, this.vector);
        functionReturn.objectReturn = this.vector;
    }
}

