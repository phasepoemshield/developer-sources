/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 *  baritone.pathing.movement.CalculationContext
 */
package baritone.utils;

import baritone.api.pathing.goals.Goal;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.pathing.movement.CalculationContext;

public class PathingCommandContext
extends PathingCommand {
    public final CalculationContext desiredCalcContext;

    public PathingCommandContext(Goal goal, PathingCommandType pathingCommandType, CalculationContext calculationContext) {
        super(goal, pathingCommandType);
        this.desiredCalcContext = calculationContext;
    }
}

