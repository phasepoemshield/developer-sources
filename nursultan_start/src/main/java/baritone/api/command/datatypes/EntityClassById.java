/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class07078
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class07078;

public enum EntityClassById implements IDatatypeFor<class07078>
{
    INSTANCE;


    @Override
    public class07078 get(IDatatypeContext iDatatypeContext) throws CommandException {
        class01894 class018942 = class01894.N((String)iDatatypeContext.getConsumer().getString());
        class07078 class070782 = class04206.M.y(class018942).orElse(null);
        if (class070782 == null) {
            throw new IllegalArgumentException("no entity found by that id");
        }
        return class070782;
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) throws CommandException {
        return new TabCompleteHelper().append(class04206.M.j().map(Object::toString)).filterPrefixNamespaced(iDatatypeContext.getConsumer().getString()).sortAlphabetically().stream();
    }
}

