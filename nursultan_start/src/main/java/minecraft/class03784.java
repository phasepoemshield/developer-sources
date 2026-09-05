/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class03238
 *  minecraft.class03529
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class04748
 *  minecraft.class05946
 *  minecraft.class07078
 *  minecraft.class07084
 *  minecraft.class07304
 *  minecraft.class07468
 *  minecraft.class07666
 *  minecraft.class07689
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class03238;
import minecraft.class03529;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class04748;
import minecraft.class05946;
import minecraft.class07078;
import minecraft.class07084;
import minecraft.class07304;
import minecraft.class07468;
import minecraft.class07666;
import minecraft.class07689;
import minecraft.class07701;

public class class03784<T>
implements ArgumentType<class03529<T>> {
    private static final Collection<String> u = Arrays.asList("foo", "foo:bar", "012");
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"entity.not_summonable", (Object[])new Object[]{object}));
    public static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.resource.not_found", (Object[])new Object[]{object, object2}));
    public static final Dynamic3CommandExceptionType y = new Dynamic3CommandExceptionType((object, object2, object3) -> class00392.y((String)"argument.resource.invalid_type", (Object[])new Object[]{object, object2, object3}));
    public final class05946<? extends class00751<T>> L;
    private final class01905<T> R;

    public static class03529<class04748> L(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class03784.N(commandContext, string, class04227.yj);
    }

    public static class03529<class07304> M(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class03784.N(commandContext, string, class04227.yR);
    }

    public class03784(class04348 class043482, class05946<? extends class00751<T>> class059462) {
        this.L = class059462;
        this.R = class043482.y(class059462);
    }

    public static class03529<class07078<?>> i(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        class03529 var2 = class03784.N(commandContext, string, class04227.I);
        if (!((class07078)var2.N()).y()) {
            throw i.create((Object)var2.B().N().toString());
        }
        return var2;
    }

    public static class03529<class07078<?>> u(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class03784.N(commandContext, string, class04227.I);
    }

    public static class03529<class03238<?, ?>> y(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class03784.N(commandContext, string, class04227.Nh);
    }

    public static <T> class03529<T> N(CommandContext<class07701> commandContext, String string, class05946<class00751<T>> class059462) throws CommandSyntaxException {
        class03529 class035292 = (class03529)commandContext.getArgument(string, class03529.class);
        class05946 class059463 = class035292.B();
        if (class059463.L(class059462)) {
            return class035292;
        }
        throw y.create((Object)class059463.N(), (Object)class059463.y(), (Object)class059462.N());
    }

    public class03529<T> parse(StringReader stringReader) throws CommandSyntaxException {
        class01894 class018942 = class01894.N((StringReader)stringReader);
        class05946 class059462 = class05946.N(this.L, (class01894)class018942);
        return (class03529)this.R.N(class059462).orElseThrow(() -> N.createWithContext((ImmutableStringReader)stringReader, (Object)class018942, (Object)this.L.N()));
    }

    public static class03529<class07468> N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class03784.N(commandContext, string, class04227.L);
    }

    public static <T> class03784<T> N(class04348 class043482, class05946<? extends class00751<T>> class059462) {
        return new class03784<T>(class043482, class059462);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.N(commandContext, (SuggestionsBuilder)suggestionsBuilder, this.L, (class07666)class07666.field_37263);
    }

    public Collection<String> getExamples() {
        return u;
    }

    public static class03529<class07084> R(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class03784.N(commandContext, string, class04227.Ni);
    }
}

