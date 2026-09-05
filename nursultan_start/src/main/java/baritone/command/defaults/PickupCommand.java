/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.IDatatype
 *  baritone.api.command.datatypes.IDatatypeFor
 *  baritone.api.command.datatypes.ItemById
 *  baritone.api.command.exception.CommandException
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04241
 *  minecraft.class06581
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.IDatatype;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.datatypes.ItemById;
import baritone.api.command.exception.CommandException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class04241;
import minecraft.class06581;

public class PickupCommand
extends Command {
    public PickupCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"pickup"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        HashSet<class06581> hashSet = new HashSet<class06581>();
        while (iArgConsumer.hasAny()) {
            class06581 class065812 = (class06581)iArgConsumer.getDatatypeFor((IDatatypeFor)ItemById.INSTANCE);
            hashSet.add(class065812);
        }
        if (hashSet.isEmpty()) {
            this.baritone.getFollowProcess().pickup(class065842 -> true);
            this.logDirect("Picking up all items");
        } else {
            this.baritone.getFollowProcess().pickup(class065842 -> hashSet.contains(class065842.B()));
            this.logDirect("Picking up these items:");
            hashSet.stream().map(arg_0 -> ((class04241)class04206.B).y(arg_0)).map(class01894::toString).forEach(arg_0 -> ((PickupCommand)this).logDirect(arg_0));
        }
    }

    public String getShortDesc() {
        return "Pickup items";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("Usage:", "> pickup - Pickup anything", "> pickup <item1> <item2> <...> - Pickup certain items");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        while (iArgConsumer.has(2)) {
            if (iArgConsumer.peekDatatypeOrNull((IDatatypeFor)ItemById.INSTANCE) == null) {
                return Stream.empty();
            }
            iArgConsumer.get();
        }
        return iArgConsumer.tabCompleteDatatype((IDatatype)ItemById.INSTANCE);
    }
}

