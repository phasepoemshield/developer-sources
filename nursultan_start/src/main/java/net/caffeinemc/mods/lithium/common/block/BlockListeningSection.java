/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.common.tracking.block.SectionedBlockChangeTracker
 */
package net.caffeinemc.mods.lithium.common.block;

import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.tracking.block.SectionedBlockChangeTracker;

public interface BlockListeningSection {
    public void lithium$addToCallback(SectionedBlockChangeTracker var1, long var2, class07299 var4);

    public void lithium$removeFromCallback(SectionedBlockChangeTracker var1);
}

