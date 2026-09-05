/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12002
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

import Nursultan.class12002;
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

public class class09382
implements ArgumentType<class12002> {
    public static Object N_0;

    static {
        class09382.N();
        class09382.u();
        N_0 = new DynamicCommandExceptionType(object -> class00392.y((String)class12020.N((String)"key.not-found").formatted(new Object[]{object})));
    }

    private static void u() {
        N_0 = null;
    }

    private static void N() {
    }

    public static class12002 N(CommandContext<?> commandContext, String string) {
        return (class12002)commandContext.getArgument(string, class12002.class);
    }

    public class12002 parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readString();
        return Arrays.stream(class12002.values()).filter(class120022 -> string.equalsIgnoreCase(class120022.u().replace(" ", "_"))).findFirst().orElseThrow(() -> ((DynamicCommandExceptionType)N_0).create((Object)string));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(Arrays.stream(class12002.values()).map(class120022 -> class120022.u().replace(" ", "_")), (SuggestionsBuilder)suggestionsBuilder);
    }
}

