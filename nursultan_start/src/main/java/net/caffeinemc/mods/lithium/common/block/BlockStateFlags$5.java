/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate
 */
package net.caffeinemc.mods.lithium.common.block;

import minecraft.class00500;
import net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate;

class BlockStateFlags$5
extends TrackedBlockStatePredicate {
    BlockStateFlags$5(int n) {
        super(n);
    }

    public boolean test(class00500 class005002) {
        return class005002.Q() || class005002.Y().M();
    }
}

