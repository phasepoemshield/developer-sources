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

public final class class09741
extends Record {
    private final boolean changed;
    private final boolean layoutChanged;
    public static final class09741 N = new class09741(false, false);
    private static final class09741 u = new class09741(true, false);
    private static final class09741 i = new class09741(true, true);
    private static final class09741 R = new class09741(false, true);

    public class09741(boolean bl, boolean bl2) {
        this.changed = bl;
        this.layoutChanged = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09741.class, "changed;layoutChanged", "changed", "layoutChanged"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09741.class, "changed;layoutChanged", "changed", "layoutChanged"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09741.class, "changed;layoutChanged", "changed", "layoutChanged"}, this);
    }

    public boolean y() {
        return this.layoutChanged;
    }

    public boolean N() {
        return this.changed;
    }

    public static class09741 N(boolean bl, boolean bl2) {
        if (bl) {
            return bl2 ? i : u;
        }
        return bl2 ? R : N;
    }
}

