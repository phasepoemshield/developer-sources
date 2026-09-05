/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00778
 *  minecraft.class00808
 *  minecraft.class01001
 *  minecraft.class01194
 *  minecraft.class01929
 *  minecraft.class03556
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05074
 *  minecraft.class05487
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06113
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06925
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07107
 *  minecraft.class07113
 *  minecraft.class07126
 *  minecraft.class07134
 *  minecraft.class07206
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07448
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08308
 *  minecraft.class08329
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00778;
import minecraft.class00808;
import minecraft.class01001;
import minecraft.class01194;
import minecraft.class01929;
import minecraft.class03556;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04479;
import minecraft.class04481;
import minecraft.class04487;
import minecraft.class04488;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04498;
import minecraft.class04500;
import minecraft.class04502;
import minecraft.class04505;
import minecraft.class04513;
import minecraft.class04514;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05074;
import minecraft.class05487;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06113;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06925;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07107;
import minecraft.class07113;
import minecraft.class07126;
import minecraft.class07134;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07448;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08308;
import minecraft.class08329;
import org.slf4j.Logger;

public final class class04485 {
    private static final Logger y = LogUtils.getLogger();
    public static final int N = 40;
    private static final int L = 36000;
    private static final int u = 14;
    private static final int i = 47;
    private static final int R = class04995.Z((int)47);
    private static final float M = 0.02f;
    private final class04479 B = new class04479();
    private class04502 Z;
    private final class04498 z;
    private class04514 U;
    private final class04488 E;
    private boolean W;
    private boolean m;

    public class04513 L() {
        return (class04513)((Object)this.Z.y().N());
    }

    public Optional<UUID> L(class04782 class047822, class07209 class072092) {
        class06069 class060692 = class047822.method_8409();
        class00808 class008082 = this.B.y(this, class047822.method_8409());
        try (class04495 class044952 = new class04495(() -> "spawner@" + String.valueOf(class072092), y);){
            Object object;
            class00778 class007782;
            class08299 class082992 = class08308.N((class04490)class044952, (class01929)class047822.method_30349(), (class07001)class008082.u());
            Optional var7 = class07078.N((class08299)class082992);
            if (var7.isEmpty()) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            class06889 class068892 = class082992.N("Pos", class06889.N).orElseGet(() -> {
                class04513 class045132 = this.N();
                return new class06889((double)class072092.method_10263() + (class060692.U() - class060692.U()) * (double)class045132.L() + 0.5, (double)(class072092.method_10264() + class060692.y(3) - 1), (double)class072092.method_10260() + (class060692.U() - class060692.U()) * (double)class045132.L() + 0.5);
            });
            if (!class047822.y(((class07078)var7.get()).N(class068892.M, class068892.B, class068892.Z))) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            if (!class04485.N((class07299)class047822, class072092.method_46558(), class068892)) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            class07209 class072093 = class07209.method_49638((class00737)class068892);
            if (!class07448.N((class07078)((class07078)var7.get()), (class01001)class047822, (class06113)class06113.field_47245, (class07209)class072093, (class06069)class047822.method_8409())) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            if (class008082.y().isPresent() && !(class007782 = (class00778)class008082.y().get()).N(class072093, class047822)) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            class007782 = class07078.N((class08299)class082992, (class07299)class047822, (class06113)class06113.field_47245, class070492 -> {
                class070492.method_5808(class068892.M, class068892.B, class068892.Z, class060692.z() * 360.0f, 0.0f);
                return class070492;
            });
            if (class007782 == null) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            if (class007782 instanceof class07079) {
                boolean bl;
                object = (class07079)class007782;
                if (!object.N((class05487)class047822)) {
                    Optional<UUID> optional = Optional.empty();
                    return optional;
                }
                boolean bl2 = bl = class008082.N().Z() == 1 && class008082.N().Z("id").isPresent();
                if (bl) {
                    object.N((class01001)class047822, class047822.method_8404(object.method_24515()), class06113.field_47245, null);
                }
                object.NW();
                class008082.L().ifPresent(arg_0 -> ((class07079)object).N(arg_0));
            }
            if (!class047822.method_30736((class07049)class007782)) {
                object = Optional.empty();
                return object;
            }
            object = this.m ? class04500.field_50187 : class04500.field_50186;
            class047822.N(3011, class072092, ((class04500)((Object)object)).N());
            class047822.N(3012, class072093, ((class04500)((Object)object)).N());
            class047822.N((class07049)class007782, (class03556)class01194.v, class072093);
            Optional<UUID> optional = Optional.of(class007782.method_5667());
            return optional;
        }
    }

    public class04481 M() {
        return this.z.u();
    }

    public class04485(class04502 class045022, class04498 class044982, class04514 class045142, class04488 class044882) {
        this.Z = class045022;
        this.z = class044982;
        this.U = class045142;
        this.E = class044882;
    }

    public class04479 B() {
        return this.B;
    }

    public void Z() {
        this.z.R();
    }

    public int i() {
        return this.Z.L();
    }

    public class04488 U() {
        return this.E;
    }

    public class04514 z() {
        return this.U;
    }

    public boolean u() {
        return this.m;
    }

    public static void y(class07299 class072992, class07209 class072092, class06069 class060692) {
        for (int i = 0; i < 20; ++i) {
            double d = (double)class072092.method_10263() + 0.4 + class060692.U() * 0.2;
            double d2 = (double)class072092.method_10264() + 0.4 + class060692.U() * 0.2;
            double d3 = (double)class072092.method_10260() + 0.4 + class060692.U() * 0.2;
            double d4 = class060692.E() * 0.02;
            double d5 = class060692.E() * 0.02;
            double d6 = class060692.E() * 0.02;
            class072992.method_8406((class07126)class07107.Nc, d, d2, d3, d4, d5, d6 * 0.25);
            class072992.method_8406((class07126)class07107.NZ, d, d2, d3, d4, d5, d6);
        }
    }

    public void y(class04782 class047822, class07209 class072092) {
        class047822.method_8652(class072092, (class00500)class047822.method_8320(class072092).y((class08092)class04487.L, (Comparable)Boolean.valueOf(false)), 3);
        this.m = false;
    }

    public class04513 y() {
        return (class04513)((Object)this.Z.N().N());
    }

    @Deprecated(forRemoval=true)
    public void E() {
        this.W = true;
    }

    public void N(class07078<?> class070782, class07299 class072992) {
        this.B.y();
        this.Z = this.Z.N(class070782);
        this.N(class072992, class04481.field_47383);
    }

    public static void N(class07299 class072992, class07209 class072092, class06069 class060692, class07134 class071342) {
        for (int i = 0; i < 20; ++i) {
            double d = (double)class072092.method_10263() + 0.5 + (class060692.U() - 0.5) * 2.0;
            double d2 = (double)class072092.method_10264() + 0.5 + (class060692.U() - 0.5) * 2.0;
            double d3 = (double)class072092.method_10260() + 0.5 + (class060692.U() - 0.5) * 2.0;
            class072992.method_8406((class07126)class07107.NZ, d, d2, d3, 0.0, 0.0, 0.0);
            class072992.method_8406((class07126)class071342, d, d2, d3, 0.0, 0.0, 0.0);
        }
    }

    public static void N(class07299 class072992, class07209 class072092, class06069 class060692, int n, class07126 class071262) {
        for (int i = 0; i < 30 + Math.min(n, 10) * 5; ++i) {
            double d = (double)(2.0f * class060692.z() - 1.0f) * 0.65;
            double d2 = (double)(2.0f * class060692.z() - 1.0f) * 0.65;
            double d3 = (double)class072092.method_10263() + 0.5 + d;
            double d4 = (double)class072092.method_10264() + 0.1 + (double)class060692.z() * 0.8;
            double d5 = (double)class072092.method_10260() + 0.5 + d2;
            class072992.method_8406(class071262, d3, d4, d5, 0.0, 0.0, 0.0);
        }
    }

    public static void N(class07299 class072992, class07209 class072092, class06069 class060692) {
        for (int i = 0; i < 20; ++i) {
            double d = (double)class072092.method_10263() + 0.5 + (class060692.U() - 0.5) * 2.0;
            double d2 = (double)class072092.method_10264() + 0.5 + (class060692.U() - 0.5) * 2.0;
            double d3 = (double)class072092.method_10260() + 0.5 + (class060692.U() - 0.5) * 2.0;
            double d4 = class060692.E() * 0.02;
            double d5 = class060692.E() * 0.02;
            double d6 = class060692.E() * 0.02;
            class072992.method_8406((class07126)class07107.yZ, d, d2, d3, d4, d5, d6);
            class072992.method_8406((class07126)class07107.X, d, d2, d3, d4, d5, d6);
        }
    }

    public void N(class08299 class082992) {
        class082992.N(class04505.B).ifPresent(this.B::N);
        this.Z = class082992.N(class04502.i).orElse(class04502.R);
    }

    @Deprecated(forRemoval=true)
    public void N(class04514 class045142) {
        this.U = class045142;
    }

    public class04513 N() {
        return this.m ? (class04513)((Object)this.Z.y().N()) : (class04513)((Object)this.Z.N().N());
    }

    public boolean N(class04782 class047822) {
        if (!((Boolean)class047822.method_64395().N(class07305.C)).booleanValue()) {
            return false;
        }
        if (this.W) {
            return true;
        }
        if (class047822.y() == class07086.field_5801) {
            return false;
        }
        return (Boolean)class047822.method_64395().N(class07305.S);
    }

    public void N(class07299 class072992, class04481 class044812) {
        this.z.N(class072992, class044812);
    }

    public void N(class04782 class047822, class07209 class072092) {
        class047822.method_8652(class072092, (class00500)class047822.method_8320(class072092).y((class08092)class04487.L, (Comparable)Boolean.valueOf(true)), 3);
        class047822.N(3020, class072092, 1);
        this.m = true;
        this.B.N(this, class047822);
    }

    public void N(class08329 class083292) {
        class083292.N(class04505.B, (Object)this.B.N());
        class083292.N(class04502.i, (Object)this.Z);
    }

    private static boolean N(class04782 class047822, class07209 class072092, UUID uUID) {
        class07049 class070492 = class047822.method_66347(uUID);
        return class070492 == null || !class070492.method_5805() || !class070492.method_73183().method_27983().equals(class047822.method_27983()) || class070492.method_24515().method_10262((class00753)class072092) > (double)R;
    }

    private static boolean N(class07299 class072992, class06889 class068892, class06889 class068893) {
        class06183 class061832 = class072992.N(new class05862(class068893, class068892, class05849.field_23142, class05835.field_1348, class06092.N()));
        return class061832.u().equals((Object)class07209.method_49638((class00737)class068892)) || class061832.N() == class07113.field_1333;
    }

    public void N(class04782 class047822, class07209 class072092, boolean bl) {
        class04481 class044812;
        this.m = bl;
        class04481 class044813 = this.M();
        if (this.B.y.removeIf(uUID -> class04485.N(class047822, class072092, uUID))) {
            this.B.u = class047822.N() + (long)this.N().B();
        }
        if ((class044812 = class044813.N(class072092, this, class047822)) != class044813) {
            this.N((class07299)class047822, class044812);
        }
    }

    public void N(class07299 class072992, class07209 class072092, boolean bl) {
        class06069 class060692;
        class04481 class044812 = this.M();
        class044812.N(class072992, class072092, bl);
        if (class044812.L()) {
            double d = Math.max(0L, this.B.u - class072992.N());
            this.B.Z = this.B.B;
            this.B.B = (this.B.B + class044812.y() / (d + 200.0)) % 360.0;
        }
        if (class044812.u() && (class060692 = class072992.method_8409()).z() <= 0.02f) {
            class04891 class048912 = bl ? class04909.Pu : class04909.PL;
            class072992.method_45446(class072092, class048912, class04911.field_15245, class060692.z() * 0.25f + 0.75f, class060692.z() + 0.5f, false);
        }
    }

    public void N(class04782 class047822, class07209 class072092, class05946<class05074> class059462) {
        class04162 class041622;
        class05074 class050742 = class047822.method_8503().yd().N(class059462);
        ObjectArrayList var6 = class050742.N(class041622 = new class04160(class047822).N(class06925.L));
        if (!var6.isEmpty()) {
            for (class06584 class065842 : var6) {
                class07206.N((class07299)class047822, (class06584)class065842, (int)2, (class07211)class07211.field_11036, (class00737)class06889.L((class00753)class072092).N(class07211.field_11036, 1.2));
            }
            class047822.N(3014, class072092, 0);
        }
    }

    public int R() {
        return this.Z.u();
    }
}

