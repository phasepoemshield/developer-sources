/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class01296
 *  minecraft.class05474
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.common.block.BlockListeningSection
 *  net.caffeinemc.mods.lithium.common.world.LithiumData
 *  net.caffeinemc.mods.lithium.common.world.chunk.ChunkStatusTracker
 */
package net.caffeinemc.mods.lithium.common.tracking.block;

import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import java.util.ArrayList;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class01296;
import minecraft.class05474;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.block.BlockListeningSection;
import net.caffeinemc.mods.lithium.common.tracking.block.BlockChangeTracker;
import net.caffeinemc.mods.lithium.common.util.Pos$SectionYCoord;
import net.caffeinemc.mods.lithium.common.world.LithiumData;
import net.caffeinemc.mods.lithium.common.world.chunk.ChunkStatusTracker;

public final class ChunkSectionChangeCallback {
    private final long sectionPos;
    private ArrayList<BlockChangeTracker> trackers;

    public static ChunkSectionChangeCallback create(long l, class07299 class072992) {
        ChunkSectionChangeCallback chunkSectionChangeCallback = new ChunkSectionChangeCallback(l);
        Long2ReferenceOpenHashMap long2ReferenceOpenHashMap = ((LithiumData)class072992).lithium$getData().chunkSectionChangeCallbacks();
        ChunkSectionChangeCallback chunkSectionChangeCallback2 = (ChunkSectionChangeCallback)long2ReferenceOpenHashMap.put(l, (Object)chunkSectionChangeCallback);
        if (chunkSectionChangeCallback2 != null) {
            chunkSectionChangeCallback2.onChunkSectionInvalidated(class01296.N((long)l));
        }
        return chunkSectionChangeCallback;
    }

    public ChunkSectionChangeCallback(long l) {
        this.sectionPos = l;
    }

    public static void init() {
        if (BlockListeningSection.class.isAssignableFrom(class00554.class)) {
            ChunkStatusTracker.registerUnloadCallback((class047822, class073212) -> {
                Long2ReferenceOpenHashMap long2ReferenceOpenHashMap = ((LithiumData)class047822).lithium$getData().chunkSectionChangeCallbacks();
                int n = class073212.B;
                int n2 = class073212.Z;
                for (int i = Pos$SectionYCoord.getMinYSection((class05474)class047822); i <= Pos$SectionYCoord.getMaxYSectionInclusive((class05474)class047822); ++i) {
                    class01296 class012962 = class01296.N((int)n, (int)i, (int)n2);
                    ChunkSectionChangeCallback chunkSectionChangeCallback = (ChunkSectionChangeCallback)long2ReferenceOpenHashMap.remove(class012962.W());
                    if (chunkSectionChangeCallback == null) continue;
                    chunkSectionChangeCallback.onChunkSectionInvalidated(class012962);
                }
            });
        }
    }

    public int getY(int n) {
        return class01296.L((int)class01296.L((long)this.sectionPos)) + n;
    }

    public int getX(int n) {
        return class01296.L((int)class01296.y((long)this.sectionPos)) + n;
    }

    public int getZ(int n) {
        return class01296.L((int)class01296.u((long)this.sectionPos)) + n;
    }

    public void onBlockChange(BlockListeningSection blockListeningSection, int n, int n2, int n3, class00500 class005002, class00500 class005003) {
        ArrayList<BlockChangeTracker> arrayList = this.trackers;
        this.trackers = null;
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; --i) {
                BlockChangeTracker blockChangeTracker = arrayList.get(i);
                if (blockChangeTracker.setChanged(blockListeningSection, n, n2, n3, class005002, class005003)) continue;
                BlockChangeTracker blockChangeTracker2 = (BlockChangeTracker)arrayList.removeLast();
                if (i == arrayList.size()) continue;
                arrayList.set(i, blockChangeTracker2);
            }
            if (this.trackers != null) {
                arrayList.addAll(this.trackers);
            }
            if (!arrayList.isEmpty()) {
                this.trackers = arrayList;
            }
        }
    }

    public void addTracker(BlockChangeTracker blockChangeTracker) {
        ArrayList<BlockChangeTracker> arrayList = this.trackers;
        if (arrayList == null) {
            this.trackers = arrayList = new ArrayList();
        }
        arrayList.add(blockChangeTracker);
    }

    public long getSectionPos() {
        return this.sectionPos;
    }

    public void removeTracker(BlockChangeTracker blockChangeTracker) {
        ArrayList<BlockChangeTracker> arrayList = this.trackers;
        if (arrayList != null) {
            arrayList.remove(blockChangeTracker);
        }
    }

    public void onChunkSectionInvalidated(class01296 class012962) {
        ArrayList<BlockChangeTracker> arrayList = this.trackers;
        this.trackers = null;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); ++i) {
                arrayList.get(i).onChunkSectionInvalidated(class012962);
            }
        }
    }
}

