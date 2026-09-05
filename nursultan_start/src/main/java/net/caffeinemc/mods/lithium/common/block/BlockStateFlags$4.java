/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01339
 *  minecraft.class04425
 *  net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate
 */
package net.caffeinemc.mods.lithium.common.block;

import minecraft.class00500;
import minecraft.class01339;
import minecraft.class04425;
import net.caffeinemc.mods.lithium.common.ai.pathing.PathNodeCache;
import net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate;

class BlockStateFlags$4
extends TrackedBlockStatePredicate {
    BlockStateFlags$4(int n) {
        super(n);
    }

    public boolean test(class00500 class005002) {
        return PathNodeCache.getNeighborPathNodeType((class01339)class005002) != class04425.field_7;
    }
}

