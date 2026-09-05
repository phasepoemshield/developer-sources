/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.IDatatype
 *  baritone.api.command.datatypes.IDatatypePost
 *  baritone.api.command.datatypes.RelativeGoalXZ
 *  baritone.api.command.exception.CommandException
 *  baritone.api.pathing.goals.GoalXZ
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.IDatatype;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.datatypes.RelativeGoalXZ;
import baritone.api.command.exception.CommandException;
import baritone.api.pathing.goals.GoalXZ;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExploreCommand
extends Command {
    public ExploreCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"explore"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        if (iArgConsumer.hasAny()) {
            iArgConsumer.requireExactly(2);
        } else {
            iArgConsumer.requireMax(0);
        }
        GoalXZ goalXZ = iArgConsumer.hasAny() ? (GoalXZ)iArgConsumer.getDatatypePost((IDatatypePost)RelativeGoalXZ.INSTANCE, (Object)this.ctx.playerFeet()) : new GoalXZ(this.ctx.playerFeet());
        this.baritone.getExploreProcess().explore(goalXZ.getX(), goalXZ.getZ());
        this.logDirect(String.format("Exploring from %s", goalXZ.toString()));
    }

    public String getShortDesc() {
        return "Explore things";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("Tell Baritone to explore randomly. If you used explorefilter before this, it will be applied.", "", "Usage:", "> explore - Explore from your current position.", "> explore <x> <z> - Explore from the specified X and Z position.");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        if (iArgConsumer.hasAtMost(2)) {
            return iArgConsumer.tabCompleteDatatype((IDatatype)RelativeGoalXZ.INSTANCE);
        }
        return Stream.empty();
    }
}

