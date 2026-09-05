/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00392
 *  minecraft.class07689
 */
package Nursultan;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class07689;

public class class10674
implements ArgumentType<Integer> {
    private static String[] R;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    static {
        class10674.N();
        class10674.R();
        class10674.i();
        N_0 = new SimpleCommandExceptionType((Message)class00392.L((String)R[1]));
        N_1 = new DynamicCommandExceptionType(object -> class00392.N((String)R[0], (Object[])new Object[]{object}));
        N_2 = new Object2IntOpenHashMap();
        ((Object2IntMap)N_2).put((Object)R[2], 86400);
        ((Object2IntMap)N_2).put((Object)R[3], 3600);
        ((Object2IntMap)N_2).put((Object)R[4], 60);
    }

    private static void i() {
    }

    private static void N() {
    }

    public Integer parse(StringReader stringReader) throws CommandSyntaxException {
        float f = stringReader.readFloat();
        String string = stringReader.readUnquotedString();
        int n = ((Object2IntMap)N_2).getOrDefault((Object)string, 0);
        if (n == 0) {
            throw ((SimpleCommandExceptionType)N_0).create();
        }
        int n2 = Math.round(f * (float)n);
        if (n2 < 0) {
            throw ((DynamicCommandExceptionType)N_1).create((Object)n2);
        }
        return n2;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        StringReader stringReader = new StringReader(suggestionsBuilder.getRemaining());
        try {
            stringReader.readFloat();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return suggestionsBuilder.buildFuture();
        }
        return class07689.y((Iterable)((Object2IntMap)N_2).keySet(), (SuggestionsBuilder)suggestionsBuilder.createOffset(suggestionsBuilder.getStart() + stringReader.getCursor()));
    }

    private static void R() {
        R = new String[5];
        class10674.R[0] = "argument.time.invalid_tick_count";
        class10674.R[1] = "argument.time.invalid_unit";
        class10674.R[2] = "d";
        class10674.R[3] = "h";
        class10674.R[4] = "m";
    }
}

