/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.serialization.DataResult
 *  it.unimi.dsi.fastutil.objects.ReferenceArraySet
 *  minecraft.class01894
 *  minecraft.class02477
 *  minecraft.class03519
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class07689
 *  minecraft.class07755
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import minecraft.class01894;
import minecraft.class02477;
import minecraft.class03519;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class06762;
import minecraft.class06777;
import minecraft.class07689;
import minecraft.class07755;

class class06773 {
    private final StringReader y;
    private final class06777 L;
    final /* synthetic */ class06762 N;

    private CompletableFuture<Suggestions> L(SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf('='));
        }
        return suggestionsBuilder.buildFuture();
    }

    private void L() throws CommandSyntaxException {
        this.y.expect('[');
        this.L.N(this::i);
        ReferenceArraySet referenceArraySet = new ReferenceArraySet();
        while (this.y.canRead() && this.y.peek() != ']') {
            this.y.skipWhitespace();
            if (this.y.canRead() && this.y.peek() == '!') {
                this.y.skip();
                this.L.N(this::R);
                var2 = class06773.N(this.y);
                if (!referenceArraySet.add(var2)) {
                    throw class06762.i.create(var2);
                }
                this.L.N(var2);
                this.L.N(class06762.U);
                this.y.skipWhitespace();
            } else {
                var2 = class06773.N(this.y);
                if (!referenceArraySet.add(var2)) {
                    throw class06762.i.create(var2);
                }
                this.L.N(this::L);
                this.y.skipWhitespace();
                this.y.expect('=');
                this.L.N(class06762.U);
                this.y.skipWhitespace();
                this.N(this.N.m, this.N.W, var2);
                this.y.skipWhitespace();
            }
            this.L.N(this::y);
            if (!this.y.canRead() || this.y.peek() != ',') break;
            this.y.skip();
            this.y.skipWhitespace();
            this.L.N(this::i);
            if (this.y.canRead()) continue;
            throw class06762.u.createWithContext((ImmutableStringReader)this.y);
        }
        this.y.expect(']');
        this.L.N(class06762.U);
    }

    class06773(class06762 class067622, StringReader stringReader, class06777 class067772) {
        this.N = class067622;
        this.y = stringReader;
        this.L = class067772;
    }

    private CompletableFuture<Suggestions> i(SuggestionsBuilder suggestionsBuilder) {
        suggestionsBuilder.suggest(String.valueOf('!'));
        return this.N(suggestionsBuilder, String.valueOf('='));
    }

    private CompletableFuture<Suggestions> u(SuggestionsBuilder suggestionsBuilder) {
        return class07689.N(this.N.E.n().map(class05946::N), (SuggestionsBuilder)suggestionsBuilder);
    }

    private void y() throws CommandSyntaxException {
        int n = this.y.getCursor();
        class01894 class018942 = class01894.N((StringReader)this.y);
        this.L.N((class03556<class06581>)((class03556)this.N.E.N(class05946.N((class05946)class04227.F, (class01894)class018942)).orElseThrow(() -> {
            this.y.setCursor(n);
            return class06762.N.createWithContext((ImmutableStringReader)this.y, (Object)class018942);
        })));
    }

    private CompletableFuture<Suggestions> y(SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf(','));
            suggestionsBuilder.suggest(String.valueOf(']'));
        }
        return suggestionsBuilder.buildFuture();
    }

    private CompletableFuture<Suggestions> N(SuggestionsBuilder suggestionsBuilder, String string) {
        String string2 = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        class07689.N((Iterable)class04206.NW.Z(), (String)string2, entry -> ((class05946)entry.getKey()).N(), entry -> {
            if (((class02477)entry.getValue()).y() != null) {
                class01894 class018942 = ((class05946)entry.getKey()).N();
                suggestionsBuilder.suggest(String.valueOf(class018942) + string);
            }
        });
        return suggestionsBuilder.buildFuture();
    }

    public void N() throws CommandSyntaxException {
        this.L.N(this::u);
        this.y();
        this.L.N(this::N);
        if (this.y.canRead() && this.y.peek() == '[') {
            this.L.N(class06762.U);
            this.L();
        }
    }

    private CompletableFuture<Suggestions> N(SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf('['));
        }
        return suggestionsBuilder.buildFuture();
    }

    public static class02477<?> N(StringReader stringReader) throws CommandSyntaxException {
        if (!stringReader.canRead()) {
            throw class06762.u.createWithContext((ImmutableStringReader)stringReader);
        }
        int n = stringReader.getCursor();
        class01894 class018942 = class01894.N((StringReader)stringReader);
        class02477 var3 = (class02477)class04206.NW.N(class018942);
        if (var3 == null || var3.u()) {
            stringReader.setCursor(n);
            throw class06762.y.createWithContext((ImmutableStringReader)stringReader, (Object)class018942);
        }
        return var3;
    }

    private <T, O> void N(class07755<O> class077552, class03519<O> class035192, class02477<T> class024772) throws CommandSyntaxException {
        int n = this.y.getCursor();
        Object object = class077552.y(this.y);
        DataResult dataResult = class024772.L().parse(class035192, object);
        this.L.N(class024772, dataResult.getOrThrow(string -> {
            this.y.setCursor(n);
            return class06762.L.createWithContext((ImmutableStringReader)this.y, (Object)class024772.toString(), string);
        }));
    }

    private CompletableFuture<Suggestions> R(SuggestionsBuilder suggestionsBuilder) {
        return this.N(suggestionsBuilder, "");
    }
}

