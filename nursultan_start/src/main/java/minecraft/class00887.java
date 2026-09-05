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
 *  minecraft.class06889
 *  minecraft.class07109
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
import minecraft.class06889;
import minecraft.class07109;
import minecraft.class07665;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;

public class class00887
implements ArgumentType<class00874> {
    private static final Collection<String> y = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.pos2d.incomplete"));
    private final boolean L;

    public class00887(boolean bl) {
        this.L = bl;
    }

    public class00874 parse(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        if (!stringReader.canRead()) {
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        class00883 class008832 = class00883.N(stringReader, this.L);
        if (!stringReader.canRead() || stringReader.peek() != ' ') {
            stringReader.setCursor(n);
            throw N.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        class00883 class008833 = class00883.N(stringReader, this.L);
        return new class00863(class008832, new class00883(true, 0.0), class008833);
    }

    public static class00887 N() {
        return new class00887(true);
    }

    public static class00887 N(boolean bl) {
        return new class00887(bl);
    }

    public static class07109 N(CommandContext<class07701> commandContext, String string) {
        class06889 class068892 = ((class00874)commandContext.getArgument(string, class00874.class)).N((class07701)commandContext.getSource());
        return new class07109((float)class068892.M, (float)class068892.Z);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        if (commandContext.getSource() instanceof class07689) {
            Collection var4;
            String string = suggestionsBuilder.getRemaining();
            if (!string.isEmpty() && string.charAt(0) == '^') {
                Set<class07665> set = Collections.singleton(class07665.N);
            } else {
                var4 = ((class07689)commandContext.getSource()).Q();
            }
            return class07689.y((String)string, (Collection)var4, (SuggestionsBuilder)suggestionsBuilder, (Predicate)class07686.N_80(stringReader -> this.parse(stringReader)));
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return y;
    }
}

