/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalXZ
 *  baritone.api.pathing.goals.GoalYLevel
 *  baritone.api.utils.BetterBlockPos
 *  minecraft.class07209
 */
package baritone.api.command.datatypes;

import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.datatypes.RelativeCoordinate;
import baritone.api.command.datatypes.RelativeGoalBlock;
import baritone.api.command.datatypes.RelativeGoalXZ;
import baritone.api.command.datatypes.RelativeGoalYLevel;
import baritone.api.command.exception.CommandException;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.pathing.goals.GoalYLevel;
import baritone.api.utils.BetterBlockPos;
import java.util.stream.Stream;
import minecraft.class07209;

public enum RelativeGoal implements IDatatypePost<Goal, BetterBlockPos>
{
    INSTANCE;


    @Override
    public Goal apply(IDatatypeContext iDatatypeContext, BetterBlockPos betterBlockPos) throws CommandException {
        IArgConsumer iArgConsumer;
        GoalBlock goalBlock;
        if (betterBlockPos == null) {
            betterBlockPos = BetterBlockPos.ORIGIN;
        }
        if ((goalBlock = (GoalBlock)(iArgConsumer = iDatatypeContext.getConsumer()).peekDatatypePostOrNull(RelativeGoalBlock.INSTANCE, betterBlockPos)) != null) {
            return goalBlock;
        }
        GoalXZ goalXZ = (GoalXZ)iArgConsumer.peekDatatypePostOrNull(RelativeGoalXZ.INSTANCE, betterBlockPos);
        if (goalXZ != null) {
            return goalXZ;
        }
        GoalYLevel goalYLevel = (GoalYLevel)iArgConsumer.peekDatatypePostOrNull(RelativeGoalYLevel.INSTANCE, betterBlockPos);
        if (goalYLevel != null) {
            return goalYLevel;
        }
        return new GoalBlock((class07209)betterBlockPos);
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) {
        return iDatatypeContext.getConsumer().tabCompleteDatatype(RelativeCoordinate.INSTANCE);
    }
}

