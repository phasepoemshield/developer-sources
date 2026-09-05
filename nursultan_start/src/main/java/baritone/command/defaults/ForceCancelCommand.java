/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.behavior.IPathingBehavior
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.behavior.IPathingBehavior;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForceCancelCommand
extends Command {
    public ForceCancelCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"forcecancel"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        IPathingBehavior iPathingBehavior = this.baritone.getPathingBehavior();
        iPathingBehavior.cancelEverything();
        iPathingBehavior.forceCancel();
        this.logDirect("ok force canceled");
    }

    public String getShortDesc() {
        return "Force cancel";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("Like cancel, but more forceful.", "", "Usage:", "> forcecancel");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

