/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class00900
 *  minecraft.class06772
 *  minecraft.class07090
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08092
 */
package baritone.process;

import baritone.process.FarmProcess$Harvest$1;
import baritone.process.FarmProcess$Harvest$2;
import baritone.process.FarmProcess$Harvest$3;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class00900;
import minecraft.class06772;
import minecraft.class07090;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08092;

sealed class FarmProcess$Harvest
extends Enum<FarmProcess$Harvest>
permits FarmProcess$Harvest$1, FarmProcess$Harvest$2, FarmProcess$Harvest$3 {
    public static final /* enum */ FarmProcess$Harvest WHEAT = new FarmProcess$Harvest((class06772)class00869.Lh);
    public static final /* enum */ FarmProcess$Harvest CARROTS = new FarmProcess$Harvest((class06772)class00869.Bz);
    public static final /* enum */ FarmProcess$Harvest POTATOES = new FarmProcess$Harvest((class06772)class00869.BU);
    public static final /* enum */ FarmProcess$Harvest BEETROOT = new FarmProcess$Harvest((class06772)class00869.Ew);
    public static final /* enum */ FarmProcess$Harvest PUMPKIN = new FarmProcess$Harvest(class00869.Ro, class005002 -> true);
    public static final /* enum */ FarmProcess$Harvest MELON = new FarmProcess$Harvest(class00869.Rq, class005002 -> true);
    public static final /* enum */ FarmProcess$Harvest NETHERWART = new FarmProcess$Harvest(class00869.MR, class005002 -> (Integer)class005002.L((class08092)class07090.L) >= 3);
    public static final /* enum */ FarmProcess$Harvest COCOA = new FarmProcess$Harvest(class00869.Mb, class005002 -> (Integer)class005002.L((class08092)class00900.L) >= 2);
    public static final /* enum */ FarmProcess$Harvest SUGARCANE = new FarmProcess$Harvest$1(class00869.it, null);
    public static final /* enum */ FarmProcess$Harvest BAMBOO = new FarmProcess$Harvest$2(class00869.mx, null);
    public static final /* enum */ FarmProcess$Harvest CACTUS = new FarmProcess$Harvest$3(class00869.ij, null);
    public final class00891 block;
    public final Predicate<class00500> readyToHarvest;
    private static final /* synthetic */ FarmProcess$Harvest[] $VALUES;

    FarmProcess$Harvest(class00891 class008912, Predicate<class00500> predicate) {
        this.block = class008912;
        this.readyToHarvest = predicate;
    }

    private FarmProcess$Harvest(class06772 class067722) {
        this((class00891)class067722, arg_0 -> ((class06772)class067722).E(arg_0));
    }

    static {
        $VALUES = FarmProcess$Harvest.$values();
    }

    public static FarmProcess$Harvest[] values() {
        return (FarmProcess$Harvest[])$VALUES.clone();
    }

    public static FarmProcess$Harvest valueOf(String string) {
        return Enum.valueOf(FarmProcess$Harvest.class, string);
    }

    private static /* synthetic */ FarmProcess$Harvest[] $values() {
        return new FarmProcess$Harvest[]{WHEAT, CARROTS, POTATOES, BEETROOT, PUMPKIN, MELON, NETHERWART, COCOA, SUGARCANE, BAMBOO, CACTUS};
    }

    public boolean readyToHarvest(class07299 class072992, class07209 class072092, class00500 class005002) {
        return this.readyToHarvest.test(class005002);
    }
}

