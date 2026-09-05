/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.cache.ChunkPacker
 *  minecraft.class00570
 *  minecraft.class07321
 */
package baritone.cache;

import baritone.Baritone;
import baritone.cache.CachedChunk;
import baritone.cache.CachedWorld;
import baritone.cache.ChunkPacker;
import minecraft.class00570;
import minecraft.class07321;

class CachedWorld$PackerThread
implements Runnable {
    final /* synthetic */ CachedWorld this$0;

    CachedWorld$PackerThread(CachedWorld cachedWorld) {
        this.this$0 = cachedWorld;
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    class07321 class073212 = this.this$0.toPackQueue.take();
                    class00570 class005702 = this.this$0.toPackMap.remove(class073212);
                    if (this.this$0.toPackQueue.size() > (Integer)Baritone.settings().chunkPackerQueueMaxSize.value) continue;
                    CachedChunk cachedChunk = ChunkPacker.pack((class00570)class005702);
                    this.this$0.updateCachedChunk(cachedChunk);
                }
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                continue;
            }
            break;
        }
    }
}

