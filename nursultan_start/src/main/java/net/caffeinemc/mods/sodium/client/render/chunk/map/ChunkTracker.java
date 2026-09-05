/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongCollection
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.longs.LongSets
 *  minecraft.class07321
 */
package net.caffeinemc.mods.sodium.client.render.chunk.map;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import minecraft.class07321;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTracker$ChunkEventHandler;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ClientChunkEventListener;

public class ChunkTracker
implements ClientChunkEventListener {
    private final Long2IntOpenHashMap chunkStatus = new Long2IntOpenHashMap();
    private final LongOpenHashSet chunkReady = new LongOpenHashSet();
    private final LongSet unloadQueue = new LongOpenHashSet();
    private final LongSet loadQueue = new LongOpenHashSet();

    @Override
    public void onChunkStatusAdded(int n, int n2, int n3) {
        int n4;
        long l = class07321.u((int)n, (int)n2);
        int n5 = this.chunkStatus.get(l);
        if (n5 == (n4 = n5 | n3)) {
            return;
        }
        this.chunkStatus.put(l, n4);
        this.updateNeighbors(n, n2);
    }

    public LongCollection getReadyChunks() {
        return LongSets.unmodifiable((LongSet)this.chunkReady);
    }

    public static void forEachChunk(LongCollection longCollection, ChunkTracker$ChunkEventHandler chunkTracker$ChunkEventHandler) {
        LongIterator longIterator = longCollection.iterator();
        while (longIterator.hasNext()) {
            long l = longIterator.nextLong();
            int n = class07321.N((long)l);
            int n2 = class07321.y((long)l);
            chunkTracker$ChunkEventHandler.apply(n, n2);
        }
    }

    public void forEachEvent(ChunkTracker$ChunkEventHandler chunkTracker$ChunkEventHandler, ChunkTracker$ChunkEventHandler chunkTracker$ChunkEventHandler2) {
        ChunkTracker.forEachChunk((LongCollection)this.unloadQueue, chunkTracker$ChunkEventHandler2);
        this.unloadQueue.clear();
        ChunkTracker.forEachChunk((LongCollection)this.loadQueue, chunkTracker$ChunkEventHandler);
        this.loadQueue.clear();
    }

    private void updateNeighbors(int n, int n2) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                this.updateMerged(i + n, j + n2);
            }
        }
    }

    @Override
    public void updateMapCenter(int n, int n2) {
    }

    private void updateMerged(int n, int n2) {
        long l = class07321.u((int)n, (int)n2);
        int n3 = this.chunkStatus.get(l);
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                n3 &= this.chunkStatus.get(class07321.u((int)(i + n), (int)(j + n2)));
            }
        }
        if (n3 == 3) {
            if (this.chunkReady.add(l) && !this.unloadQueue.remove(l)) {
                this.loadQueue.add(l);
            }
        } else if (this.chunkReady.remove(l) && !this.loadQueue.remove(l)) {
            this.unloadQueue.add(l);
        }
    }

    @Override
    public void updateLoadDistance(int n) {
    }

    @Override
    public void onChunkStatusRemoved(int n, int n2, int n3) {
        int n4;
        long l = class07321.u((int)n, (int)n2);
        int n5 = this.chunkStatus.get(l);
        if (n5 == (n4 = n5 & ~n3)) {
            return;
        }
        if (n4 == this.chunkStatus.defaultReturnValue()) {
            this.chunkStatus.remove(l);
        } else {
            this.chunkStatus.put(l, n4);
        }
        this.updateNeighbors(n, n2);
    }
}

