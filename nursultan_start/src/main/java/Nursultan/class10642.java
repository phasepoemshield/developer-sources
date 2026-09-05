/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10733
 *  Nursultan.class11067
 *  Nursultan.class11938
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class10733;
import Nursultan.class11067;
import Nursultan.class11938;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class07689;

public class class10642
extends class10733 {
    static {
        class10642.N();
    }

    private static void N() {
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(class11938.u().a().filter(class110672 -> !class110672.R().B()).map(class11067::N), (SuggestionsBuilder)suggestionsBuilder);
    }
}

