/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01226
 *  minecraft.class02484
 *  minecraft.class02523
 *  minecraft.class02541
 *  minecraft.class02710
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class05298
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07047
 *  minecraft.class07304
 *  minecraft.class07314
 */
package baritone.utils;

import baritone.Baritone;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01226;
import minecraft.class02484;
import minecraft.class02523;
import minecraft.class02541;
import minecraft.class02710;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class05298;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07047;
import minecraft.class07304;
import minecraft.class07314;

public class ToolSet {
    private final Map<class00891, Double> breakStrengthCache = new HashMap<class00891, Double>();
    private final Function<class00891, Double> backendCalculation;
    private final class04453 player;
    private static final List<class03530<class06581>> materialTagsPriorityList = List.of(class01226.yt, class01226.yG, class01226.yd, class01226.yw, class01226.yk, class01226.yY);

    public ToolSet(class04453 class044532) {
        this.player = class044532;
        if (((Boolean)Baritone.settings().considerPotionEffects.value).booleanValue()) {
            double d = this.potionAmplifier();
            Function<Double, Double> function = d2 -> d * d2;
            this.backendCalculation = function.compose(this::getBestDestructionTime);
        } else {
            this.backendCalculation = this::getBestDestructionTime;
        }
    }

    private double avoidanceMultiplier(class00891 class008912) {
        return ((List)Baritone.settings().blocksToAvoidBreaking.value).contains(class008912) ? (Double)Baritone.settings().avoidBreakingMultiplier.value : 1.0;
    }

    private double getBestDestructionTime(class00891 class008912) {
        class06584 class065842 = this.player.method_31548().method_5438(this.getBestSlot(class008912, false, true));
        return ToolSet.calculateSpeedVsBlock(class065842, class008912.W()) * this.avoidanceMultiplier(class008912);
    }

    public double getStrVsBlock(class00500 class005002) {
        return this.breakStrengthCache.computeIfAbsent(class005002.i(), this.backendCalculation);
    }

    public int getBestSlot(class00891 class008912, boolean bl) {
        return this.getBestSlot(class008912, bl, false);
    }

    public int getBestSlot(class00891 class008912, boolean bl, boolean bl2) {
        if (!((Boolean)Baritone.settings().autoTool.value).booleanValue() && bl2) {
            return this.player.method_31548().N();
        }
        int n = 0;
        double d = Double.NEGATIVE_INFINITY;
        int n2 = Integer.MIN_VALUE;
        boolean bl3 = false;
        class00500 class005002 = class008912.W();
        for (int i = 0; i < 9; ++i) {
            int n3;
            class06584 class065842 = this.player.method_31548().method_5438(i);
            if (!((Boolean)Baritone.settings().useSwordToMine.value).booleanValue() && class065842.B().R().N(class02484.g) || ((Boolean)Baritone.settings().itemSaver.value).booleanValue() && class065842.P() + (Integer)Baritone.settings().itemSaverThreshold.value >= class065842.s() && class065842.s() > 1) continue;
            double d2 = ToolSet.calculateSpeedVsBlock(class065842, class005002);
            boolean bl4 = this.hasSilkTouch(class065842);
            if (d2 > d) {
                d = d2;
                n = i;
                n2 = this.getMaterialCost(class065842);
                bl3 = bl4;
                continue;
            }
            if (d2 != d || ((n3 = this.getMaterialCost(class065842)) >= n2 || !bl4 && bl3) && (!bl || bl3 || !bl4)) continue;
            d = d2;
            n = i;
            n2 = n3;
            bl3 = bl4;
        }
        return n;
    }

    private int getMaterialCost(class06584 class065842) {
        for (int i = 0; i < materialTagsPriorityList.size(); ++i) {
            class03530<class06581> class035302 = materialTagsPriorityList.get(i);
            if (!class065842.N(class035302)) continue;
            return i;
        }
        return -1;
    }

    private double potionAmplifier() {
        double d = 1.0;
        if (this.player.method_6059(class07047.L)) {
            d *= 1.0 + (double)(this.player.method_6112(class07047.L).i() + 1) * 0.2;
        }
        if (this.player.method_6059(class07047.u)) {
            switch (this.player.method_6112(class07047.u).i()) {
                case 0: {
                    d *= 0.3;
                    break;
                }
                case 1: {
                    d *= 0.09;
                    break;
                }
                case 2: {
                    d *= 0.0027;
                    break;
                }
                default: {
                    d *= 8.1E-4;
                }
            }
        }
        return d;
    }

    public boolean hasSilkTouch(class06584 class065842) {
        class02710 class027102 = class065842.J();
        for (class03556 class035562 : class027102.N()) {
            if (!class035562.N(class07314.t) || class027102.N(class035562) <= 0) continue;
            return true;
        }
        return false;
    }

    public static double calculateSpeedVsBlock(class06584 class065842, class00500 class005002) {
        float f;
        try {
            f = class005002.i(null, null);
        }
        catch (NullPointerException nullPointerException) {
            return -1.0;
        }
        if (f < 0.0f) {
            return -1.0;
        }
        float f2 = class065842.N(class005002);
        if (f2 > 1.0f) {
            class02710 class027102 = class065842.J();
            block2: for (class03556 class035562 : class027102.N()) {
                List list = ((class07304)class035562.N()).N(class02523.W);
                for (class02541 class025412 : list) {
                    if (!class025412.L().N((class05946)class05298.t.i().get())) continue;
                    f2 += class025412.u().N(class027102.N(class035562));
                    break block2;
                }
            }
        }
        f2 /= f;
        if (!class005002.J() || !class065842.R() && class065842.y(class005002)) {
            return f2 / 30.0f;
        }
        return f2 / 100.0f;
    }
}

