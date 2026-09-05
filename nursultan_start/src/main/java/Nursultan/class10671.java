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

public final class class10671
extends Record {
    public final class06889 pos;
    private final int color;
    private final float size;

    public float L() {
        return this.size;
    }

    public class10671(class06889 class068892, int n, float f) {
        this.pos = class068892;
        this.color = n;
        this.size = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10671.class, "pos;color;size", "pos", "color", "size"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10671.class, "pos;color;size", "pos", "color", "size"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10671.class, "pos;color;size", "pos", "color", "size"}, this);
    }

    public int y() {
        return this.color;
    }

    public class06889 N() {
        return this.pos;
    }
}

