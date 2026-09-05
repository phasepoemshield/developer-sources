/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07001
 *  minecraft.class07689
 *  minecraft.class07755
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00891;
import minecraft.class00896;
import minecraft.class00904;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class07001;
import minecraft.class07689;
import minecraft.class07755;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class00892 {
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.block.tag.disallowed"));
    public static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.block.id.invalid", (Object[])new Object[]{object}));
    public static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.block.property.unknown", (Object[])new Object[]{object, object2}));
    public static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.block.property.duplicate", (Object[])new Object[]{object2, object}));
    public static final Dynamic3CommandExceptionType i = new Dynamic3CommandExceptionType((object, object2, object3) -> class00392.y((String)"argument.block.property.invalid", (Object[])new Object[]{object, object3, object2}));
    public static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.block.property.novalue", (Object[])new Object[]{object2, object}));
    public static final SimpleCommandExceptionType M = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.block.property.unclosed"));
    public static final DynamicCommandExceptionType B = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.block.tag.unknown", (Object[])new Object[]{object}));
    private static final char Z = '[';
    private static final char z = '{';
    private static final char U = ']';
    private static final char E = '=';
    private static final char W = ',';
    private static final char m = '#';
    private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> P = SuggestionsBuilder::buildFuture;
    private final class01905<class00891> s;
    private final StringReader T;
    private final boolean b;
    private final boolean j;
    private final Map<class08092<?>, Comparable<?>> v = Maps.newHashMap();
    private final Map<String, String> n = Maps.newHashMap();
    private class01894 t = class01894.y((String)"");
    private @Nullable class00507<class00891, class00500> G;
    private @Nullable class00500 l;
    private @Nullable class07001 d;
    private @Nullable class03543<class00891> w;
    private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> k = P;

    private CompletableFuture<Suggestions> L(SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (class08092 var4 : this.l.y()) {
            if (this.v.containsKey(var4) || !var4.R().startsWith(string)) continue;
            suggestionsBuilder.suggest(var4.R() + "=");
        }
        return suggestionsBuilder.buildFuture();
    }

    private void L() throws CommandSyntaxException {
        int n = this.T.getCursor();
        this.t = class01894.N((StringReader)this.T);
        class00891 class008912 = (class00891)((Object)((class03529)this.s.N(class05946.N((class05946)class04227.Z, (class01894)this.t)).orElseThrow(() -> {
            this.T.setCursor(n);
            return y.createWithContext((ImmutableStringReader)this.T, (Object)this.t.toString());
        })).N());
        this.G = class008912.E();
        this.l = class008912.W();
    }

    private void M() throws CommandSyntaxException {
        this.d = class07755.L((StringReader)this.T);
    }

    private CompletableFuture<Suggestions> M(SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf(']'));
        }
        if (suggestionsBuilder.getRemaining().isEmpty() && this.v.size() < this.l.y().size()) {
            suggestionsBuilder.suggest(String.valueOf(','));
        }
        return suggestionsBuilder.buildFuture();
    }

    private class00892(class01905<class00891> class019052, StringReader stringReader, boolean bl, boolean bl2) {
        this.s = class019052;
        this.T = stringReader;
        this.b = bl;
        this.j = bl2;
    }

    private CompletableFuture<Suggestions> B(SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty() && this.w != null) {
            class00891 class008912;
            boolean bl = false;
            boolean bl2 = false;
            Iterator var4 = this.w.iterator();
            while (!(!var4.hasNext() || (bl |= !(class008912 = (class00891)((Object)((class03556)var4.next()).N())).E().u().isEmpty()) && (bl2 |= class008912.W().k()))) {
            }
            if (bl) {
                suggestionsBuilder.suggest(String.valueOf('['));
            }
            if (bl2) {
                suggestionsBuilder.suggest(String.valueOf('{'));
            }
        }
        return suggestionsBuilder.buildFuture();
    }

    private CompletableFuture<Suggestions> Z(SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            if (!this.G.u().isEmpty()) {
                suggestionsBuilder.suggest(String.valueOf('['));
            }
            if (this.l.k()) {
                suggestionsBuilder.suggest(String.valueOf('{'));
            }
        }
        return suggestionsBuilder.buildFuture();
    }

    private CompletableFuture<Suggestions> i(SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty() && this.y()) {
            suggestionsBuilder.suggest(String.valueOf('{'));
        }
        return suggestionsBuilder.buildFuture();
    }

    private void i() throws CommandSyntaxException {
        this.T.skip();
        this.k = this::N;
        this.T.skipWhitespace();
        while (this.T.canRead() && this.T.peek() != ']') {
            this.T.skipWhitespace();
            int n = this.T.getCursor();
            String string = this.T.readString();
            class08092 var3 = this.G.N(string);
            if (var3 == null) {
                this.T.setCursor(n);
                throw L.createWithContext((ImmutableStringReader)this.T, (Object)this.t.toString(), (Object)string);
            }
            if (this.v.containsKey(var3)) {
                this.T.setCursor(n);
                throw u.createWithContext((ImmutableStringReader)this.T, (Object)this.t.toString(), (Object)string);
            }
            this.T.skipWhitespace();
            this.k = this::R;
            if (!this.T.canRead() || this.T.peek() != '=') {
                throw R.createWithContext((ImmutableStringReader)this.T, (Object)this.t.toString(), (Object)string);
            }
            this.T.skip();
            this.T.skipWhitespace();
            this.k = suggestionsBuilder -> class00892.N(suggestionsBuilder, var3).buildFuture();
            int n2 = this.T.getCursor();
            this.N(var3, this.T.readString(), n2);
            this.k = this::M;
            this.T.skipWhitespace();
            if (!this.T.canRead()) continue;
            if (this.T.peek() == ',') {
                this.T.skip();
                this.k = this::L;
                continue;
            }
            if (this.T.peek() == ']') break;
            throw M.createWithContext((ImmutableStringReader)this.T);
        }
        if (!this.T.canRead()) {
            throw M.createWithContext((ImmutableStringReader)this.T);
        }
        this.T.skip();
    }

    private CompletableFuture<Suggestions> U(SuggestionsBuilder suggestionsBuilder) {
        return class07689.N(this.s.n().map(class05946::N), (SuggestionsBuilder)suggestionsBuilder);
    }

    private CompletableFuture<Suggestions> z(SuggestionsBuilder suggestionsBuilder) {
        return class07689.N(this.s.t().map(class03530::y), (SuggestionsBuilder)suggestionsBuilder, (String)String.valueOf('#'));
    }

    private void u() throws CommandSyntaxException {
        if (!this.b) {
            throw N.createWithContext((ImmutableStringReader)this.T);
        }
        int n = this.T.getCursor();
        this.T.expect('#');
        this.k = this::z;
        class01894 class018942 = class01894.N((StringReader)this.T);
        this.w = (class03543)this.s.N(class03530.N((class05946)class04227.Z, (class01894)class018942)).orElseThrow(() -> {
            this.T.setCursor(n);
            return B.createWithContext((ImmutableStringReader)this.T, (Object)class018942.toString());
        });
    }

    private CompletableFuture<Suggestions> u(SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        if (this.w != null) {
            Iterator var3 = this.w.iterator();
            while (var3.hasNext()) {
                for (class08092 var6 : ((class00891)((Object)((class03556)var3.next()).N())).E().u()) {
                    if (this.n.containsKey(var6.R()) || !var6.R().startsWith(string)) continue;
                    suggestionsBuilder.suggest(var6.R() + "=");
                }
            }
        }
        return suggestionsBuilder.buildFuture();
    }

    public static Either<class00904, class00896> y(class01905<class00891> class019052, String string, boolean bl) throws CommandSyntaxException {
        return class00892.y(class019052, new StringReader(string), bl);
    }

    private CompletableFuture<Suggestions> y(SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf(']'));
        }
        return this.u(suggestionsBuilder);
    }

    private boolean y() {
        if (this.l != null) {
            return this.l.k();
        }
        if (this.w != null) {
            Iterator var1 = this.w.iterator();
            while (var1.hasNext()) {
                if (!((class00891)((Object)((class03556)var1.next()).N())).W().k()) continue;
                return true;
            }
        }
        return false;
    }

    public static Either<class00904, class00896> y(class01905<class00891> class019052, StringReader stringReader, boolean bl) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        try {
            class00892 class008922 = new class00892(class019052, stringReader, true, bl);
            class008922.N();
            if (class008922.w != null) {
                return Either.right((Object)((Object)new class00896(class008922.w, class008922.n, class008922.d)));
            }
            return Either.left((Object)((Object)new class00904(class008922.l, class008922.v, class008922.d)));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            stringReader.setCursor(n);
            throw commandSyntaxException;
        }
    }

    private CompletableFuture<Suggestions> E(SuggestionsBuilder suggestionsBuilder) {
        this.z(suggestionsBuilder);
        this.U(suggestionsBuilder);
        return suggestionsBuilder.buildFuture();
    }

    private CompletableFuture<Suggestions> N(SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf(']'));
        }
        return this.L(suggestionsBuilder);
    }

    private void N() throws CommandSyntaxException {
        this.k = this.b ? this::E : this::U;
        if (this.T.canRead() && this.T.peek() == '#') {
            this.u();
            this.k = this::B;
            if (this.T.canRead() && this.T.peek() == '[') {
                this.R();
                this.k = this::i;
            }
        } else {
            this.L();
            this.k = this::Z;
            if (this.T.canRead() && this.T.peek() == '[') {
                this.i();
                this.k = this::i;
            }
        }
        if (this.j && this.T.canRead() && this.T.peek() == '{') {
            this.k = P;
            this.M();
        }
    }

    public static class00904 N(class01905<class00891> class019052, String string, boolean bl) throws CommandSyntaxException {
        return class00892.N(class019052, new StringReader(string), bl);
    }

    public static class00904 N(class01905<class00891> class019052, StringReader stringReader, boolean bl) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        try {
            class00892 class008922 = new class00892(class019052, stringReader, false, bl);
            class008922.N();
            return new class00904(class008922.l, class008922.v, class008922.d);
        }
        catch (CommandSyntaxException commandSyntaxException) {
            stringReader.setCursor(n);
            throw commandSyntaxException;
        }
    }

    private CompletableFuture<Suggestions> N(SuggestionsBuilder suggestionsBuilder, String string) {
        boolean bl = false;
        if (this.w != null) {
            Iterator var4 = this.w.iterator();
            block0: while (var4.hasNext()) {
                class00891 class008912 = (class00891)((Object)((class03556)var4.next()).N());
                class08092 var7 = class008912.E().N(string);
                if (var7 != null) {
                    class00892.N(suggestionsBuilder, var7);
                }
                if (bl) continue;
                for (class08092 var9 : class008912.E().u()) {
                    if (this.n.containsKey(var9.R())) continue;
                    bl = true;
                    continue block0;
                }
            }
        }
        if (bl) {
            suggestionsBuilder.suggest(String.valueOf(','));
        }
        suggestionsBuilder.suggest(String.valueOf(']'));
        return suggestionsBuilder.buildFuture();
    }

    public static CompletableFuture<Suggestions> N(class01905<class00891> class019052, SuggestionsBuilder suggestionsBuilder, boolean bl, boolean bl2) {
        StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
        stringReader.setCursor(suggestionsBuilder.getStart());
        class00892 class008922 = new class00892(class019052, stringReader, bl, bl2);
        try {
            class008922.N();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return class008922.k.apply(suggestionsBuilder.createOffset(stringReader.getCursor()));
    }

    private static <T extends Comparable<T>> SuggestionsBuilder N(SuggestionsBuilder suggestionsBuilder, class08092<T> class080922) {
        for (Comparable comparable : class080922.N()) {
            if (comparable instanceof Integer) {
                Integer n = (Integer)comparable;
                suggestionsBuilder.suggest(n.intValue());
                continue;
            }
            suggestionsBuilder.suggest(class080922.y(comparable));
        }
        return suggestionsBuilder;
    }

    private static <T extends Comparable<T>> void N(StringBuilder stringBuilder, class08092<T> class080922, Comparable<?> comparable) {
        stringBuilder.append(class080922.R());
        stringBuilder.append('=');
        stringBuilder.append(class080922.y(comparable));
    }

    private <T extends Comparable<T>> void N(class08092<T> class080922, String string, int n) throws CommandSyntaxException {
        Optional optional = class080922.y(string);
        if (!optional.isPresent()) {
            this.T.setCursor(n);
            throw i.createWithContext((ImmutableStringReader)this.T, (Object)this.t.toString(), (Object)class080922.R(), (Object)string);
        }
        this.l = (class00500)this.l.y(class080922, (Comparable)optional.get());
        this.v.put(class080922, (Comparable)optional.get());
    }

    public static String N(class00500 class005002) {
        StringBuilder stringBuilder = new StringBuilder(class005002.R().i().map(class059462 -> class059462.N().toString()).orElse("air"));
        if (!class005002.y().isEmpty()) {
            stringBuilder.append('[');
            boolean bl = false;
            for (Map.Entry entry : class005002.L().entrySet()) {
                if (bl) {
                    stringBuilder.append(',');
                }
                class00892.N(stringBuilder, (class08092)entry.getKey(), (Comparable)entry.getValue());
                bl = true;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    private void R() throws CommandSyntaxException {
        this.T.skip();
        this.k = this::y;
        int n = -1;
        this.T.skipWhitespace();
        while (this.T.canRead() && this.T.peek() != ']') {
            this.T.skipWhitespace();
            int n2 = this.T.getCursor();
            String string = this.T.readString();
            if (this.n.containsKey(string)) {
                this.T.setCursor(n2);
                throw u.createWithContext((ImmutableStringReader)this.T, (Object)this.t.toString(), (Object)string);
            }
            this.T.skipWhitespace();
            if (!this.T.canRead() || this.T.peek() != '=') {
                this.T.setCursor(n2);
                throw R.createWithContext((ImmutableStringReader)this.T, (Object)this.t.toString(), (Object)string);
            }
            this.T.skip();
            this.T.skipWhitespace();
            this.k = suggestionsBuilder -> this.N((SuggestionsBuilder)suggestionsBuilder, string);
            n = this.T.getCursor();
            String string2 = this.T.readString();
            this.n.put(string, string2);
            this.T.skipWhitespace();
            if (!this.T.canRead()) continue;
            n = -1;
            if (this.T.peek() == ',') {
                this.T.skip();
                this.k = this::u;
                continue;
            }
            if (this.T.peek() == ']') break;
            throw M.createWithContext((ImmutableStringReader)this.T);
        }
        if (!this.T.canRead()) {
            if (n >= 0) {
                this.T.setCursor(n);
            }
            throw M.createWithContext((ImmutableStringReader)this.T);
        }
        this.T.skip();
    }

    private CompletableFuture<Suggestions> R(SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf('='));
        }
        return suggestionsBuilder.buildFuture();
    }
}

