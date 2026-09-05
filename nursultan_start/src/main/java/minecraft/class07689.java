/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.CharMatcher
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class03530
 *  minecraft.class03767
 *  minecraft.class05946
 *  minecraft.class07299
 *  minecraft.class08168
 */
package minecraft;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class03530;
import minecraft.class03767;
import minecraft.class05946;
import minecraft.class07299;
import minecraft.class07665;
import minecraft.class07666;
import minecraft.class08168;

public interface class07689
extends class08168 {
    public static final CharMatcher L = CharMatcher.anyOf((CharSequence)"._/");

    default public Collection<class07665> Q() {
        return Collections.singleton(class07665.y);
    }

    public Collection<String> b();

    public Set<class05946<class07299>> n();

    public class01042 t();

    public Stream<class01894> v();

    public Collection<String> j();

    public static CompletableFuture<Suggestions> y(String string, Collection<class07665> collection, SuggestionsBuilder suggestionsBuilder, Predicate<String> predicate) {
        ArrayList arrayList;
        block3: {
            block2: {
                arrayList = Lists.newArrayList();
                if (!Strings.isNullOrEmpty((String)string)) break block2;
                for (class07665 class076652 : collection) {
                    String string2 = class076652.L + " " + class076652.i;
                    if (!predicate.test(string2)) continue;
                    arrayList.add(class076652.L);
                    arrayList.add(string2);
                }
                break block3;
            }
            String[] stringArray = string.split(" ");
            if (stringArray.length != 1) break block3;
            for (class07665 class076653 : collection) {
                String string3 = stringArray[0] + " " + class076653.i;
                if (!predicate.test(string3)) continue;
                arrayList.add(string3);
            }
        }
        return class07689.y(arrayList, suggestionsBuilder);
    }

    public static <T> CompletableFuture<Suggestions> y(Iterable<T> iterable, SuggestionsBuilder suggestionsBuilder, Function<T, String> function, Function<T, Message> function2) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (T t : iterable) {
            String string2 = function.apply(t);
            if (!class07689.N(string, string2.toLowerCase(Locale.ROOT))) continue;
            suggestionsBuilder.suggest(string2, function2.apply(t));
        }
        return suggestionsBuilder.buildFuture();
    }

    public static CompletableFuture<Suggestions> y(Stream<String> stream, SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        stream.filter(string2 -> class07689.N(string, string2.toLowerCase(Locale.ROOT))).forEach(arg_0 -> ((SuggestionsBuilder)suggestionsBuilder).suggest(arg_0));
        return suggestionsBuilder.buildFuture();
    }

    public static CompletableFuture<Suggestions> y(Iterable<String> iterable, SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (String string2 : iterable) {
            if (!class07689.N(string, string2.toLowerCase(Locale.ROOT))) continue;
            suggestionsBuilder.suggest(string2);
        }
        return suggestionsBuilder.buildFuture();
    }

    public static CompletableFuture<Suggestions> N(String[] stringArray, SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (String string2 : stringArray) {
            if (!class07689.N(string, string2.toLowerCase(Locale.ROOT))) continue;
            suggestionsBuilder.suggest(string2);
        }
        return suggestionsBuilder.buildFuture();
    }

    public static CompletableFuture<Suggestions> N(String string, Collection<class07665> collection, SuggestionsBuilder suggestionsBuilder, Predicate<String> predicate) {
        ArrayList arrayList;
        block4: {
            String[] stringArray;
            block5: {
                block3: {
                    arrayList = Lists.newArrayList();
                    if (!Strings.isNullOrEmpty((String)string)) break block3;
                    for (class07665 class076652 : collection) {
                        String string2 = class076652.L + " " + class076652.u + " " + class076652.i;
                        if (!predicate.test(string2)) continue;
                        arrayList.add(class076652.L);
                        arrayList.add(class076652.L + " " + class076652.u);
                        arrayList.add(string2);
                    }
                    break block4;
                }
                stringArray = string.split(" ");
                if (stringArray.length != 1) break block5;
                for (class07665 class076653 : collection) {
                    String string3 = stringArray[0] + " " + class076653.u + " " + class076653.i;
                    if (!predicate.test(string3)) continue;
                    arrayList.add(stringArray[0] + " " + class076653.u);
                    arrayList.add(string3);
                }
                break block4;
            }
            if (stringArray.length != 2) break block4;
            for (class07665 class076654 : collection) {
                String string4 = stringArray[0] + " " + stringArray[1] + " " + class076654.i;
                if (!predicate.test(string4)) continue;
                arrayList.add(string4);
            }
        }
        return class07689.y(arrayList, suggestionsBuilder);
    }

    public static <T> CompletableFuture<Suggestions> N(Stream<T> stream, SuggestionsBuilder suggestionsBuilder, Function<T, class01894> function, Function<T, Message> function2) {
        return class07689.N(stream::iterator, suggestionsBuilder, function, function2);
    }

    public static CompletableFuture<Suggestions> N(Iterable<class01894> iterable, SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        class07689.N(iterable, string, (T class018942) -> class018942, (T class018942) -> suggestionsBuilder.suggest(class018942.toString()));
        return suggestionsBuilder.buildFuture();
    }

    public static boolean N(String string, String string2) {
        int n = 0;
        while (!string2.startsWith(string, n)) {
            int n2 = L.indexIn((CharSequence)string2, n);
            if (n2 < 0) {
                return false;
            }
            n = n2 + 1;
        }
        return true;
    }

    public static <T> void N(Iterable<T> iterable, String string, String string2, Function<T, class01894> function, Consumer<T> consumer) {
        if (string.isEmpty()) {
            iterable.forEach(consumer);
        } else {
            String string3 = Strings.commonPrefix((CharSequence)string, (CharSequence)string2);
            if (!string3.isEmpty()) {
                String string4 = string.substring(string3.length());
                class07689.N(iterable, string4, function, consumer);
            }
        }
    }

    public static <T> void N(Iterable<T> iterable, String string, Function<T, class01894> function, Consumer<T> consumer) {
        boolean bl = string.indexOf(58) > -1;
        for (T t : iterable) {
            class01894 class018942 = function.apply(t);
            if (bl) {
                String string2 = class018942.toString();
                if (!class07689.N(string, string2)) continue;
                consumer.accept(t);
                continue;
            }
            if (!class07689.N(string, class018942.y()) && !class07689.N(string, class018942.N())) continue;
            consumer.accept(t);
        }
    }

    public CompletableFuture<Suggestions> N(class05946<? extends class00751<?>> var1, class07666 var2, SuggestionsBuilder var3, CommandContext<?> var4);

    public static <S> CompletableFuture<Suggestions> N(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder, class05946<? extends class00751<?>> class059462, class07666 class076662) {
        Object object = commandContext.getSource();
        if (object instanceof class07689) {
            return ((class07689)object).N(class059462, class076662, suggestionsBuilder, commandContext);
        }
        return suggestionsBuilder.buildFuture();
    }

    default public void N(class01905<?> class019052, class07666 class076662, SuggestionsBuilder suggestionsBuilder) {
        if (class076662.N()) {
            class07689.N(class019052.t().map(class03530::y), suggestionsBuilder, "#");
        }
        if (class076662.y()) {
            class07689.N(class019052.n().map(class05946::N), suggestionsBuilder);
        }
    }

    public CompletableFuture<Suggestions> N(CommandContext<?> var1);

    public static CompletableFuture<Suggestions> N(Stream<class01894> stream, SuggestionsBuilder suggestionsBuilder) {
        return class07689.N(stream::iterator, suggestionsBuilder);
    }

    public static <T> CompletableFuture<Suggestions> N(Iterable<T> iterable, SuggestionsBuilder suggestionsBuilder, Function<T, class01894> function, Function<T, Message> function2) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        class07689.N(iterable, string, function, (T object) -> suggestionsBuilder.suggest(((class01894)function.apply(object)).toString(), (Message)function2.apply(object)));
        return suggestionsBuilder.buildFuture();
    }

    public static CompletableFuture<Suggestions> N(Iterable<class01894> iterable, SuggestionsBuilder suggestionsBuilder, String string) {
        String string2 = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        class07689.N(iterable, string2, string, class018942 -> class018942, class018942 -> suggestionsBuilder.suggest(string + String.valueOf(class018942)));
        return suggestionsBuilder.buildFuture();
    }

    public static CompletableFuture<Suggestions> N(Stream<class01894> stream, SuggestionsBuilder suggestionsBuilder, String string) {
        return class07689.N(stream::iterator, suggestionsBuilder, string);
    }

    public class03767 G();

    default public Collection<class07665> Y() {
        return Collections.singleton(class07665.y);
    }

    default public Collection<String> ag_() {
        return Collections.emptyList();
    }

    default public Collection<String> af_() {
        return this.b();
    }
}

