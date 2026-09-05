/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01231
 *  net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate
 */
package net.caffeinemc.mods.lithium.common.block;

import minecraft.class00500;
import minecraft.class01231;
import net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate;

class BlockStateFlags$3
extends TrackedBlockStatePredicate {
    BlockStateFlags$3(int n) {
        super(n);
    }

    public boolean test(class00500 class005002) {
        return class005002.Y().N().N(class01231.y);
    }
}

