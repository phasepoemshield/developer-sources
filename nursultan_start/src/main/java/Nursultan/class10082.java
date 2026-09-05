/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02968
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02968;

public final class class10082<T>
extends Record {
    private final class02968<T> type;
    private final T value;

    public class10082(class02968<T> class029682, T t) {
        this.type = class029682;
        this.value = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10082.class, "type;value", "type", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10082.class, "type;value", "type", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10082.class, "type;value", "type", "value"}, this);
    }

    public T y() {
        return this.value;
    }

    public class02968<T> N() {
        return this.type;
    }

    public <U> Optional<U> N(class02968<U> class029682) {
        return class029682 == this.type ? Optional.of(this.value) : Optional.empty();
    }
}

