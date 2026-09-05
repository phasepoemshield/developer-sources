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

public class class10863
implements ArgumentType<String> {
    public String parse(StringReader stringReader) throws CommandSyntaxException {
        return stringReader.readString();
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            class11938.z().N((class11951)new class11953());
        }
        return class07689.y(class11938.z().E().stream(), (SuggestionsBuilder)suggestionsBuilder);
    }
}

