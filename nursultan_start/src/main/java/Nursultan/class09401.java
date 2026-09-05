/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10782
 *  Nursultan.class11938
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class06202
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class10782;
import Nursultan.class11938;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class06202;
import minecraft.class07689;

public class class09401
extends class10782 {
    static {
        class09401.N();
    }

    private static void N() {
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(class06202.Nq().NE().Z().stream().map(class034582 -> class034582.N().name()).filter(string -> !class11938.t().L((String)string)), (SuggestionsBuilder)suggestionsBuilder);
    }
}

