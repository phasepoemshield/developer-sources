/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalAxis
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalAxis;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AxisCommand
extends Command {
    public AxisCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"axis", "highway"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        GoalAxis goalAxis = new GoalAxis();
        this.baritone.getCustomGoalProcess().setGoal((Goal)goalAxis);
        this.logDirect(String.format("Goal: %s", goalAxis.toString()));
    }

    public String getShortDesc() {
        return "Set a goal to the axes";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The axis command sets a goal that tells Baritone to head towards the nearest axis. That is, X=0 or Z=0.", "", "Usage:", "> axis");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

