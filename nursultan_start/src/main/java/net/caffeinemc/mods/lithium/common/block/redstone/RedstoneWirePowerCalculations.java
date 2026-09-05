/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00570
 *  minecraft.class00891
 *  minecraft.class02761
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 */
package net.caffeinemc.mods.lithium.common.block.redstone;

import minecraft.class00500;
import minecraft.class00570;
import minecraft.class00891;
import minecraft.class02761;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.util.DirectionConstants;

public class RedstoneWirePowerCalculations {
    private static final int MIN = 0;
    private static final int MAX = 15;
    private static final int MAX_WIRE = 14;

    public static int getNeighborSignal(class00891 class008912, class02761 class027612, class07299 class072992, class07209 class072092, boolean bl, boolean bl2) {
        int n = 0;
        class00570 class005702 = class072992.method_8500(class072092);
        if (!bl) {
            for (class07211 class072112 : DirectionConstants.VERTICAL) {
                class07209 class072093 = class072092.method_10093(class072112);
                class00500 class005002 = class005702.method_8320(class072093);
                if (class005002.P() || class005002.N(class008912) || (n = Math.max(n, RedstoneWirePowerCalculations.getSignalFromVertical(class072992, class072093, class005002, class072112, class008912))) < 15) continue;
                return 15;
            }
        }
        boolean bl3 = false;
        if (!bl2) {
            class07209 class072094 = class072092.method_10084();
            bl3 = !class005702.method_8320(class072094).u((class07290)class072992, class072094);
        }
        for (class07211 class072112 : DirectionConstants.HORIZONTAL) {
            if ((n = Math.max(n, RedstoneWirePowerCalculations.getSignalFromSide(class072992, class072092.method_10093(class072112), class072112, bl3, bl, bl2, class008912, class027612))) < 15) continue;
            return 15;
        }
        return n;
    }

    private static int getDirectSignalTo(class07299 class072992, class07209 class072092, class07211 class072112, class00891 class008912) {
        int n = 0;
        for (class07211 class072113 : DirectionConstants.ALL) {
            class07209 class072093;
            class00500 class005002;
            if (class072113 == class072112 || (class005002 = class072992.method_8320(class072093 = class072092.method_10093(class072113))).P() || class005002.N(class008912) || (n = Math.max(n, class005002.y((class07290)class072992, class072093, class072113))) < 15) continue;
            return 15;
        }
        return n;
    }

    private static int getSignalFromSide(class07299 class072992, class07209 class072092, class07211 class072112, boolean bl, boolean bl2, boolean bl3, class00891 class008912, class02761 class027612) {
        class07209 class072093;
        class00500 class005002;
        class00570 class005702 = class072992.method_8500(class072092);
        class00500 class005003 = class005702.method_8320(class072092);
        if (class005003.N(class008912)) {
            return !bl3 ? class027612.N(class072092, class005003) - 1 : 0;
        }
        int n = 0;
        if (!bl2 && (n = class005003.N((class07290)class072992, class072092, class072112)) >= 15) {
            return 15;
        }
        if (class005003.u((class07290)class072992, class072092)) {
            class07209 class072094;
            class00500 class005004;
            if (!bl2 && (n = Math.max(n, RedstoneWirePowerCalculations.getDirectSignalTo(class072992, class072092, class072112.b(), class008912))) >= 15) {
                return 15;
            }
            if (!bl3 && bl && n < 14 && (class005004 = class005702.method_8320(class072094 = class072092.method_10084())).N(class008912)) {
                n = Math.max(n, class027612.N(class072094, class005004) - 1);
            }
        } else if (!bl3 && n < 14 && (class005002 = class005702.method_8320(class072093 = class072092.method_10074())).N(class008912)) {
            n = Math.max(n, class027612.N(class072093, class005002) - 1);
        }
        return n;
    }

    public static int getNeighborWireSignal(class00891 class008912, class02761 class027612, class07299 class072992, class07209 class072092) {
        return RedstoneWirePowerCalculations.getNeighborSignal(class008912, class027612, class072992, class072092, true, false);
    }

    public static int getNeighborBlockSignal(class00891 class008912, class02761 class027612, class07299 class072992, class07209 class072092) {
        return RedstoneWirePowerCalculations.getNeighborSignal(class008912, class027612, class072992, class072092, false, true);
    }

    private static int getSignalFromVertical(class07299 class072992, class07209 class072092, class00500 class005002, class07211 class072112, class00891 class008912) {
        int n = class005002.N((class07290)class072992, class072092, class072112);
        if (n >= 15) {
            return 15;
        }
        if (class005002.u((class07290)class072992, class072092)) {
            return Math.max(n, RedstoneWirePowerCalculations.getDirectSignalTo(class072992, class072092, class072112.b(), class008912));
        }
        return n;
    }
}

