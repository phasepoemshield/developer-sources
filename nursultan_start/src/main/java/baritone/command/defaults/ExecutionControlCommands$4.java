/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.command.defaults.ExecutionControlCommands;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class ExecutionControlCommands$4
extends Command {
    final /* synthetic */ boolean[] val$paused;

    ExecutionControlCommands$4(ExecutionControlCommands executionControlCommands, IBaritone iBaritone, String[] stringArray, boolean ... blArray) {
        this.val$paused = blArray;
        super(iBaritone, stringArray);
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        this.logDirect(String.format("Baritone is %spaused", this.val$paused[0] ? "" : "not "));
    }

    public String getShortDesc() {
        return "Tells you if Baritone is paused";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The paused command tells you if Baritone is currently paused by use of the pause command.", "", "Usage:", "> paused");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

