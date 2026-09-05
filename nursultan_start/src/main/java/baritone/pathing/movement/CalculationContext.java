/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.pathing.precompute.PrecomputedData
 *  baritone.utils.BlockStateInterface
 *  baritone.utils.ToolSet
 *  baritone.utils.pathing.BetterWorldBorder
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class02523
 *  minecraft.class02541
 *  minecraft.class02710
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class05298
 *  minecraft.class05946
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07304
 *  minecraft.class07310
 *  minecraft.class07314
 *  minecraft.class08044
 */
package baritone.pathing.movement;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.cache.WorldData;
import baritone.pathing.precompute.PrecomputedData;
import baritone.utils.BlockStateInterface;
import baritone.utils.ToolSet;
import baritone.utils.pathing.BetterWorldBorder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02523;
import minecraft.class02541;
import minecraft.class02710;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class05298;
import minecraft.class05946;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07304;
import minecraft.class07310;
import minecraft.class07314;
import minecraft.class08044;

public class CalculationContext {
    private static final class06584 STACK_BUCKET_WATER = new class06584((class07310)class06570.jE);
    public final boolean safeForThreadedUse;
    public final IBaritone baritone;
    public final class07299 world;
    public final WorldData worldData;
    public final BlockStateInterface bsi;
    public final ToolSet toolSet;
    public final boolean hasWaterBucket;
    public final boolean hasThrowaway;
    public final boolean canSprint;
    protected final double placeBlockCost;
    public final boolean allowBreak;
    public final List<class00891> allowBreakAnyway;
    public final boolean allowParkour;
    public final boolean allowParkourPlace;
    public final boolean allowJumpAtBuildLimit;
    public final boolean allowParkourAscend;
    public final boolean assumeWalkOnWater;
    public boolean allowFallIntoLava;
    public final int frostWalker;
    public final boolean allowDiagonalDescend;
    public final boolean allowDiagonalAscend;
    public final boolean allowDownward;
    public int minFallHeight;
    public int maxFallHeightNoWater;
    public final int maxFallHeightBucket;
    public final double waterWalkSpeed;
    public final double breakBlockAdditionalCost;
    public double backtrackCostFavoringCoefficient;
    public double jumpPenalty;
    public final double walkOnWaterOnePenalty;
    public final boolean allowWalkOnMagmaBlocks;
    public final BetterWorldBorder worldBorder;
    public final PrecomputedData precomputedData = new PrecomputedData();

    public CalculationContext(IBaritone iBaritone) {
        this(iBaritone, false);
    }

    public CalculationContext(IBaritone iBaritone, boolean bl) {
        this.safeForThreadedUse = bl;
        this.baritone = iBaritone;
        class04453 class044532 = iBaritone.getPlayerContext().player();
        this.world = iBaritone.getPlayerContext().world();
        this.worldData = (WorldData)iBaritone.getPlayerContext().worldData();
        this.bsi = new BlockStateInterface(iBaritone.getPlayerContext(), bl);
        this.toolSet = new ToolSet(class044532);
        this.hasThrowaway = (Boolean)Baritone.settings().allowPlace.value != false && ((Baritone)iBaritone).getInventoryBehavior().hasGenericThrowaway();
        this.hasWaterBucket = (Boolean)Baritone.settings().allowWaterBucketFall.value != false && class08044.L((int)class044532.method_31548().u(STACK_BUCKET_WATER)) && this.world.method_27983() != class07299.field_25180;
        this.canSprint = (Boolean)Baritone.settings().allowSprint.value != false && class044532.method_7344().N() > 6;
        this.placeBlockCost = (Double)Baritone.settings().blockPlacementPenalty.value;
        this.allowBreak = (Boolean)Baritone.settings().allowBreak.value;
        this.allowBreakAnyway = new ArrayList<class00891>((Collection)Baritone.settings().allowBreakAnyway.value);
        this.allowParkour = (Boolean)Baritone.settings().allowParkour.value;
        this.allowParkourPlace = (Boolean)Baritone.settings().allowParkourPlace.value;
        this.allowJumpAtBuildLimit = (Boolean)Baritone.settings().allowJumpAtBuildLimit.value;
        this.allowParkourAscend = (Boolean)Baritone.settings().allowParkourAscend.value;
        this.assumeWalkOnWater = (Boolean)Baritone.settings().assumeWalkOnWater.value;
        this.allowFallIntoLava = false;
        int n = 0;
        for (class07085 class070852 : class07085.values()) {
            class02710 class027102 = iBaritone.getPlayerContext().player().method_6118(class070852).J();
            for (Object object : class027102.N()) {
                if (!object.N(class07314.z)) continue;
                n = class027102.N((class03556)object);
            }
        }
        this.frostWalker = n;
        this.allowDiagonalDescend = (Boolean)Baritone.settings().allowDiagonalDescend.value;
        this.allowDiagonalAscend = (Boolean)Baritone.settings().allowDiagonalAscend.value;
        this.allowDownward = (Boolean)Baritone.settings().allowDownward.value;
        this.minFallHeight = 3;
        this.maxFallHeightNoWater = (Integer)Baritone.settings().maxFallHeightNoWater.value;
        this.maxFallHeightBucket = (Integer)Baritone.settings().maxFallHeightBucket.value;
        float f = 1.0f;
        block2: for (class07085 class070852 : class07085.values()) {
            class02710 class027102 = iBaritone.getPlayerContext().player().method_6118(class070852).J();
            for (class03556 class035562 : class027102.N()) {
                List list = ((class07304)class035562.N()).N(class02523.W);
                for (class02541 class025412 : list) {
                    if (!class025412.L().N((class05946)class05298.o.i().get())) continue;
                    f = class025412.u().N(class027102.N(class035562));
                    break block2;
                }
            }
        }
        this.waterWalkSpeed = 9.09090909090909 * (double)(1.0f - f) + 4.63284688441047 * (double)f;
        this.breakBlockAdditionalCost = (Double)Baritone.settings().blockBreakAdditionalPenalty.value;
        this.backtrackCostFavoringCoefficient = (Double)Baritone.settings().backtrackCostFavoringCoefficient.value;
        this.jumpPenalty = (Double)Baritone.settings().jumpPenalty.value;
        this.walkOnWaterOnePenalty = (Double)Baritone.settings().walkOnWaterOnePenalty.value;
        this.allowWalkOnMagmaBlocks = (Boolean)Baritone.settings().allowWalkOnMagmaBlocks.value;
        this.worldBorder = new BetterWorldBorder(this.world.method_8621());
    }

    public class00500 get(class07209 class072092) {
        return this.get(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public class00500 get(int n, int n2, int n3) {
        return this.bsi.get0(n, n2, n3);
    }

    public boolean isLoaded(int n, int n2) {
        return this.bsi.isLoaded(n, n2);
    }

    public final IBaritone getBaritone() {
        return this.baritone;
    }

    public class00891 getBlock(int n, int n2, int n3) {
        return this.get(n, n2, n3).i();
    }

    public boolean isPossiblyProtected(int n, int n2, int n3) {
        return false;
    }

    public double breakCostMultiplierAt(int n, int n2, int n3, class00500 class005002) {
        if (!this.allowBreak && !this.allowBreakAnyway.contains(class005002.i())) {
            return 1000000.0;
        }
        if (this.isPossiblyProtected(n, n2, n3)) {
            return 1000000.0;
        }
        return 1.0;
    }

    public double costOfPlacingAt(int n, int n2, int n3, class00500 class005002) {
        if (!this.hasThrowaway) {
            return 1000000.0;
        }
        if (this.isPossiblyProtected(n, n2, n3)) {
            return 1000000.0;
        }
        if (!this.worldBorder.canPlaceAt(n, n3)) {
            return 1000000.0;
        }
        if (!((Boolean)Baritone.settings().allowPlaceInFluidsSource.value).booleanValue() && class005002.Y().u()) {
            return 1000000.0;
        }
        if (!(((Boolean)Baritone.settings().allowPlaceInFluidsFlow.value).booleanValue() || class005002.Y().W() || class005002.Y().u())) {
            return 1000000.0;
        }
        return this.placeBlockCost;
    }

    public double placeBucketCost() {
        return this.placeBlockCost;
    }
}

