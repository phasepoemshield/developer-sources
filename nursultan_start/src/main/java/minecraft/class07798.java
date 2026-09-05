/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00392
 *  minecraft.class07689
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class07689;

public class class07798
implements ArgumentType<Integer> {
    private static final Collection<String> y = Arrays.asList("0d", "0s", "0t", "0");
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.time.invalid_unit"));
    private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.time.tick_count_too_low", (Object[])new Object[]{object2, object}));
    private static final Object2IntMap<String> i = new Object2IntOpenHashMap();
    final int N;

    private class07798(int n) {
        this.N = n;
    }

    static {
        i.put((Object)"d", 24000);
        i.put((Object)"s", 20);
        i.put((Object)"t", 1);
        i.put((Object)"", 1);
    }

    public static class07798 N(int n) {
        return new class07798(n);
    }

    public static class07798 N() {
        return new class07798(0);
    }

    public Integer parse(StringReader stringReader) throws CommandSyntaxException {
        float f = stringReader.readFloat();
        String string = stringReader.readUnquotedString();
        int n = i.getOrDefault((Object)string, 0);
        if (n == 0) {
            throw L.createWithContext((ImmutableStringReader)stringReader);
        }
        int n2 = Math.round(f * (float)n);
        if (n2 < this.N) {
            throw u.createWithContext((ImmutableStringReader)stringReader, (Object)n2, (Object)this.N);
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
        return class07689.y((Iterable)i.keySet(), (SuggestionsBuilder)suggestionsBuilder.createOffset(suggestionsBuilder.getStart() + stringReader.getCursor()));
    }

    public Collection<String> getExamples() {
        return y;
    }
}

