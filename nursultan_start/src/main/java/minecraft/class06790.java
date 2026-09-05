/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Doubles
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class00734
 *  minecraft.class00816
 *  minecraft.class00836
 *  minecraft.class00838
 *  minecraft.class01894
 *  minecraft.class04770
 *  minecraft.class04995
 *  minecraft.class06620
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class08162
 *  minecraft.class08168
 *  net.fabricmc.fabric.api.command.v2.FabricEntitySelectorReader
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.primitives.Doubles;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00734;
import minecraft.class00816;
import minecraft.class00836;
import minecraft.class00838;
import minecraft.class01894;
import minecraft.class04770;
import minecraft.class04995;
import minecraft.class06620;
import minecraft.class06767;
import minecraft.class06794;
import minecraft.class06798;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class08162;
import minecraft.class08168;
import net.fabricmc.fabric.api.command.v2.FabricEntitySelectorReader;
import org.jspecify.annotations.Nullable;

public class class06790
implements FabricEntitySelectorReader {
    public static final char N = '@';
    private static final char P = '[';
    private static final char s = ']';
    public static final char y = '=';
    private static final char T = ',';
    public static final char L = '!';
    public static final char u = '#';
    private static final char b = 'p';
    private static final char j = 'a';
    private static final char v = 'r';
    private static final char n = 's';
    private static final char t = 'e';
    private static final char G = 'n';
    public static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.entity.invalid"));
    public static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.entity.selector.unknown", (Object[])new Object[]{object}));
    public static final SimpleCommandExceptionType M = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.entity.selector.not_allowed"));
    public static final SimpleCommandExceptionType B = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.entity.selector.missing"));
    public static final SimpleCommandExceptionType Z = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.entity.options.unterminated"));
    public static final DynamicCommandExceptionType z = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.entity.options.valueless", (Object[])new Object[]{object}));
    public static final BiConsumer<class06889, List<? extends class07049>> U = (class068892, list) -> list.sort((class070492, class070493) -> Doubles.compare((double)class070492.method_5707(class068892), (double)class070493.method_5707(class068892)));
    public static final BiConsumer<class06889, List<? extends class07049>> E = (class068892, list) -> list.sort((class070492, class070493) -> Doubles.compare((double)class070493.method_5707(class068892), (double)class070492.method_5707(class068892)));
    public static final BiConsumer<class06889, List<? extends class07049>> W = (class068892, list) -> Collections.shuffle(list);
    public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> m = (suggestionsBuilder, consumer) -> suggestionsBuilder.buildFuture();
    private final StringReader l;
    private final boolean d;
    private int w;
    private boolean k;
    private boolean Y;
    private @Nullable class00816 Q;
    private @Nullable class00836 O;
    private @Nullable Double g;
    private @Nullable Double I;
    private @Nullable Double J;
    private @Nullable Double o;
    private @Nullable Double q;
    private @Nullable Double K;
    private @Nullable class00838 V;
    private @Nullable class00838 e;
    private final List<Predicate<class07049>> H;
    private BiConsumer<class06889, List<? extends class07049>> c;
    private boolean X;
    private @Nullable String a;
    private int p;
    private @Nullable UUID F;
    private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> A;
    private boolean f;
    private boolean C;
    private boolean S;
    private boolean x;
    private boolean D;
    private boolean h;
    private boolean r;
    private boolean NN;
    private @Nullable class07078<?> Ny;
    private boolean NL;
    private boolean Nu;
    private boolean Ni;
    private boolean NR;
    private final Set NM = new HashSet();

    public boolean w() {
        return this.D;
    }

    public void L(double d) {
        this.J = d;
    }

    public void L(boolean bl) {
        this.C = bl;
    }

    protected void L() throws CommandSyntaxException {
        if (this.l.canRead()) {
            this.A = this::L;
        }
        int n = this.l.getCursor();
        String string = this.l.readString();
        try {
            this.F = UUID.fromString(string);
            this.k = true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            if (string.isEmpty() || string.length() > 16) {
                this.l.setCursor(n);
                throw i.createWithContext((ImmutableStringReader)this.l);
            }
            this.k = false;
            this.a = string;
        }
        this.w = 1;
    }

    private CompletableFuture<Suggestions> L(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        SuggestionsBuilder suggestionsBuilder2 = suggestionsBuilder.createOffset(this.p);
        consumer.accept(suggestionsBuilder2);
        return suggestionsBuilder.add(suggestionsBuilder2).buildFuture();
    }

    public void M(boolean bl) {
        this.h = bl;
    }

    public StringReader M() {
        return this.l;
    }

    private CompletableFuture<Suggestions> M(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        class06767.N(this, suggestionsBuilder);
        return suggestionsBuilder.buildFuture();
    }

    public @Nullable Double P() {
        return this.J;
    }

    public @Nullable Double T() {
        return this.q;
    }

    public boolean Q() {
        return this.NN;
    }

    public class06790(StringReader stringReader, boolean bl) {
        this.H = new ArrayList<Predicate<class07049>>();
        this.c = class06794.y;
        this.A = m;
        this.l = stringReader;
        this.d = bl;
    }

    public void B() {
        this.Y = true;
    }

    public void B(boolean bl) {
        this.r = bl;
    }

    private CompletableFuture<Suggestions> B(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        suggestionsBuilder.suggest(String.valueOf(','));
        suggestionsBuilder.suggest(String.valueOf(']'));
        return suggestionsBuilder.buildFuture();
    }

    public boolean I() {
        return this.NL;
    }

    public boolean J() {
        return this.Nu;
    }

    public @Nullable class00816 Z() {
        return this.Q;
    }

    public void Z(boolean bl) {
        this.NN = bl;
    }

    private CompletableFuture<Suggestions> Z(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        suggestionsBuilder.suggest(String.valueOf('='));
        return suggestionsBuilder.buildFuture();
    }

    public void i(double d) {
        this.q = d;
    }

    public void i(boolean bl) {
        this.x = bl;
    }

    private CompletableFuture<Suggestions> i(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        suggestionsBuilder.suggest(String.valueOf('['));
        return suggestionsBuilder.buildFuture();
    }

    public boolean i() {
        this.l.skipWhitespace();
        if (this.l.canRead() && this.l.peek() == '!') {
            this.l.skip();
            this.l.skipWhitespace();
            return true;
        }
        return false;
    }

    public @Nullable Double b() {
        return this.K;
    }

    public @Nullable Double s() {
        return this.o;
    }

    public boolean n() {
        return this.X;
    }

    public boolean l() {
        return this.S;
    }

    public boolean d() {
        return this.x;
    }

    public @Nullable Double m() {
        return this.I;
    }

    public boolean o() {
        return this.Ni;
    }

    public boolean k() {
        return this.h;
    }

    public boolean t() {
        return this.f;
    }

    public boolean g() {
        return this.Ny != null;
    }

    public class06794 v() throws CommandSyntaxException {
        this.p = this.l.getCursor();
        this.A = this::y;
        if (this.l.canRead() && this.l.peek() == '@') {
            if (!this.d) {
                throw M.createWithContext((ImmutableStringReader)this.l);
            }
            this.l.skip();
            this.y();
        } else {
            this.L();
        }
        this.q();
        return this.N();
    }

    public BiConsumer<class06889, List<? extends class07049>> j() {
        return this.c;
    }

    private void q() {
        if (this.V != null) {
            this.H.add(this.N(this.V, (class06620<class07049>)((class06620)class07049::method_36455)));
        }
        if (this.e != null) {
            this.H.add(this.N(this.e, (class06620<class07049>)((class06620)class07049::method_36454)));
        }
        if (this.O != null) {
            this.H.add(class070492 -> {
                if (!(class070492 instanceof class04770)) return false;
                class04770 class047702 = (class04770)class070492;
                if (!this.O.u(class047702.fields_37fa3311b0e9d3e9b883d09222919bf5a_0.intValue())) return false;
                return true;
            });
        }
    }

    public @Nullable class00838 U() {
        return this.V;
    }

    public void U(boolean bl) {
        this.Ni = bl;
    }

    public void z(boolean bl) {
        this.Nu = bl;
    }

    public @Nullable class00836 z() {
        return this.O;
    }

    public void u(boolean bl) {
        this.S = bl;
    }

    public void u(double d) {
        this.o = d;
    }

    protected void u() throws CommandSyntaxException {
        this.A = this::M;
        this.l.skipWhitespace();
        while (this.l.canRead() && this.l.peek() != ']') {
            this.l.skipWhitespace();
            int n = this.l.getCursor();
            String string = this.l.readString();
            class06798 class067982 = class06767.N(this, string, n);
            this.l.skipWhitespace();
            if (!this.l.canRead() || this.l.peek() != '=') {
                this.l.setCursor(n);
                throw z.createWithContext((ImmutableStringReader)this.l, (Object)string);
            }
            this.l.skip();
            this.l.skipWhitespace();
            this.A = m;
            class067982.handle(this);
            this.l.skipWhitespace();
            this.A = this::B;
            if (!this.l.canRead()) continue;
            if (this.l.peek() == ',') {
                this.l.skip();
                this.A = this::M;
                continue;
            }
            if (this.l.peek() == ']') break;
            throw Z.createWithContext((ImmutableStringReader)this.l);
        }
        if (!this.l.canRead()) {
            throw Z.createWithContext((ImmutableStringReader)this.l);
        }
        this.l.skip();
        this.A = m;
    }

    private CompletableFuture<Suggestions> u(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        SuggestionsBuilder suggestionsBuilder2 = suggestionsBuilder.createOffset(suggestionsBuilder.getStart() - 1);
        class06790.N(suggestionsBuilder2);
        suggestionsBuilder.add(suggestionsBuilder2);
        return suggestionsBuilder.buildFuture();
    }

    public void y(boolean bl) {
        this.f = bl;
    }

    public void y(double d) {
        this.I = d;
    }

    public void y(class00838 class008382) {
        this.e = class008382;
    }

    private CompletableFuture<Suggestions> y(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        consumer.accept(suggestionsBuilder);
        if (this.d) {
            class06790.N(suggestionsBuilder);
        }
        return suggestionsBuilder.buildFuture();
    }

    protected void y() throws CommandSyntaxException {
        this.NR = true;
        this.A = this::u;
        if (!this.l.canRead()) {
            throw B.createWithContext((ImmutableStringReader)this.l);
        }
        int n = this.l.getCursor();
        char c = this.l.read();
        if (switch (c) {
            case 'p' -> {
                this.w = 1;
                this.k = false;
                this.c = U;
                this.N(class07078.Ly);
                yield false;
            }
            case 'a' -> {
                this.w = Integer.MAX_VALUE;
                this.k = false;
                this.c = class06794.y;
                this.N(class07078.Ly);
                yield false;
            }
            case 'r' -> {
                this.w = 1;
                this.k = false;
                this.c = W;
                this.N(class07078.Ly);
                yield false;
            }
            case 's' -> {
                this.w = 1;
                this.k = true;
                this.X = true;
                yield false;
            }
            case 'e' -> {
                this.w = Integer.MAX_VALUE;
                this.k = true;
                this.c = class06794.y;
                yield true;
            }
            case 'n' -> {
                this.w = 1;
                this.k = true;
                this.c = U;
                yield true;
            }
            default -> {
                this.l.setCursor(n);
                throw R.createWithContext((ImmutableStringReader)this.l, (Object)("@" + String.valueOf(c)));
            }
        }) {
            this.H.add(class07049::method_5805);
        }
        this.A = this::i;
        if (this.l.canRead() && this.l.peek() == '[') {
            this.l.skip();
            this.A = this::R;
            this.u();
        }
    }

    public @Nullable class00838 E() {
        return this.e;
    }

    private class00734 N(double d, double d2, double d3) {
        boolean bl = d < 0.0;
        boolean bl2 = d2 < 0.0;
        boolean bl3 = d3 < 0.0;
        double d4 = bl ? d : 0.0;
        double d5 = bl2 ? d2 : 0.0;
        double d6 = bl3 ? d3 : 0.0;
        double d7 = (bl ? 0.0 : d) + 1.0;
        double d8 = (bl2 ? 0.0 : d2) + 1.0;
        double d9 = (bl3 ? 0.0 : d3) + 1.0;
        return new class00734(d4, d5, d6, d7, d8, d9);
    }

    private Predicate<class07049> N(class00838 class008382, class06620<class07049> class066202) {
        float f = class04995.R((float)class008382.y().orElse(Float.valueOf(0.0f)).floatValue());
        float f2 = class04995.R((float)class008382.L().orElse(Float.valueOf(359.0f)).floatValue());
        return class070492 -> {
            float f3 = class04995.R((float)class066202.applyAsFloat(class070492));
            if (f > f2) {
                return f3 >= f || f3 <= f2;
            }
            return f3 >= f && f3 <= f2;
        };
    }

    private static void N(SuggestionsBuilder suggestionsBuilder) {
        suggestionsBuilder.suggest("@p", (Message)class00392.L((String)"argument.entity.selector.nearestPlayer"));
        suggestionsBuilder.suggest("@a", (Message)class00392.L((String)"argument.entity.selector.allPlayers"));
        suggestionsBuilder.suggest("@r", (Message)class00392.L((String)"argument.entity.selector.randomPlayer"));
        suggestionsBuilder.suggest("@s", (Message)class00392.L((String)"argument.entity.selector.self"));
        suggestionsBuilder.suggest("@e", (Message)class00392.L((String)"argument.entity.selector.allEntities"));
        suggestionsBuilder.suggest("@n", (Message)class00392.L((String)"argument.entity.selector.nearestEntity"));
    }

    public static <S> boolean N(S s) {
        return s instanceof class08168 && ((class08168)s).N().hasPermission(class08162.i);
    }

    @Deprecated
    public static boolean N(class08168 class081682) {
        return class081682.N().hasPermission(class08162.i);
    }

    public class06794 N() {
        class00734 class007342;
        if (this.o != null || this.q != null || this.K != null) {
            class007342 = this.N(this.o == null ? 0.0 : this.o, this.q == null ? 0.0 : this.q, this.K == null ? 0.0 : this.K);
        } else if (this.Q != null && this.Q.L().isPresent()) {
            double d = (Double)this.Q.L().get();
            class007342 = new class00734(-d, -d, -d, d + 1.0, d + 1.0, d + 1.0);
        } else {
            class007342 = null;
        }
        Function<class06889, class06889> function = this.g == null && this.I == null && this.J == null ? class068892 -> class068892 : class068892 -> new class06889(this.g == null ? class068892.M : this.g, this.I == null ? class068892.B : this.I, this.J == null ? class068892.Z : this.J);
        return new class06794(this.w, this.k, this.Y, List.copyOf(this.H), this.Q, function, class007342, this.c, this.X, this.a, this.F, this.Ny, this.NR);
    }

    public void N(double d) {
        this.g = d;
    }

    public CompletableFuture<Suggestions> N(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        return this.A.apply(suggestionsBuilder.createOffset(this.l.getCursor()), consumer);
    }

    public void N_63(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> biFunction) {
        this.A = biFunction;
    }

    public void N(int n) {
        this.w = n;
    }

    public void N(boolean bl) {
        this.k = bl;
    }

    public void N(BiConsumer<class06889, List<? extends class07049>> biConsumer) {
        this.c = biConsumer;
    }

    public void N(class07078<?> class070782) {
        this.Ny = class070782;
    }

    public void N(Predicate<class07049> predicate) {
        this.H.add(predicate);
    }

    public void N(class00816 class008162) {
        this.Q = class008162;
    }

    public void N(class00836 class008362) {
        this.O = class008362;
    }

    public void N(class00838 class008382) {
        this.V = class008382;
    }

    public boolean getCustomFlag(class01894 class018942) {
        return this.NM.contains(class018942);
    }

    public void setCustomFlag(class01894 class018942, boolean bl) {
        if (bl) {
            this.NM.add(class018942);
        } else {
            this.NM.remove(class018942);
        }
    }

    public @Nullable Double W() {
        return this.g;
    }

    private CompletableFuture<Suggestions> R(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        suggestionsBuilder.suggest(String.valueOf(']'));
        class06767.N(this, suggestionsBuilder);
        return suggestionsBuilder.buildFuture();
    }

    public boolean R() {
        this.l.skipWhitespace();
        if (this.l.canRead() && this.l.peek() == '#') {
            this.l.skip();
            this.l.skipWhitespace();
            return true;
        }
        return false;
    }

    public void R(boolean bl) {
        this.D = bl;
    }

    public void R(double d) {
        this.K = d;
    }

    public void O() {
        this.NL = true;
    }

    public boolean G() {
        return this.C;
    }

    public boolean Y() {
        return this.r;
    }
}

