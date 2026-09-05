/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.ForBlockOptionalMeta
 *  baritone.api.command.datatypes.IDatatype
 *  baritone.api.command.datatypes.IDatatypeFor
 *  baritone.api.command.datatypes.IDatatypePost
 *  baritone.api.command.datatypes.RelativeCoordinate
 *  baritone.api.command.datatypes.RelativeGoal
 *  baritone.api.command.exception.CommandException
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.BlockOptionalMeta
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.ForBlockOptionalMeta;
import baritone.api.command.datatypes.IDatatype;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.datatypes.RelativeCoordinate;
import baritone.api.command.datatypes.RelativeGoal;
import baritone.api.command.exception.CommandException;
import baritone.api.pathing.goals.Goal;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.BlockOptionalMeta;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GotoCommand
extends Command {
    protected GotoCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"goto"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        if (iArgConsumer.peekDatatypeOrNull((IDatatypePost)RelativeCoordinate.INSTANCE) != null) {
            iArgConsumer.requireMax(3);
            BetterBlockPos betterBlockPos = this.ctx.playerFeet();
            Goal goal = (Goal)iArgConsumer.getDatatypePost((IDatatypePost)RelativeGoal.INSTANCE, (Object)betterBlockPos);
            this.logDirect(String.format("Going to: %s", goal.toString()));
            this.baritone.getCustomGoalProcess().setGoalAndPath(goal);
            return;
        }
        iArgConsumer.requireMax(1);
        BlockOptionalMeta blockOptionalMeta = (BlockOptionalMeta)iArgConsumer.getDatatypeFor((IDatatypeFor)ForBlockOptionalMeta.INSTANCE);
        this.baritone.getGetToBlockProcess().getToBlock(blockOptionalMeta);
    }

    public String getShortDesc() {
        return "Go to a coordinate or block";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The goto command tells Baritone to head towards a given goal or block.", "", "Wherever a coordinate is expected, you can use ~ just like in regular Minecraft commands. Or, you can just use regular numbers.", "", "Usage:", "> goto <block> - Go to a block, wherever it is in the world", "> goto <y> - Go to a Y level", "> goto <x> <z> - Go to an X,Z position", "> goto <x> <y> <z> - Go to an X,Y,Z position");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(1);
        return iArgConsumer.tabCompleteDatatype((IDatatype)ForBlockOptionalMeta.INSTANCE);
    }
}

