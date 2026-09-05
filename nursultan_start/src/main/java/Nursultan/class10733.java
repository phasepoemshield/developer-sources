/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11938
 *  Nursultan.class12020
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11938;
import Nursultan.class12020;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class07689;

public class class10733
implements ArgumentType<class11067> {
    public static Object N_0;

    static {
        class10733.N();
        class10733.y();
        N_0 = new DynamicCommandExceptionType(object -> class00392.y((String)class12020.N((String)"module.not-found").formatted(new Object[]{((class11067)object).N()})));
    }

    private static void y() {
        N_0 = null;
    }

    private static void N() {
    }

    public static class11067 N(CommandContext<?> commandContext, String string) {
        return (class11067)commandContext.getArgument(string, class11067.class);
    }

    public class11067 parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readString();
        return (class11067)class11938.u().N(string).orElseThrow(() -> ((DynamicCommandExceptionType)N_0).create((Object)string));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y((Stream)class11938.u().t(), (SuggestionsBuilder)suggestionsBuilder);
    }
}

