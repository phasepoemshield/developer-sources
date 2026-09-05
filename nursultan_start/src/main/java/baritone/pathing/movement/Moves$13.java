/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BetterBlockPos
 *  baritone.utils.pathing.MutableMoveResult
 */
package baritone.pathing.movement;

import baritone.api.utils.BetterBlockPos;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.Moves;
import baritone.pathing.movement.movements.MovementDescend;
import baritone.pathing.movement.movements.MovementFall;
import baritone.utils.pathing.MutableMoveResult;

final class Moves$13
extends Moves {
    Moves$13(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    @Override
    public void apply(CalculationContext calculationContext, int n, int n2, int n3, MutableMoveResult mutableMoveResult) {
        MovementDescend.cost(calculationContext, n, n2, n3, n, n3 - 1, mutableMoveResult);
    }

    @Override
    public Movement apply0(CalculationContext calculationContext, BetterBlockPos betterBlockPos) {
        MutableMoveResult mutableMoveResult = new MutableMoveResult();
        this.apply(calculationContext, betterBlockPos.x, betterBlockPos.y, betterBlockPos.z, mutableMoveResult);
        if (mutableMoveResult.y == betterBlockPos.y - 1) {
            return new MovementDescend(calculationContext.getBaritone(), betterBlockPos, new BetterBlockPos(mutableMoveResult.x, mutableMoveResult.y, mutableMoveResult.z));
        }
        return new MovementFall(calculationContext.getBaritone(), betterBlockPos, new BetterBlockPos(mutableMoveResult.x, mutableMoveResult.y, mutableMoveResult.z));
    }
}

