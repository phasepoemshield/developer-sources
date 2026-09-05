/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02325
 *  minecraft.class02333
 *  minecraft.class02344
 *  minecraft.class02346
 *  minecraft.class02350
 *  minecraft.class02357
 *  minecraft.class07689
 *  minecraft.class08501
 *  minecraft.class08524
 *  minecraft.class08530
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class02162;
import minecraft.class02170;
import minecraft.class02325;
import minecraft.class02333;
import minecraft.class02344;
import minecraft.class02346;
import minecraft.class02350;
import minecraft.class02357;
import minecraft.class07689;
import minecraft.class08501;
import minecraft.class08524;
import minecraft.class08530;

public final class class02169<T>
extends Record
implements class08530<T> {
    private final class02344<StringReader> rules;
    private final class08501<StringReader, T> top;

    public class02169(class02344<StringReader> class023442, class08501<StringReader, T> class085012) {
        class023442.N();
        this.rules = class023442;
        this.top = class085012;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02169.class, "rules;top", "rules", "top"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02169.class, "rules;top", "rules", "top"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02169.class, "rules;top", "rules", "top"}, this);
    }

    public class08501<StringReader, T> y() {
        return this.top;
    }

    public class02344<StringReader> N() {
        return this.rules;
    }

    public Optional<T> N(class02325<StringReader> class023252) {
        return class023252.y(this.top);
    }

    public T N(StringReader stringReader) throws CommandSyntaxException {
        Exception exception2;
        class02357 class023572 = new class02357();
        class02162 class021622 = new class02162((class02346<StringReader>)class023572, stringReader);
        Optional<T> optional = this.N((class02325<StringReader>)class021622);
        if (optional.isPresent()) {
            return optional.get();
        }
        List list = class023572.N();
        List list2 = list.stream().mapMulti((class023332, consumer) -> {
            Object object = class023332.L();
            if (object instanceof class08524) {
                class08524 class085242 = (class08524)object;
                consumer.accept(class085242.create(stringReader.getString(), class023332.N()));
            } else {
                object = class023332.L();
                if (object instanceof Exception) {
                    Exception exception = (Exception)object;
                    consumer.accept(exception);
                }
            }
        }).toList();
        for (Exception exception2 : list2) {
            if (!(exception2 instanceof CommandSyntaxException)) continue;
            throw (CommandSyntaxException)exception2;
        }
        if (list2.size() == 1 && (exception2 = list2.get(0)) instanceof RuntimeException) {
            RuntimeException runtimeException = (RuntimeException)exception2;
            throw runtimeException;
        }
        throw new IllegalStateException("Failed to parse: " + list.stream().map(class02333::toString).collect(Collectors.joining(", ")));
    }

    public CompletableFuture<Suggestions> N(SuggestionsBuilder suggestionsBuilder) {
        StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
        stringReader.setCursor(suggestionsBuilder.getStart());
        class02357 class023572 = new class02357();
        class02162 class021622 = new class02162((class02346<StringReader>)class023572, stringReader);
        this.N((class02325<StringReader>)class021622);
        List list = class023572.N();
        if (list.isEmpty()) {
            return suggestionsBuilder.buildFuture();
        }
        SuggestionsBuilder suggestionsBuilder2 = suggestionsBuilder.createOffset(class023572.y());
        for (class02333 class023332 : list) {
            class02350 class023502 = class023332.y();
            if (class023502 instanceof class02170) {
                class07689.N(((class02170)class023502).y(), (SuggestionsBuilder)suggestionsBuilder2);
                continue;
            }
            class07689.y((Stream)class023332.y().possibleValues((class02325)class021622), (SuggestionsBuilder)suggestionsBuilder2);
        }
        return suggestionsBuilder2.buildFuture();
    }
}

