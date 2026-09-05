/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00150
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00150;

final class class00139<T>
extends Record {
    private final class00150 sign;
    final T value;

    class00139(class00150 class001502, T t) {
        this.sign = class001502;
        this.value = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00139.class, "sign;value", "sign", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00139.class, "sign;value", "sign", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00139.class, "sign;value", "sign", "value"}, this);
    }

    public T y() {
        return this.value;
    }

    public class00150 N() {
        return this.sign;
    }
}

