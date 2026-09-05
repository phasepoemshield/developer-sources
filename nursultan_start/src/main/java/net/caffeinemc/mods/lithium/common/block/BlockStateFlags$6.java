/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01210
 *  net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate
 *  net.caffeinemc.mods.lithium.common.reflection.ReflectionUtil
 */
package net.caffeinemc.mods.lithium.common.block;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01210;
import net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate;
import net.caffeinemc.mods.lithium.common.reflection.ReflectionUtil;

class BlockStateFlags$6
extends TrackedBlockStatePredicate {
    BlockStateFlags$6(int n) {
        super(n);
    }

    public boolean test(class00500 class005002) {
        return ReflectionUtil.isBlockStateEntityTouchable((class00500)class005002) || class005002.N(class00869.V) || class005002.N(class01210.Nh);
    }
}

