/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  minecraft.class00891
 *  minecraft.class07689
 */
package Nursultan;

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
import minecraft.class00392;
import minecraft.class00891;
import minecraft.class07689;

public class class09404
implements ArgumentType<class00891> {
    public static Object N_0;

    static {
        class09404.N();
        N_0 = new DynamicCommandExceptionType(object -> class00392.y((String)class12020.N((String)"nuker.not-found").formatted(new Object[]{object})));
    }

    public static class00891 N(CommandContext<?> commandContext, String string) {
        return (class00891)commandContext.getArgument(string, class00891.class);
    }

    private static void N() {
        N_0 = null;
    }

    public class00891 parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readString();
        return class11938.u().b().m().stream().filter(class008912 -> class008912.w().replace("block.minecraft.", "").equals(string)).findFirst().orElseThrow(() -> ((DynamicCommandExceptionType)N_0).create((Object)string));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(class11938.u().b().m().stream().map(class008912 -> class008912.w().replace("block.minecraft.", "")), (SuggestionsBuilder)suggestionsBuilder);
    }
}

