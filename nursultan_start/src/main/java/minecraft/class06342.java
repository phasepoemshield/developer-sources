/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.MatchException
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00608
 *  minecraft.class00701
 *  minecraft.class00865
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class07003
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07212
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07517
 *  minecraft.class08005
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00608;
import minecraft.class00701;
import minecraft.class00865;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06336;
import minecraft.class06337;
import minecraft.class06344;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class07003;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07212;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07517;
import minecraft.class08005;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class06342
extends class00891
implements class06084,
class06344 {
    public static final MapCodec<class06342> N = class06342.y(class06342::new);
    public static final class08064<class07211> y = class06665.yb;
    public static final class08064<class06337> L = class06665.yj;
    public static final class06667 u = class06665.q;
    private static final int i = 11;
    private static final int R = 2;
    private static final float M = 0.02f;
    private static final float B = 0.12f;
    private static final int Z = 11;
    private static final float O = 0.17578125f;
    private static final float F = 0.05859375f;
    private static final double A = 0.6;
    private static final float f = 1.0f;
    private static final int C = 40;
    private static final int S = 6;
    private static final float x = 2.5f;
    private static final int D = 2;
    private static final float h = 5.0f;
    private static final float r = 0.011377778f;
    private static final int NN = 7;
    private static final int Ny = 10;
    private static final class00494 NL = class00891.y((double)6.0, (double)0.0, (double)16.0);
    private static final class00494 Nu = class00891.y((double)6.0, (double)0.0, (double)11.0);
    private static final class00494 Ni = class00891.y((double)6.0, (double)5.0, (double)16.0);
    private static final class00494 NR = class00891.y((double)8.0, (double)0.0, (double)16.0);
    private static final class00494 NM = class00891.y((double)10.0, (double)0.0, (double)16.0);
    private static final class00494 NB = class00891.y((double)12.0, (double)0.0, (double)16.0);
    private static final double NZ = Ni.method_1091(class07185.field_11052);
    private static final float Nz = (float)NB.method_1091(class07185.field_11048);
    private static final class00494 NU = class00891.y((double)4.0, (double)0.0, (double)16.0);

    private static boolean L(class05487 class054872, class07209 class072092, class07211 class072112) {
        class07209 class072093 = class072092.method_10093(class072112.b());
        class00500 class005002 = class054872.method_8320(class072093);
        return class005002.L((class07290)class054872, class072093, class072112) || class06342.y(class005002, class072112);
    }

    public static void L(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00500 class005003;
        class00500 class005004 = class047822.method_8320(class072092.method_10086(1));
        if (!class06342.N(class005004, class005003 = class047822.method_8320(class072092.method_10086(2)))) {
            return;
        }
        class07209 class072093 = class06342.N(class005002, (class07284)class047822, class072092, 7, false);
        if (class072093 == null) {
            return;
        }
        class00500 class005005 = class047822.method_8320(class072093);
        if (!class06342.U(class005005) || !class06342.y(class005005, class047822, class072093)) {
            return;
        }
        if (class060692.Z()) {
            class06342.N(class047822, class072093, class07211.field_11033);
        } else {
            class06342.y(class047822, class072093);
        }
    }

    private static boolean T(class00500 class005002) {
        return class06342.y(class005002, class07211.field_11033);
    }

    public class06342(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11036)).y(L, (Comparable)((Object)class06337.field_28065))).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    private static boolean b(class00500 class005002) {
        return class06342.y(class005002, class07211.field_11036);
    }

    public static boolean U(class00500 class005002) {
        return class06342.T(class005002) && class005002.L(L) == class06337.field_28065 && (Boolean)class005002.L((class08092)u) == false;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    private static void y(class00500 class005002, class07284 class072842, class07209 class072092) {
        class07209 class072093;
        class07209 class072094;
        if (class005002.L(y) == class07211.field_11036) {
            class072094 = class072092;
            class072093 = class072092.method_10084();
        } else {
            class072093 = class072092;
            class072094 = class072092.method_10074();
        }
        class06342.N(class072842, class072093, class07211.field_11033, class06337.field_28064);
        class06342.N(class072842, class072094, class07211.field_11036, class06337.field_28064);
    }

    private static boolean y(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class06342.T(class005002) && !class054872.method_8320(class072092.method_10084()).N(class00869.vp);
    }

    private static void y(class04782 class047822, class07209 class072092) {
        class07218 class072182 = class072092.method_25503();
        for (int i = 0; i < 10; ++i) {
            class072182.N(class07211.field_11033);
            class00500 class005002 = class047822.method_8320((class07209)class072182);
            if (!class005002.Y().W()) {
                return;
            }
            if (class06342.N(class005002, class07211.field_11036) && class06342.y(class005002, class047822, (class07209)class072182)) {
                class06342.N(class047822, (class07209)class072182, class07211.field_11036);
                return;
            }
            if (class06342.L((class05487)class047822, (class07209)class072182, class07211.field_11036) && !class047822.z(class072182.method_10074())) {
                class06342.N(class047822, class072182.method_10074(), class07211.field_11036);
                return;
            }
            if (class06342.L((class07290)class047822, (class07209)class072182, class005002)) continue;
            return;
        }
    }

    private static @Nullable class07211 y(class05487 class054872, class07209 class072092, class07211 class072112) {
        class07211 class072113;
        if (class06342.L(class054872, class072092, class072112)) {
            class072113 = class072112;
        } else if (class06342.L(class054872, class072092, class072112.b())) {
            class072113 = class072112.b();
        } else {
            return null;
        }
        return class072113;
    }

    private static boolean y(class00500 class005002, class04782 class047822, class07209 class072092) {
        class07211 class072112 = (class07211)class005002.L(y);
        class07209 class072093 = class072092.method_10093(class072112);
        class00500 class005003 = class047822.method_8320(class072093);
        if (!class005003.Y().W()) {
            return false;
        }
        if (class005003.P()) {
            return true;
        }
        return class06342.N(class005003, class072112.b());
    }

    private static boolean y(class00500 class005002, class07211 class072112) {
        return class005002.N(class00869.vp) && class005002.L(y) == class072112;
    }

    private static Optional<class06336> y(class07299 class072992, class07209 class072093, class00500 class005002) {
        if (!class06342.T(class005002)) {
            return Optional.empty();
        }
        return class06342.N(class072992, class072093, class005002, 11).map(class072092 -> {
            class07209 class072093 = class072092.method_10084();
            class00500 class005002 = class072992.method_8320(class072093);
            Object object = class005002.N(class00869.nB) && (Boolean)class072992.method_75728().N(class00608.Y, class072093) == false ? class04684.L : class072992.method_8316(class072093).N();
            return new class06336(class072093, (class04651)object, class005002);
        });
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class06342.N(class005002, class047822, class072092, class060692.z());
        if (class060692.z() < 0.011377778f && class06342.y(class005002, (class05487)class047822, class072092)) {
            class06342.L(class005002, class047822, class072092, class060692);
        }
    }

    private static @Nullable class07209 N(class07299 class072992, class07209 class072093, class04651 class046512) {
        Predicate<class00500> predicate = class005002 -> class005002.i() instanceof class00865 && ((class00865)class005002.i()).N(class046512);
        BiPredicate<class07209, class00500> biPredicate = (class072092, class005002) -> class06342.L((class07290)class072992, class072092, class005002);
        return class06342.N((class07284)class072992, class072093, class07211.field_11033.i(), biPredicate, predicate, 11).orElse(null);
    }

    private static boolean N(class00500 class005002, class00500 class005003) {
        return class005002.N(class00869.vF) && class005003.N(class00869.K) && class005003.Y().u();
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public MapCodec<class06342> N() {
        return N;
    }

    private static boolean N(class04651 class046512) {
        return class046512 == class04684.i || class046512 == class04684.L;
    }

    private static class07126 N(class07299 class072992, class04651 class046512, class07209 class072092) {
        if (class046512.N(class04684.N)) {
            return (class07126)class072992.method_75728().N(class00608.v, class072092);
        }
        return class046512.N(class01231.y) ? class07107.Na : class07107.NF;
    }

    private static boolean L(class07290 class072902, class07209 class072092, class00500 class005002) {
        if (class005002.P()) {
            return true;
        }
        if (class005002.t()) {
            return false;
        }
        if (!class005002.Y().W()) {
            return false;
        }
        class00494 class004942 = class005002.M(class072902, class072092);
        return !class00389.L((class00494)NU, (class00494)class004942, (class07003)class07003.Z);
    }

    private static Optional<class07209> N(class07284 class072842, class07209 class072092, class07212 class072122, BiPredicate<class07209, class00500> biPredicate, Predicate<class00500> predicate, int n) {
        class07211 class072112 = class07211.N((class07212)class072122, (class07185)class07185.field_11052);
        class07218 class072182 = class072092.method_25503();
        for (int i = 1; i < n; ++i) {
            class072182.N(class072112);
            class00500 class005002 = class072842.method_8320((class07209)class072182);
            if (predicate.test(class005002)) {
                return Optional.of(class072182.method_10062());
            }
            if (!class072842.method_31601(class072182.method_10264()) && biPredicate.test((class07209)class072182, class005002)) continue;
            return Optional.empty();
        }
        return Optional.empty();
    }

    public static @Nullable class07209 N(class07299 class072992, class07209 class072093) {
        BiPredicate<class07209, class00500> biPredicate = (class072092, class005002) -> class06342.L((class07290)class072992, class072092, class005002);
        return class06342.N((class07284)class072992, class072093, class07211.field_11036.i(), biPredicate, class06342::U, 11).orElse(null);
    }

    public static class04651 N(class04782 class047822, class07209 class072092) {
        return class06342.y((class07299)class047822, class072092, class047822.method_8320(class072092)).map(class063362 -> class063362.y()).filter(class06342::N).orElse(class04684.N);
    }

    public static void N(class00500 class005002, class04782 class047822, class07209 class072092, float f) {
        float f2;
        if (f > 0.17578125f && f > 0.05859375f) {
            return;
        }
        if (!class06342.y(class005002, (class05487)class047822, class072092)) {
            return;
        }
        Optional<class06336> var4 = class06342.y((class07299)class047822, class072092, class005002);
        if (var4.isEmpty()) {
            return;
        }
        class04651 class046512 = var4.get().y();
        if (class046512 == class04684.L) {
            f2 = 0.17578125f;
        } else if (class046512 == class04684.i) {
            f2 = 0.05859375f;
        } else {
            return;
        }
        if (f >= f2) {
            return;
        }
        class07209 class072093 = class06342.N(class005002, (class07284)class047822, class072092, 11, false);
        if (class072093 == null) {
            return;
        }
        if (var4.get().L().N(class00869.nB) && class046512 == class04684.L) {
            class00500 class005003 = class00869.in.W();
            class047822.method_8501(var4.get().N(), class005003);
            class00891.N_19((class00500)var4.get().L(), (class00500)class005003, (class07284)class047822, (class07209)var4.get().N());
            class047822.N((class03556)class01194.L, var4.get().N(), class01164.N((class00500)class005003));
            class047822.N(1504, class072093, 0);
            return;
        }
        class07209 class072094 = class06342.N((class07299)class047822, class072093, class046512);
        if (class072094 == null) {
            return;
        }
        class047822.N(1504, class072093, 0);
        int n = class072093.method_10264() - class072094.method_10264();
        int n2 = 50 + n;
        class00500 class005004 = class047822.method_8320(class072094);
        class047822.N(class072094, class005004.i(), n2);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class07211 class072112;
        class07209 class072092;
        class07299 class072992 = class069422.method_8045();
        class07211 class072113 = class06342.y((class05487)class072992, class072092 = class069422.method_8037(), class072112 = class069422.u().b());
        if (class072113 == null) {
            return null;
        }
        boolean bl = !class069422.method_8046();
        class06337 class063372 = class06342.N((class05487)class072992, class072092, class072113, bl);
        return (class00500)((class00500)((class00500)this.W().y(y, (Comparable)class072113)).y(L, (Comparable)((Object)class063372))).y((class08092)u, (Comparable)Boolean.valueOf(class072992.method_8316(class072092).N() == class04684.L));
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return (switch ((class06337)((Object)class005002.L(L))) {
            default -> throw new MatchException(null, null);
            case class06337.field_28064 -> NL;
            case class06337.field_28065 -> {
                if (class005002.L(y) == class07211.field_11033) {
                    yield Ni;
                }
                yield Nu;
            }
            case class06337.field_28066 -> NR;
            case class06337.field_28067 -> NM;
            case class06337.field_28068 -> NB;
        }).method_64034(class005002.N(class072092));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u});
    }

    @Override
    public void N(class07299 class072992, class07209 class072092, class00701 class007012) {
        if (!class007012.method_5701()) {
            class072992.N(1045, class072092, 0);
        }
    }

    @Override
    public class07072 N(class07049 class070492) {
        return class070492.method_48923().L(class070492);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (class072112 != class07211.field_11036 && class072112 != class07211.field_11033) {
            return class005002;
        }
        class07211 class072113 = (class07211)class005002.L(y);
        if (class072113 == class07211.field_11033 && class087132.method_8397().N(class072092, (Object)this)) {
            return class005002;
        }
        if (class072112 == class072113.b() && !this.a_(class005002, class054872, class072092)) {
            if (class072113 == class07211.field_11033) {
                class087132.N(class072092, (class00891)this, 2);
            } else {
                class087132.N(class072092, (class00891)this, 1);
            }
            return class005002;
        }
        boolean bl = class005002.L(L) == class06337.field_28064;
        class06337 class063372 = class06342.N(class054872, class072092, class072113, bl);
        return (class00500)class005002.y(L, (Comparable)((Object)class063372));
    }

    protected void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
        class04782 class047822;
        if (class072992.method_8608()) {
            return;
        }
        class07209 class072092 = class061832.u();
        if (class072992 instanceof class04782 && class080052.method_36971(class047822 = (class04782)class072992, class072092) && class080052.N(class047822) && class080052 instanceof class07517 && class080052.method_18798().M() > 0.6) {
            class072992.N(class072092, true);
        }
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092, class07049 class070492, double d) {
        if (class005002.L(y) == class07211.field_11036 && class005002.L(L) == class06337.field_28065) {
            class070492.method_5747(d + 2.5, 2.0f, class072992.method_48963().G());
        } else {
            super.N(class072992, class005002, class072092, class070492, d);
        }
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (!class06342.U(class005002)) {
            return;
        }
        float f = class060692.z();
        if (f > 0.12f) {
            return;
        }
        class06342.y(class072992, class072092, class005002).filter(class063362 -> f < 0.02f || class06342.N(class063362.y())).ifPresent(class063362 -> class06342.N(class072992, class072092, class005002, class063362.y(), class063362.N()));
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class06342.b(class005002) && !this.a_(class005002, (class05487)class047822, class072092)) {
            class047822.N(class072092, true);
        } else {
            class06342.N(class005002, class047822, class072092);
        }
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class04651 class046512, class07209 class072093) {
        class06889 class068892 = class005002.N(class072092);
        double d = 0.0625;
        double d2 = (double)class072092.method_10263() + 0.5 + class068892.M;
        double d3 = (double)class072092.method_10264() + NZ - 0.0625;
        double d4 = (double)class072092.method_10260() + 0.5 + class068892.Z;
        class07126 class071262 = class06342.N(class072992, class046512, class072093);
        class072992.method_8406(class071262, d2, d3, d4, 0.0, 0.0, 0.0);
    }

    private static @Nullable class07209 N(class00500 class005003, class07284 class072842, class07209 class072093, int n, boolean bl) {
        if (class06342.N(class005003, bl)) {
            return class072093;
        }
        class07211 class072112 = (class07211)class005003.L(y);
        BiPredicate<class07209, class00500> biPredicate = (class072092, class005002) -> class005002.N(class00869.vp) && class005002.L(y) == class072112;
        return class06342.N(class072842, class072093, class072112.i(), biPredicate, class005002 -> class06342.N(class005002, bl), n).orElse(null);
    }

    private static class06337 N(class05487 class054872, class07209 class072092, class07211 class072112, boolean bl) {
        class07211 class072113 = class072112.b();
        class00500 class005002 = class054872.method_8320(class072092.method_10093(class072112));
        if (class06342.y(class005002, class072113)) {
            if (bl || class005002.L(L) == class06337.field_28064) {
                return class06337.field_28064;
            }
            return class06337.field_28065;
        }
        if (!class06342.y(class005002, class072112)) {
            return class06337.field_28065;
        }
        class06337 class063372 = (class06337)((Object)class005002.L(L));
        if (class063372 == class06337.field_28065 || class063372 == class06337.field_28064) {
            return class06337.field_28066;
        }
        if (!class06342.y(class054872.method_8320(class072092.method_10093(class072113)), class072112)) {
            return class06337.field_28068;
        }
        return class06337.field_28067;
    }

    private static Optional<class07209> N(class07299 class072992, class07209 class072093, class00500 class005003, int n) {
        class07211 class072112 = (class07211)class005003.L(y);
        BiPredicate<class07209, class00500> biPredicate = (class072092, class005002) -> class005002.N(class00869.vp) && class005002.L(y) == class072112;
        return class06342.N((class07284)class072992, class072093, class072112.b().i(), biPredicate, class005002 -> !class005002.N(class00869.vp), n);
    }

    private static boolean N(class00500 class005002, boolean bl) {
        if (!class005002.N(class00869.vp)) {
            return false;
        }
        class06337 class063372 = (class06337)((Object)class005002.L(L));
        return class063372 == class06337.field_28065 || bl && class063372 == class06337.field_28064;
    }

    private static boolean N(class00500 class005002, class07211 class072112) {
        return class06342.N(class005002, false) && class005002.L(y) == class072112;
    }

    private static void N(class00500 class005002, class04782 class047822, class07209 class072092) {
        class07218 class072182 = class072092.method_25503();
        class00500 class005003 = class005002;
        while (class06342.T(class005003)) {
            class00701 class007012 = class00701.N((class07299)class047822, (class07209)class072182, (class00500)class005003);
            if (class06342.N(class005003, true)) {
                int n = Math.max(1 + class072092.method_10264() - class072182.method_10264(), 6);
                float f = 1.0f * (float)n;
                class007012.N(f, 40);
                break;
            }
            class072182.N(class07211.field_11033);
            class005003 = class047822.method_8320((class07209)class072182);
        }
    }

    private static void N(class04782 class047822, class07209 class072092, class07211 class072112) {
        class07209 class072093 = class072092.method_10093(class072112);
        class00500 class005002 = class047822.method_8320(class072093);
        if (class06342.N(class005002, class072112.b())) {
            class06342.y(class005002, (class07284)class047822, class072093);
        } else if (class005002.P() || class005002.N(class00869.K)) {
            class06342.N((class07284)class047822, class072093, class072112, class06337.field_28065);
        }
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class06342.y(class072992, class072092, class005002).ifPresent(class063362 -> class06342.N(class072992, class072092, class005002, class063362.y(), class063362.N()));
    }

    private static void N(class07284 class072842, class07209 class072092, class07211 class072112, class06337 class063372) {
        class00500 class005002 = (class00500)((class00500)((class00500)class00869.vp.W().y(y, (Comparable)class072112)).y(L, (Comparable)((Object)class063372))).y((class08092)u, (Comparable)Boolean.valueOf(class072842.method_8316(class072092).N() == class04684.L));
        class072842.method_8652(class072092, class005002, 3);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class06342.L(class054872, class072092, (class07211)class005002.L(y));
    }

    protected boolean a_(class00500 class005002, class07290 class072902, class07209 class072092) {
        return false;
    }

    protected float G() {
        return Nz;
    }
}

