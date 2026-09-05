/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.process.ICustomGoalProcess
 */
package baritone.command.defaults;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.process.ICustomGoalProcess;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PathCommand
extends Command {
    public PathCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"path"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        ICustomGoalProcess iCustomGoalProcess = this.baritone.getCustomGoalProcess();
        iArgConsumer.requireMax(0);
        BaritoneAPI.getProvider().getWorldScanner().repack(this.ctx);
        iCustomGoalProcess.path();
        this.logDirect("Now pathing");
    }

    public String getShortDesc() {
        return "Start heading towards the goal";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The path command tells Baritone to head towards the current goal.", "", "Usage:", "> path - Start the pathing.");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        return Stream.empty();
    }
}

