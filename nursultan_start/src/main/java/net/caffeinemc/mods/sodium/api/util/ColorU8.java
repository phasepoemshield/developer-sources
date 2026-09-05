/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.api.util;

public interface ColorU8 {
    public static final int COMPONENT_BITS = 8;
    public static final int COMPONENT_MASK = 255;
    public static final float COMPONENT_RANGE = 255.0f;
    public static final float COMPONENT_RANGE_INVERSE = 0.003921569f;

    public static float byteToNormalizedFloat(int n) {
        return (float)n * 0.003921569f;
    }

    public static int normalizedFloatToByte(float f) {
        return (int)(f * 255.0f) & 0xFF;
    }
}

