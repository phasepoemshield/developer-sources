/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.vertices;

public final class ExtendedDataHelper {
    public static final short BLOCK_RENDER_TYPE = -1;
    public static final short FLUID_RENDER_TYPE = 1;

    public static int computeMidBlock(float f, float f2, float f3, int n, int n2, int n3) {
        return ExtendedDataHelper.packMidBlock((float)n + 0.5f - f, (float)n2 + 0.5f - f2, (float)n3 + 0.5f - f3);
    }

    public static int packMidBlock(float f, float f2, float f3) {
        return (int)(f * 64.0f) & 0xFF | ((int)(f2 * 64.0f) & 0xFF) << 8 | ((int)(f3 * 64.0f) & 0xFF) << 16;
    }
}

