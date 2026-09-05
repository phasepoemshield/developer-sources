/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.api.util;

import net.caffeinemc.mods.sodium.api.util.ColorU8;

public class ColorMixer {
    public static int mul(int n, float f) {
        return ColorMixer.mul(n, ColorU8.normalizedFloatToByte(f));
    }

    public static int mul(int n, int n2) {
        long l = ((long)n & 0xFF00FFL) * (long)n2;
        long l2 = ((long)n & 0xFF00FF00L) * (long)n2;
        long l3 = l + 0xFF00FFL >>> 8 & 0xFF00FFL | l2 + 0xFF00FF00L >>> 8 & 0xFF00FF00L;
        return (int)l3;
    }

    public static int mix(int n, int n2, int n3) {
        long l = ((long)n & 0xFF00FFL) * (long)n3 + ((long)n2 & 0xFF00FFL) * (long)(255 - n3);
        long l2 = ((long)n & 0xFF00FF00L) * (long)n3 + ((long)n2 & 0xFF00FF00L) * (long)(255 - n3);
        long l3 = l + 0xFF00FFL >>> 8 & 0xFF00FFL | l2 + 0xFF00FF00L >>> 8 & 0xFF00FF00L;
        return (int)l3;
    }

    public static int mix(int n, int n2, float f) {
        return ColorMixer.mix(n, n2, ColorU8.normalizedFloatToByte(f));
    }

    public static int mulComponentWise(int n, int n2) {
        int n3 = (n >>> 0 & 0xFF) * (n2 >>> 0 & 0xFF) + 255 >>> 8;
        int n4 = (n >>> 8 & 0xFF) * (n2 >>> 8 & 0xFF) + 255 >>> 8;
        int n5 = (n >>> 16 & 0xFF) * (n2 >>> 16 & 0xFF) + 255 >>> 8;
        int n6 = (n >>> 24 & 0xFF) * (n2 >>> 24 & 0xFF) + 255 >>> 8;
        return n3 << 0 | n4 << 8 | n5 << 16 | n6 << 24;
    }

    public static int mix2d(int n, int n2, int n3, int n4, float f, float f2) {
        int n5 = ColorU8.normalizedFloatToByte(f);
        int n6 = 255 - n5;
        int n7 = ColorU8.normalizedFloatToByte(f2);
        int n8 = 255 - n7;
        long l = ((long)n & 0xFF00FFL) * (long)n6 + ((long)n3 & 0xFF00FFL) * (long)n5 + 0xFF00FFL >>> 8 & 0xFF00FFL;
        long l2 = ((long)n & 0xFF00FF00L) * (long)n6 + ((long)n3 & 0xFF00FF00L) * (long)n5 + 0xFF00FF00L >>> 8 & 0xFF00FF00L;
        long l3 = ((long)n2 & 0xFF00FFL) * (long)n6 + ((long)n4 & 0xFF00FFL) * (long)n5 + 0xFF00FFL >>> 8 & 0xFF00FFL;
        long l4 = ((long)n2 & 0xFF00FF00L) * (long)n6 + ((long)n4 & 0xFF00FF00L) * (long)n5 + 0xFF00FF00L >>> 8 & 0xFF00FF00L;
        long l5 = l * (long)n8 + l3 * (long)n7 + 0xFF00FFL >>> 8 & 0xFF00FFL | l2 * (long)n8 + l4 * (long)n7 + 0xFF00FF00L >>> 8 & 0xFF00FF00L;
        return (int)l5;
    }
}

