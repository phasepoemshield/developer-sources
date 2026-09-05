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
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GcCommand
extends Command {
    public GcCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"gc"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        System.gc();
        this.logDirect("ok called System.gc()");
    }

    public String getShortDesc() {
        return "Call System.gc()";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("Calls System.gc().", "", "Usage:", "> gc");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

