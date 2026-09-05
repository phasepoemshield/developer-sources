/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class02082<T>
extends Record {
    final T value;
    private final Lifecycle lifecycle;

    class02082(T t, Lifecycle lifecycle) {
        this.value = t;
        this.lifecycle = lifecycle;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02082.class, "value;lifecycle", "value", "lifecycle"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02082.class, "value;lifecycle", "value", "lifecycle"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02082.class, "value;lifecycle", "value", "lifecycle"}, this);
    }

    public Lifecycle y() {
        return this.lifecycle;
    }

    public T N() {
        return this.value;
    }
}

