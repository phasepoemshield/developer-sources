/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11308;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11316
extends Record {
    public long generation;
    public long presetId;
    public class11308 phase;
    public static Object u_0;

    public static class11316 L() {
        return (class11316)((Object)u_0);
    }

    public class11316(class11308 class113082, long l, long l2) {
        this.phase = class113082;
        this.presetId = l;
        this.generation = l2;
    }

    static {
        class11316.R();
        u_0 = new class11316(class11308.IDLE, 0L, 0L);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11316.class, "phase;presetId;generation", "phase", "presetId", "generation"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11316.class, "phase;presetId;generation", "phase", "presetId", "generation"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11316.class, "phase;presetId;generation", "phase", "presetId", "generation"}, this);
    }

    public long u() {
        return this.presetId;
    }

    public long y() {
        return this.generation;
    }

    public class11308 N() {
        return this.phase;
    }

    private static void R() {
        u_0 = null;
    }
}

