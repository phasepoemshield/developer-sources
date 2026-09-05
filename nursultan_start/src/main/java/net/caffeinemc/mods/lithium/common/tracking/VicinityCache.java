/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2DoubleArrayMap
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class03530
 *  minecraft.class04651
 *  minecraft.class07049
 */
package net.caffeinemc.mods.lithium.common.tracking;

import it.unimi.dsi.fastutil.objects.Reference2DoubleArrayMap;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class03530;
import minecraft.class04651;
import minecraft.class07049;
import net.caffeinemc.mods.lithium.common.tracking.block.SectionedBlockChangeTracker;

public final class VicinityCache {
    private static final int MIN_DELAY = 180;
    private int initDelay = 0;
    private class00734 trackedPos = null;
    private SectionedBlockChangeTracker tracker = null;
    private long trackingSince;
    private boolean canSkipSupportingBlockSearch;
    private class00500 cachedSupportingBlock;
    private boolean canSkipBlockTouching;
    private byte cachedTouchingFireLava;
    private byte cachedIsSuffocating;
    private final Reference2DoubleArrayMap<class03530<class04651>> fluidType2FluidHeightMap = new Reference2DoubleArrayMap(2);

    public void remove() {
        if (this.tracker != null) {
            this.tracker.unregister();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void updateCache(class07049 class070492) {
        class00734 class007342;
        if (!this.isTracking()) {
            if (this.initDelay < 180) {
                ++this.initDelay;
                return;
            }
        }
        if ((class007342 = class070492.method_5829()).equals((Object)this.trackedPos)) {
            if (!this.isTracking()) {
                this.initTracking(class070492);
                return;
            }
            if (this.tracker.isUnchangedSince(this.trackingSince)) return;
            this.resetCachedInfo();
            return;
        }
        if (this.isTracking() && !this.tracker.matchesMovedBox(class007342)) {
            this.tracker.unregister();
            this.tracker = null;
        }
        this.resetTrackedPos(class007342);
    }

    public boolean isTracking() {
        return this.tracker != null;
    }

    public double getStationaryFluidHeightOrDefault(class03530<class04651> class035302, double d) {
        if (this.isTracking()) {
            return this.fluidType2FluidHeightMap.getOrDefault(class035302, d);
        }
        return d;
    }

    public boolean canSkipSupportingBlockSearch() {
        return this.isTracking() && this.canSkipSupportingBlockSearch;
    }

    public void setCanSkipSupportingBlockSearch(boolean bl) {
        this.canSkipSupportingBlockSearch = bl;
        this.cachedSupportingBlock = null;
    }

    public void initTracking(class07049 class070492) {
        if (this.isTracking()) {
            throw new IllegalStateException("Cannot init cache that is already initialized!");
        }
        this.tracker = SectionedBlockChangeTracker.registerAt(class070492.method_73183(), class070492.method_5829());
        this.initDelay = 0;
        this.resetCachedInfo();
    }

    public void resetCachedInfo() {
        this.trackingSince = !this.isTracking() ? Long.MIN_VALUE : this.tracker.getWorldTime();
        this.canSkipSupportingBlockSearch = false;
        this.cachedSupportingBlock = null;
        this.cachedIsSuffocating = (byte)-1;
        this.cachedTouchingFireLava = (byte)-1;
        this.canSkipBlockTouching = false;
        this.fluidType2FluidHeightMap.clear();
    }

    public byte getIsSuffocating() {
        if (this.isTracking()) {
            return this.cachedIsSuffocating;
        }
        return -1;
    }

    public void resetTrackedPos(class00734 class007342) {
        this.trackedPos = class007342;
        this.initDelay = 0;
        this.resetCachedInfo();
    }

    public void setCachedTouchingFireLava(boolean bl) {
        this.cachedTouchingFireLava = bl ? (byte)1 : 0;
    }

    public void cacheSupportingBlockState(class00500 class005002) {
        this.cachedSupportingBlock = class005002;
    }

    public byte getIsTouchingFireLava() {
        if (this.isTracking()) {
            return this.cachedTouchingFireLava;
        }
        return -1;
    }

    public boolean canSkipBlockTouching() {
        return this.isTracking() && this.canSkipBlockTouching;
    }

    public void setCanSkipBlockTouching(boolean bl) {
        this.canSkipBlockTouching = bl;
    }

    public void setCachedIsSuffocating(boolean bl) {
        this.cachedIsSuffocating = bl ? (byte)1 : 0;
    }

    public class00500 getCachedSupportingBlock() {
        if (!this.isTracking()) {
            return null;
        }
        return this.cachedSupportingBlock;
    }

    public void setCachedFluidHeight(class03530<class04651> class035302, double d) {
        this.fluidType2FluidHeightMap.put(class035302, d);
    }
}

