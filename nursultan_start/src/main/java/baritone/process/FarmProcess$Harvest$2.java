/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07784
 */
package baritone.process;

import baritone.Baritone;
import baritone.process.FarmProcess$Harvest;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07784;

final class FarmProcess$Harvest$2
extends FarmProcess$Harvest {
    FarmProcess$Harvest$2(class00891 class008912, Predicate predicate) {
    }

    @Override
    public boolean readyToHarvest(class07299 class072992, class07209 class072092, class00500 class005002) {
        if (((Boolean)Baritone.settings().replantCrops.value).booleanValue()) {
            return class072992.method_8320(class072092.method_10074()).i() instanceof class07784;
        }
        return true;
    }
}

