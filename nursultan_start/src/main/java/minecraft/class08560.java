/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import minecraft.class08584;

public final class class08560<C, T>
extends Record {
    private final T entry;
    final int priority;
    final class08584<C> condition;
    public static final Comparator<class08560<?, ?>> L = Comparator.comparingInt(class08560::y).reversed();

    public class08584<C> L() {
        return this.condition;
    }

    public class08560(T t, int n, class08584<C> class085842) {
        this.entry = t;
        this.priority = n;
        this.condition = class085842;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08560.class, "entry;priority;condition", "entry", "priority", "condition"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08560.class, "entry;priority;condition", "entry", "priority", "condition"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08560.class, "entry;priority;condition", "entry", "priority", "condition"}, this);
    }

    public int y() {
        return this.priority;
    }

    public T N() {
        return this.entry;
    }
}

