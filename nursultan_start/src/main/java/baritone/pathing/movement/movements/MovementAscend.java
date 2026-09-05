/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.pathing.movement.MovementStatus
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.input.Input
 *  baritone.utils.BlockStateInterface
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class07204
 *  minecraft.class07209
 *  minecraft.class07211
 */
package baritone.pathing.movement.movements;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.movement.MovementHelper$PlaceResult;
import baritone.pathing.movement.MovementState;
import baritone.utils.BlockStateInterface;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class07204;
import minecraft.class07209;
import minecraft.class07211;

public class MovementAscend
extends Movement {
    private int ticksWithoutPlacement = 0;

    public MovementAscend(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        super(iBaritone, betterBlockPos, betterBlockPos2, new BetterBlockPos[]{betterBlockPos2, betterBlockPos.above(2), betterBlockPos2.above()}, betterBlockPos2.below());
    }

    @Override
    public void reset() {
        super.reset();
        this.ticksWithoutPlacement = 0;
    }

    public static double cost(CalculationContext calculationContext, int n, int n2, int n3, int n4, int n5) {
        double d;
        int n6;
        int n7;
        class00500 class005002 = calculationContext.get(n4, n2, n5);
        double d2 = 0.0;
        if (!MovementHelper.canWalkOn(calculationContext, n4, n2, n5, class005002)) {
            d2 = calculationContext.costOfPlacingAt(n4, n2, n5, class005002);
            if (d2 >= 1000000.0) {
                return 1000000.0;
            }
            if (!MovementHelper.isReplaceable(n4, n2, n5, class005002, calculationContext.bsi)) {
                return 1000000.0;
            }
            boolean bl = false;
            for (int i = 0; i < 5; ++i) {
                n7 = n4 + HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP[i].P();
                n6 = n2 + HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP[i].s();
                int n8 = n5 + HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP[i].T();
                if (n7 == n && n8 == n3 || !MovementHelper.canPlaceAgainst(calculationContext.bsi, n7, n6, n8)) continue;
                bl = true;
                break;
            }
            if (!bl) {
                return 1000000.0;
            }
        }
        class00500 class005003 = calculationContext.get(n, n2 + 2, n3);
        if (calculationContext.get(n, n2 + 3, n3).i() instanceof class07204 && (MovementHelper.canWalkThrough(calculationContext, n, n2 + 1, n3) || !(class005003.i() instanceof class07204))) {
            return 1000000.0;
        }
        class00500 class005004 = calculationContext.get(n, n2 - 1, n3);
        if (class005004.i() == class00869.uW || class005004.i() == class00869.Rc) {
            return 1000000.0;
        }
        n7 = MovementHelper.isBottomSlab(class005004) ? 1 : 0;
        n6 = MovementHelper.isBottomSlab(class005002) ? 1 : 0;
        if (n7 != 0 && n6 == 0) {
            return 1000000.0;
        }
        if (n6 != 0) {
            if (n7 != 0) {
                d = Math.max(JUMP_ONE_BLOCK_COST, 4.63284688441047);
                d += calculationContext.jumpPenalty;
            } else {
                d = 4.63284688441047;
            }
        } else {
            d = class005002.N(class00869.iw) ? 9.26569376882094 : (class005002.N(class00869.EI) ? 15.384615384615383 : Math.max(JUMP_ONE_BLOCK_COST, 4.63284688441047));
            d += calculationContext.jumpPenalty;
        }
        double d3 = d + d2;
        d3 += MovementHelper.getMiningDurationTicks(calculationContext, n, n2 + 2, n3, class005003, false);
        if (d3 >= 1000000.0) {
            return 1000000.0;
        }
        if ((d3 += MovementHelper.getMiningDurationTicks(calculationContext, n4, n2 + 1, n5, false)) >= 1000000.0) {
            return 1000000.0;
        }
        return d3 += MovementHelper.getMiningDurationTicks(calculationContext, n4, n2 + 2, n5, true);
    }

    @Override
    public Set<BetterBlockPos> calculateValidPositions() {
        BetterBlockPos betterBlockPos = new BetterBlockPos(this.src.method_10059((class00753)this.getDirection()).method_10084());
        return ImmutableSet.of((Object)this.src, (Object)this.src.above(), (Object)this.dest, (Object)betterBlockPos, (Object)betterBlockPos.above());
    }

    @Override
    public boolean safeToCancel(MovementState movementState) {
        return movementState.getStatus() != MovementStatus.RUNNING || this.ticksWithoutPlacement == 0;
    }

    @Override
    public double calculateCost(CalculationContext calculationContext) {
        return MovementAscend.cost(calculationContext, this.src.x, this.src.y, this.src.z, this.dest.x, this.dest.z);
    }

    public boolean headBonkClear() {
        BetterBlockPos betterBlockPos = this.src.above(2);
        for (int i = 0; i < 4; ++i) {
            BetterBlockPos betterBlockPos2 = betterBlockPos.relative(class07211.y((int)i));
            if (MovementHelper.canWalkThrough(this.ctx, betterBlockPos2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public MovementState updateState(MovementState movementState) {
        if (this.ctx.playerFeet().y < this.src.y) {
            return movementState.setStatus(MovementStatus.UNREACHABLE);
        }
        super.updateState(movementState);
        if (movementState.getStatus() != MovementStatus.RUNNING) {
            return movementState;
        }
        if (this.ctx.playerFeet().equals((Object)this.dest) || this.ctx.playerFeet().equals((Object)this.dest.method_10081((class00753)this.getDirection().method_10074()))) {
            return movementState.setStatus(MovementStatus.SUCCESS);
        }
        class00500 class005002 = BlockStateInterface.get((IPlayerContext)this.ctx, (class07209)this.positionToPlace);
        if (!MovementHelper.canWalkOn(this.ctx, this.positionToPlace, class005002)) {
            ++this.ticksWithoutPlacement;
            if (MovementHelper.attemptToPlaceABlock(movementState, this.baritone, (class07209)this.dest.below(), false, true) == MovementHelper$PlaceResult.READY_TO_PLACE) {
                movementState.setInput(Input.SNEAK, true);
                if (this.ctx.player().method_18276()) {
                    movementState.setInput(Input.CLICK_RIGHT, true);
                }
            }
            if (this.ticksWithoutPlacement > 10) {
                movementState.setInput(Input.MOVE_BACK, true);
            }
            return movementState;
        }
        MovementHelper.moveTowards(this.ctx, movementState, (class07209)this.dest);
        movementState.setInput(Input.SNEAK, (Boolean)Baritone.settings().allowWalkOnMagmaBlocks.value != false && class005002.N(class00869.EI));
        if (MovementHelper.isBottomSlab(class005002) && !MovementHelper.isBottomSlab(BlockStateInterface.get((IPlayerContext)this.ctx, (class07209)this.src.below()))) {
            return movementState;
        }
        if (((Boolean)Baritone.settings().assumeStep.value).booleanValue() || this.ctx.playerFeet().equals((Object)this.src.above())) {
            return movementState;
        }
        int n = Math.abs(this.src.method_10263() - this.dest.method_10263());
        int n2 = Math.abs(this.src.method_10260() - this.dest.method_10260());
        double d = (double)n * Math.abs((double)this.dest.method_10263() + 0.5 - this.ctx.player().method_73189().M) + (double)n2 * Math.abs((double)this.dest.method_10260() + 0.5 - this.ctx.player().method_73189().Z);
        double d2 = (double)n2 * Math.abs((double)this.dest.method_10263() + 0.5 - this.ctx.player().method_73189().M) + (double)n * Math.abs((double)this.dest.method_10260() + 0.5 - this.ctx.player().method_73189().Z);
        double d3 = (double)n * this.ctx.player().method_18798().Z + (double)n2 * this.ctx.player().method_18798().M;
        if (Math.abs(d3) > 0.1) {
            return movementState;
        }
        if (this.headBonkClear()) {
            return movementState.setInput(Input.JUMP, true);
        }
        if (d > 1.2 || d2 > 0.2) {
            return movementState;
        }
        return movementState.setInput(Input.JUMP, true);
    }
}

