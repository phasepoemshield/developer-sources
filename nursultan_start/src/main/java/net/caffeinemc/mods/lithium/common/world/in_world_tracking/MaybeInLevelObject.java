/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07299
 */
package net.caffeinemc.mods.lithium.common.world.in_world_tracking;

import minecraft.class07299;

public interface MaybeInLevelObject {
    default public void lithium$handleAddedToLevel(class07299 class072992) {
    }

    public boolean lithium$isInLevel();

    default public void lithium$handleRemovedFromLevel(class07299 class072992) {
    }
}

