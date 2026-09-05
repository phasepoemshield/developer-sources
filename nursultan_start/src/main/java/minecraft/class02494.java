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
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class01780;
import minecraft.class02466;
import minecraft.class02488;
import minecraft.class07689;
import minecraft.class07701;

public class class02494
implements ArgumentType<class02466> {
    private static final Collection<String> N = List.of("container.*", "container.5", "weapon");
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"slot.unknown", (Object[])new Object[]{object}));

    public static class02466 N(CommandContext<class07701> commandContext, String string) {
        return (class02466)commandContext.getArgument(string, class02466.class);
    }

    public class02466 parse(StringReader stringReader) throws CommandSyntaxException {
        String string = class01780.N((StringReader)stringReader, c -> c != ' ');
        class02466 class024662 = class02488.N(string);
        if (class024662 == null) {
            throw y.createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
        return class024662;
    }

    public static class02494 N() {
        return new class02494();
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(class02488.N(), (SuggestionsBuilder)suggestionsBuilder);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

