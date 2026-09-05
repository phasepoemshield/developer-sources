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
 *  minecraft.class00862
 *  minecraft.class01905
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class06646
 *  minecraft.class07701
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
import java.util.function.Predicate;
import minecraft.class00862;
import minecraft.class00880;
import minecraft.class00891;
import minecraft.class00892;
import minecraft.class00895;
import minecraft.class01905;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class06646;
import minecraft.class07701;

public class class00878
implements ArgumentType<class00880> {
    private static final Collection<String> N = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
    private final class01905<class00891> y;

    public class00878(class04348 class043482) {
        this.y = class043482.y(class04227.Z);
    }

    public static class00878 N(class04348 class043482) {
        return new class00878(class043482);
    }

    public static Predicate<class06646> N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return (Predicate)commandContext.getArgument(string, class00880.class);
    }

    public static class00880 N(class01905<class00891> class019052, StringReader stringReader) throws CommandSyntaxException {
        return (class00880)class00892.y(class019052, stringReader, true).map(class009042 -> new class00862(class009042.N(), class009042.y().keySet(), class009042.L()), class008962 -> new class00895(class008962.N(), class008962.y(), class008962.L()));
    }

    public class00880 parse(StringReader stringReader) throws CommandSyntaxException {
        return class00878.N(this.y, stringReader);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class00892.N(this.y, suggestionsBuilder, true, true);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

