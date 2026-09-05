/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.cache.ICachedWorld
 *  baritone.cache.CachedWorld
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.cache.ICachedWorld;
import baritone.cache.CachedWorld;
import baritone.process.ExploreProcess;
import baritone.process.ExploreProcess$IChunkFilter;
import baritone.process.ExploreProcess$Status;

class ExploreProcess$BaritoneChunkCache
implements ExploreProcess$IChunkFilter {
    private final ICachedWorld cache;
    final /* synthetic */ ExploreProcess this$0;

    ExploreProcess$BaritoneChunkCache(ExploreProcess exploreProcess) {
        this.this$0 = exploreProcess;
        this.cache = ExploreProcess.access$000(this.this$0).getWorldProvider().getCurrentWorld().getCachedWorld();
    }

    @Override
    public ExploreProcess$Status isAlreadyExplored(int n, int n2) {
        int n3 = n << 4;
        int n4 = n2 << 4;
        if (this.cache.isCached(n3, n4)) {
            return ExploreProcess$Status.EXPLORED;
        }
        if (!((CachedWorld)this.cache).regionLoaded(n3, n4)) {
            Baritone.getExecutor().execute(() -> ((CachedWorld)this.cache).tryLoadFromDisk(n3 >> 9, n4 >> 9));
            return ExploreProcess$Status.UNKNOWN;
        }
        return ExploreProcess$Status.NOT_EXPLORED;
    }

    @Override
    public int countRemain() {
        return Integer.MAX_VALUE;
    }
}

