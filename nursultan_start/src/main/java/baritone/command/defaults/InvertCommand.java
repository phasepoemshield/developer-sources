/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 *  baritone.api.pathing.goals.GoalInverted
 *  baritone.api.process.ICustomGoalProcess
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.pathing.goals.GoalInverted;
import baritone.api.process.ICustomGoalProcess;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class InvertCommand
extends Command {
    public InvertCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"invert"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        ICustomGoalProcess iCustomGoalProcess = this.baritone.getCustomGoalProcess();
        Object object = iCustomGoalProcess.getGoal();
        if (object == null) {
            throw new CommandInvalidStateException("No goal");
        }
        object = object instanceof GoalInverted ? ((GoalInverted)object).origin : new GoalInverted(object);
        iCustomGoalProcess.setGoalAndPath(object);
        this.logDirect(String.format("Goal: %s", object.toString()));
    }

    public String getShortDesc() {
        return "Run away from the current goal";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The invert command tells Baritone to head away from the current goal rather than towards it.", "", "Usage:", "> invert - Invert the current goal.");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

