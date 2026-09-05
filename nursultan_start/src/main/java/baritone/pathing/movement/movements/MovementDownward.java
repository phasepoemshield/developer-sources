/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.pathing.movement.MovementStatus
 *  baritone.api.utils.BetterBlockPos
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class07209
 */
package baritone.pathing.movement.movements;

import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.movement.MovementState;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class07209;

public class MovementDownward
extends Movement {
    private int numTicks = 0;

    public MovementDownward(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        super(iBaritone, betterBlockPos, betterBlockPos2, new BetterBlockPos[]{betterBlockPos2});
    }

    @Override
    public void reset() {
        super.reset();
        this.numTicks = 0;
    }

    public static double cost(CalculationContext calculationContext, int n, int n2, int n3) {
        if (!calculationContext.allowDownward) {
            return 1000000.0;
        }
        if (!MovementHelper.canWalkOn(calculationContext, n, n2 - 2, n3)) {
            return 1000000.0;
        }
        class00500 class005002 = calculationContext.get(n, n2 - 1, n3);
        class00891 class008912 = class005002.i();
        if (class008912 == class00869.uW || class008912 == class00869.Rc) {
            return 6.666666666666667;
        }
        return FALL_N_BLOCKS_COST[1] + MovementHelper.getMiningDurationTicks(calculationContext, n, n2 - 1, n3, class005002, false);
    }

    @Override
    public Set<BetterBlockPos> calculateValidPositions() {
        return ImmutableSet.of((Object)this.src, (Object)this.dest);
    }

    @Override
    public double calculateCost(CalculationContext calculationContext) {
        return MovementDownward.cost(calculationContext, this.src.x, this.src.y, this.src.z);
    }

    @Override
    public MovementState updateState(MovementState movementState) {
        super.updateState(movementState);
        if (movementState.getStatus() != MovementStatus.RUNNING) {
            return movementState;
        }
        if (this.ctx.playerFeet().equals((Object)this.dest)) {
            return movementState.setStatus(MovementStatus.SUCCESS);
        }
        if (!this.playerInValidPosition()) {
            return movementState.setStatus(MovementStatus.UNREACHABLE);
        }
        double d = this.ctx.player().method_73189().M - ((double)this.dest.method_10263() + 0.5);
        double d2 = this.ctx.player().method_73189().Z - ((double)this.dest.method_10260() + 0.5);
        double d3 = Math.sqrt(d * d + d2 * d2);
        if (this.numTicks++ < 10 && d3 < 0.2) {
            return movementState;
        }
        MovementHelper.moveTowards(this.ctx, movementState, (class07209)this.positionsToBreak[0]);
        return movementState;
    }
}

