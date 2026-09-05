/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class08036
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class08036;

public enum NearbyPlayer implements IDatatypeFor<class08036>
{
    INSTANCE;


    @Override
    public class08036 get(IDatatypeContext iDatatypeContext) throws CommandException {
        String string = iDatatypeContext.getConsumer().getString();
        return NearbyPlayer.getPlayers(iDatatypeContext).stream().filter(class080362 -> class080362.method_5477().getString().equalsIgnoreCase(string)).findFirst().orElse(null);
    }

    private static List<? extends class08036> getPlayers(IDatatypeContext iDatatypeContext) {
        return iDatatypeContext.getBaritone().getPlayerContext().world().method_18456();
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) throws CommandException {
        return new TabCompleteHelper().append(NearbyPlayer.getPlayers(iDatatypeContext).stream().map(class08036::method_5477).map(class00392::getString)).filterPrefix(iDatatypeContext.getConsumer().getString()).sortAlphabetically().stream();
    }
}

