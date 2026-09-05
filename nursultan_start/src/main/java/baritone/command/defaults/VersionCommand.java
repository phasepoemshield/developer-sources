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
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class VersionCommand
extends Command {
    public VersionCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"version"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        String string2 = ((Object)((Object)this)).getClass().getPackage().getImplementationVersion();
        if (string2 == null) {
            throw new CommandInvalidStateException("Null version (this is normal in a dev environment)");
        }
        this.logDirect(String.format("You are running Baritone v%s", string2));
    }

    public String getShortDesc() {
        return "View the Baritone version";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The version command prints the version of Baritone you're currently running.", "", "Usage:", "> version - View version information, if present");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

