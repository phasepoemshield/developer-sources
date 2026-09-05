/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09982;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09962
extends Record {
    private final class09982 mode;
    private final float min;
    private final float max;
    private final float value;
    private static final float i = Float.POSITIVE_INFINITY;

    public float L(float f) {
        float f2 = Math.max(0.0f, this.min);
        float f3 = Math.max(this.max, f2);
        return class09693.N((float)f, (float)f2, (float)f3);
    }

    public boolean L() {
        return this.mode == class09982.PERCENT;
    }

    private static float M(float f) {
        if (Float.isInfinite(f)) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, f);
    }

    public float M() {
        return this.value;
    }

    public class09962(class09982 class099822, float f, float f2, float f3) {
        this.mode = class099822;
        this.min = f;
        this.max = f2;
        this.value = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09962.class, "mode;min;max;value", "mode", "min", "max", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09962.class, "mode;min;max;value", "mode", "min", "max", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09962.class, "mode;min;max;value", "mode", "min", "max", "value"}, this);
    }

    private static float B(float f) {
        if (Float.isInfinite(f)) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, f);
    }

    public float i() {
        return this.min;
    }

    public float i(float f) {
        return Math.max(0.0f, f) * this.value / 100.0f;
    }

    public float u(float f) {
        float f2 = Math.max(0.0f, f);
        return switch (this.mode) {
            default -> throw new MatchException(null, null);
            case class09982.FIT -> this.L(f2);
            case class09982.GROW -> this.L(f2);
            case class09982.PERCENT -> this.i(f2);
            case class09982.FIXED -> this.value;
        };
    }

    public class09982 u() {
        return this.mode;
    }

    public boolean y() {
        return this.mode == class09982.GROW;
    }

    public static class09962 y(float f) {
        float f2 = class09962.M(f);
        return new class09962(class09982.FIXED, f2, f2, f2);
    }

    public static class09962 y(float f, float f2) {
        return new class09962(class09982.GROW, class09962.M(f), class09962.B(f2), 0.0f);
    }

    public static class09962 N(float f) {
        float f2 = class09693.N((float)f, (float)0.0f, (float)100.0f);
        return new class09962(class09982.PERCENT, 0.0f, Float.POSITIVE_INFINITY, f2);
    }

    public static class09962 N() {
        return new class09962(class09982.FIT, 0.0f, Float.POSITIVE_INFINITY, 0.0f);
    }

    public static class09962 N(float f, float f2) {
        return new class09962(class09982.FIT, class09962.M(f), class09962.B(f2), 0.0f);
    }

    public static class09962 R(float f) {
        float f2 = class09962.M(f);
        return class09962.N(f2, f2);
    }

    public float R() {
        return this.max;
    }
}

