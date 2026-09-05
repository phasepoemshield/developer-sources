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

public final class class03126
extends Record {
    private final byte flags;
    public static final class03126 N = new class03126(0);
    private static final byte L = 1;
    private static final byte u = 2;

    public boolean L() {
        return (this.flags & 2) != 0;
    }

    public class03126(byte by) {
        this.flags = by;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03126.class, "flags", "flags"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03126.class, "flags", "flags"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03126.class, "flags", "flags"}, this);
    }

    public byte i() {
        return this.flags;
    }

    public class03126 u() {
        return this.N((byte)2);
    }

    public class03126 y() {
        return this.N((byte)1);
    }

    public boolean N() {
        return (this.flags & 1) != 0;
    }

    private class03126 N(byte by) {
        int n = this.flags | by;
        return n != this.flags ? new class03126((byte)n) : this;
    }
}

