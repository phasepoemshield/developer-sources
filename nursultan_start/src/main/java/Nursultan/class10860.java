/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12020
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class06541
 *  minecraft.class07689
 */
package Nursultan;

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
import java.util.regex.Pattern;
import minecraft.class00392;
import minecraft.class06541;
import minecraft.class07689;

public class class10860
implements ArgumentType<Integer> {
    public static Object N_0;
    public static Object N_1;

    private static void L() {
        N_0 = null;
        N_1 = null;
    }

    static {
        class10860.N();
        class10860.L();
        N_0 = Pattern.compile("[0-9a-fA-F]{6}");
        N_1 = new DynamicCommandExceptionType(object -> class00392.y((String)class12020.N((String)"blockesp.color-invalid").formatted(new Object[]{object})));
    }

    public Integer parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readString();
        if (((Pattern)N_0).matcher(string).matches()) {
            return 0xFF000000 | Integer.parseInt(string, 16);
        }
        class06541 class065412 = class06541.y((String)string);
        if (class065412 != null && class065412.u()) {
            return 0xFF000000 | class065412.i();
        }
        throw ((DynamicCommandExceptionType)N_1).create((Object)string);
    }

    private static void N() {
    }

    public static int N(CommandContext<?> commandContext, String string) {
        return (Integer)commandContext.getArgument(string, Integer.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(Arrays.stream(class06541.values()).filter(class06541::u).map(class06541::R), (SuggestionsBuilder)suggestionsBuilder);
    }
}

