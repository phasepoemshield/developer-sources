/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 */
package net.caffeinemc.mods.lithium.common.tracking;

import minecraft.class07049;
import net.caffeinemc.mods.lithium.common.tracking.VicinityCache;

public interface VicinityCacheProvider {
    default public VicinityCache getUpdatedVicinityCache(class07049 class070492) {
        VicinityCache vicinityCache = this.lithium$getVicinityCache();
        vicinityCache.updateCache(class070492);
        return vicinityCache;
    }

    public VicinityCache lithium$getVicinityCache();
}

