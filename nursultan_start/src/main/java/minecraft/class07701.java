/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandExceptionType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00649
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01704
 *  minecraft.class01711
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class02796
 *  minecraft.class03059
 *  minecraft.class03068
 *  minecraft.class03102
 *  minecraft.class03711
 *  minecraft.class03767
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04445
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class05946
 *  minecraft.class06541
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07109
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07376
 *  minecraft.class08152
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00649;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01704;
import minecraft.class01711;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class02796;
import minecraft.class03059;
import minecraft.class03068;
import minecraft.class03102;
import minecraft.class03711;
import minecraft.class03767;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04445;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class05946;
import minecraft.class06541;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07109;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07376;
import minecraft.class07664;
import minecraft.class07666;
import minecraft.class07689;
import minecraft.class07703;
import minecraft.class08152;
import org.jspecify.annotations.Nullable;

public class class07701
implements class01711<class07701>,
class07689 {
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"permissions.requires.player"));
    public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"permissions.requires.entity"));
    private final class07703 u;
    private final class06889 i;
    private final class04782 R;
    private final class08152 M;
    private final String B;
    private final class00392 Z;
    private final class02796 z;
    private final boolean U;
    private final @Nullable class07049 E;
    private final class03102 W;
    private final class07664 m;
    private final class07109 P;
    private final class04445 s;
    private final class03068 T;

    private void L(class00392 class003922) {
        class05216 class052162 = class00392.N((String)"chat.type.admin", (Object[])new Object[]{this.L(), class003922}).N(new class06541[]{class06541.field_1080, class06541.field_1056});
        class07305 class073052 = this.R.method_64395();
        if (((Boolean)class073052.N(class07305.F)).booleanValue()) {
            for (class04770 class047702 : this.z.Nm().v()) {
                if (class047702.method_64401() == this.u || !this.z.Nm().R(class047702.method_72498())) continue;
                class047702.method_64398((class00392)class052162);
            }
        }
        if (this.u != this.z && ((Boolean)class073052.N(class07305.G)).booleanValue()) {
            this.z.N((class00392)class052162);
        }
    }

    public class00392 L() {
        return this.Z;
    }

    public @Nullable class07049 M() {
        return this.E;
    }

    public class04445 P() {
        return this.s;
    }

    public class03102 T() {
        return this.W;
    }

    public class07701(class07703 class077032, class06889 class068892, class07109 class071092, class04782 class047822, class08152 class081522, String string, class00392 class003922, class02796 class027962, @Nullable class07049 class070492) {
        this(class077032, class068892, class071092, class047822, class081522, string, class003922, class027962, class070492, false, class03102.N, class07664.field_9853, class04445.N, class03068.N((Executor)class027962));
    }

    private class07701(class07703 class077032, class06889 class068892, class07109 class071092, class04782 class047822, class08152 class081522, String string, class00392 class003922, class02796 class027962, @Nullable class07049 class070492, boolean bl, class03102 class031022, class07664 class076642, class04445 class044452, class03068 class030682) {
        this.u = class077032;
        this.i = class068892;
        this.R = class047822;
        this.U = bl;
        this.E = class070492;
        this.M = class081522;
        this.B = string;
        this.Z = class003922;
        this.z = class027962;
        this.W = class031022;
        this.m = class076642;
        this.P = class071092;
        this.s = class044452;
        this.T = class030682;
    }

    public class07049 B() throws CommandSyntaxException {
        if (this.E == null) {
            throw y.create();
        }
        return this.E;
    }

    public class04770 Z() throws CommandSyntaxException {
        class07049 class070492 = this.E;
        if (class070492 instanceof class04770) {
            return (class04770)class070492;
        }
        throw N.create();
    }

    public class06889 i() {
        return this.i;
    }

    @Override
    public Collection<String> b() {
        return Lists.newArrayList((Object[])this.z.z_());
    }

    public class03068 s() {
        return this.T;
    }

    @Override
    public Set<class05946<class07299>> n() {
        return this.z.NQ();
    }

    public CommandDispatcher<class07701> l() {
        return this.W().Nr().N();
    }

    public boolean d() {
        return this.U;
    }

    public class07664 m() {
        return this.m;
    }

    @Override
    public class01042 t() {
        return this.z.yt();
    }

    @Override
    public Stream<class01894> v() {
        return class04206.y.j().map(class04891::N);
    }

    @Override
    public Collection<String> j() {
        return this.z.yB().u();
    }

    public boolean U() {
        return this.E instanceof class04770;
    }

    public @Nullable class04770 z() {
        class07049 class070492 = this.E;
        return class070492 instanceof class04770 ? (class04770)class070492 : null;
    }

    public String u() {
        return this.B;
    }

    public void y(class00392 class003922) {
        if (this.u.B_() && !this.U) {
            this.u.N((class00392)class00392.i().y(class003922).N(class06541.field_1061));
        }
    }

    public class07701 y(class08152 class081522) {
        return this.N(this.M.N(class081522));
    }

    public class07701 y(class06889 class068892) {
        class06889 class068893 = this.m.N(this);
        double d = class068892.M - class068893.M;
        double d2 = class068892.B - class068893.B;
        double d3 = class068892.Z - class068893.Z;
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f = class04995.R((float)((float)(-(class04995.u((double)d2, (double)d4) * 57.2957763671875))));
        float f2 = class04995.R((float)((float)(class04995.u((double)d3, (double)d) * 57.2957763671875) - 90.0f));
        return this.N(new class07109(f, f2));
    }

    public class07701 y() {
        if (this.U || this.u.G_()) {
            return this;
        }
        return new class07701(this.u, this.i, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, true, this.W, this.m, this.s, this.T);
    }

    public class07109 E() {
        return this.P;
    }

    public class07701 N(class07703 class077032) {
        if (this.u == class077032) {
            return this;
        }
        return new class07701(class077032, this.i, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, this.s, this.T);
    }

    @Override
    public CompletableFuture<Suggestions> N(class05946<? extends class00751<?>> class059462, class07666 class076662, SuggestionsBuilder suggestionsBuilder, CommandContext<?> commandContext) {
        if (class059462 == class04227.yV) {
            return class07689.N(this.z.yM().u().stream().map(class037292 -> class037292.N().N()), suggestionsBuilder);
        }
        if (class059462 == class04227.yK) {
            return class07689.N(this.z.Nh().y().stream().map(class03711::N), suggestionsBuilder);
        }
        return this.N(class059462).map(class019052 -> {
            this.N((class01905)class019052, class076662, suggestionsBuilder);
            return suggestionsBuilder.buildFuture();
        }).orElseGet(Suggestions::empty);
    }

    public void N(CommandExceptionType commandExceptionType, Message message, boolean bl, @Nullable class01704 class017042) {
        if (class017042 != null) {
            class017042.N(message.getString());
        }
        if (!bl) {
            this.y(class00390.N((Message)message));
        }
    }

    @Override
    public CompletableFuture<Suggestions> N(CommandContext<?> commandContext) {
        return Suggestions.empty();
    }

    private Optional<? extends class01905<?>> N(class05946<? extends class00751<?>> class059462) {
        Optional optional = this.t().method_46759(class059462);
        if (optional.isPresent()) {
            return optional;
        }
        return this.z.yd().N().method_46759(class059462);
    }

    public class07701 N(class04445 class044452, class03068 class030682) {
        if (class044452 == this.s && class030682 == this.T) {
            return this;
        }
        return new class07701(this.u, this.i, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, class044452, class030682);
    }

    public class07701 N(class03102 class031022, BinaryOperator<class03102> binaryOperator) {
        class03102 class031023 = (class03102)binaryOperator.apply(this.W, class031022);
        return this.y(class031023);
    }

    public class08152 N() {
        return this.M;
    }

    public class07701 y(class03102 class031022) {
        if (Objects.equals(this.W, class031022)) {
            return this;
        }
        return new class07701(this.u, this.i, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, class031022, this.m, this.s, this.T);
    }

    public class07701 N(class08152 class081522) {
        if (class081522 == this.M) {
            return this;
        }
        return new class07701(this.u, this.i, this.P, this.R, class081522, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, this.s, this.T);
    }

    public class07701 N(class07664 class076642) {
        if (class076642 == this.m) {
            return this;
        }
        return new class07701(this.u, this.i, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, class076642, this.s, this.T);
    }

    public class07701 N(class04782 class047822) {
        if (class047822 == this.R) {
            return this;
        }
        double d = class07376.N((class07376)this.R.method_8597(), (class07376)class047822.method_8597());
        class06889 class068892 = new class06889(this.i.M * d, this.i.B, this.i.Z * d);
        return new class07701(this.u, class068892, this.P, class047822, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, this.s, this.T);
    }

    public class07701 N(class07049 class070492, class07664 class076642) {
        return this.y(class076642.N(class070492));
    }

    public class07701 N(class06889 class068892) {
        if (this.i.equals((Object)class068892)) {
            return this;
        }
        return new class07701(this.u, class068892, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, this.s, this.T);
    }

    public boolean N(class04770 class047702) {
        class04770 class047703 = this.z();
        if (class047702 == class047703) {
            return false;
        }
        return class047703 != null && class047703.method_33793() || class047702.method_33793();
    }

    public void N(Supplier<class00392> supplier, boolean bl) {
        boolean bl2;
        boolean bl3 = this.u.A_() && !this.U;
        boolean bl4 = bl2 = bl && this.u.B() && !this.U;
        if (!bl3 && !bl2) {
            return;
        }
        class00392 class003922 = supplier.get();
        if (bl3) {
            this.u.N(class003922);
        }
        if (bl2) {
            this.L(class003922);
        }
    }

    public void N(class00392 class003922) {
        if (this.U) {
            return;
        }
        class04770 class047702 = this.z();
        if (class047702 != null) {
            class047702.method_64398(class003922);
        } else {
            this.u.N(class003922);
        }
    }

    public class07701 N(class07049 class070492) {
        if (this.E == class070492) {
            return this;
        }
        return new class07701(this.u, this.i, this.P, this.R, this.M, class070492.method_74861(), class070492.method_5476(), this.z, class070492, this.U, this.W, this.m, this.s, this.T);
    }

    public class07701 N(class07109 class071092) {
        if (this.P.L(class071092)) {
            return this;
        }
        return new class07701(this.u, this.i, class071092, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, this.s, this.T);
    }

    public void N(class03059 class030592, boolean bl, class00649 class006492) {
        if (this.U) {
            return;
        }
        class04770 class047702 = this.z();
        if (class047702 != null) {
            class047702.method_43505(class030592, bl, class006492);
        } else {
            this.u.N(class006492.N(class030592.N()));
        }
    }

    public class02796 W() {
        return this.z;
    }

    public class04782 R() {
        return this.R;
    }

    @Override
    public class03767 G() {
        return this.R.method_45162();
    }
}

