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

final class class03390<T>
extends Record {
    final T value;
    final long time;

    class03390(T t, long l) {
        this.value = t;
        this.time = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03390.class, "value;time", "value", "time"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03390.class, "value;time", "value", "time"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03390.class, "value;time", "value", "time"}, this);
    }

    public long y() {
        return this.time;
    }

    public T N() {
        return this.value;
    }
}

