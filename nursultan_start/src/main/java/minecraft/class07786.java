/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10789
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class01766
 *  minecraft.class02796
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06394
 *  minecraft.class06790
 *  minecraft.class06794
 *  minecraft.class07049
 *  minecraft.class07680
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class08162
 */
package minecraft;

import Nursultan.class10789;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01766;
import minecraft.class02796;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06394;
import minecraft.class06790;
import minecraft.class06794;
import minecraft.class07049;
import minecraft.class07680;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07765;
import minecraft.class08162;

public class class07786
implements ArgumentType<class07765> {
    public static final SuggestionProvider<class07701> N = (commandContext, suggestionsBuilder2) -> {
        StringReader stringReader = new StringReader(suggestionsBuilder2.getInput());
        stringReader.setCursor(suggestionsBuilder2.getStart());
        class06790 class067902 = new class06790(stringReader, ((class07701)commandContext.getSource()).N().hasPermission(class08162.i));
        try {
            class067902.v();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return class067902.N(suggestionsBuilder2, (T suggestionsBuilder) -> class07689.y((Iterable)((class07701)commandContext.getSource()).b(), (SuggestionsBuilder)suggestionsBuilder));
    };
    private static final Collection<String> L = Arrays.asList("Player", "0123", "*", "@e");
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.scoreHolder.empty"));
    final boolean y;

    public static Collection<class01766> L(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class07786.N(commandContext, string, () -> ((class06394)((class07701)commandContext.getSource()).W().yB()).L());
    }

    public class07786(boolean bl) {
        this.y = bl;
    }

    public static Collection<class01766> y(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class07786.N(commandContext, string, Collections::emptyList);
    }

    public static class07786 y() {
        return new class07786(true);
    }

    private static /* synthetic */ Collection N(UUID uUID, List list, class07701 class077012, Supplier supplier) throws CommandSyntaxException {
        class02796 class027962 = class077012.W();
        class07049 class070492 = null;
        ArrayList<class07049> arrayList = null;
        Iterator var7 = class027962.NO().iterator();
        while (var7.hasNext()) {
            class07049 class070493 = ((class04782)var7.next()).method_66347(uUID);
            if (class070493 == null) continue;
            if (class070492 == null) {
                class070492 = class070493;
                continue;
            }
            if (arrayList == null) {
                arrayList = new ArrayList<class07049>();
                arrayList.add(class070492);
            }
            arrayList.add(class070493);
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (class070492 != null) {
            return List.of(class070492);
        }
        return list;
    }

    public static Collection<class01766> N(CommandContext<class07701> commandContext, String string, Supplier<Collection<class01766>> supplier) throws CommandSyntaxException {
        Collection<class01766> var3 = ((class07765)commandContext.getArgument(string, class07765.class)).getNames((class07701)commandContext.getSource(), supplier);
        if (var3.isEmpty()) {
            throw class07680.u.create();
        }
        return var3;
    }

    public class07765 parse(StringReader stringReader) throws CommandSyntaxException {
        return this.N(stringReader, true);
    }

    public <S> class07765 parse(StringReader stringReader, S s) throws CommandSyntaxException {
        return this.N(stringReader, class06790.N(s));
    }

    private class07765 N(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '@') {
            class06790 class067902 = new class06790(stringReader, bl);
            class06794 class067942 = class067902.v();
            if (!this.y && class067942.N() > 1) {
                throw class07680.N.createWithContext((ImmutableStringReader)stringReader);
            }
            return new class10789(class067942);
        }
        int n = stringReader.getCursor();
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            stringReader.skip();
        }
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        if (string.equals("*")) {
            return (class077012, supplier) -> {
                Collection collection = (Collection)supplier.get();
                if (collection.isEmpty()) {
                    throw u.create();
                }
                return collection;
            };
        }
        List<class01766> list = List.of(class01766.N((String)string));
        if (string.startsWith("#")) {
            return (class077012, supplier) -> list;
        }
        try {
            return (arg_0, arg_1) -> class07786.N(UUID.fromString(string), list, arg_0, arg_1);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return (class077012, supplier) -> {
                class04770 class047702 = class077012.W().Nm().N(string);
                if (class047702 != null) {
                    return List.of(class047702);
                }
                return list;
            };
        }
    }

    public static class01766 N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class07786.y(commandContext, string).iterator().next();
    }

    public static class07786 N() {
        return new class07786(false);
    }

    public Collection<String> getExamples() {
        return L;
    }
}

