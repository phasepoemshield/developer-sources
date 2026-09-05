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
import net.irisshaders.iris.parsing.IrisFunctions$ObjectObject2BooleanFunction;

class IrisFunctions$40
extends AbstractTypedFunction {
    final /* synthetic */ IrisFunctions$ObjectObject2BooleanFunction val$function;
    final /* synthetic */ boolean val$inverted;

    IrisFunctions$40(Type type, Type[] typeArray, IrisFunctions$ObjectObject2BooleanFunction objectObject2BooleanFunction, boolean bl) {
        this.val$function = objectObject2BooleanFunction;
        this.val$inverted = bl;
        super(type, typeArray);
    }

    public void evaluateTo(Expression[] expressionArray, FunctionContext functionContext, FunctionReturn functionReturn) {
        expressionArray[0].evaluateTo(functionContext, functionReturn);
        Object object = functionReturn.objectReturn;
        expressionArray[1].evaluateTo(functionContext, functionReturn);
        Object object2 = functionReturn.objectReturn;
        functionReturn.objectReturn = this.val$function.apply(object, object2) != this.val$inverted;
    }
}

