/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00549
 *  minecraft.class02696
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00549;
import minecraft.class02225;
import minecraft.class02230;
import minecraft.class02237;
import minecraft.class02696;

public final class class02238
extends Record {
    private final ImmutableList<class02237> steps;
    public static final class02238 N = new class02230().N(class00549.L, $$0 -> $$0).N(class00549.u, $$0 -> $$0.N(class02696::y)).N(class00549.i, class022252 -> class022252.N(class00549.u, 8).N(class02696::u)).N(class00549.R, class022252 -> class022252.N(class00549.u, 8).N(class02696::i)).N(class00549.M, class022252 -> class022252.N(class00549.u, 8).N(class00549.R, 1).N(0).N(class02696::R)).N(class00549.B, class022252 -> class022252.N(class00549.u, 8).N(class00549.R, 1).N(0).N(class02696::M)).N(class00549.Z, class022252 -> class022252.N(class00549.u, 8).N(0).N(class02696::B)).N(class00549.z, class022252 -> class022252.N(class00549.u, 8).N(class00549.Z, 1).N(1).N(class02696::Z)).N(class00549.U, $$0 -> $$0.N(class02696::z)).N(class00549.E, $$0 -> $$0.N(class00549.U, 1).N(class02696::U)).N(class00549.W, class022252 -> class022252.N(class00549.R, 1).N(class02696::E)).N(class00549.m, class022252 -> class022252.N(class02696::W)).N();
    public static final class02238 y = new class02230().N(class00549.L, class022252 -> class022252).N(class00549.u, $$0 -> $$0.N(class02696::L)).N(class00549.i, class022252 -> class022252).N(class00549.R, class022252 -> class022252).N(class00549.M, $$0 -> $$0).N(class00549.B, $$0 -> $$0).N(class00549.Z, $$0 -> $$0).N(class00549.z, $$0 -> $$0).N(class00549.U, $$0 -> $$0.N(class02696::z)).N(class00549.E, $$0 -> $$0.N(class00549.U, 1).N(class02696::U)).N(class00549.W, class022252 -> class022252).N(class00549.m, class022252 -> class022252.N(class02696::W)).N();

    private static /* synthetic */ class02225 L(class02225 class022252) {
        return class022252.N(class00549.U, 1).N(class02696::U);
    }

    private static /* synthetic */ class02225 P(class02225 class022252) {
        return class022252.N(class00549.U, 1).N(class02696::U);
    }

    public class02238(ImmutableList<class02237> immutableList) {
        this.steps = immutableList;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02238.class, "steps", "steps"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02238.class, "steps", "steps"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02238.class, "steps", "steps"}, this);
    }

    private static /* synthetic */ class02225 B(class02225 class022252) {
        return class022252;
    }

    private static /* synthetic */ class02225 Z(class02225 class022252) {
        return class022252;
    }

    private static /* synthetic */ class02225 s(class02225 class022252) {
        return class022252.N(class02696::z);
    }

    private static /* synthetic */ class02225 U(class02225 class022252) {
        return class022252.N(class02696::L);
    }

    private static /* synthetic */ class02225 z(class02225 class022252) {
        return class022252;
    }

    private static /* synthetic */ class02225 u(class02225 class022252) {
        return class022252.N(class02696::z);
    }

    private static /* synthetic */ class02225 y(class02225 class022252) {
        return class022252;
    }

    private static /* synthetic */ class02225 E(class02225 class022252) {
        return class022252;
    }

    public ImmutableList<class02237> N() {
        return this.steps;
    }

    public class02237 N(class00549 class005492) {
        return (class02237)((Object)this.steps.get(class005492.y()));
    }

    private static /* synthetic */ class02225 R(class02225 class022252) {
        return class022252;
    }

    private static /* synthetic */ class02225 G(class02225 class022252) {
        return class022252.N(class02696::y);
    }
}

