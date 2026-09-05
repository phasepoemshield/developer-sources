/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03869
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class06889
 *  minecraft.class08800
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03869;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class06889;
import minecraft.class08800;

final class class00994
extends Record {
    final class08800 itemRenderState;
    final double xOffset;
    final double yOffset;
    final double zOffset;

    public double L() {
        return this.yOffset;
    }

    private class00994(class08800 class088002, double d, double d2, double d3) {
        this.itemRenderState = class088002;
        this.xOffset = d;
        this.yOffset = d2;
        this.zOffset = d3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00994.class, "itemRenderState;xOffset;yOffset;zOffset", "itemRenderState", "xOffset", "yOffset", "zOffset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00994.class, "itemRenderState;xOffset;yOffset;zOffset", "itemRenderState", "xOffset", "yOffset", "zOffset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00994.class, "itemRenderState;xOffset;yOffset;zOffset", "itemRenderState", "xOffset", "yOffset", "zOffset"}, this);
    }

    public double u() {
        return this.zOffset;
    }

    public double y() {
        return this.xOffset;
    }

    public static class00994 N(class03869 class038692, class05363 class053632, float f) {
        float f2 = ((float)class038692.y + f) / 3.0f;
        f2 *= f2;
        double d = class04995.u((double)f, (double)class038692.M, (double)class038692.u);
        double d2 = class04995.u((double)f, (double)class038692.B, (double)class038692.i);
        double d3 = class04995.u((double)f, (double)class038692.Z, (double)class038692.R);
        double d4 = class04995.u((double)f2, (double)class038692.L.E, (double)d);
        double d5 = class04995.u((double)f2, (double)class038692.L.W, (double)d2);
        double d6 = class04995.u((double)f2, (double)class038692.L.m, (double)d3);
        class06889 class068892 = class053632.y();
        return new class00994(class038692.L, d4 - class068892.N(), d5 - class068892.y(), d6 - class068892.L());
    }

    public class08800 N() {
        return this.itemRenderState;
    }
}

