/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BlockOptionalMeta
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class08092
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.BlockById;
import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.utils.BlockOptionalMeta;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class08092;

public enum ForBlockOptionalMeta implements IDatatypeFor<BlockOptionalMeta>
{
    INSTANCE;

    private static Pattern PATTERN;

    static {
        PATTERN = Pattern.compile("(?:[a-z0-9_.-]+:)?(?:[a-z0-9/_.-]+(?:\\[(?:(?:[a-z0-9_.-]+=[a-z0-9_.-]+,)*(?:[a-z0-9_.-]+(?:=(?:[a-z0-9_.-]+(?:\\])?)?)?)?|\\])?)?)?");
    }

    @Override
    public BlockOptionalMeta get(IDatatypeContext iDatatypeContext) throws CommandException {
        return new BlockOptionalMeta(iDatatypeContext.getConsumer().getString());
    }

    private static <T extends Comparable<T>> Stream<String> getValues(class08092<T> class080922) {
        return class080922.N().stream().map(arg_0 -> class080922.y(arg_0));
    }

    private static String[] splitLast(String string, char c) {
        int n = string.lastIndexOf(c);
        if (n == -1) {
            return new String[]{"", string};
        }
        return new String[]{string.substring(0, n), string.substring(n + 1)};
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) throws CommandException {
        String string3 = iDatatypeContext.getConsumer().peekString();
        if (!PATTERN.matcher(string3).matches()) {
            iDatatypeContext.getConsumer().getString();
            return Stream.empty();
        }
        if (string3.endsWith("]")) {
            iDatatypeContext.getConsumer().getString();
            return Stream.empty();
        }
        if (!string3.contains("[")) {
            return iDatatypeContext.getConsumer().tabCompleteDatatype(BlockById.INSTANCE);
        }
        iDatatypeContext.getConsumer().getString();
        class00891 class008912 = ForBlockOptionalMeta.splitLast(string3, '[');
        String string4 = class008912[0];
        String string5 = class008912[1];
        class008912 = class04206.i.y(class01894.N((String)string4)).orElse(null);
        if (class008912 == null) {
            return Stream.empty();
        }
        Object object = ForBlockOptionalMeta.splitLast(string5, ',');
        String string6 = object[0];
        String string7 = object[1];
        if (!string7.contains("=")) {
            object = Stream.of(string6.split(",")).map(string -> string.split("=")[0]).collect(Collectors.toSet());
            String string8 = string3.substring(0, string3.length() - string7.length());
            return new TabCompleteHelper().append(class008912.E().u().stream().map(class08092::R)).filter(arg_0 -> ForBlockOptionalMeta.lambda$tabComplete$1((Set)object, arg_0)).filterPrefix(string7).sortAlphabetically().map(string2 -> string8 + string2).stream();
        }
        Object object2 = ForBlockOptionalMeta.splitLast(string7, '=');
        object = object2[0];
        String string9 = object2[1];
        object2 = string3.substring(0, string3.length() - string9.length());
        class08092 class080922 = class008912.E().N((String)object);
        if (class080922 == null) {
            return Stream.empty();
        }
        return new TabCompleteHelper().append(ForBlockOptionalMeta.getValues(class080922)).filterPrefix(string9).sortAlphabetically().map(arg_0 -> ForBlockOptionalMeta.lambda$tabComplete$3((String)object2, arg_0)).stream();
    }

    private static /* synthetic */ boolean lambda$tabComplete$1(Set set, String string) {
        return !set.contains(string);
    }

    private static /* synthetic */ String lambda$tabComplete$3(String string, String string2) {
        return string + string2;
    }
}

