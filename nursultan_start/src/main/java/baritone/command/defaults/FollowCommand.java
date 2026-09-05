/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.IDatatype
 *  baritone.api.command.datatypes.IDatatypeFor
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.helpers.TabCompleteHelper
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04241
 *  minecraft.class07049
 *  minecraft.class07078
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.IDatatype;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.command.defaults.FollowCommand$FollowGroup;
import baritone.command.defaults.FollowCommand$FollowList;
import baritone.command.defaults.FollowCommand$NoEntitiesException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class04241;
import minecraft.class07049;
import minecraft.class07078;

public class FollowCommand
extends Command {
    public FollowCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"follow"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        FollowCommand$FollowGroup followCommand$FollowGroup;
        iArgConsumer.requireMin(1);
        ArrayList<class07049> arrayList = new ArrayList<class07049>();
        ArrayList<class07078> arrayList2 = new ArrayList<class07078>();
        if (iArgConsumer.hasExactlyOne()) {
            followCommand$FollowGroup = (FollowCommand$FollowGroup)iArgConsumer.getEnum(FollowCommand$FollowGroup.class);
            this.baritone.getFollowProcess().follow(followCommand$FollowGroup.filter);
        } else {
            iArgConsumer.requireMin(2);
            followCommand$FollowGroup = null;
            FollowCommand$FollowList followCommand$FollowList = (FollowCommand$FollowList)iArgConsumer.getEnum(FollowCommand$FollowList.class);
            while (iArgConsumer.hasAny()) {
                Object object = iArgConsumer.getDatatypeFor(followCommand$FollowList.datatype);
                if (object instanceof class07078) {
                    arrayList2.add((class07078)object);
                    continue;
                }
                if (object == null) continue;
                arrayList.add((class07049)object);
            }
            this.baritone.getFollowProcess().follow(arrayList2.isEmpty() ? arrayList::contains : class070492 -> arrayList2.stream().anyMatch(class070782 -> class070492.method_5864().equals(class070782)));
        }
        if (followCommand$FollowGroup != null) {
            this.logDirect(String.format("Following all %s", followCommand$FollowGroup.name().toLowerCase(Locale.US)));
        } else if (arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new FollowCommand$NoEntitiesException();
            }
            this.logDirect("Following these entities:");
            arrayList.stream().map(class07049::toString).forEach(arg_0 -> ((FollowCommand)this).logDirect(arg_0));
        } else {
            this.logDirect("Following these types of entities:");
            arrayList2.stream().map(arg_0 -> ((class04241)class04206.M).y(arg_0)).map(Objects::requireNonNull).map(class01894::toString).forEach(arg_0 -> ((FollowCommand)this).logDirect(arg_0));
        }
    }

    public String getShortDesc() {
        return "Follow entity things";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The follow command tells Baritone to follow certain kinds of entities.", "", "Usage:", "> follow entities - Follows all entities.", "> follow entity <entity1> <entity2> <...> - Follow certain entities (for example 'skeleton', 'horse' etc.)", "> follow players - Follow players", "> follow player <username1> <username2> <...> - Follow certain players");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        IDatatypeFor iDatatypeFor;
        if (iArgConsumer.hasExactlyOne()) {
            return new TabCompleteHelper().append(FollowCommand$FollowGroup.class).append(FollowCommand$FollowList.class).filterPrefix(iArgConsumer.getString()).stream();
        }
        try {
            iDatatypeFor = ((FollowCommand$FollowList)iArgConsumer.getEnum(FollowCommand$FollowList.class)).datatype;
        }
        catch (NullPointerException nullPointerException) {
            return Stream.empty();
        }
        while (iArgConsumer.has(2)) {
            if (iArgConsumer.peekDatatypeOrNull(iDatatypeFor) == null) {
                return Stream.empty();
            }
            iArgConsumer.get();
        }
        return iArgConsumer.tabCompleteDatatype((IDatatype)iDatatypeFor);
    }
}

