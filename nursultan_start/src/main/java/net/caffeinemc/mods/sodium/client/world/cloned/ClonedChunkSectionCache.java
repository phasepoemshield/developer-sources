/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceLinkedOpenHashMap
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class01296
 *  minecraft.class07299
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.world.cloned;

import it.unimi.dsi.fastutil.longs.Long2ReferenceLinkedOpenHashMap;
import java.util.concurrent.TimeUnit;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class01296;
import minecraft.class07299;
import net.caffeinemc.mods.sodium.client.world.cloned.ClonedChunkSection;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class ClonedChunkSectionCache {
    private static final int MAX_CACHE_SIZE = 512;
    private static final long MAX_CACHE_DURATION = TimeUnit.SECONDS.toNanos(5L);
    private final class07299 level;
    private final Long2ReferenceLinkedOpenHashMap<ClonedChunkSection> positionToEntry = new Long2ReferenceLinkedOpenHashMap();
    private long time;

    public ClonedChunkSectionCache(class07299 class072992) {
        this.level = class072992;
        this.time = ClonedChunkSectionCache.getMonotonicTimeSource();
    }

    private @NonNull ClonedChunkSection clone(int n, int n2, int n3) {
        class00570 class005702 = this.level.method_8497(n, n3);
        if (class005702 == null) {
            throw new RuntimeException("Chunk is not loaded at: " + class01296.y((int)n, (int)n2, (int)n3));
        }
        class00554 class005542 = null;
        if (!this.level.method_31601(class01296.L((int)n2))) {
            class005542 = class005702.u()[this.level.method_31603(n2)];
        }
        return new ClonedChunkSection(this.level, class005702, class005542, class01296.N((int)n, (int)n2, (int)n3));
    }

    public void cleanup() {
        this.time = ClonedChunkSectionCache.getMonotonicTimeSource();
        this.positionToEntry.values().removeIf(clonedChunkSection -> this.time > clonedChunkSection.getLastUsedTimestamp() + MAX_CACHE_DURATION);
    }

    public @Nullable ClonedChunkSection acquire(int n, int n2, int n3) {
        long l = class01296.y((int)n, (int)n2, (int)n3);
        ClonedChunkSection clonedChunkSection = (ClonedChunkSection)this.positionToEntry.getAndMoveToLast(l);
        if (clonedChunkSection == null) {
            clonedChunkSection = this.clone(n, n2, n3);
            while (this.positionToEntry.size() >= 512) {
                this.positionToEntry.removeFirst();
            }
            this.positionToEntry.putAndMoveToLast(l, (Object)clonedChunkSection);
        }
        clonedChunkSection.setLastUsedTimestamp(this.time);
        return clonedChunkSection;
    }

    public void invalidate(int n, int n2, int n3) {
        this.positionToEntry.remove(class01296.y((int)n, (int)n2, (int)n3));
    }

    private static long getMonotonicTimeSource() {
        return System.nanoTime();
    }
}

