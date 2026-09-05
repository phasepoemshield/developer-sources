/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09648
 *  Nursultan.class09649
 *  Nursultan.class09650
 *  Nursultan.class09655
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02169
 *  minecraft.class02172
 *  minecraft.class02178
 *  minecraft.class02315
 *  minecraft.class02344
 *  minecraft.class02353
 *  minecraft.class03556
 *  minecraft.class04348
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class05957
 *  minecraft.class07666
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class08122
 *  minecraft.class08501
 *  minecraft.class08876
 *  minecraft.class09037
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09648;
import Nursultan.class09649;
import Nursultan.class09650;
import Nursultan.class09655;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02169;
import minecraft.class02172;
import minecraft.class02178;
import minecraft.class02188;
import minecraft.class02196;
import minecraft.class02315;
import minecraft.class02344;
import minecraft.class02353;
import minecraft.class03556;
import minecraft.class04348;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class05957;
import minecraft.class07666;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class08122;
import minecraft.class08501;
import minecraft.class08876;
import minecraft.class09037;
import org.jspecify.annotations.Nullable;

public class class02198<T>
implements ArgumentType<class03556<T>> {
    private static final Collection<String> u = List.of("foo", "foo:bar", "012", "{}", "true");
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.resource_or_id.failed_to_parse", (Object[])new Object[]{object}));
    public static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.resource_or_id.no_such_element", (Object[])new Object[]{object, object2}));
    public static final DynamicOps<class07709> L = class07713.N;
    private final class01929 i;
    private final Optional<? extends class01921<T>> R;
    private final Codec<T> M;
    private final class02169<class02172<T, class07709>> B;
    private final class05946<? extends class00751<T>> Z;

    public static class09648 L(class04348 class043482) {
        return new class09648(class043482);
    }

    public static class03556<class05957> L(CommandContext<class07701> commandContext, String string) {
        return class02198.i(commandContext, string);
    }

    protected class02198(class04348 class043482, class05946<? extends class00751<T>> class059462, Codec<T> codec) {
        this.i = class043482;
        this.R = class043482.method_46759(class059462);
        this.Z = class059462;
        this.M = codec;
        this.B = class02198.N(class059462, L);
    }

    private static <T> class03556<T> i(CommandContext<class07701> commandContext, String string) {
        return (class03556)commandContext.getArgument(string, class03556.class);
    }

    public /* synthetic */ @Nullable Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.N(stringReader);
    }

    public static class03556<class09037> u(CommandContext<class07701> commandContext, String string) {
        return class02198.i(commandContext, string);
    }

    public static class09650 u(class04348 class043482) {
        return new class09650(class043482);
    }

    public static class09655 y(class04348 class043482) {
        return new class09655(class043482);
    }

    public static class03556<class08122> y(CommandContext<class07701> commandContext, String string) {
        return class02198.i(commandContext, string);
    }

    private <O> @Nullable class03556<T> N(StringReader stringReader, class02169<class02172<T, O>> class021692, DynamicOps<O> dynamicOps) throws CommandSyntaxException {
        class02172 class021722 = (class02172)class021692.N(stringReader);
        if (this.R.isEmpty()) {
            return null;
        }
        return class021722.N((ImmutableStringReader)stringReader, this.i, dynamicOps, this.M, this.R.get());
    }

    public static class09649 N(class04348 class043482) {
        return new class09649(class043482);
    }

    public @Nullable class03556<T> N(StringReader stringReader) throws CommandSyntaxException {
        return this.N(stringReader, this.B, L);
    }

    public static class03556<class05074> N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class02198.i(commandContext, string);
    }

    public static <T, O> class02169<class02172<T, O>> N(class05946<? extends class00751<T>> class059462, DynamicOps<O> dynamicOps) {
        class02169 class021692 = class08876.N(dynamicOps);
        class02344 class023442 = new class02344();
        class02353 class023532 = class02353.N((String)"result");
        class02353 class023533 = class02353.N((String)"id");
        class02353 class023534 = class02353.N((String)"value");
        class023442.N(class023533, class02196.N);
        class023442.N(class023534, class021692.y().y());
        class08501 class085012 = class023442.N(class023532, class02315.y((class02315[])new class02315[]{class023442.L(class023533), class023442.L(class023534)}), class023322 -> {
            class01894 class018942 = (class01894)class023322.N(class023533);
            if (class018942 != null) {
                return new class02178(class05946.N((class05946)class059462, (class01894)class018942));
            }
            Object object = class023322.y(class023534);
            return new class02188(object);
        });
        return new class02169(class023442, class085012);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.N(commandContext, (SuggestionsBuilder)suggestionsBuilder, this.Z, (class07666)class07666.field_37263);
    }

    public Collection<String> getExamples() {
        return u;
    }
}

