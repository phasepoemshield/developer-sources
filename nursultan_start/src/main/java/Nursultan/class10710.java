/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11025
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

import Nursultan.class11025;
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

public class class10710
implements ArgumentType<class00891> {
    public static Object N_0;

    private static void L() {
        N_0 = null;
    }

    static {
        class10710.N();
        class10710.u();
        class10710.L();
        N_0 = new DynamicCommandExceptionType(object -> class00392.y((String)class12020.N((String)"blockesp.not-found").formatted(new Object[]{object})));
    }

    private static void u() {
    }

    public static class00891 N(CommandContext<?> commandContext, String string) {
        return (class00891)commandContext.getArgument(string, class00891.class);
    }

    public class00891 parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readString();
        return class11938.u().N().m().stream().map(class11025::N).filter(class008912 -> class10710.N(class008912).equals(string)).findFirst().orElseThrow(() -> ((DynamicCommandExceptionType)N_0).create((Object)string));
    }

    private static void N() {
    }

    public static String N(class00891 class008912) {
        return class008912.w().replace("block.minecraft.", "");
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(class11938.u().N().m().stream().map(class110252 -> class10710.N(class110252.N())), (SuggestionsBuilder)suggestionsBuilder);
    }
}

