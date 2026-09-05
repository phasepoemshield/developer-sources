/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00554
 *  minecraft.class01339
 *  minecraft.class07049
 *  net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate
 *  net.caffeinemc.mods.lithium.common.entity.FluidCachingEntity
 */
package net.caffeinemc.mods.lithium.common.block;

import java.util.ArrayList;
import minecraft.class00554;
import minecraft.class01339;
import minecraft.class07049;
import net.caffeinemc.mods.lithium.common.ai.pathing.BlockStatePathingCache;
import net.caffeinemc.mods.lithium.common.block.BlockCountingSection;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags$1;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags$2;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags$3;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags$4;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags$5;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags$6;
import net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate;
import net.caffeinemc.mods.lithium.common.entity.FluidCachingEntity;

public class BlockStateFlags {
    public static final boolean ENABLED = BlockCountingSection.class.isAssignableFrom(class00554.class);
    public static final int NUM_TRACKED_FLAGS;
    public static final TrackedBlockStatePredicate[] TRACKED_FLAGS;
    public static final TrackedBlockStatePredicate OVERSIZED_SHAPE;
    public static final TrackedBlockStatePredicate PATH_NOT_OPEN;
    public static final TrackedBlockStatePredicate WATER;
    public static final TrackedBlockStatePredicate LAVA;
    public static final TrackedBlockStatePredicate[] FLAGS;
    public static final TrackedBlockStatePredicate ENTITY_TOUCHABLE;
    public static final TrackedBlockStatePredicate RANDOM_TICKING;

    static {
        ArrayList<TrackedBlockStatePredicate> arrayList = new ArrayList<TrackedBlockStatePredicate>();
        OVERSIZED_SHAPE = new BlockStateFlags$1(arrayList.size());
        arrayList.add(OVERSIZED_SHAPE);
        if (FluidCachingEntity.class.isAssignableFrom(class07049.class)) {
            WATER = new BlockStateFlags$2(arrayList.size());
            arrayList.add(WATER);
            LAVA = new BlockStateFlags$3(arrayList.size());
            arrayList.add(LAVA);
        } else {
            WATER = null;
            LAVA = null;
        }
        if (BlockStatePathingCache.class.isAssignableFrom(class01339.class)) {
            PATH_NOT_OPEN = new BlockStateFlags$4(arrayList.size());
            arrayList.add(PATH_NOT_OPEN);
        } else {
            PATH_NOT_OPEN = null;
        }
        RANDOM_TICKING = new BlockStateFlags$5(arrayList.size());
        arrayList.add(RANDOM_TICKING);
        NUM_TRACKED_FLAGS = arrayList.size();
        TRACKED_FLAGS = arrayList.toArray(new TrackedBlockStatePredicate[NUM_TRACKED_FLAGS]);
        ArrayList<TrackedBlockStatePredicate> arrayList2 = new ArrayList<TrackedBlockStatePredicate>(arrayList);
        ENTITY_TOUCHABLE = new BlockStateFlags$6(arrayList2.size());
        arrayList2.add(ENTITY_TOUCHABLE);
        FLAGS = arrayList2.toArray(new TrackedBlockStatePredicate[0]);
    }
}

