/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.utils.BetterBlockPos
 *  minecraft.class03063
 *  minecraft.class05630
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.utils.BetterBlockPos;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class03063;
import minecraft.class05630;

public class RenderCommand
extends Command {
    public RenderCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"render"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        int n = ((Integer)((class05630)this.ctx.minecraft().i_7).i().method_41753() + 1) * 16;
        ((class03063)this.ctx.minecraft().B_2).y(betterBlockPos.x - n, this.ctx.world().method_31607(), betterBlockPos.z - n, betterBlockPos.x + n, this.ctx.world().method_31600(), betterBlockPos.z + n);
        this.logDirect("Done");
    }

    public String getShortDesc() {
        return "Fix glitched chunks";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The render command fixes glitched chunk rendering without having to reload all of them.", "", "Usage:", "> render");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

