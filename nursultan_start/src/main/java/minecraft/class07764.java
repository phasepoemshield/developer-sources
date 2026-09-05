/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class04206
 *  minecraft.class04907
 *  minecraft.class04922
 *  minecraft.class06675
 *  minecraft.class07689
 *  minecraft.class07701
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class04206;
import minecraft.class04907;
import minecraft.class04922;
import minecraft.class06675;
import minecraft.class07689;
import minecraft.class07701;

public class class07764
implements ArgumentType<class06675> {
    private static final Collection<String> y = Arrays.asList("foo", "foo.bar.baz", "minecraft:foo");
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.criteria.invalid", (Object[])new Object[]{object}));

    private class07764() {
    }

    public <T> String N(class04922<T> class049222, Object object) {
        return class04907.N(class049222, (Object)object);
    }

    public static class06675 N(CommandContext<class07701> commandContext, String string) {
        return (class06675)commandContext.getArgument(string, class06675.class);
    }

    public class06675 parse(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            stringReader.skip();
        }
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        return (class06675)class06675.y((String)string).orElseThrow(() -> {
            stringReader.setCursor(n);
            return N.createWithContext((ImmutableStringReader)stringReader, (Object)string);
        });
    }

    public static class07764 N() {
        return new class07764();
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        ArrayList arrayList = Lists.newArrayList((Iterable)class06675.N());
        for (class04922 var5 : class04206.G) {
            for (Object e : var5.y()) {
                String string = this.N(var5, e);
                arrayList.add(string);
            }
        }
        return class07689.y((Iterable)arrayList, (SuggestionsBuilder)suggestionsBuilder);
    }

    public Collection<String> getExamples() {
        return y;
    }
}

