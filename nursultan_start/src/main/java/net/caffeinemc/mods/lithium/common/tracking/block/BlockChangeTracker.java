/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01296
 *  net.caffeinemc.mods.lithium.common.block.BlockListeningSection
 */
package net.caffeinemc.mods.lithium.common.tracking.block;

import minecraft.class00500;
import minecraft.class01296;
import net.caffeinemc.mods.lithium.common.block.BlockListeningSection;

public interface BlockChangeTracker {
    public void onChunkSectionInvalidated(class01296 var1);

    public boolean setChanged(BlockListeningSection var1, int var2, int var3, int var4, class00500 var5, class00500 var6);
}

