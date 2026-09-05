/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package net.caffeinemc.mods.lithium.common.entity.pushable;

import minecraft.class00500;

public interface FeetBlockCachingEntity {
    default public void lithium$SetClimbingMobCachingSectionUpdateBehavior(boolean bl) {
        throw new UnsupportedOperationException();
    }

    default public void lithium$OnFeetBlockCacheDeleted() {
    }

    default public void lithium$OnFeetBlockCacheSet(class00500 class005002) {
    }

    public class00500 lithium$getCachedFeetBlockState();
}

