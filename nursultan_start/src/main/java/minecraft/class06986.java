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

final class class06986<T>
extends Record {
    private final T value;
    private final long expiresAfterTime;
    private static final long L = -1L;

    class06986(T t, long l) {
        this.value = t;
        this.expiresAfterTime = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06986.class, "value;expiresAfterTime", "value", "expiresAfterTime"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06986.class, "value;expiresAfterTime", "value", "expiresAfterTime"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06986.class, "value;expiresAfterTime", "value", "expiresAfterTime"}, this);
    }

    public long y() {
        return this.expiresAfterTime;
    }

    public T N() {
        return this.value;
    }

    public boolean N(long l) {
        if (this.expiresAfterTime == -1L) {
            return false;
        }
        return l >= this.expiresAfterTime;
    }
}

