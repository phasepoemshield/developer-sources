/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06581
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06581;

public enum ItemById implements IDatatypeFor<class06581>
{
    INSTANCE;


    @Override
    public class06581 get(IDatatypeContext iDatatypeContext) throws CommandException {
        class01894 class018942 = class01894.N((String)iDatatypeContext.getConsumer().getString());
        class06581 class065812 = class04206.B.y(class018942).orElse(null);
        if (class065812 == null) {
            throw new IllegalArgumentException("No item found by that id");
        }
        return class065812;
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) throws CommandException {
        return new TabCompleteHelper().append(class04206.i.M().stream().map(class01894::toString)).filterPrefixNamespaced(iDatatypeContext.getConsumer().getString()).sortAlphabetically().stream();
    }
}

