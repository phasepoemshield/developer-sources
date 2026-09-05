/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionLight
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 */
package net.raphimc.viabedrock.api.chunk.section;

import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionLight;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import java.util.List;

public interface BedrockChunkSection
extends ChunkSection,
Cloneable {
    @Deprecated
    default public ChunkSectionLight getLight() {
        return null;
    }

    @Deprecated
    default public void setLight(ChunkSectionLight light) {
        throw new UnsupportedOperationException();
    }

    default public DataPalette palette(PaletteType type) {
        int count = this.palettesCount(type);
        if (count == 0) {
            return null;
        }
        if (count > 1) {
            throw new IllegalStateException("More than one palette for type " + String.valueOf(type) + " in section");
        }
        return this.palettes(type).get(0);
    }

    @Deprecated
    default public int getNonAirBlocksCount() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    default public void setNonAirBlocksCount(int nonAirBlocksCount) {
        throw new UnsupportedOperationException();
    }

    public int palettesCount(PaletteType var1);

    @Deprecated
    default public int getFluidCount() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    default public void setFluidCount(int fluidCount) {
        throw new UnsupportedOperationException();
    }

    public boolean hasPendingBlockUpdates();

    public void addPendingBlockUpdate(int var1, int var2, int var3, int var4, int var5);

    public void applyPendingBlockUpdates(int var1);

    public void mergeWith(BedrockChunkSection var1);

    public List<DataPalette> palettes(PaletteType var1);
}

