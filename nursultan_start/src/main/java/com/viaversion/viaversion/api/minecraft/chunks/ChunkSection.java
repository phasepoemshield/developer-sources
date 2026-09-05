/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionLight
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.chunks;

import com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionLight;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface ChunkSection {
    public static final int SIZE = 4096;
    public static final int BIOME_SIZE = 64;

    public @Nullable ChunkSectionLight getLight();

    public static int zFromIndex(int idx) {
        return idx >> 4 & 0xF;
    }

    public void addPalette(PaletteType var1, DataPalette var2);

    default public boolean hasLight() {
        return this.getLight() != null;
    }

    public static int yFromIndex(int idx) {
        return idx >> 8 & 0xF;
    }

    public static int xFromIndex(int idx) {
        return idx & 0xF;
    }

    public void setLight(@Nullable ChunkSectionLight var1);

    public static int index(int x, int y, int z) {
        return y << 8 | z << 4 | x;
    }

    public @Nullable DataPalette palette(PaletteType var1);

    public int getNonAirBlocksCount();

    public void setNonAirBlocksCount(int var1);

    public int getFluidCount();

    public void setFluidCount(int var1);

    public void removePalette(PaletteType var1);
}

