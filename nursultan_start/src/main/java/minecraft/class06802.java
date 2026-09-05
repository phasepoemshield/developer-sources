/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import minecraft.class06762;
import minecraft.class06777;

class class06802
implements class06777 {
    private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> N = class06762.U;

    class06802() {
    }

    @Override
    public void N(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> function) {
        this.N = function;
    }

    public CompletableFuture<Suggestions> N(SuggestionsBuilder suggestionsBuilder, StringReader stringReader) {
        return this.N.apply(suggestionsBuilder.createOffset(stringReader.getCursor()));
    }
}

