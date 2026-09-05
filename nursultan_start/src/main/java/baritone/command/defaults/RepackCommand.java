/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 */
package baritone.command.defaults;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RepackCommand
extends Command {
    public RepackCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"repack", "rescan"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        this.logDirect(String.format("Queued %d chunks for repacking", BaritoneAPI.getProvider().getWorldScanner().repack(this.ctx)));
    }

    public String getShortDesc() {
        return "Re-cache chunks";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("Repack chunks around you. This basically re-caches them.", "", "Usage:", "> repack - Repack chunks.");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

