/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.IBaritoneChatControl
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.BlockById
 *  baritone.api.command.datatypes.IDatatypeFor
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.helpers.TabCompleteHelper
 *  baritone.api.utils.BetterBlockPos
 *  baritone.cache.CachedChunk
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class00891
 *  minecraft.class04206
 *  minecraft.class04241
 *  minecraft.class05216
 *  minecraft.class06541
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.BlockById;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.utils.BetterBlockPos;
import baritone.cache.CachedChunk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class00891;
import minecraft.class04206;
import minecraft.class04241;
import minecraft.class05216;
import minecraft.class06541;

public class FindCommand
extends Command {
    public FindCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"find"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMin(1);
        ArrayList<class00891> arrayList = new ArrayList<class00891>();
        while (iArgConsumer.hasAny()) {
            arrayList.add((class00891)iArgConsumer.getDatatypeFor((IDatatypeFor)BlockById.INSTANCE));
        }
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        class00392[] class00392Array = (class00392[])arrayList.stream().flatMap(class008912 -> this.ctx.worldData().getCachedWorld().getLocationsOf(class04206.i.y(class008912).N(), Integer.MAX_VALUE, betterBlockPos.x, betterBlockPos.y, 4).stream()).map(BetterBlockPos::new).map(this::positionToComponent).toArray(class00392[]::new);
        if (class00392Array.length > 0) {
            Arrays.asList(class00392Array).forEach(class003922 -> this.logDirect(new class00392[]{class003922}));
        } else {
            this.logDirect("No positions known, are you sure the blocks are cached?");
        }
    }

    public String getShortDesc() {
        return "Find positions of a certain block";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The find command searches through Baritone's cache and attempts to find the location of the block.", "Tab completion will suggest only cached blocks and uncached blocks can not be found.", "", "Usage:", "> find <block> [...] - Try finding the listed blocks");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        return new TabCompleteHelper().append(CachedChunk.BLOCKS_TO_KEEP_TRACK_OF.stream().map(arg_0 -> ((class04241)class04206.i).y(arg_0)).map(Object::toString)).filterPrefixNamespaced(iArgConsumer.getString()).sortAlphabetically().stream();
    }

    private class00392 positionToComponent(BetterBlockPos betterBlockPos) {
        String string = String.format("%s %s %s", betterBlockPos.x, betterBlockPos.y, betterBlockPos.z);
        String string2 = String.format("%sgoal %s", IBaritoneChatControl.FORCE_COMMAND_PREFIX, string);
        class05216 class052162 = class00392.y((String)betterBlockPos.toString());
        class05216 class052163 = class00392.y((String)"Click to set goal to this position");
        class052162.y(class052162.method_10866().N(class06541.field_1080).N(string).N((class00647)new class00625(string2)).N((class00395)new class00401((class00392)class052163)));
        return class052162;
    }
}

