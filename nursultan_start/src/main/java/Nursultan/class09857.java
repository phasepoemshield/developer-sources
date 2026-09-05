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

public final class class09857
extends Record {
    private final boolean ctrl;
    private final boolean shift;
    private final boolean alt;
    private final boolean meta;
    public static final class09857 N = new class09857(false, false, false, false);

    public boolean L() {
        return this.alt;
    }

    public class09857(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.ctrl = bl;
        this.shift = bl2;
        this.alt = bl3;
        this.meta = bl4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09857.class, "ctrl;shift;alt;meta", "ctrl", "shift", "alt", "meta"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09857.class, "ctrl;shift;alt;meta", "ctrl", "shift", "alt", "meta"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09857.class, "ctrl;shift;alt;meta", "ctrl", "shift", "alt", "meta"}, this);
    }

    public boolean u() {
        return this.meta;
    }

    public boolean y() {
        return this.shift;
    }

    public boolean N() {
        return this.ctrl;
    }
}

