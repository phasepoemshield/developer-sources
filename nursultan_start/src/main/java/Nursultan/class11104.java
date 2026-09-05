/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11499
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.class11499;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06889;

public class class11104
extends Record {
    public boolean released;
    public boolean flicking;
    public class06889 point;
    public class11499 rotation;

    public class11499 L() {
        return this.rotation;
    }

    public class11104(class06889 class068892, class11499 class114992, boolean bl, boolean bl2) {
        this.point = class068892;
        this.rotation = class114992;
        this.released = bl;
        this.flicking = bl2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11104.class, "point;rotation;released;flicking", "point", "rotation", "released", "flicking"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11104.class, "point;rotation;released;flicking", "point", "rotation", "released", "flicking"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11104.class, "point;rotation;released;flicking", "point", "rotation", "released", "flicking"}, this);
    }

    public class06889 u() {
        return this.point;
    }

    public boolean y() {
        return this.flicking;
    }

    public static class11104 N(class06889 class068892, class11499 class114992) {
        return new class11104(class068892, class114992, false, false);
    }

    public boolean N() {
        return this.released;
    }
}

