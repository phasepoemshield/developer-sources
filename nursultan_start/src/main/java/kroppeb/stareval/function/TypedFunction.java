/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import java.util.Arrays;
import java.util.stream.Collectors;
import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.TypedFunction$Parameter;

public interface TypedFunction {
    default public int priority() {
        return 0;
    }

    public static String format(TypedFunction typedFunction, String string) {
        return String.format("%s %s(%s) (priority: %d, pure:%s)", typedFunction.getReturnType().toString(), string, Arrays.stream(typedFunction.getParameters()).map(typedFunction$Parameter -> typedFunction$Parameter.constant() ? "const " + String.valueOf(typedFunction$Parameter.type()) : typedFunction$Parameter.type().toString()).collect(Collectors.joining(", ")), typedFunction.priority(), typedFunction.isPure() ? "yes" : "no");
    }

    public Type getReturnType();

    public TypedFunction$Parameter[] getParameters();

    public void evaluateTo(Expression[] var1, FunctionContext var2, FunctionReturn var3);

    default public boolean isPure() {
        return true;
    }
}

