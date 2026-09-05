/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.util;

public final class MathUtil {
    public static final float EPSILON = 1.0E-5f;

    public static int ceil(float value) {
        int intValue = (int)value;
        return value > (float)intValue ? intValue + 1 : intValue;
    }

    public static int clamp(int i, int min, int max) {
        if (i < min) {
            return min;
        }
        return i > max ? max : i;
    }

    public static double clamp(double d, double min, double max) {
        if (d < min) {
            return min;
        }
        return d > max ? max : d;
    }

    public static long clamp(long l, long min, long max) {
        if (l < min) {
            return min;
        }
        return l > max ? max : l;
    }

    public static long ceilLong(double d) {
        long l = (long)d;
        return d > (double)l ? l + 1L : l;
    }

    public static int ceilLog2(int i) {
        return i > 0 ? 32 - Integer.numberOfLeadingZeros(i - 1) : 0;
    }
}

