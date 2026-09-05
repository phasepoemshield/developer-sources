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
import baritone.pathing.movement.movements.MovementParkour;
import baritone.utils.pathing.MutableMoveResult;
import minecraft.class07211;

final class Moves$20
extends Moves {
    Moves$20(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    @Override
    public void apply(CalculationContext calculationContext, int n, int n2, int n3, MutableMoveResult mutableMoveResult) {
        MovementParkour.cost(calculationContext, n, n2, n3, class07211.field_11035, mutableMoveResult);
    }

    @Override
    public Movement apply0(CalculationContext calculationContext, BetterBlockPos betterBlockPos) {
        return MovementParkour.cost(calculationContext, betterBlockPos, class07211.field_11035);
    }
}

