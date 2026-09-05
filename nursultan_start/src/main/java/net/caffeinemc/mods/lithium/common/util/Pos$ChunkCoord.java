/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 */
package net.caffeinemc.mods.lithium.common.util;

import minecraft.class01296;

public class Pos$ChunkCoord {
    public static int fromBlockCoord(int n) {
        return class01296.N((int)n);
    }

    public static int fromBlockSize(int n) {
        return n >> 4;
    }
}

