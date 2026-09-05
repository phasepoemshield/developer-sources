/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import minecraft.class08530;

class class08532<S>
implements class08530<S> {
    final /* synthetic */ Function N;
    final /* synthetic */ class08530 y;

    class08532(class08530 class085302, Function function) {
        this.y = class085302;
        this.N = function;
    }

    @Override
    public S N(StringReader stringReader) throws CommandSyntaxException {
        return (S)this.N.apply(this.y.N(stringReader));
    }

    @Override
    public CompletableFuture<Suggestions> N(SuggestionsBuilder suggestionsBuilder) {
        return this.y.N(suggestionsBuilder);
    }
}

