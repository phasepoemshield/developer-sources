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
 *  baritone.api.utils.BetterBlockPos
 *  minecraft.class07209
 *  minecraft.class07662
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.utils.BetterBlockPos;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class07209;
import minecraft.class07662;

public class SurfaceCommand
extends Command {
    protected SurfaceCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"surface", "top"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        int n;
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        int n2 = this.ctx.world().method_8615();
        int n3 = this.ctx.world().method_31605();
        if (betterBlockPos.method_10264() > n2 && this.ctx.world().method_8320((class07209)betterBlockPos.above()).i() instanceof class07662) {
            this.logDirect("Already at surface");
            return;
        }
        for (int i = n = Math.max(betterBlockPos.method_10264(), n2); i < n3; ++i) {
            BetterBlockPos betterBlockPos2 = new BetterBlockPos(betterBlockPos.method_10263(), i, betterBlockPos.method_10260());
            if (this.ctx.world().method_8320((class07209)betterBlockPos2).i() instanceof class07662 || betterBlockPos2.method_10264() <= betterBlockPos.method_10264()) continue;
            GoalBlock goalBlock = new GoalBlock((class07209)betterBlockPos2.above());
            this.logDirect(String.format("Going to: %s", goalBlock.toString()));
            this.baritone.getCustomGoalProcess().setGoalAndPath((Goal)goalBlock);
            return;
        }
        this.logDirect("No higher location found");
    }

    public String getShortDesc() {
        return "Used to get out of caves, mines, ...";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The surface/top command tells Baritone to head towards the closest surface-like area.", "", "This can be the surface or the highest available air space, depending on circumstances.", "", "Usage:", "> surface - Used to get out of caves, mines, ...", "> top - Used to get out of caves, mines, ...");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

