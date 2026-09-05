/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06889;

public class class11065
extends Record {
    public boolean detached;
    public boolean pullback;
    public class06889 point;

    public class06889 L() {
        return this.point;
    }

    public class11065(class06889 class068892, boolean bl) {
        this(class068892, bl, false);
    }

    public class11065(class06889 class068892, boolean bl, boolean bl2) {
        this.point = class068892;
        this.detached = bl;
        this.pullback = bl2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11065.class, "point;detached;pullback", "point", "detached", "pullback"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11065.class, "point;detached;pullback", "point", "detached", "pullback"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11065.class, "point;detached;pullback", "point", "detached", "pullback"}, this);
    }

    public boolean y() {
        return this.detached;
    }

    public boolean N() {
        return this.pullback;
    }
}

