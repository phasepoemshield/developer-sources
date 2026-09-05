/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 *  baritone.api.pathing.calc.IPathingControlManager
 *  baritone.api.process.IBaritoneProcess
 *  baritone.api.process.PathingCommand
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.pathing.calc.IPathingControlManager;
import baritone.api.process.IBaritoneProcess;
import baritone.api.process.PathingCommand;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProcCommand
extends Command {
    public ProcCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"proc"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        IPathingControlManager iPathingControlManager = this.baritone.getPathingControlManager();
        IBaritoneProcess iBaritoneProcess = iPathingControlManager.mostRecentInControl().orElse(null);
        if (iBaritoneProcess == null) {
            throw new CommandInvalidStateException("No process in control");
        }
        this.logDirect(String.format("Class: %s\nPriority: %f\nTemporary: %b\nDisplay name: %s\nLast command: %s", iBaritoneProcess.getClass().getTypeName(), iBaritoneProcess.priority(), iBaritoneProcess.isTemporary(), iBaritoneProcess.displayName(), iPathingControlManager.mostRecentCommand().map(PathingCommand::toString).orElse("None")));
    }

    public String getShortDesc() {
        return "View process state information";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The proc command provides miscellaneous information about the process currently controlling Baritone.", "", "You are not expected to understand this if you aren't familiar with how Baritone works.", "", "Usage:", "> proc - View process information, if present");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

