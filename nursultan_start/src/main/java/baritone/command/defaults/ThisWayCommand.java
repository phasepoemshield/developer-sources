/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalXZ
 *  minecraft.class06889
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalXZ;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class06889;

public class ThisWayCommand
extends Command {
    public ThisWayCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"thisway", "forward"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireExactly(1);
        GoalXZ goalXZ = GoalXZ.fromDirection((class06889)this.ctx.playerFeetAsVec(), (float)this.ctx.player().method_5791(), (double)((Double)iArgConsumer.getAs(Double.class)));
        this.baritone.getCustomGoalProcess().setGoal((Goal)goalXZ);
        this.logDirect(String.format("Goal: %s", goalXZ));
    }

    public String getShortDesc() {
        return "Travel in your current direction";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("Creates a GoalXZ some amount of blocks in the direction you're currently looking", "", "Usage:", "> thisway <distance> - makes a GoalXZ distance blocks in front of you");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

