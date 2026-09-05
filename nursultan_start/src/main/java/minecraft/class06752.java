/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06889;

final class class06752
extends Record {
    private final class06889[] points;
    private final int color;

    class06752(class06889[] class06889Array, int n) {
        this.points = class06889Array;
        this.color = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06752.class, "points;color", "points", "color"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06752.class, "points;color", "points", "color"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06752.class, "points;color", "points", "color"}, this);
    }

    public int y() {
        return this.color;
    }

    public class06889[] N() {
        return this.points;
    }
}

