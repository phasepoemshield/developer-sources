/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 *  baritone.api.process.IGetToBlockProcess
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.process.IGetToBlockProcess;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BlacklistCommand
extends Command {
    public BlacklistCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"blacklist"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        IGetToBlockProcess iGetToBlockProcess = this.baritone.getGetToBlockProcess();
        if (!iGetToBlockProcess.isActive()) {
            throw new CommandInvalidStateException("GetToBlockProcess is not currently active");
        }
        if (!iGetToBlockProcess.blacklistClosest()) {
            throw new CommandInvalidStateException("No known locations, unable to blacklist");
        }
        this.logDirect("Blacklisted closest instances");
    }

    public String getShortDesc() {
        return "Blacklist closest block";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("While going to a block this command blacklists the closest block so that Baritone won't attempt to get to it.", "", "Usage:", "> blacklist");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

