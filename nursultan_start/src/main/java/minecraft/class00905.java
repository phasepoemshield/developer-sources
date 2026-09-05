/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class00863
 *  minecraft.class07209
 *  minecraft.class07665
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00863;
import minecraft.class00874;
import minecraft.class00883;
import minecraft.class00893;
import minecraft.class07209;
import minecraft.class07665;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;

public class class00905
implements ArgumentType<class00874> {
    private static final Collection<String> y = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.pos2d.incomplete"));

    public static class00893 N(CommandContext<class07701> commandContext, String string) {
        class07209 class072092 = ((class00874)commandContext.getArgument(string, class00874.class)).L((class07701)commandContext.getSource());
        return new class00893(class072092.method_10263(), class072092.method_10260());
    }

    public static class00905 N() {
        return new class00905();
    }

    public class00874 parse(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        if (!stringReader.canRead()) {
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        class00883 class008832 = class00883.N(stringReader);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(n);
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        class00883 class008833 = class00883.N(stringReader);
        return new class00863(class008832, new class00883(true, 0.0), class008833);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        if (commandContext.getSource() instanceof class07689) {
            Collection var4;
            String string = suggestionsBuilder.getRemaining();
            if (!string.isEmpty() && string.charAt(0) == '^') {
                Set<class07665> set = Collections.singleton(class07665.N);
            } else {
                var4 = ((class07689)commandContext.getSource()).Y();
            }
            return class07689.y((String)string, (Collection)var4, (SuggestionsBuilder)suggestionsBuilder, (Predicate)class07686.N_80(stringReader -> this.parse(stringReader)));
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return y;
    }
}

