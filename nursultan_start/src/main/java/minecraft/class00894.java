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
 *  minecraft.class04782
 *  minecraft.class07209
 *  minecraft.class07299
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
import minecraft.class04782;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07665;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;

public class class00894
implements ArgumentType<class00874> {
    private static final Collection<String> u = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.pos.unloaded"));
    public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.pos.outofworld"));
    public static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.pos.outofbounds"));

    public static class07209 L(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        class07209 class072092 = class00894.y(commandContext, string);
        if (!class07299.method_25953((class07209)class072092)) {
            throw L.create();
        }
        return class072092;
    }

    public static class07209 y(CommandContext<class07701> commandContext, String string) {
        return ((class00874)commandContext.getArgument(string, class00874.class)).L((class07701)commandContext.getSource());
    }

    public static class07209 N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        class04782 class047822 = ((class07701)commandContext.getSource()).R();
        return class00894.N(commandContext, class047822, string);
    }

    public class00874 parse(StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '^') {
            return class00872.N(stringReader);
        }
        return class00863.N((StringReader)stringReader);
    }

    public static class07209 N(CommandContext<class07701> commandContext, class04782 class047822, String string) throws CommandSyntaxException {
        class07209 class072092 = class00894.y(commandContext, string);
        if (!class047822.E(class072092)) {
            throw N.create();
        }
        if (!class047822.method_24794(class072092)) {
            throw y.create();
        }
        return class072092;
    }

    public static class00894 N() {
        return new class00894();
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
            return class07689.N((String)string, (Collection)var4, (SuggestionsBuilder)suggestionsBuilder, (Predicate)class07686.N_80(stringReader -> this.parse(stringReader)));
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return u;
    }
}

