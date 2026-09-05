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
 *  minecraft.class07282
 *  minecraft.class07689
 *  minecraft.class07701
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
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class07282;
import minecraft.class07689;
import minecraft.class07701;

public class class04131
implements ArgumentType<class07282> {
    private static final Collection<String> N = Stream.of(class07282.field_9215, class07282.field_9220).map(class07282::y).collect(Collectors.toList());
    private static final class07282[] y = class07282.values();
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.gamemode.invalid", (Object[])new Object[]{object}));

    public static class04131 N() {
        return new class04131();
    }

    public static class07282 N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return (class07282)commandContext.getArgument(string, class07282.class);
    }

    public class07282 parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readUnquotedString();
        class07282 class072822 = class07282.N((String)string, null);
        if (class072822 == null) {
            throw L.createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
        return class072822;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        if (commandContext.getSource() instanceof class07689) {
            return class07689.y(Arrays.stream(y).map(class07282::y), (SuggestionsBuilder)suggestionsBuilder);
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return N;
    }
}

