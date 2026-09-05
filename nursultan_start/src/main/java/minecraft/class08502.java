/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.concurrent.CompletableFuture;
import minecraft.class08530;

class class08502<T>
implements class08530<T> {
    final /* synthetic */ class08530 N;
    final /* synthetic */ Codec y;
    final /* synthetic */ DynamicOps L;
    final /* synthetic */ DynamicCommandExceptionType u;
    final /* synthetic */ class08530 i;

    class08502(class08530 class085302, class08530 class085303, Codec codec, DynamicOps dynamicOps, DynamicCommandExceptionType dynamicCommandExceptionType) {
        this.i = class085302;
        this.N = class085303;
        this.y = codec;
        this.L = dynamicOps;
        this.u = dynamicCommandExceptionType;
    }

    @Override
    public CompletableFuture<Suggestions> N(SuggestionsBuilder suggestionsBuilder) {
        return this.i.N(suggestionsBuilder);
    }

    @Override
    public T N(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        Object t = this.N.N(stringReader);
        return (T)this.y.parse(this.L, t).getOrThrow(string -> {
            stringReader.setCursor(n);
            return this.u.createWithContext((ImmutableStringReader)stringReader, string);
        });
    }
}

