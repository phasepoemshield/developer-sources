/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09847
extends Record {
    private final boolean changed;
    static final class09847 N = new class09847(false);
    static final class09847 y = new class09847(true);

    class09847(boolean bl) {
        this.changed = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09847.class, "changed", "changed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09847.class, "changed", "changed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09847.class, "changed", "changed"}, this);
    }

    public boolean N() {
        return this.changed;
    }
}

