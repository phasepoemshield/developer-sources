/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class07664;
import minecraft.class07689;
import minecraft.class07701;

public class class07687
implements ArgumentType<class07664> {
    private static final Collection<String> N = Arrays.asList("eyes", "feet");
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.anchor.invalid", (Object[])new Object[]{object}));

    public static class07687 N() {
        return new class07687();
    }

    public static class07664 N(CommandContext<class07701> commandContext, String string) {
        return (class07664)((Object)commandContext.getArgument(string, class07664.class));
    }

    public class07664 parse(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        String string = stringReader.readUnquotedString();
        class07664 class076642 = class07664.N(string);
        if (class076642 == null) {
            stringReader.setCursor(n);
            throw y.createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
        return class076642;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(class07664.field_9852.keySet(), suggestionsBuilder);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

