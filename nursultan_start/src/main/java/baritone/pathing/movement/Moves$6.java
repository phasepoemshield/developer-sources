/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BetterBlockPos
 *  baritone.pathing.movement.movements.MovementTraverse
 */
package baritone.pathing.movement;

import baritone.api.utils.BetterBlockPos;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.Moves;
import baritone.pathing.movement.movements.MovementTraverse;

final class Moves$6
extends Moves {
    Moves$6(int n2, int n3, int n4) {
    }

    @Override
    public double cost(CalculationContext calculationContext, int n, int n2, int n3) {
        return MovementTraverse.cost((CalculationContext)calculationContext, (int)n, (int)n2, (int)n3, (int)(n - 1), (int)n3);
    }

    @Override
    public Movement apply0(CalculationContext calculationContext, BetterBlockPos betterBlockPos) {
        return new MovementTraverse(calculationContext.getBaritone(), betterBlockPos, betterBlockPos.west());
    }
}

