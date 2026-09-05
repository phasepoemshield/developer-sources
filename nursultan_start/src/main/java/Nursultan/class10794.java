/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09045
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

import Nursultan.class09045;
import Nursultan.class12020;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class07689;

public class class10794
implements ArgumentType<class09045> {
    public static Object N_0;

    private static void L() {
        N_0 = null;
    }

    static {
        class10794.N();
        class10794.L();
        N_0 = new DynamicCommandExceptionType(object -> class00392.y((String)class12020.N((String)"bind.not-found").formatted(new Object[]{object})));
    }

    public static class09045 N(CommandContext<?> commandContext, String string) {
        return (class09045)commandContext.getArgument(string, class09045.class);
    }

    public class09045 parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readString();
        class09045 class090452 = class09045.N((String)string);
        if (class090452 == null) {
            throw ((DynamicCommandExceptionType)N_0).create((Object)string);
        }
        return class090452;
    }

    private static void N() {
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(Arrays.stream(class09045.values()).map(class090452 -> class090452.N().toUpperCase()), (SuggestionsBuilder)suggestionsBuilder);
    }
}

