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

public class SaveAllCommand
extends Command {
    public SaveAllCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"saveall"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        this.ctx.worldData().getCachedWorld().save();
        this.logDirect("Saved");
    }

    public String getShortDesc() {
        return "Saves Baritone's cache for this world";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The saveall command saves Baritone's world cache.", "", "Usage:", "> saveall");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

