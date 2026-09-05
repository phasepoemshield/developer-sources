/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class05487
 *  minecraft.class07209
 *  minecraft.class07438
 */
package net.caffeinemc.mods.lithium.common.ai.non_poi_block_search;

import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class05487;
import minecraft.class07209;
import minecraft.class07438;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.CheckAndCacheBlockChecker;

public class CommonBlockSearchesCheckAndCache {
    public static Optional<class07209> blockPosFindClosestMatch(class05487 class054872, class07438 class074382, int n, int n2, Predicate<class00500> predicate, boolean bl) {
        class07209 class072092 = class074382.method_24515();
        CheckAndCacheBlockChecker checkAndCacheBlockChecker = new CheckAndCacheBlockChecker(class072092, n, n2, class054872, predicate, bl);
        checkAndCacheBlockChecker.initializeChunks();
        if (checkAndCacheBlockChecker.shouldStop()) {
            return Optional.empty();
        }
        return class07209.method_25997((class07209)class072092, (int)n, (int)n2, checkAndCacheBlockChecker::checkPosition);
    }
}

