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
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class03238
 *  minecraft.class03529
 *  minecraft.class03711
 *  minecraft.class03729
 *  minecraft.class04227
 *  minecraft.class04748
 *  minecraft.class05281
 *  minecraft.class05946
 *  minecraft.class06482
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
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class03238;
import minecraft.class03529;
import minecraft.class03711;
import minecraft.class03729;
import minecraft.class04227;
import minecraft.class04748;
import minecraft.class05281;
import minecraft.class05946;
import minecraft.class06482;
import minecraft.class07666;
import minecraft.class07689;
import minecraft.class07701;

public class class04403<T>
implements ArgumentType<class05946<T>> {
    private static final Collection<String> y = Arrays.asList("foo", "foo:bar", "012");
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.place.feature.invalid", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.place.structure.invalid", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.place.jigsaw.invalid", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(object -> class00392.y((String)"recipe.notFound", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType M = new DynamicCommandExceptionType(object -> class00392.y((String)"advancement.advancementNotFound", (Object[])new Object[]{object}));
    public final class05946<? extends class00751<T>> N;

    public static class03529<class05281> L(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class04403.y(commandContext, string, class04227.yv, i);
    }

    public class04403(class05946<? extends class00751<T>> class059462) {
        this.N = class059462;
    }

    public static class03711 i(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        class05946 var2 = class04403.N(commandContext, string, class04227.yK, M);
        class03711 class037112 = ((class07701)commandContext.getSource()).W().Nh().N(var2.N());
        if (class037112 == null) {
            throw M.create((Object)var2.N());
        }
        return class037112;
    }

    public static class03729<?> u(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        class06482 class064822 = ((class07701)commandContext.getSource()).W().yM();
        class05946 var3 = class04403.N(commandContext, string, class04227.yV, R);
        return (class03729)class064822.y(var3).orElseThrow(() -> R.create((Object)var3.N()));
    }

    private static <T> class03529<T> y(CommandContext<class07701> commandContext, String string, class05946<class00751<T>> class059462, DynamicCommandExceptionType dynamicCommandExceptionType) throws CommandSyntaxException {
        class05946 class059463 = class04403.N(commandContext, string, class059462, dynamicCommandExceptionType);
        return (class03529)class04403.N(commandContext, class059462).N(class059463).orElseThrow(() -> dynamicCommandExceptionType.create((Object)class059463.N()));
    }

    public static class03529<class04748> y(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class04403.y(commandContext, string, class04227.yj, u);
    }

    public static class03529<class03238<?, ?>> N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class04403.y(commandContext, string, class04227.Nh, L);
    }

    public static <T> class04403<T> N(class05946<? extends class00751<T>> class059462) {
        return new class04403<T>(class059462);
    }

    private static <T> class00751<T> N(CommandContext<class07701> commandContext, class05946<? extends class00751<T>> class059462) {
        return ((class07701)commandContext.getSource()).W().yt().L(class059462);
    }

    public class05946<T> parse(StringReader stringReader) throws CommandSyntaxException {
        class01894 class018942 = class01894.N((StringReader)stringReader);
        return class05946.N(this.N, (class01894)class018942);
    }

    public static <T> class05946<T> N(CommandContext<class07701> commandContext, String string, class05946<class00751<T>> class059462, DynamicCommandExceptionType dynamicCommandExceptionType) throws CommandSyntaxException {
        class05946 class059463 = (class05946)commandContext.getArgument(string, class05946.class);
        return (class05946)class059463.u(class059462).orElseThrow(() -> dynamicCommandExceptionType.create((Object)class059463.N()));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.N(commandContext, (SuggestionsBuilder)suggestionsBuilder, this.N, (class07666)class07666.field_37263);
    }

    public Collection<String> getExamples() {
        return y;
    }
}

