/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.EvictingQueue
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.libs.fastutil.longs.Long2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.longs.Long2ObjectOpenHashMap
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.BlockConnectionStorage$SectionData
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.storage;

import com.google.common.collect.EvictingQueue;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.libs.fastutil.longs.Long2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.longs.Long2ObjectOpenHashMap;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.BlockConnectionStorage;
import java.util.Queue;
import org.checkerframework.checker.nullness.qual.Nullable;

public class BlockConnectionStorage
implements StorableObject {
    private final Long2ObjectMap<SectionData> blockStorage = new Long2ObjectOpenHashMap();
    private final Queue<BlockPosition> modified = EvictingQueue.create((int)5);
    private long lastIndex = -1L;
    private SectionData lastSection;

    public void remove(int x, int y, int z) {
        long index = BlockConnectionStorage.getChunkSectionIndex(x, y, z);
        SectionData section = this.getSection(index);
        if (section == null) {
            return;
        }
        section.setBlockAt(x, y, z, 0);
        if (section.nonEmptyBlocks() == 0) {
            this.removeSection(index);
        }
    }

    public int get(int x, int y, int z) {
        long pair = BlockConnectionStorage.getChunkSectionIndex(x, y, z);
        SectionData section = this.getSection(pair);
        if (section == null) {
            return 0;
        }
        return section.blockAt(x, y, z);
    }

    public void store(int x, int y, int z, int blockState) {
        long index = BlockConnectionStorage.getChunkSectionIndex(x, y, z);
        SectionData section = this.getSection(index);
        if (section == null) {
            if (blockState == 0) {
                return;
            }
            section = new SectionData();
            this.blockStorage.put(index, (Object)section);
            this.lastSection = section;
            this.lastIndex = index;
        }
        section.setBlockAt(x, y, z, blockState);
    }

    public void clear() {
        this.blockStorage.clear();
        this.lastSection = null;
        this.lastIndex = -1L;
        this.modified.clear();
    }

    public static void init() {
    }

    private // Could not load outer class - annotation placement on inner may be incorrect
    @Nullable BlockConnectionStorage.SectionData getSection(long index) {
        if (this.lastIndex == index) {
            return this.lastSection;
        }
        this.lastIndex = index;
        this.lastSection = (SectionData)this.blockStorage.get(index);
        return this.lastSection;
    }

    private static long getChunkSectionIndex(int x, int y, int z) {
        return ((long)(x >> 4) & 0x3FFFFFFL) << 38 | ((long)(y >> 4) & 0xFFFL) << 26 | (long)(z >> 4) & 0x3FFFFFFL;
    }

    public void unloadChunk(int x, int z) {
        for (int y = 0; y < 16; ++y) {
            this.unloadSection(x, y, z);
        }
    }

    public void markModified(BlockPosition pos) {
        if (!this.modified.contains(pos)) {
            this.modified.add(pos);
        }
    }

    public boolean recentlyModified(BlockPosition pos) {
        for (BlockPosition p : this.modified) {
            if (Math.abs(pos.x() - p.x()) + Math.abs(pos.y() - p.y()) + Math.abs(pos.z() - p.z()) > 2) continue;
            return true;
        }
        return false;
    }

    public void unloadSection(int x, int y, int z) {
        this.removeSection(BlockConnectionStorage.getChunkSectionIndex(x << 4, y << 4, z << 4));
    }

    private void removeSection(long index) {
        this.blockStorage.remove(index);
        if (this.lastIndex == index) {
            this.lastIndex = -1L;
            this.lastSection = null;
        }
    }
}

