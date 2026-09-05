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
 *  minecraft.class02566
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
import minecraft.class02566;
import minecraft.class07689;
import minecraft.class07701;

public class class00035
implements ArgumentType<Integer> {
    private static final Collection<String> y = Arrays.asList("F00", "FF0000");
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.hexcolor.invalid", (Object[])new Object[]{object}));

    private class00035() {
    }

    public static class00035 N() {
        return new class00035();
    }

    public static Integer N(CommandContext<class07701> commandContext, String string) {
        return (Integer)commandContext.getArgument(string, Integer.class);
    }

    private static int N(int n) {
        return n * 17;
    }

    public Integer parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readUnquotedString();
        return switch (string.length()) {
            case 3 -> class02566.N((int)class00035.N(Integer.parseInt(string, 0, 1, 16)), (int)class00035.N(Integer.parseInt(string, 1, 2, 16)), (int)class00035.N(Integer.parseInt(string, 2, 3, 16)));
            case 6 -> class02566.N((int)Integer.parseInt(string, 0, 2, 16), (int)Integer.parseInt(string, 2, 4, 16), (int)Integer.parseInt(string, 4, 6, 16));
            default -> throw N.createWithContext((ImmutableStringReader)stringReader, (Object)string);
        };
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(y, (SuggestionsBuilder)suggestionsBuilder);
    }

    public Collection<String> getExamples() {
        return y;
    }
}

