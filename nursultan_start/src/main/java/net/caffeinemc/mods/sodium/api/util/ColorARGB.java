/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.api.util;

import net.caffeinemc.mods.sodium.api.util.ColorMixer;
import net.caffeinemc.mods.sodium.api.util.ColorU8;

public class ColorARGB
implements ColorU8 {
    private static final int ALPHA_COMPONENT_OFFSET = 24;
    private static final int RED_COMPONENT_OFFSET = 16;
    private static final int GREEN_COMPONENT_OFFSET = 8;
    private static final int BLUE_COMPONENT_OFFSET = 0;
    private static final int RED_COMPONENT_MASK = 0xFF0000;
    private static final int GREEN_COMPONENT_MASK = 65280;
    private static final int BLUE_COMPONENT_MASK = 255;
    private static final int ALPHA_COMPONENT_MASK = -16777216;

    private static int pack(float f, float f2, float f3) {
        return ColorARGB.pack(ColorU8.normalizedFloatToByte(f), ColorU8.normalizedFloatToByte(f2), ColorU8.normalizedFloatToByte(f3));
    }

    public static int pack(int n, int n2, int n3, int n4) {
        return (n4 & 0xFF) << 24 | (n & 0xFF) << 16 | (n2 & 0xFF) << 8 | (n3 & 0xFF) << 0;
    }

    public static int pack(int n, int n2, int n3) {
        return ColorARGB.pack(n, n2, n3, 255);
    }

    public static int withAlpha(int n, int n2) {
        return n2 << 24 | n & 0xFFFFFF;
    }

    public static float[] toHSV(int n) {
        float f = (float)ColorARGB.unpackRed(n) / 255.0f;
        float f2 = (float)ColorARGB.unpackGreen(n) / 255.0f;
        float f3 = (float)ColorARGB.unpackBlue(n) / 255.0f;
        float f4 = Math.max(f, Math.max(f2, f3));
        float f5 = Math.min(f, Math.min(f2, f3));
        float f6 = f4 - f5;
        float f7 = -1.0f;
        float f8 = -1.0f;
        if (f4 == f5) {
            f7 = 0.0f;
        } else if (f4 == f) {
            f7 = (0.1666f * ((f2 - f3) / f6) + 1.0f) % 1.0f;
        } else if (f4 == f2) {
            f7 = (0.1666f * ((f3 - f) / f6) + 0.333f) % 1.0f;
        } else if (f4 == f3) {
            f7 = (0.1666f * ((f - f2) / f6) + 0.666f) % 1.0f;
        }
        f8 = f4 == 0.0f ? 0.0f : f6 / f4;
        return new float[]{f7, f8, f4};
    }

    public static int unpackBlue(int n) {
        return n >> 0 & 0xFF;
    }

    public static int mulRGB(int n, int n2) {
        return ColorMixer.mul(n, n2) & 0xFFFFFF | n & 0xFF000000;
    }

    public static int mulRGB(int n, float f) {
        return ColorARGB.mulRGB(n, ColorU8.normalizedFloatToByte(f));
    }

    public static int fromABGR(int n) {
        return Integer.rotateRight(Integer.reverseBytes(n), 8);
    }

    public static int fromHSV(float f, float f2, float f3) {
        int n = (int)(f * 6.0f) % 6;
        float f4 = f * 6.0f - (float)n;
        float f5 = f3 * (1.0f - f2);
        float f6 = f3 * (1.0f - f4 * f2);
        float f7 = f3 * (1.0f - (1.0f - f4) * f2);
        return switch (n) {
            case 0 -> ColorARGB.pack(f3, f7, f5);
            case 1 -> ColorARGB.pack(f6, f3, f5);
            case 2 -> ColorARGB.pack(f5, f3, f7);
            case 3 -> ColorARGB.pack(f5, f6, f3);
            case 4 -> ColorARGB.pack(f7, f5, f3);
            case 5 -> ColorARGB.pack(f3, f5, f6);
            default -> 0;
        };
    }

    public static int fromHSV(float[] fArray) {
        return ColorARGB.fromHSV(fArray[0], fArray[1], fArray[2]);
    }

    public static int unpackRed(int n) {
        return n >> 16 & 0xFF;
    }

    public static int toABGR(int n, int n2) {
        return Integer.reverseBytes(n << 8 | n2);
    }

    public static int toABGR(int n) {
        return Integer.reverseBytes(Integer.rotateLeft(n, 8));
    }

    public static int toABGR(int n, float f) {
        return ColorARGB.toABGR(n, ColorU8.normalizedFloatToByte(f));
    }

    public static int transferAlpha(int n, int n2) {
        return ColorARGB.withAlpha(n, ColorARGB.unpackAlpha(n2));
    }

    public static int unpackAlpha(int n) {
        return n >> 24 & 0xFF;
    }

    public static int unpackGreen(int n) {
        return n >> 8 & 0xFF;
    }
}

