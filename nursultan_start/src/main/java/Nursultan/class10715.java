/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11481
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

import Nursultan.class11481;
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

public class class10715
implements ArgumentType<class11481> {
    public static Object N_0;

    static {
        class10715.N();
        class10715.u();
        N_0 = new DynamicCommandExceptionType(object -> class00392.y((String)class12020.N((String)"waypoint.not-found").formatted(new Object[]{object})));
    }

    private static void u() {
        N_0 = null;
    }

    private static void N() {
    }

    public static class11481 N(CommandContext<?> commandContext, String string) {
        return (class11481)commandContext.getArgument(string, class11481.class);
    }

    public class11481 parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.getRemaining();
        stringReader.setCursor(stringReader.getTotalLength());
        return class11938.E().N().stream().filter(class114812 -> string.equals(class114812.m())).findFirst().orElseThrow(() -> ((DynamicCommandExceptionType)N_0).create((Object)string));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y((Stream)class11938.E().y(), (SuggestionsBuilder)suggestionsBuilder);
    }
}

