/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  minecraft.class07209
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class07209;

public class ComeCommand
extends Command {
    public ComeCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"come"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        this.baritone.getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock((class07209)this.ctx.viewerPos()));
        this.logDirect("Coming");
    }

    public String getShortDesc() {
        return "Start heading towards your camera";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The come command tells Baritone to head towards your camera.", "", "This can be useful in hacked clients where freecam doesn't move your player position.", "", "Usage:", "> come");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

