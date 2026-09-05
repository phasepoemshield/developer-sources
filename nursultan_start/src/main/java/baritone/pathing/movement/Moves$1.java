/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BetterBlockPos
 */
package baritone.pathing.movement;

import baritone.api.utils.BetterBlockPos;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.Moves;
import baritone.pathing.movement.movements.MovementDownward;

final class Moves$1
extends Moves {
    Moves$1(int n2, int n3, int n4) {
    }

    @Override
    public double cost(CalculationContext calculationContext, int n, int n2, int n3) {
        return MovementDownward.cost(calculationContext, n, n2, n3);
    }

    @Override
    public Movement apply0(CalculationContext calculationContext, BetterBlockPos betterBlockPos) {
        return new MovementDownward(calculationContext.getBaritone(), betterBlockPos, betterBlockPos.below());
    }
}

