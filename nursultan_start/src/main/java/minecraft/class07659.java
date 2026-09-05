/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10784
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class06790
 *  minecraft.class06794
 *  minecraft.class08162
 *  minecraft.class08774
 */
package minecraft;

import Nursultan.class10784;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class06790;
import minecraft.class06794;
import minecraft.class07675;
import minecraft.class07680;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class08162;
import minecraft.class08774;

public class class07659
implements ArgumentType<class07675> {
    private static final Collection<String> y = Arrays.asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.player.unknown"));

    public static Collection<class08774> N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return ((class07675)commandContext.getArgument(string, class07675.class)).getNames((class07701)commandContext.getSource());
    }

    public static class07659 N() {
        return new class07659();
    }

    public <S> class07675 parse(StringReader stringReader, S s) throws CommandSyntaxException {
        return class07659.N(stringReader, class06790.N(s));
    }

    public class07675 parse(StringReader stringReader) throws CommandSyntaxException {
        return class07659.N(stringReader, true);
    }

    private static class07675 N(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '@') {
            class06790 class067902 = new class06790(stringReader, bl);
            class06794 class067942 = class067902.v();
            if (class067942.y()) {
                throw class07680.L.createWithContext((ImmutableStringReader)stringReader);
            }
            return new class10784(class067942);
        }
        int n = stringReader.getCursor();
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            stringReader.skip();
        }
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        return class077012 -> Collections.singleton((class08774)class077012.W().Nf().R().N(string).orElseThrow(() -> ((SimpleCommandExceptionType)N).create()));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder2) {
        Object object = commandContext.getSource();
        if (object instanceof class07689) {
            class07689 class076892 = (class07689)object;
            object = new StringReader(suggestionsBuilder2.getInput());
            object.setCursor(suggestionsBuilder2.getStart());
            class06790 class067902 = new class06790((StringReader)object, class076892.N().hasPermission(class08162.i));
            try {
                class067902.v();
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
            return class067902.N(suggestionsBuilder2, (T suggestionsBuilder) -> class07689.y(class076892.b(), suggestionsBuilder));
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return y;
    }
}

