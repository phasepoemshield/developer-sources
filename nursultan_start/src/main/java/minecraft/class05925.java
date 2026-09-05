/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03347
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03347;

public final class class05925<T>
extends Record {
    private final class03347<T> type;
    private final T value;

    public class05925(class03347<T> class033472, T t) {
        this.type = class033472;
        this.value = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05925.class, "type;value", "type", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05925.class, "type;value", "type", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05925.class, "type;value", "type", "value"}, this);
    }

    public T y() {
        return this.value;
    }

    public class03347<T> N() {
        return this.type;
    }
}

