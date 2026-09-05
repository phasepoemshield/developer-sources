/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import java.util.Arrays;
import java.util.Objects;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.TypedFunction;
import kroppeb.stareval.function.TypedFunction$Parameter;

public abstract class AbstractTypedFunction
implements TypedFunction {
    private final Type returnType;
    private final TypedFunction$Parameter[] parameters;
    private final int priority;
    private final boolean isPure;

    public AbstractTypedFunction(Type type, TypedFunction$Parameter[] typedFunction$ParameterArray, int n, boolean bl) {
        this.returnType = type;
        this.parameters = typedFunction$ParameterArray;
        this.priority = n;
        this.isPure = bl;
    }

    public AbstractTypedFunction(Type type, Type[] typeArray) {
        this.returnType = type;
        this.parameters = (TypedFunction$Parameter[])Arrays.stream(typeArray).map(TypedFunction$Parameter::new).toArray(TypedFunction$Parameter[]::new);
        this.priority = 0;
        this.isPure = true;
    }

    @Override
    public int priority() {
        return this.priority;
    }

    public boolean equals(Object object) {
        if (object instanceof AbstractTypedFunction) {
            AbstractTypedFunction abstractTypedFunction = (AbstractTypedFunction)object;
            return Objects.equals(this.returnType, abstractTypedFunction.returnType) && Arrays.equals(this.parameters, abstractTypedFunction.parameters) && this.priority == abstractTypedFunction.priority && this.isPure == abstractTypedFunction.isPure;
        }
        return false;
    }

    public String toString() {
        return TypedFunction.format(this, "unknown");
    }

    public int hashCode() {
        return Objects.hash(this.returnType, Arrays.hashCode(this.parameters), this.priority, this.isPure);
    }

    @Override
    public Type getReturnType() {
        return this.returnType;
    }

    @Override
    public TypedFunction$Parameter[] getParameters() {
        return this.parameters;
    }

    @Override
    public boolean isPure() {
        return this.isPure;
    }
}

