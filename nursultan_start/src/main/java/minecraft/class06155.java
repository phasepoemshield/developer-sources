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
import java.util.concurrent.atomic.AtomicLong;

public final class class06155
extends Record {
    final String name;
    final AtomicLong preparationNanos;
    final AtomicLong preparationCount;
    final AtomicLong reloadNanos;
    final AtomicLong reloadCount;

    public AtomicLong L() {
        return this.preparationCount;
    }

    public class06155(String string, AtomicLong atomicLong, AtomicLong atomicLong2, AtomicLong atomicLong3, AtomicLong atomicLong4) {
        this.name = string;
        this.preparationNanos = atomicLong;
        this.preparationCount = atomicLong2;
        this.reloadNanos = atomicLong3;
        this.reloadCount = atomicLong4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06155.class, "name;preparationNanos;preparationCount;reloadNanos;reloadCount", "name", "preparationNanos", "preparationCount", "reloadNanos", "reloadCount"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06155.class, "name;preparationNanos;preparationCount;reloadNanos;reloadCount", "name", "preparationNanos", "preparationCount", "reloadNanos", "reloadCount"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06155.class, "name;preparationNanos;preparationCount;reloadNanos;reloadCount", "name", "preparationNanos", "preparationCount", "reloadNanos", "reloadCount"}, this);
    }

    public AtomicLong i() {
        return this.reloadCount;
    }

    public AtomicLong u() {
        return this.reloadNanos;
    }

    public AtomicLong y() {
        return this.preparationNanos;
    }

    public String N() {
        return this.name;
    }
}

