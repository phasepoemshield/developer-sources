/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class01929
 *  minecraft.class04348
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import minecraft.class01929;
import minecraft.class04348;
import minecraft.class06762;
import minecraft.class06778;
import minecraft.class06796;

public class class06770
implements ArgumentType<class06778> {
    private static final Collection<String> N = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
    private final class06762 y;

    public class06770(class04348 class043482) {
        this.y = new class06762((class01929)class043482);
    }

    public class06778 parse(StringReader stringReader) throws CommandSyntaxException {
        class06796 class067962 = this.y.N(stringReader);
        return new class06778(class067962.N(), class067962.y());
    }

    public static class06770 N(class04348 class043482) {
        return new class06770(class043482);
    }

    public static <S> class06778 N(CommandContext<S> commandContext, String string) {
        return (class06778)commandContext.getArgument(string, class06778.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return this.y.N(suggestionsBuilder);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

