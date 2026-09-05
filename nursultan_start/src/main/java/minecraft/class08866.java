/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import minecraft.class00500;

public final class class08866<T>
extends Record {
    final Predicate<class00500> condition;
    final T model;

    public class08866(Predicate<class00500> predicate, T t) {
        this.condition = predicate;
        this.model = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08866.class, "condition;model", "condition", "model"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08866.class, "condition;model", "condition", "model"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08866.class, "condition;model", "condition", "model"}, this);
    }

    public T y() {
        return this.model;
    }

    public Predicate<class00500> N() {
        return this.condition;
    }

    public <S> class08866<S> N(S s) {
        return new class08866<S>(this.condition, s);
    }
}

