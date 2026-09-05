/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonPrimitive
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00392
 *  minecraft.class05033
 *  minecraft.class07689
 */
package minecraft;

import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class05033;
import minecraft.class07689;

public class class03940<T extends Enum<T>>
implements ArgumentType<T> {
    private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.enum.invalid", (Object[])new Object[]{object}));
    private final Codec<T> y;
    private final Supplier<T[]> L;

    protected class03940(Codec<T> codec, Supplier<T[]> supplier) {
        this.y = codec;
        this.L = supplier;
    }

    public T parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readUnquotedString();
        return (T)((Enum)this.y.parse((DynamicOps)JsonOps.INSTANCE, (Object)new JsonPrimitive(string)).result().orElseThrow(() -> N.createWithContext((ImmutableStringReader)stringReader, (Object)string)));
    }

    protected String N(String string) {
        return string;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y((Iterable)Arrays.stream((Enum[])this.L.get()).map(object -> ((class05033)object).method_15434()).map(this::N).collect(Collectors.toList()), (SuggestionsBuilder)suggestionsBuilder);
    }

    public Collection<String> getExamples() {
        return Arrays.stream((Enum[])this.L.get()).map(object -> ((class05033)object).method_15434()).map(this::N).limit(2L).collect(Collectors.toList());
    }
}

