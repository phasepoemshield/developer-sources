/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.function;

import java.util.Objects;
import kroppeb.stareval.function.Type;

public class TypedFunction$Parameter {
    private final Type type;
    private final boolean isConstant;

    public TypedFunction$Parameter(Type type, boolean bl) {
        this.type = type;
        this.isConstant = bl;
    }

    public TypedFunction$Parameter(Type type) {
        this(type, false);
    }

    public Type type() {
        return this.type;
    }

    public boolean equals(Object object) {
        if (object instanceof TypedFunction$Parameter) {
            TypedFunction$Parameter typedFunction$Parameter = (TypedFunction$Parameter)object;
            return Objects.equals(this.type, typedFunction$Parameter.type) && Objects.equals(this.isConstant, typedFunction$Parameter.isConstant);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.type) + 3192 + Objects.hashCode(this.isConstant);
    }

    public boolean constant() {
        return this.isConstant;
    }
}

