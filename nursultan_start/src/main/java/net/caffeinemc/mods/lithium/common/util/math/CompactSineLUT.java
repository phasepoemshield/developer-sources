/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package net.caffeinemc.mods.lithium.common.util.math;

import minecraft.class04995;

public class CompactSineLUT {
    private static final int[] SINE_TABLE_INT;
    private static final float SINE_TABLE_MIDPOINT;

    public static float sin(double d) {
        return CompactSineLUT.lookup((int)(d * 10430.378350470453) & 0xFFFF);
    }

    public static float cos(double d) {
        return CompactSineLUT.lookup((int)(d * 10430.378350470453 + 16384.0) & 0xFFFF);
    }

    private static float lookup(int n) {
        if (n == 32768) {
            return SINE_TABLE_MIDPOINT;
        }
        int n2 = (n & 0x8000) << 16;
        int n3 = n << 17 >> 31;
        int n4 = (0x8001 & n3) + (n ^ n3);
        return Float.intBitsToFloat(SINE_TABLE_INT[n4 &= Short.MAX_VALUE] ^ n2);
    }

    public static void init() {
    }

    static {
        int i;
        SINE_TABLE_INT = new int[16385];
        for (i = 0; i < SINE_TABLE_INT.length; ++i) {
            CompactSineLUT.SINE_TABLE_INT[i] = Float.floatToRawIntBits(class04995.U[i]);
        }
        SINE_TABLE_MIDPOINT = class04995.U[class04995.U.length / 2];
        for (i = 0; i < class04995.U.length; ++i) {
            float expected = class04995.U[i];
            float value = CompactSineLUT.lookup(i);
            if (expected == value) continue;
            throw new IllegalArgumentException(String.format("LUT error at index %d (expected: %s, found: %s)", i, Float.valueOf(expected), Float.valueOf(value)));
        }
    }
}

