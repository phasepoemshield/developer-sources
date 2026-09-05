/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BetterBlockPos
 *  baritone.utils.pathing.MutableMoveResult
 *  minecraft.class07211
 */
package baritone.pathing.movement;

import baritone.api.utils.BetterBlockPos;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.Moves;
import baritone.pathing.movement.movements.MovementDiagonal;
import baritone.utils.pathing.MutableMoveResult;
import minecraft.class07211;

final class Moves$17
extends Moves {
    Moves$17(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    @Override
    public void apply(CalculationContext calculationContext, int n, int n2, int n3, MutableMoveResult mutableMoveResult) {
        MovementDiagonal.cost(calculationContext, n, n2, n3, n + 1, n3 + 1, mutableMoveResult);
    }

    @Override
    public Movement apply0(CalculationContext calculationContext, BetterBlockPos betterBlockPos) {
        MutableMoveResult mutableMoveResult = new MutableMoveResult();
        this.apply(calculationContext, betterBlockPos.x, betterBlockPos.y, betterBlockPos.z, mutableMoveResult);
        return new MovementDiagonal(calculationContext.getBaritone(), betterBlockPos, class07211.field_11035, class07211.field_11034, mutableMoveResult.y - betterBlockPos.y);
    }
}

