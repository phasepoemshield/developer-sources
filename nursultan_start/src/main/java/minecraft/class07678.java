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
 *  minecraft.class01894
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class07299;
import minecraft.class07689;
import minecraft.class07701;

public class class07678
implements ArgumentType<class01894> {
    private static final Collection<String> N = Stream.of(class07299.field_25179, class07299.field_25180).map(class059462 -> class059462.N().toString()).collect(Collectors.toList());
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.dimension.invalid", (Object[])new Object[]{object}));

    public static class04782 N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        class01894 class018942 = (class01894)commandContext.getArgument(string, class01894.class);
        class05946 class059462 = class05946.N((class05946)class04227.yg, (class01894)class018942);
        class04782 class047822 = ((class07701)commandContext.getSource()).W().N(class059462);
        if (class047822 == null) {
            throw y.create((Object)class018942);
        }
        return class047822;
    }

    public class01894 parse(StringReader stringReader) throws CommandSyntaxException {
        return class01894.N((StringReader)stringReader);
    }

    public static class07678 N() {
        return new class07678();
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        if (commandContext.getSource() instanceof class07689) {
            return class07689.N(((class07689)commandContext.getSource()).n().stream().map(class05946::N), suggestionsBuilder);
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return N;
    }
}

