/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07185
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import java.util.Locale;
import java.util.stream.Stream;
import minecraft.class07185;

public enum ForAxis implements IDatatypeFor<class07185>
{
    INSTANCE;


    @Override
    public class07185 get(IDatatypeContext iDatatypeContext) throws CommandException {
        return class07185.valueOf((String)iDatatypeContext.getConsumer().getString().toUpperCase(Locale.US));
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) throws CommandException {
        return new TabCompleteHelper().append(Stream.of(class07185.values()).map(class07185::N).map(String::toLowerCase)).filterPrefix(iDatatypeContext.getConsumer().getString()).stream();
    }
}

