/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class01929
 *  minecraft.class03519
 *  minecraft.class03529
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class05946
 *  minecraft.class07103
 *  minecraft.class07126
 *  minecraft.class07689
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DynamicOps;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class01929;
import minecraft.class03519;
import minecraft.class03529;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class05946;
import minecraft.class07103;
import minecraft.class07126;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07713;
import minecraft.class07755;

public class class07772
implements ArgumentType<class07126> {
    private static final Collection<String> L = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"particle.notFound", (Object[])new Object[]{object}));
    public static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"particle.invalidOptions", (Object[])new Object[]{object}));
    private final class01929 u;
    private static final class07755<?> i = class07755.N(class07713.N);

    public class07772(class04348 class043482) {
        this.u = class043482;
    }

    public static class07772 N(class04348 class043482) {
        return new class07772(class043482);
    }

    private static <T extends class07126, O> T N(class07755<O> class077552, StringReader stringReader, class07103<T> class071032, class01929 class019292) throws CommandSyntaxException {
        class03519 class035192 = class019292.N(class077552.N());
        Object object = stringReader.canRead() && stringReader.peek() == '{' ? class077552.y(stringReader) : class035192.emptyMap();
        return (T)((class07126)class071032.method_29138().codec().parse((DynamicOps)class035192, object).getOrThrow(arg_0 -> ((DynamicCommandExceptionType)y).create(arg_0)));
    }

    public static class07126 N(CommandContext<class07701> commandContext, String string) {
        return (class07126)commandContext.getArgument(string, class07126.class);
    }

    public class07126 parse(StringReader stringReader) throws CommandSyntaxException {
        return class07772.N(stringReader, this.u);
    }

    private static class07103<?> N(StringReader stringReader, class01905<class07103<?>> class019052) throws CommandSyntaxException {
        class01894 class018942 = class01894.N((StringReader)stringReader);
        class05946 class059462 = class05946.N((class05946)class04227.NM, (class01894)class018942);
        return (class07103)((class03529)class019052.N(class059462).orElseThrow(() -> N.createWithContext((ImmutableStringReader)stringReader, (Object)class018942))).N();
    }

    public static class07126 N(StringReader stringReader, class01929 class019292) throws CommandSyntaxException {
        class07103<?> var2 = class07772.N(stringReader, class019292.y(class04227.NM));
        return class07772.N(i, stringReader, var2, class019292);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.N(this.u.y(class04227.NM).n().map(class05946::N), (SuggestionsBuilder)suggestionsBuilder);
    }

    public Collection<String> getExamples() {
        return L;
    }
}

