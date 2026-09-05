/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class05946
 *  minecraft.class07666
 *  minecraft.class07689
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class04400;
import minecraft.class04427;
import minecraft.class04428;
import minecraft.class05946;
import minecraft.class07666;
import minecraft.class07689;
import minecraft.class07701;

public class class04434<T>
implements ArgumentType<class04428<T>> {
    private static final Collection<String> y = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
    public final class05946<? extends class00751<T>> N;

    public class04434(class05946<? extends class00751<T>> class059462) {
        this.N = class059462;
    }

    public static <T> class04428<T> N(CommandContext<class07701> commandContext, String string, class05946<class00751<T>> class059462, DynamicCommandExceptionType dynamicCommandExceptionType) throws CommandSyntaxException {
        class04428 class044282 = (class04428)commandContext.getArgument(string, class04428.class);
        return class044282.N(class059462).orElseThrow(() -> dynamicCommandExceptionType.create((Object)class044282));
    }

    public static <T> class04434<T> N(class05946<? extends class00751<T>> class059462) {
        return new class04434<T>(class059462);
    }

    public class04428<T> parse(StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '#') {
            int n = stringReader.getCursor();
            try {
                stringReader.skip();
                class01894 class018942 = class01894.N((StringReader)stringReader);
                return new class04427(class03530.N(this.N, (class01894)class018942));
            }
            catch (CommandSyntaxException commandSyntaxException) {
                stringReader.setCursor(n);
                throw commandSyntaxException;
            }
        }
        class01894 class018943 = class01894.N((StringReader)stringReader);
        return new class04400(class05946.N(this.N, (class01894)class018943));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.N(commandContext, (SuggestionsBuilder)suggestionsBuilder, this.N, (class07666)class07666.field_37264);
    }

    public Collection<String> getExamples() {
        return y;
    }
}

