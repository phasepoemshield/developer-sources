/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.ForBlockOptionalMeta
 *  baritone.api.command.datatypes.IDatatype
 *  baritone.api.command.datatypes.IDatatypeFor
 *  baritone.api.command.exception.CommandException
 *  baritone.api.utils.BlockOptionalMeta
 */
package baritone.command.defaults;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.ForBlockOptionalMeta;
import baritone.api.command.datatypes.IDatatype;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.utils.BlockOptionalMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MineCommand
extends Command {
    public MineCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"mine"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        int n = (Integer)iArgConsumer.getAsOrDefault(Integer.class, (Object)0);
        iArgConsumer.requireMin(1);
        ArrayList<BlockOptionalMeta> arrayList = new ArrayList<BlockOptionalMeta>();
        while (iArgConsumer.hasAny()) {
            arrayList.add((BlockOptionalMeta)iArgConsumer.getDatatypeFor((IDatatypeFor)ForBlockOptionalMeta.INSTANCE));
        }
        BaritoneAPI.getProvider().getWorldScanner().repack(this.ctx);
        this.logDirect(String.format("Mining %s", ((Object)arrayList).toString()));
        this.baritone.getMineProcess().mine(n, arrayList.toArray(new BlockOptionalMeta[0]));
    }

    public String getShortDesc() {
        return "Mine some blocks";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The mine command allows you to tell Baritone to search for and mine individual blocks.", "", "The specified blocks can be ores, or any other block.", "", "Also see the legitMine settings (see #set l legitMine).", "", "Usage:", "> mine diamond_ore - Mines all diamonds it can find.");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.getAsOrDefault(Integer.class, (Object)0);
        while (iArgConsumer.has(2)) {
            iArgConsumer.getDatatypeFor((IDatatypeFor)ForBlockOptionalMeta.INSTANCE);
        }
        return iArgConsumer.tabCompleteDatatype((IDatatype)ForBlockOptionalMeta.INSTANCE);
    }
}

