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
import minecraft.class02362;

final class class02365<B, V, T>
extends Record {
    final class02362<? super B, ? extends V> serializer;
    final T type;

    class02365(class02362<? super B, ? extends V> class023622, T t) {
        this.serializer = class023622;
        this.type = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02365.class, "serializer;type", "serializer", "type"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02365.class, "serializer;type", "serializer", "type"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02365.class, "serializer;type", "serializer", "type"}, this);
    }

    public T y() {
        return this.type;
    }

    public class02362<? super B, ? extends V> N() {
        return this.serializer;
    }
}

