/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07218
 *  minecraft.class08050
 */
package net.caffeinemc.mods.lithium.common.ai.non_poi_block_search;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class07218;
import minecraft.class08050;

public interface LithiumMoveToBlockGoal {
    public boolean lithium$findNearestBlock(Predicate<class00500> var1, BiPredicate<class08050, class07218> var2, boolean var3);
}

