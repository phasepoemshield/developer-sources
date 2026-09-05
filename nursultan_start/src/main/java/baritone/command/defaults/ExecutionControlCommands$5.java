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

class ExecutionControlCommands$5
extends Command {
    final /* synthetic */ boolean[] val$paused;

    ExecutionControlCommands$5(ExecutionControlCommands executionControlCommands, IBaritone iBaritone, String[] stringArray, boolean ... blArray) {
        this.val$paused = blArray;
        super(iBaritone, stringArray);
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        if (this.val$paused[0]) {
            this.val$paused[0] = false;
        }
        this.baritone.getPathingBehavior().cancelEverything();
        this.logDirect("ok canceled");
    }

    public String getShortDesc() {
        return "Cancel what Baritone is currently doing";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The cancel command tells Baritone to stop whatever it's currently doing.", "", "Usage:", "> cancel");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

