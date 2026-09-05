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

public final class class09876
extends Record {
    private final boolean capture;
    private final boolean once;
    private final boolean passive;
    public static final class09876 N = new class09876(false, false, false);

    public static class09876 L() {
        return new class09876(false, false, true);
    }

    public class09876(boolean bl, boolean bl2, boolean bl3) {
        this.capture = bl;
        this.once = bl2;
        this.passive = bl3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09876.class, "capture;once;passive", "capture", "once", "passive"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09876.class, "capture;once;passive", "capture", "once", "passive"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09876.class, "capture;once;passive", "capture", "once", "passive"}, this);
    }

    public boolean i() {
        return this.once;
    }

    public boolean u() {
        return this.capture;
    }

    public static class09876 y() {
        return new class09876(false, true, false);
    }

    public static class09876 N() {
        return new class09876(true, false, false);
    }

    public boolean R() {
        return this.passive;
    }
}

