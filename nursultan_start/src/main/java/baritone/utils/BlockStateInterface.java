/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.utils.IPlayerContext
 *  baritone.cache.CachedRegion
 *  baritone.cache.WorldData
 *  minecraft.class00500
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01688
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 */
package baritone.utils;

import baritone.Baritone;
import baritone.api.utils.IPlayerContext;
import baritone.cache.CachedRegion;
import baritone.cache.WorldData;
import baritone.utils.BlockStateInterfaceAccessWrapper;
import baritone.utils.accessor.IClientChunkProvider;
import baritone.utils.pathing.BetterWorldBorder;
import minecraft.class00500;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01688;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;

public class BlockStateInterface {
    private final class01688 provider;
    private final WorldData worldData;
    protected final class07299 world;
    public final class07218 isPassableBlockPos;
    public final class07290 access;
    public final BetterWorldBorder worldBorder;
    private class00570 prev = null;
    private CachedRegion prevCached = null;
    private final boolean useTheRealWorld;
    private static final class00500 AIR = class00869.N.W();

    public BlockStateInterface(IPlayerContext iPlayerContext) {
        this(iPlayerContext, false);
    }

    public BlockStateInterface(IPlayerContext iPlayerContext, boolean bl) {
        this.world = iPlayerContext.world();
        this.worldBorder = new BetterWorldBorder(this.world.method_8621());
        this.worldData = (WorldData)iPlayerContext.worldData();
        this.provider = bl ? ((IClientChunkProvider)this.world.method_8398()).createThreadSafeCopy() : (class01688)this.world.method_8398();
        boolean bl2 = this.useTheRealWorld = (Boolean)Baritone.settings().pathThroughCachedOnly.value == false;
        if (!iPlayerContext.minecraft().E_()) {
            throw new IllegalStateException("BlockStateInterface must be constructed on the main thread");
        }
        this.isPassableBlockPos = new class07218();
        this.access = new BlockStateInterfaceAccessWrapper(this);
    }

    public static class00500 get(IPlayerContext iPlayerContext, class07209 class072092) {
        return new BlockStateInterface(iPlayerContext).get0(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public boolean isLoaded(int n, int n2) {
        class00570 class005702 = this.prev;
        if (class005702 != null && class005702.R().B == n >> 4 && class005702.R().Z == n2 >> 4) {
            return true;
        }
        class005702 = this.provider.N(n >> 4, n2 >> 4, class00549.m, false);
        if (class005702 != null && !class005702.O()) {
            this.prev = class005702;
            return true;
        }
        CachedRegion cachedRegion = this.prevCached;
        if (cachedRegion != null && cachedRegion.getX() == n >> 9 && cachedRegion.getZ() == n2 >> 9) {
            return cachedRegion.isCached(n & 0x1FF, n2 & 0x1FF);
        }
        if (this.worldData == null) {
            return false;
        }
        cachedRegion = this.worldData.cache.getRegion(n >> 9, n2 >> 9);
        if (cachedRegion == null) {
            return false;
        }
        this.prevCached = cachedRegion;
        return cachedRegion.isCached(n & 0x1FF, n2 & 0x1FF);
    }

    public class00500 get0(class07209 class072092) {
        return this.get0(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public class00500 get0(int n, int n2, int n3) {
        class00570 class005702;
        class00570 class005703;
        if ((n2 -= this.world.method_8597().B()) < 0 || n2 >= this.world.method_8597().Z()) {
            return AIR;
        }
        if (this.useTheRealWorld) {
            class005703 = this.prev;
            if (class005703 != null && class005703.R().B == n >> 4 && class005703.R().Z == n3 >> 4) {
                return BlockStateInterface.getFromChunk(class005703, n, n2, n3);
            }
            class005702 = this.provider.N(n >> 4, n3 >> 4, class00549.m, false);
            if (class005702 != null && !class005702.O()) {
                this.prev = class005702;
                return BlockStateInterface.getFromChunk(class005702, n, n2, n3);
            }
        }
        if ((class005703 = this.prevCached) == null || class005703.getX() != n >> 9 || class005703.getZ() != n3 >> 9) {
            if (this.worldData == null) {
                return AIR;
            }
            class005702 = this.worldData.cache.getRegion(n >> 9, n3 >> 9);
            if (class005702 == null) {
                return AIR;
            }
            this.prevCached = class005702;
            class005703 = class005702;
        }
        if ((class005702 = class005703.getBlock(n & 0x1FF, n2 + this.world.method_8597().B(), n3 & 0x1FF)) == null) {
            return AIR;
        }
        return class005702;
    }

    public static class00891 getBlock(IPlayerContext iPlayerContext, class07209 class072092) {
        return BlockStateInterface.get(iPlayerContext, class072092).i();
    }

    public static class00500 getFromChunk(class00570 class005702, int n, int n2, int n3) {
        class00554 class005542 = class005702.u()[n2 >> 4];
        if (class005542.L()) {
            return AIR;
        }
        return class005542.N(n & 0xF, n2 & 0xF, n3 & 0xF);
    }

    public boolean worldContainsLoadedChunk(int n, int n2) {
        return this.provider.L(n >> 4, n2 >> 4);
    }
}

