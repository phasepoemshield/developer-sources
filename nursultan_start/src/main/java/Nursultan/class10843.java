/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11938
 *  Nursultan.class11951
 *  Nursultan.class11953
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class11938;
import Nursultan.class11951;
import Nursultan.class11953;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class07689;

public class class10843
implements ArgumentType<String> {
    static {
        class10843.N();
    }

    private static void N() {
    }

    public String parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.getRemaining();
        stringReader.setCursor(stringReader.getTotalLength());
        return string;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining();
        int n = string.lastIndexOf("@");
        if (n == -1) {
            return suggestionsBuilder.buildFuture();
        }
        if (string.charAt(string.length() - 1) == '@') {
            class11938.z().N((class11951)new class11953());
        }
        String string3 = string.substring(n + 1);
        if (class11938.z().E().stream().anyMatch(string2 -> string2.startsWith(string3))) {
            return class07689.y((Iterable)class11938.z().E(), (SuggestionsBuilder)suggestionsBuilder.createOffset(suggestionsBuilder.getStart() + n + 1));
        }
        return suggestionsBuilder.buildFuture();
    }
}

