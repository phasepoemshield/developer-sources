/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Math
 *  org.joml.Vector3dc
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.util;

import org.joml.Math;
import org.joml.Vector3dc;
import org.joml.Vector3fc;

public class MathUtil {
    public static int floatToComparableInt(float f) {
        int n = Float.floatToRawIntBits(f);
        return n ^ n >> 31 & Integer.MAX_VALUE;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & n - 1) == 0;
    }

    public static int align(int n, int n2) {
        int n3 = n2 - 1;
        int n4 = ~n3;
        return n + n3 & n4;
    }

    public static double floatDoubleDot(Vector3fc vector3fc, Vector3dc vector3dc) {
        return Math.fma((double)vector3fc.x(), (double)vector3dc.x(), (double)Math.fma((double)vector3fc.y(), (double)vector3dc.y(), (double)((double)vector3fc.z() * vector3dc.z())));
    }

    public static double floatDoubleDot(Vector3fc vector3fc, double d, double d2, double d3) {
        return Math.fma((double)vector3fc.x(), (double)d, (double)Math.fma((double)vector3fc.y(), (double)d2, (double)((double)vector3fc.z() * d3)));
    }

    public static double exponentialMovingAverage(double d, double d2, double d3) {
        return d3 * d2 + (1.0 - d3) * d;
    }

    public static long exponentialMovingAverage(long l, long l2, float f) {
        return (long)(f * (float)l2) + (long)((1.0f - f) * (float)l);
    }

    public static float comparableIntToFloat(int n) {
        return Float.intBitsToFloat(n ^ n >> 31 & Integer.MAX_VALUE);
    }

    public static long toMib(long l) {
        return l / 0x100000L;
    }
}

