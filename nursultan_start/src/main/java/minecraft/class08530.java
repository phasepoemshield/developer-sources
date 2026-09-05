/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import minecraft.class08502;
import minecraft.class08532;

public interface class08530<T> {
    default public <T, O> class08530<T> N(DynamicOps<O> dynamicOps, class08530<O> class085302, Codec<T> codec, DynamicCommandExceptionType dynamicCommandExceptionType) {
        return new class08502(this, class085302, codec, dynamicOps, dynamicCommandExceptionType);
    }

    default public <S> class08530<S> N(Function<T, S> function) {
        return new class08532(this, function);
    }

    public CompletableFuture<Suggestions> N(SuggestionsBuilder var1);

    public T N(StringReader var1) throws CommandSyntaxException;
}

