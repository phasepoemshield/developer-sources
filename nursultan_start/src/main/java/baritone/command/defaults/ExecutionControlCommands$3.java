/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.command.defaults.ExecutionControlCommands;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class ExecutionControlCommands$3
extends Command {
    final /* synthetic */ boolean[] val$paused;

    ExecutionControlCommands$3(ExecutionControlCommands executionControlCommands, IBaritone iBaritone, String[] stringArray, boolean ... blArray) {
        this.val$paused = blArray;
        super(iBaritone, stringArray);
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        this.baritone.getBuilderProcess().resume();
        if (!this.val$paused[0]) {
            throw new CommandInvalidStateException("Not paused");
        }
        this.val$paused[0] = false;
        this.logDirect("Resumed");
    }

    public String getShortDesc() {
        return "Resumes Baritone after a pause";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The resume command tells Baritone to resume whatever it was doing when you last used pause.", "", "Usage:", "> resume");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

