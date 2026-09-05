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
 *  minecraft.class06541
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
import minecraft.class06541;
import minecraft.class07689;
import minecraft.class07701;

public class class07696
implements ArgumentType<class06541> {
    private static final Collection<String> y = Arrays.asList("red", "green");
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.color.invalid", (Object[])new Object[]{object}));

    private class07696() {
    }

    public static class06541 N(CommandContext<class07701> commandContext, String string) {
        return (class06541)commandContext.getArgument(string, class06541.class);
    }

    public static class07696 N() {
        return new class07696();
    }

    public class06541 parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readUnquotedString();
        class06541 class065412 = class06541.y((String)string);
        if (class065412 == null || class065412.L()) {
            throw N.createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
        return class065412;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(class06541.N((boolean)true, (boolean)false), suggestionsBuilder);
    }

    public Collection<String> getExamples() {
        return y;
    }
}

