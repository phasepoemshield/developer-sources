/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class07689
 *  minecraft.class07701
 */
package minecraft;

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
import minecraft.class00502;
import minecraft.class07689;
import minecraft.class07701;

public class class07761
implements ArgumentType<String> {
    private static final Collection<String> N = Arrays.asList("foo", "123");
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"team.notFound", (Object[])new Object[]{object}));

    public static class00502 N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        String string2 = (String)commandContext.getArgument(string, String.class);
        class00502 class005022 = ((class07701)commandContext.getSource()).W().yB().y(string2);
        if (class005022 == null) {
            throw y.create((Object)string2);
        }
        return class005022;
    }

    public static class07761 N() {
        return new class07761();
    }

    public String parse(StringReader stringReader) throws CommandSyntaxException {
        return stringReader.readUnquotedString();
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        if (commandContext.getSource() instanceof class07689) {
            return class07689.y((Iterable)((class07689)commandContext.getSource()).j(), (SuggestionsBuilder)suggestionsBuilder);
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return N;
    }
}

