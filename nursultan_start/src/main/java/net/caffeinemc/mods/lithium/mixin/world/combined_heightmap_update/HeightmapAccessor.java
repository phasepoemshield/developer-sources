/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package net.caffeinemc.mods.lithium.mixin.world.combined_heightmap_update;

import java.util.function.Predicate;
import minecraft.class00500;

public interface HeightmapAccessor {
    public Predicate<class00500> getBlockPredicate();

    public void callSet(int var1, int var2, int var3);
}

