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
import baritone.pathing.movement.movements.MovementAscend;

final class Moves$8
extends Moves {
    Moves$8(int n2, int n3, int n4) {
    }

    @Override
    public double cost(CalculationContext calculationContext, int n, int n2, int n3) {
        return MovementAscend.cost(calculationContext, n, n2, n3, n, n3 + 1);
    }

    @Override
    public Movement apply0(CalculationContext calculationContext, BetterBlockPos betterBlockPos) {
        return new MovementAscend(calculationContext.getBaritone(), betterBlockPos, new BetterBlockPos(betterBlockPos.x, betterBlockPos.y + 1, betterBlockPos.z + 1));
    }
}

