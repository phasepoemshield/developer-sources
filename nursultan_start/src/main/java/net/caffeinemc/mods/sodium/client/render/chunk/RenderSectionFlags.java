/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

public class RenderSectionFlags {
    public static final int HAS_BLOCK_GEOMETRY = 0;
    public static final int HAS_BLOCK_ENTITIES = 1;
    public static final int HAS_ANIMATED_SPRITES = 2;
    public static final int MASK_HAS_BLOCK_GEOMETRY = 1;
    public static final int MASK_HAS_BLOCK_ENTITIES = 2;
    public static final int MASK_HAS_ANIMATED_SPRITES = 4;
    public static final int MASK_NEEDS_RENDER = 7;
    public static final int NONE = 0;

    public static int getNewRenderFlags(int n, int n2) {
        return n2 & 7 & ~(n & 7);
    }

    public static boolean needsRender(int n) {
        return (n & 7) != 0;
    }
}

