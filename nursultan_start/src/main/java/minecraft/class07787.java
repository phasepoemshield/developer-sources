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
 *  minecraft.class01780
 *  minecraft.class02466
 *  minecraft.class02488
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
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class01780;
import minecraft.class02466;
import minecraft.class02488;
import minecraft.class07689;
import minecraft.class07701;

public class class07787
implements ArgumentType<Integer> {
    private static final Collection<String> N = Arrays.asList("container.5", "weapon");
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"slot.unknown", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"slot.only_single_allowed", (Object[])new Object[]{object}));

    public static int N(CommandContext<class07701> commandContext, String string) {
        return (Integer)commandContext.getArgument(string, Integer.class);
    }

    public Integer parse(StringReader stringReader) throws CommandSyntaxException {
        String string = class01780.N((StringReader)stringReader, c -> c != ' ');
        class02466 class024662 = class02488.N((String)string);
        if (class024662 == null) {
            throw y.createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
        if (class024662.y() != 1) {
            throw L.createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
        return class024662.N().getInt(0);
    }

    public static class07787 N() {
        return new class07787();
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y((Stream)class02488.y(), (SuggestionsBuilder)suggestionsBuilder);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

