/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.pathing.movement.MovementStatus
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.input.Input
 *  baritone.utils.BlockStateInterface
 *  baritone.utils.pathing.MutableMoveResult
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class06889
 *  minecraft.class07204
 *  minecraft.class07209
 */
package baritone.pathing.movement.movements;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.movement.MovementState;
import baritone.pathing.movement.MovementState$MovementTarget;
import baritone.utils.BlockStateInterface;
import baritone.utils.pathing.MutableMoveResult;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class06889;
import minecraft.class07204;
import minecraft.class07209;

public class MovementDescend
extends Movement {
    private int numTicks = 0;
    public boolean forceSafeMode = false;

    public MovementDescend(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        super(iBaritone, betterBlockPos, betterBlockPos2, new BetterBlockPos[]{betterBlockPos2.above(2), betterBlockPos2.above(), betterBlockPos2}, betterBlockPos2.below());
    }

    @Override
    public void reset() {
        super.reset();
        this.numTicks = 0;
        this.forceSafeMode = false;
    }

    public static void cost(CalculationContext calculationContext, int n, int n2, int n3, int n4, int n5, MutableMoveResult mutableMoveResult) {
        double d = 0.0;
        class00500 class005002 = calculationContext.get(n4, n2 - 1, n5);
        if ((d += MovementHelper.getMiningDurationTicks(calculationContext, n4, n2 - 1, n5, class005002, false)) >= 1000000.0) {
            return;
        }
        if ((d += MovementHelper.getMiningDurationTicks(calculationContext, n4, n2, n5, false)) >= 1000000.0) {
            return;
        }
        if ((d += MovementHelper.getMiningDurationTicks(calculationContext, n4, n2 + 1, n5, true)) >= 1000000.0) {
            return;
        }
        class00891 class008912 = calculationContext.get(n, n2 - 1, n3).i();
        if (class008912 == class00869.uW || class008912 == class00869.Rc) {
            return;
        }
        class00500 class005003 = calculationContext.get(n4, n2 - 2, n5);
        if (!MovementHelper.canWalkOn(calculationContext, n4, n2 - 2, n5, class005003)) {
            MovementDescend.dynamicFallCost(calculationContext, n, n2, n3, n4, n5, d, class005003, mutableMoveResult);
            return;
        }
        if (class005002.i() == class00869.uW || class005002.i() == class00869.Rc) {
            return;
        }
        if (MovementHelper.canUseFrostWalker(calculationContext, class005002)) {
            return;
        }
        double d2 = 3.7062775075283763;
        if (class008912 == class00869.iw) {
            d2 *= 2.0;
        }
        mutableMoveResult.x = n4;
        mutableMoveResult.y = n2 - 1;
        mutableMoveResult.z = n5;
        mutableMoveResult.cost = d += d2 + Math.max(FALL_N_BLOCKS_COST[1], 0.9265693768820937);
    }

    public boolean safeMode() {
        if (this.forceSafeMode) {
            return true;
        }
        class07209 class072092 = this.dest.method_10059((class00753)this.src.below()).method_10081((class00753)this.dest);
        if (this.skipToAscend()) {
            return true;
        }
        for (int i = 0; i <= 2; ++i) {
            if (!MovementHelper.avoidWalkingInto(BlockStateInterface.get((IPlayerContext)this.ctx, (class07209)class072092.method_10086(i)))) continue;
            return true;
        }
        return false;
    }

    @Override
    public Set<BetterBlockPos> calculateValidPositions() {
        return ImmutableSet.of((Object)this.src, (Object)this.dest.above(), (Object)this.dest);
    }

    @Override
    public double calculateCost(CalculationContext calculationContext) {
        MutableMoveResult mutableMoveResult = new MutableMoveResult();
        MovementDescend.cost(calculationContext, this.src.x, this.src.y, this.src.z, this.dest.x, this.dest.z, mutableMoveResult);
        if (mutableMoveResult.y != this.dest.y) {
            return 1000000.0;
        }
        return mutableMoveResult.cost;
    }

    public static boolean dynamicFallCost(CalculationContext calculationContext, int n, int n2, int n3, int n4, int n5, double d, class00500 class005002, MutableMoveResult mutableMoveResult) {
        if (d != 0.0 && calculationContext.get(n4, n2 + 2, n5).i() instanceof class07204) {
            return false;
        }
        if (!MovementHelper.canWalkThrough(calculationContext, n4, n2 - 2, n5, class005002)) {
            return false;
        }
        double d2 = 0.0;
        int n6 = n2;
        int n7 = 3;
        int n8;
        while ((n8 = n2 - n7) >= calculationContext.world.method_31607()) {
            boolean bl = n7 >= calculationContext.minFallHeight;
            class00500 class005003 = calculationContext.get(n4, n8, n5);
            int n9 = n7 - (n2 - n6);
            double d3 = 3.7062775075283763 + FALL_N_BLOCKS_COST[n9] + d + d2;
            if (bl && MovementHelper.isWater(class005003)) {
                if (!MovementHelper.canWalkThrough(calculationContext, n4, n8, n5, class005003)) {
                    return false;
                }
                if (calculationContext.assumeWalkOnWater) {
                    return false;
                }
                if (MovementHelper.isFlowing(n4, n8, n5, class005003, calculationContext.bsi)) {
                    return false;
                }
                if (!MovementHelper.canWalkOn(calculationContext, n4, n8 - 1, n5)) {
                    return false;
                }
                mutableMoveResult.x = n4;
                mutableMoveResult.y = n8;
                mutableMoveResult.z = n5;
                mutableMoveResult.cost = d3;
                return false;
            }
            if (bl && calculationContext.allowFallIntoLava && MovementHelper.isLava(class005003)) {
                mutableMoveResult.x = n4;
                mutableMoveResult.y = n8;
                mutableMoveResult.z = n5;
                mutableMoveResult.cost = d3;
                return false;
            }
            if (n9 <= 11 && (class005003.i() == class00869.Rc || class005003.i() == class00869.uW)) {
                d2 += FALL_N_BLOCKS_COST[n9 - 1];
                d2 += 6.666666666666667;
                n6 = n8;
            } else if (!MovementHelper.canWalkThrough(calculationContext, n4, n8, n5, class005003)) {
                if (!MovementHelper.canWalkOn(calculationContext, n4, n8, n5, class005003)) {
                    return false;
                }
                if (MovementHelper.isBottomSlab(class005003)) {
                    return false;
                }
                if (bl && n9 <= calculationContext.maxFallHeightNoWater + 1) {
                    mutableMoveResult.x = n4;
                    mutableMoveResult.y = n8 + 1;
                    mutableMoveResult.z = n5;
                    mutableMoveResult.cost = d3;
                    return false;
                }
                if (bl && calculationContext.hasWaterBucket && n9 <= calculationContext.maxFallHeightBucket + 1) {
                    mutableMoveResult.x = n4;
                    mutableMoveResult.y = n8 + 1;
                    mutableMoveResult.z = n5;
                    mutableMoveResult.cost = d3 + calculationContext.placeBucketCost();
                    return true;
                }
                return false;
            }
            ++n7;
        }
        return false;
    }

    public boolean skipToAscend() {
        class07209 class072092 = this.dest.method_10059((class00753)this.src.below()).method_10081((class00753)this.dest);
        return !MovementHelper.canWalkThrough(this.ctx, new BetterBlockPos(class072092)) && MovementHelper.canWalkThrough(this.ctx, new BetterBlockPos(class072092).above()) && MovementHelper.canWalkThrough(this.ctx, new BetterBlockPos(class072092).above(2));
    }

    public void forceSafeMode() {
        this.forceSafeMode = true;
    }

    @Override
    public MovementState updateState(MovementState movementState) {
        super.updateState(movementState);
        if (movementState.getStatus() != MovementStatus.RUNNING) {
            return movementState;
        }
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        class07209 class072092 = new class07209(this.dest.method_10263() * 2 - this.src.method_10263(), this.dest.method_10264(), this.dest.method_10260() * 2 - this.src.method_10260());
        if ((betterBlockPos.equals((Object)this.dest) || betterBlockPos.equals((Object)class072092)) && (MovementHelper.isLiquid(this.ctx, (class07209)this.dest) || this.ctx.player().method_73189().B - (double)this.dest.method_10264() < 0.5)) {
            return movementState.setStatus(MovementStatus.SUCCESS);
        }
        if (this.safeMode()) {
            double d = ((double)this.src.method_10263() + 0.5) * 0.17 + ((double)this.dest.method_10263() + 0.5) * 0.83;
            double d2 = ((double)this.src.method_10260() + 0.5) * 0.17 + ((double)this.dest.method_10260() + 0.5) * 0.83;
            movementState.setTarget(new MovementState$MovementTarget(RotationUtils.calcRotationFromVec3d((class06889)this.ctx.playerHead(), (class06889)new class06889(d, (double)this.dest.method_10264(), d2), (Rotation)this.ctx.playerRotations()).withPitch(this.ctx.playerRotations().getPitch()), false)).setInput(Input.MOVE_FORWARD, true);
            return movementState;
        }
        double d = this.ctx.player().method_73189().M - ((double)this.dest.method_10263() + 0.5);
        double d3 = this.ctx.player().method_73189().Z - ((double)this.dest.method_10260() + 0.5);
        double d4 = Math.sqrt(d * d + d3 * d3);
        double d5 = this.ctx.player().method_73189().M - ((double)this.src.method_10263() + 0.5);
        double d6 = this.ctx.player().method_73189().Z - ((double)this.src.method_10260() + 0.5);
        double d7 = Math.sqrt(d5 * d5 + d6 * d6);
        movementState.setInput(Input.SNEAK, (Boolean)Baritone.settings().allowWalkOnMagmaBlocks.value != false && this.ctx.world().method_8320(this.ctx.player().method_24515().method_10074()).N(class00869.EI));
        if (!betterBlockPos.equals((Object)this.dest) || d4 > 0.25) {
            if (this.numTicks++ < 20 && d7 < 1.25) {
                MovementHelper.moveTowards(this.ctx, movementState, class072092);
            } else {
                MovementHelper.moveTowards(this.ctx, movementState, (class07209)this.dest);
            }
        }
        return movementState;
    }
}

