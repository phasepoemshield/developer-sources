/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import java.util.Locale;
import java.util.stream.Stream;
import minecraft.class07211;

public enum ForDirection implements IDatatypeFor<class07211>
{
    INSTANCE;


    @Override
    public class07211 get(IDatatypeContext iDatatypeContext) throws CommandException {
        return class07211.valueOf((String)iDatatypeContext.getConsumer().getString().toUpperCase(Locale.US));
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) throws CommandException {
        return new TabCompleteHelper().append(Stream.of(class07211.values()).map(class07211::Z).map(String::toLowerCase)).filterPrefix(iDatatypeContext.getConsumer().getString()).stream();
    }
}

