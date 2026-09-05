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
 *  minecraft.class01890
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
import minecraft.class00392;
import minecraft.class01890;
import minecraft.class07689;
import minecraft.class07701;

public class class07758
implements ArgumentType<class01890> {
    private static final Collection<String> y = Arrays.asList("sidebar", "foo.bar");
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.scoreboardDisplaySlot.invalid", (Object[])new Object[]{object}));

    private class07758() {
    }

    public static class01890 N(CommandContext<class07701> commandContext, String string) {
        return (class01890)commandContext.getArgument(string, class01890.class);
    }

    public static class07758 N() {
        return new class07758();
    }

    public class01890 parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readUnquotedString();
        class01890 class018902 = (class01890)class01890.field_45175.N(string);
        if (class018902 == null) {
            throw N.createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
        return class018902;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(Arrays.stream(class01890.values()).map(class01890::method_15434), (SuggestionsBuilder)suggestionsBuilder);
    }

    public Collection<String> getExamples() {
        return y;
    }
}

