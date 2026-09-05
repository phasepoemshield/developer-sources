/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class07689
 */
package Nursultan;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class07689;

public class class09406
implements ArgumentType<String> {
    private static String[] i;
    public static Object N_0;

    private static void L() {
    }

    static {
        class09406.i();
        class09406.L();
        N_0 = new String[]{i[0], i[1], i[2], i[3]};
    }

    private static void i() {
        i = new String[4];
        class09406.i[0] = "\u0441\u043f\u0430\u043c/\u0444\u043b\u0443\u0434";
        class09406.i[1] = "\u0443\u043f\u043e\u043c\u0438\u043d\u0430\u043d\u0438\u0435 \u0440\u043e\u0434\u043d\u044b\u0445";
        class09406.i[2] = "\u0443\u043f\u043e\u043c\u0438\u043d\u0430\u043d\u0438\u0435 \u0441\u0442\u043e\u0440\u043e\u043d\u043d\u0438\u0445 \u043a\u043b\u0438\u0435\u043d\u0442\u043e\u0432";
        class09406.i[3] = "\u043e\u0441\u043a\u043e\u0440\u0431\u043b\u0435\u043d\u0438\u0435 \u043a\u043b\u0438\u0435\u043d\u0442\u0430";
    }

    public String parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.getRemaining();
        stringReader.setCursor(stringReader.getTotalLength());
        return string;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.N((String[])((String[])N_0), (SuggestionsBuilder)suggestionsBuilder);
    }
}

