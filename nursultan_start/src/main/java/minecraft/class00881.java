/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  minecraft.class07665
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 */
package minecraft;

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
import minecraft.class00872;
import minecraft.class00874;
import minecraft.class06889;
import minecraft.class07665;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;

public class class00881
implements ArgumentType<class00874> {
    private static final Collection<String> L = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.pos3d.incomplete"));
    public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.pos.mixed"));
    private final boolean u;

    public class00881(boolean bl) {
        this.u = bl;
    }

    public static class00874 y(CommandContext<class07701> commandContext, String string) {
        return (class00874)commandContext.getArgument(string, class00874.class);
    }

    public class00874 parse(StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '^') {
            return class00872.N(stringReader);
        }
        return class00863.N((StringReader)stringReader, (boolean)this.u);
    }

    public static class00881 N() {
        return new class00881(true);
    }

    public static class00881 N(boolean bl) {
        return new class00881(bl);
    }

    public static class06889 N(CommandContext<class07701> commandContext, String string) {
        return ((class00874)commandContext.getArgument(string, class00874.class)).N((class07701)commandContext.getSource());
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
            return class07689.N((String)string, (Collection)var4, (SuggestionsBuilder)suggestionsBuilder, (Predicate)class07686.N_80(stringReader -> this.parse(stringReader)));
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return L;
    }
}

