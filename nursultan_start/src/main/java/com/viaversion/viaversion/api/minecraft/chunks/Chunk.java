/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.chunks;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.Heightmap;
import java.util.BitSet;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface Chunk {
    public Heightmap[] heightmaps();

    public void setBitmask(int var1);

    public int getBitmask();

    public int getX();

    public int getZ();

    public @Nullable ChunkSection[] getSections();

    public List<BlockEntity> blockEntities();

    public boolean isIgnoreOldLightData();

    public void setIgnoreOldLightData(boolean var1);

    public List<CompoundTag> getBlockEntities();

    public boolean isFullChunk();

    public void setHeightMap(@Nullable CompoundTag var1);

    public @Nullable CompoundTag getHeightMap();

    public void setSections(ChunkSection[] var1);

    public void setHeightmaps(Heightmap[] var1);

    public int @Nullable [] getBiomeData();

    public boolean isBiomeData();

    public void setBiomeData(int @Nullable [] var1);

    public @Nullable BitSet getChunkMask();

    public void setChunkMask(BitSet var1);
}

