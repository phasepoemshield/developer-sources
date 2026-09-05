/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00570
 *  minecraft.class04995
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06710
 *  minecraft.class07054
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07234
 *  minecraft.class07277
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumTransferConditionInventory
 *  net.caffeinemc.mods.lithium.common.world.WorldHelper
 *  net.caffeinemc.mods.lithium.common.world.blockentity.BlockEntityGetter
 */
package net.caffeinemc.mods.lithium.common.hopper;

import java.util.Map;
import minecraft.class00394;
import minecraft.class00570;
import minecraft.class04995;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06710;
import minecraft.class07054;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07234;
import minecraft.class07277;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.api.inventory.LithiumTransferConditionInventory;
import net.caffeinemc.mods.lithium.common.hopper.ComparatorUpdatePattern;
import net.caffeinemc.mods.lithium.common.hopper.LithiumDoubleInventory;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;
import net.caffeinemc.mods.lithium.common.hopper.UpdateReceiver;
import net.caffeinemc.mods.lithium.common.util.DirectionConstants;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import net.caffeinemc.mods.lithium.common.world.blockentity.BlockEntityGetter;

public class HopperHelper {
    public static class06695 replaceDoubleInventory(class06695 class066952) {
        if (class066952 instanceof class06710) {
            class06710 class067102 = (class06710)class066952;
            if ((class067102 = LithiumDoubleInventory.getLithiumInventory(class067102)) != null) {
                return class067102;
            }
        }
        return class066952;
    }

    public static boolean tryMoveSingleItem(class06695 class066952, class06584 class065842, class07211 class072112) {
        class07054 class070542;
        class06584 class065843;
        if (((LithiumTransferConditionInventory)class066952).lithium$itemInsertionTestRequiresStackSize1()) {
            class065843 = class065842.t();
            class065843.i(1);
        } else {
            class065843 = class065842;
        }
        class07054 class070543 = class070542 = class066952 instanceof class07054 ? (class07054)class066952 : null;
        if (class070542 != null && class072112 != null) {
            int[] nArray = class070542.N(class072112);
            for (int i = 0; i < nArray.length; ++i) {
                if (!HopperHelper.tryMoveSingleItem(class066952, class070542, class065842, class065843, nArray[i], class072112)) continue;
                return true;
            }
        } else {
            int n = class066952.method_5439();
            for (int i = 0; i < n; ++i) {
                if (!HopperHelper.tryMoveSingleItem(class066952, class070542, class065842, class065843, i, class072112)) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean tryMoveSingleItem(class06695 class066952, class07054 class070542, class06584 class065842, class06584 class065843, int n, class07211 class072112) {
        class06584 class065844 = class066952.method_5438(n);
        if (class066952.method_5437(n, class065843) && (class070542 == null || class070542.N(n, class065843, class072112))) {
            if (class065844.R()) {
                class06584 class065845 = class065842.N(1);
                class066952.method_5447(n, class065845);
                return true;
            }
            int n2 = class065844.c();
            if (class065844.U() > n2 && class066952.method_5444() > n2 && class06584.L((class06584)class065844, (class06584)class065842)) {
                class065842.B(1);
                class065844.M(1);
                return true;
            }
        }
        return false;
    }

    public static void updateHopperOnUpdateSuppression(class07299 class072992, class07209 class072092, int n, class00570 class005702, boolean bl) {
        if ((n & 1) == 0 && bl) {
            Map map;
            Map map2 = map = WorldHelper.areNeighborsWithinSameChunk((class07209)class072092) ? class005702.o() : null;
            if (map == null || !map.isEmpty()) {
                for (class07211 class072112 : DirectionConstants.ALL) {
                    class00394 class003942;
                    class07209 class072093 = class072092.method_10093(class072112);
                    class00394 class003943 = class003942 = map != null ? (class00394)map.get(class072093) : ((BlockEntityGetter)class072992).lithium$getLoadedExistingBlockEntity(class072093);
                    if (!(class003942 instanceof UpdateReceiver)) continue;
                    UpdateReceiver updateReceiver = (UpdateReceiver)class003942;
                    updateReceiver.lithium$invalidateCacheOnNeighborUpdate(class072112 == class07211.field_11033);
                }
            }
        }
    }

    public static ComparatorUpdatePattern determineComparatorUpdatePattern(class06695 class066952, LithiumStackList lithiumStackList) {
        int n;
        int n2;
        class06584 class065842;
        if (class066952 instanceof class07234 || !(class066952 instanceof class07277)) {
            return ComparatorUpdatePattern.NO_UPDATE;
        }
        float f = 0.0f;
        int n3 = 0;
        for (int i = 0; i < class066952.method_5439(); ++i) {
            class06584 class065843 = class066952.method_5438(i);
            if (class065843.R()) continue;
            int n4 = Math.min(class066952.method_5444(), class065843.U());
            f += (float)class065843.c() / (float)n4;
            ++n3;
        }
        float f2 = f;
        int n5 = class04995.y((float)((f2 /= (float)class066952.method_5439()) * 14.0f)) + (n3 > 0 ? 1 : 0);
        ComparatorUpdatePattern comparatorUpdatePattern = ComparatorUpdatePattern.NO_UPDATE;
        int[] nArray = class066952 instanceof class07054 ? ((class07054)class066952).N(class07211.field_11033) : null;
        class07054 class070542 = class066952 instanceof class07054 ? (class07054)class066952 : null;
        int n6 = nArray != null ? nArray.length : class066952.method_5439();
        for (int i = 0; i < n6 && ((class065842 = (class06584)lithiumStackList.get(n2 = nArray != null ? nArray[i] : i)).R() || class070542 != null && !class070542.y(n2, class065842, class07211.field_11033) || (comparatorUpdatePattern = (n = HopperHelper.calculateReducedSignalStrength(f, class066952.method_5439(), class066952.method_5444(), n3, class065842.c(), class065842.U())) != n5 ? comparatorUpdatePattern.thenDecrementUpdateIncrementUpdate() : comparatorUpdatePattern.thenUpdate()).isChainable()); ++i) {
        }
        return comparatorUpdatePattern;
    }

    private static int calculateReducedSignalStrength(float f, int n, int n2, int n3, int n4, int n5) {
        int n6 = Math.min(n2, n5);
        int n7 = n3 - (n4 == 1 ? 1 : 0);
        float f2 = f - 1.0f / (float)n6;
        return class04995.y((float)((f2 /= (float)n) * 14.0f)) + (n7 > 0 ? 1 : 0);
    }
}

