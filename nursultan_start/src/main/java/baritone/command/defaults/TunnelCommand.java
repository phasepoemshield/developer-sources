/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.argument.ICommandArgument
 *  baritone.api.command.exception.CommandException
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalStrictDirection
 *  minecraft.class07209
 *  minecraft.class07211
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.command.exception.CommandException;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalStrictDirection;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class07209;
import minecraft.class07211;

public class TunnelCommand
extends Command {
    public TunnelCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"tunnel"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(3);
        if (iArgConsumer.hasExactly(3)) {
            boolean bl = true;
            int n = Integer.parseInt(((ICommandArgument)iArgConsumer.getArgs().get(0)).getValue());
            int n2 = Integer.parseInt(((ICommandArgument)iArgConsumer.getArgs().get(1)).getValue());
            int n3 = Integer.parseInt(((ICommandArgument)iArgConsumer.getArgs().get(2)).getValue());
            if (n2 < 1 || n < 2 || n3 < 1 || n > this.ctx.world().method_31600()) {
                this.logDirect("Width and depth must at least be 1 block; Height must at least be 2 blocks, and cannot be greater than the build limit.");
                bl = false;
            }
            if (bl) {
                class07209 class072092;
                --n;
                class07211 class072112 = this.ctx.player().method_5735();
                int n4 = --n2 % 2 == 0 ? 0 : 1;
                class07209 class072093 = switch (class072112) {
                    case class07211.field_11034 -> {
                        class072092 = new class07209(this.ctx.playerFeet().x, this.ctx.playerFeet().y, this.ctx.playerFeet().z - n2 / 2);
                        yield new class07209(this.ctx.playerFeet().x + n3, this.ctx.playerFeet().y + n, this.ctx.playerFeet().z + n2 / 2 + n4);
                    }
                    case class07211.field_11039 -> {
                        class072092 = new class07209(this.ctx.playerFeet().x, this.ctx.playerFeet().y, this.ctx.playerFeet().z + n2 / 2 + n4);
                        yield new class07209(this.ctx.playerFeet().x - n3, this.ctx.playerFeet().y + n, this.ctx.playerFeet().z - n2 / 2);
                    }
                    case class07211.field_11043 -> {
                        class072092 = new class07209(this.ctx.playerFeet().x - n2 / 2, this.ctx.playerFeet().y, this.ctx.playerFeet().z);
                        yield new class07209(this.ctx.playerFeet().x + n2 / 2 + n4, this.ctx.playerFeet().y + n, this.ctx.playerFeet().z - n3);
                    }
                    case class07211.field_11035 -> {
                        class072092 = new class07209(this.ctx.playerFeet().x + n2 / 2 + n4, this.ctx.playerFeet().y, this.ctx.playerFeet().z);
                        yield new class07209(this.ctx.playerFeet().x - n2 / 2, this.ctx.playerFeet().y + n, this.ctx.playerFeet().z + n3);
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + String.valueOf(class072112));
                };
                this.logDirect(String.format("Creating a tunnel %s block(s) high, %s block(s) wide, and %s block(s) deep", n + 1, n2 + 1, n3));
                this.baritone.getBuilderProcess().clearArea(class072092, class072093);
            }
        } else {
            GoalStrictDirection goalStrictDirection = new GoalStrictDirection((class07209)this.ctx.playerFeet(), this.ctx.player().method_5735());
            this.baritone.getCustomGoalProcess().setGoalAndPath((Goal)goalStrictDirection);
            this.logDirect(String.format("Goal: %s", goalStrictDirection.toString()));
        }
    }

    public String getShortDesc() {
        return "Set a goal to tunnel in your current direction";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The tunnel command sets a goal that tells Baritone to mine completely straight in the direction that you're facing.", "", "Usage:", "> tunnel - No arguments, mines in a 1x2 radius.", "> tunnel <height> <width> <depth> - Tunnels in a user defined height, width and depth.");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

