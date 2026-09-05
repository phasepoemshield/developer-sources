/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class06695
 *  minecraft.class07190
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.common.world.blockentity.BlockEntityGetter
 */
package net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class06695;
import minecraft.class07190;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracker;
import net.caffeinemc.mods.lithium.common.util.DirectionConstants;
import net.caffeinemc.mods.lithium.common.world.blockentity.BlockEntityGetter;

public class ComparatorTracking {
    public static void notifyNearbyBlockEntitiesAboutNewComparator(class07299 class072992, class07209 class072092) {
        class07218 class072182 = new class07218();
        for (class07211 class072112 : DirectionConstants.HORIZONTAL) {
            for (int i = 1; i <= 2; ++i) {
                class00394 class003942;
                class072182.N((class00753)class072092);
                class072182.N(class072112, i);
                class00500 class005002 = class072992.method_8320((class07209)class072182);
                if (!(class005002.i() instanceof class07190) || !((class003942 = ((BlockEntityGetter)class072992).lithium$getLoadedExistingBlockEntity((class07209)class072182)) instanceof class06695) || !(class003942 instanceof ComparatorTracker)) continue;
                ComparatorTracker comparatorTracker = (ComparatorTracker)class003942;
                comparatorTracker.lithium$onComparatorAdded(class072112, i);
            }
        }
    }

    public static boolean findNearbyComparators(class07299 class072992, class07209 class072092) {
        class07218 class072182 = new class07218();
        for (class07211 class072112 : DirectionConstants.HORIZONTAL) {
            for (int i = 1; i <= 2; ++i) {
                class072182.N((class00753)class072092);
                class072182.N(class072112, i);
                class00500 class005002 = class072992.method_8320((class07209)class072182);
                if (!class005002.N(class00869.Ba)) continue;
                return true;
            }
        }
        return false;
    }
}

