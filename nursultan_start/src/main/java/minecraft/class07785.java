/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10790
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
 *  minecraft.class04995
 *  minecraft.class07689
 *  minecraft.class07701
 */
package minecraft;

import Nursultan.class10790;
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
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class04995;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07802;

public class class07785
implements ArgumentType<class07802> {
    private static final Collection<String> N = Arrays.asList("=", ">", "<");
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"arguments.operation.invalid"));
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"arguments.operation.div0"));

    private static class10790 y(String string) throws CommandSyntaxException {
        return switch (string) {
            case "=" -> (n, n2) -> n2;
            case "+=" -> Integer::sum;
            case "-=" -> (n, n2) -> n - n2;
            case "*=" -> (n, n2) -> n * n2;
            case "/=" -> (n, n2) -> {
                if (n2 == 0) {
                    throw L.create();
                }
                return class04995.y((int)n, (int)n2);
            };
            case "%=" -> (n, n2) -> {
                if (n2 == 0) {
                    throw L.create();
                }
                return class04995.L((int)n, (int)n2);
            };
            case "<" -> Math::min;
            case ">" -> Math::max;
            default -> throw y.create();
        };
    }

    public static class07785 N() {
        return new class07785();
    }

    public class07802 parse(StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead()) {
            int n = stringReader.getCursor();
            while (stringReader.canRead() && stringReader.peek() != ' ') {
                stringReader.skip();
            }
            return class07785.N(stringReader.getString().substring(n, stringReader.getCursor()));
        }
        throw y.createWithContext((ImmutableStringReader)stringReader);
    }

    private static class07802 N(String string) throws CommandSyntaxException {
        if (string.equals("><")) {
            return (class017652, class017653) -> {
                int n = class017652.N();
                class017652.N(class017653.N());
                class017653.N(n);
            };
        }
        return class07785.y(string);
    }

    public static class07802 N(CommandContext<class07701> commandContext, String string) {
        return (class07802)commandContext.getArgument(string, class07802.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.N((String[])new String[]{"=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><"}, (SuggestionsBuilder)suggestionsBuilder);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

