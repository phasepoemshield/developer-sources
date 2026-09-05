/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.behavior.IPathingBehavior
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 *  baritone.api.pathing.calc.IPathingControlManager
 *  baritone.api.process.IBaritoneProcess
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.behavior.IPathingBehavior;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.pathing.calc.IPathingControlManager;
import baritone.api.process.IBaritoneProcess;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ETACommand
extends Command {
    public ETACommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"eta"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        IPathingControlManager iPathingControlManager = this.baritone.getPathingControlManager();
        IBaritoneProcess iBaritoneProcess = iPathingControlManager.mostRecentInControl().orElse(null);
        if (iBaritoneProcess == null) {
            throw new CommandInvalidStateException("No process in control");
        }
        IPathingBehavior iPathingBehavior = this.baritone.getPathingBehavior();
        double d = iPathingBehavior.ticksRemainingInSegment().orElse(Double.NaN);
        double d2 = iPathingBehavior.estimatedTicksToGoal().orElse(Double.NaN);
        this.logDirect(String.format("Next segment: %.1fs (%.0f ticks)\nGoal: %.1fs (%.0f ticks)", d / 20.0, d, d2 / 20.0, d2));
    }

    public String getShortDesc() {
        return "View the current ETA";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The ETA command provides information about the estimated time until the next segment.", "and the goal", "", "Be aware that the ETA to your goal is really unprecise", "", "Usage:", "> eta - View ETA, if present");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

