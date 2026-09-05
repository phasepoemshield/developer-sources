/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  minecraft.class01166
 */
package net.caffeinemc.mods.lithium.common.world;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import minecraft.class01166;

public record GameEventDispatcherStorage(Long2ReferenceOpenHashMap<Int2ObjectMap<class01166>> storage, LongOpenHashSet loadedChunks) {
    public GameEventDispatcherStorage() {
        this((Long2ReferenceOpenHashMap<Int2ObjectMap<class01166>>)new Long2ReferenceOpenHashMap(), new LongOpenHashSet());
    }

    public Int2ObjectMap<class01166> get(long l) {
        return (Int2ObjectMap)this.storage.get(l);
    }

    public void replace(long l, Int2ObjectMap<class01166> int2ObjectMap) {
        if (this.loadedChunks.contains(l)) {
            if (int2ObjectMap == null) {
                this.storage.remove(l);
            } else {
                this.storage.put(l, int2ObjectMap);
            }
        }
    }

    public void addChunk(long l, Int2ObjectMap<class01166> int2ObjectMap) {
        if (int2ObjectMap != null) {
            this.storage.put(l, int2ObjectMap);
        }
        this.loadedChunks.add(l);
    }

    public void removeChunk(long l) {
        this.storage.remove(l);
        this.loadedChunks.remove(l);
    }
}

