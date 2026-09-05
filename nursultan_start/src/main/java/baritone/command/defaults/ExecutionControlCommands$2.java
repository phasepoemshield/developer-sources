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

class ExecutionControlCommands$2
extends Command {
    final /* synthetic */ boolean[] val$paused;

    ExecutionControlCommands$2(ExecutionControlCommands executionControlCommands, IBaritone iBaritone, String[] stringArray, boolean ... blArray) {
        this.val$paused = blArray;
        super(iBaritone, stringArray);
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        if (this.val$paused[0]) {
            throw new CommandInvalidStateException("Already paused");
        }
        this.val$paused[0] = true;
        this.logDirect("Paused");
    }

    public String getShortDesc() {
        return "Pauses Baritone until you use resume";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The pause command tells Baritone to temporarily stop whatever it's doing.", "", "This can be used to pause pathing, building, following, whatever. A single use of the resume command will start it right back up again!", "", "Usage:", "> pause");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

