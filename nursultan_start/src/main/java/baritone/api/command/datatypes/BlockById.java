/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import java.util.stream.Stream;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;

public enum BlockById implements IDatatypeFor<class00891>
{
    INSTANCE;


    @Override
    public class00891 get(IDatatypeContext iDatatypeContext) throws CommandException {
        class01894 class018942 = class01894.N((String)iDatatypeContext.getConsumer().getString());
        class00891 class008912 = class04206.i.y(class018942).orElse(null);
        if (class008912 == null) {
            throw new IllegalArgumentException("no block found by that id");
        }
        return class008912;
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) throws CommandException {
        String string = iDatatypeContext.getConsumer().getString();
        return new TabCompleteHelper().append(class04206.i.M().stream().map(Object::toString)).filterPrefixNamespaced(string).sortAlphabetically().stream();
    }
}

