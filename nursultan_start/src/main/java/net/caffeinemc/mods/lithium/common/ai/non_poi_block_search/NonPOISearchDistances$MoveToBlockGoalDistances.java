/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  minecraft.class07321
 *  net.caffeinemc.mods.lithium.common.util.Distances
 */
package net.caffeinemc.mods.lithium.common.ai.non_poi_block_search;

import minecraft.class07209;
import minecraft.class07321;
import net.caffeinemc.mods.lithium.common.util.Distances;

public class NonPOISearchDistances$MoveToBlockGoalDistances {
    public static int getMinimumSortOrderOfChunk(class07209 class072092, int n, int n2) {
        int n3 = Distances.getClosestBlockCoordInSection((int)class072092.method_10263(), (int)n) - class072092.method_10263();
        int n4 = Distances.getClosestBlockCoordInSection((int)class072092.method_10260(), (int)n2) - class072092.method_10260();
        return NonPOISearchDistances$MoveToBlockGoalDistances.getVanillaSortOrderInt(NonPOISearchDistances$MoveToBlockGoalDistances.getRing(n3, n4), n3, n4);
    }

    public static int getMinimumSortOrderOfChunk(class07209 class072092, long l) {
        return NonPOISearchDistances$MoveToBlockGoalDistances.getMinimumSortOrderOfChunk(class072092, class07321.N((long)l), class07321.y((long)l));
    }

    public static int getVanillaSortOrderInt(int n, int n2, int n3) {
        return (n << 16 | Math.abs(n2) << 9 | Math.abs(n3) << 1) - ((n2 > 0 ? 1 : 0) << 8 | (n3 > 0 ? 1 : 0));
    }

    public static int getRing(int n, int n2) {
        return Math.max(Math.abs(n), Math.abs(n2));
    }
}

