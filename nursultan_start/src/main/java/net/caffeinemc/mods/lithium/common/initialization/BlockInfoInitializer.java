/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  net.caffeinemc.mods.lithium.common.ai.pathing.BlockStatePathingCache
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlagHolder
 */
package net.caffeinemc.mods.lithium.common.initialization;

import minecraft.class00500;
import minecraft.class00891;
import net.caffeinemc.mods.lithium.common.ai.pathing.BlockStatePathingCache;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlagHolder;

public class BlockInfoInitializer {
    public static void initializeBlockInfo() {
        if (BlockStatePathingCache.class.isAssignableFrom(class00500.class)) {
            for (class00500 class005002 : class00891.U) {
                ((BlockStatePathingCache)class005002).lithium$initializePathNodeTypeCache();
            }
        }
        if (BlockStateFlagHolder.class.isAssignableFrom(class00500.class)) {
            for (class00500 class005002 : class00891.U) {
                ((BlockStateFlagHolder)class005002).lithium$initializeFlags();
            }
        }
    }
}

