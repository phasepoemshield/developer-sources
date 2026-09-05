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

public final class class09833
extends Record {
    private final boolean enabled;
    private final float impulse;
    private final float friction;
    private final float stopVelocity;
    private static final float i = 1800.0f;
    private static final float R = 14.0f;
    private static final float M = 4.0f;

    public boolean L() {
        return this.enabled;
    }

    public class09833(boolean bl, float f, float f2, float f3) {
        f = class09833.N(f);
        f2 = class09833.N(f2);
        f3 = class09833.N(f3);
        this.enabled = bl;
        this.impulse = f;
        this.friction = f2;
        this.stopVelocity = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09833.class, "enabled;impulse;friction;stopVelocity", "enabled", "impulse", "friction", "stopVelocity"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09833.class, "enabled;impulse;friction;stopVelocity", "enabled", "impulse", "friction", "stopVelocity"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09833.class, "enabled;impulse;friction;stopVelocity", "enabled", "impulse", "friction", "stopVelocity"}, this);
    }

    public float i() {
        return this.friction;
    }

    public float u() {
        return this.impulse;
    }

    public static class09833 y() {
        return new class09833(false, 1800.0f, 14.0f, 4.0f);
    }

    private static float N(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return 0.0f;
        }
        return Math.max(0.0f, f);
    }

    public static class09833 N() {
        return new class09833(true, 1800.0f, 14.0f, 4.0f);
    }

    public float R() {
        return this.stopVelocity;
    }
}

