/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.goals.GoalYLevel
 *  baritone.api.utils.BetterBlockPos
 *  minecraft.class04995
 */
package baritone.api.command.datatypes;

import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.datatypes.RelativeCoordinate;
import baritone.api.command.exception.CommandException;
import baritone.api.pathing.goals.GoalYLevel;
import baritone.api.utils.BetterBlockPos;
import java.util.stream.Stream;
import minecraft.class04995;

public enum RelativeGoalYLevel implements IDatatypePost<GoalYLevel, BetterBlockPos>
{
    INSTANCE;


    @Override
    public GoalYLevel apply(IDatatypeContext iDatatypeContext, BetterBlockPos betterBlockPos) throws CommandException {
        if (betterBlockPos == null) {
            betterBlockPos = BetterBlockPos.ORIGIN;
        }
        return new GoalYLevel(class04995.N((double)((Double)iDatatypeContext.getConsumer().getDatatypePost(RelativeCoordinate.INSTANCE, Double.valueOf(betterBlockPos.y)))));
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) {
        IArgConsumer iArgConsumer = iDatatypeContext.getConsumer();
        if (iArgConsumer.hasAtMost(1)) {
            return iArgConsumer.tabCompleteDatatype(RelativeCoordinate.INSTANCE);
        }
        return Stream.empty();
    }
}

