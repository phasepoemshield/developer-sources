/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.IDatatypePost
 *  baritone.api.command.datatypes.RelativeCoordinate
 *  baritone.api.command.datatypes.RelativeGoal
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.helpers.TabCompleteHelper
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.process.ICustomGoalProcess
 *  baritone.api.utils.BetterBlockPos
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.datatypes.RelativeCoordinate;
import baritone.api.command.datatypes.RelativeGoal;
import baritone.api.command.exception.CommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.pathing.goals.Goal;
import baritone.api.process.ICustomGoalProcess;
import baritone.api.utils.BetterBlockPos;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GoalCommand
extends Command {
    public GoalCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"goal"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        ICustomGoalProcess iCustomGoalProcess = this.baritone.getCustomGoalProcess();
        if (iArgConsumer.hasAny() && Arrays.asList("reset", "clear", "none").contains(iArgConsumer.peekString())) {
            iArgConsumer.requireMax(1);
            if (iCustomGoalProcess.getGoal() != null) {
                iCustomGoalProcess.setGoal(null);
                this.logDirect("Cleared goal");
            } else {
                this.logDirect("There was no goal to clear");
            }
        } else {
            iArgConsumer.requireMax(3);
            BetterBlockPos betterBlockPos = this.ctx.playerFeet();
            Goal goal = (Goal)iArgConsumer.getDatatypePost((IDatatypePost)RelativeGoal.INSTANCE, (Object)betterBlockPos);
            iCustomGoalProcess.setGoal(goal);
            this.logDirect(String.format("Goal: %s", goal.toString()));
        }
    }

    public String getShortDesc() {
        return "Set or clear the goal";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The goal command allows you to set or clear Baritone's goal.", "", "Wherever a coordinate is expected, you can use ~ just like in regular Minecraft commands. Or, you can just use regular numbers.", "", "Usage:", "> goal - Set the goal to your current position", "> goal <reset/clear/none> - Erase the goal", "> goal <y> - Set the goal to a Y level", "> goal <x> <z> - Set the goal to an X,Z position", "> goal <x> <y> <z> - Set the goal to an X,Y,Z position");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        TabCompleteHelper tabCompleteHelper = new TabCompleteHelper();
        if (iArgConsumer.hasExactlyOne()) {
            tabCompleteHelper.append(new String[]{"reset", "clear", "none", "~"});
        } else if (iArgConsumer.hasAtMost(3)) {
            while (iArgConsumer.has(2) && iArgConsumer.peekDatatypeOrNull((IDatatypePost)RelativeCoordinate.INSTANCE) != null) {
                iArgConsumer.get();
                if (iArgConsumer.has(2)) continue;
                tabCompleteHelper.append(new String[]{"~"});
            }
        }
        return tabCompleteHelper.filterPrefix(iArgConsumer.getString()).stream();
    }
}

