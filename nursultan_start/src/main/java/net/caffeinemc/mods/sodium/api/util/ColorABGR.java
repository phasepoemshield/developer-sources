/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.api.util;

import java.nio.ByteOrder;
import net.caffeinemc.mods.sodium.api.util.ColorMixer;
import net.caffeinemc.mods.sodium.api.util.ColorU8;

public class ColorABGR
implements ColorU8 {
    private static final int RED_COMPONENT_OFFSET = 0;
    private static final int GREEN_COMPONENT_OFFSET = 8;
    private static final int BLUE_COMPONENT_OFFSET = 16;
    private static final int ALPHA_COMPONENT_OFFSET = 24;
    private static final int RED_COMPONENT_MASK = 255;
    private static final int GREEN_COMPONENT_MASK = 65280;
    private static final int BLUE_COMPONENT_MASK = 0xFF0000;
    private static final int ALPHA_COMPONENT_MASK = -16777216;
    private static final boolean BIG_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;

    public static int pack(float f, float f2, float f3, float f4) {
        return ColorABGR.pack(ColorU8.normalizedFloatToByte(f), ColorU8.normalizedFloatToByte(f2), ColorU8.normalizedFloatToByte(f3), ColorU8.normalizedFloatToByte(f4));
    }

    public static int pack(float f, float f2, float f3) {
        return ColorABGR.pack(f, f2, f3, 255.0f);
    }

    public static int pack(int n, int n2, int n3, int n4) {
        return (n4 & 0xFF) << 24 | (n3 & 0xFF) << 16 | (n2 & 0xFF) << 8 | (n & 0xFF) << 0;
    }

    public static int withAlpha(int n, float f) {
        return ColorABGR.withAlpha(n, ColorU8.normalizedFloatToByte(f));
    }

    public static int withAlpha(int n, int n2) {
        return n2 << 24 | n & 0xFFFFFF;
    }

    public static int unpackBlue(int n) {
        return n >> 16 & 0xFF;
    }

    public static int mulRGB(int n, int n2) {
        return ColorMixer.mul(n, n2) & 0xFFFFFF | n & 0xFF000000;
    }

    public static int mulRGB(int n, float f) {
        return ColorABGR.mulRGB(n, ColorU8.normalizedFloatToByte(f));
    }

    public static int unpackRed(int n) {
        return n >> 0 & 0xFF;
    }

    public static int fromNativeByteOrder(int n) {
        if (BIG_ENDIAN) {
            return Integer.reverseBytes(n);
        }
        return n;
    }

    public static int unpackAlpha(int n) {
        return n >> 24 & 0xFF;
    }

    public static int unpackGreen(int n) {
        return n >> 8 & 0xFF;
    }

    public static int toNativeByteOrder(int n) {
        if (BIG_ENDIAN) {
            return Integer.reverseBytes(n);
        }
        return n;
    }
}

