/*
 * Decompiled with CFR 0.152.
 */
package me.flashyreese.mods.sodiumextra.common.util;

public class Utils {
    public static int packLight(int n, int n2) {
        return n2 << 16 | n & 0xFFFF;
    }

    public static long packPosition(int n, int n2) {
        return (long)n << 32 | (long)n2 & 0xFFFFFFFFL;
    }

    public static int[] unpackIntegers(long l) {
        int n = (int)(l >> 32);
        int n2 = (int)(l & 0xFFFFFFFFL);
        return new int[]{n, n2};
    }
}

