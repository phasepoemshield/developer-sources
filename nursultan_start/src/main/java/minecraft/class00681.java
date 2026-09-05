/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00744
 *  minecraft.class00753
 *  minecraft.class00772
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02484
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04641
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07043
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07062
 *  minecraft.class07070
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07105
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07307
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07443
 *  minecraft.class07504
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class00672;
import minecraft.class00691;
import minecraft.class00734;
import minecraft.class00744;
import minecraft.class00753;
import minecraft.class00772;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02484;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03696;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04641;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07043;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07062;
import minecraft.class07070;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07105;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07307;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07443;
import minecraft.class07504;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class00681
extends class07438 {
    public static final int N = 5;
    private static final boolean d = true;
    public static final class00744 y = new class00744(0.0f, 0.0f, 0.0f);
    public static final class00744 L = new class00744(0.0f, 0.0f, 0.0f);
    public static final class00744 u = new class00744(-10.0f, 0.0f, -10.0f);
    public static final class00744 i = new class00744(-15.0f, 0.0f, 10.0f);
    public static final class00744 R = new class00744(-1.0f, 0.0f, -1.0f);
    public static final class00744 M = new class00744(1.0f, 0.0f, 1.0f);
    private static final class01325 w = class01325.L((float)0.0f, (float)0.0f);
    private static final class01325 k = class07078.B.E().N(0.5f).y(0.9875f);
    private static final double Y = 0.1;
    private static final double Q = 0.9;
    private static final double O = 0.4;
    private static final double g = 1.6;
    public static final int B = 8;
    public static final int Z = 16;
    public static final int W = 1;
    public static final int m = 4;
    public static final int P = 8;
    public static final int s = 16;
    public static final class02131<Byte> T = class03289.N(class00681.class, (class04383)class02154.N);
    public static final class02131<class00744> b = class03289.N(class00681.class, (class04383)class02154.m);
    public static final class02131<class00744> j = class03289.N(class00681.class, (class04383)class02154.m);
    public static final class02131<class00744> v = class03289.N(class00681.class, (class04383)class02154.m);
    public static final class02131<class00744> n = class03289.N(class00681.class, (class04383)class02154.m);
    public static final class02131<class00744> t = class03289.N(class00681.class, (class04383)class02154.m);
    public static final class02131<class00744> G = class03289.N(class00681.class, (class04383)class02154.m);
    private static final Predicate<class07049> I = class070492 -> class070492 instanceof class07504 && ((class07504)class070492).Z();
    private static final boolean J = false;
    private static final int o = 0;
    private static final boolean q = false;
    private static final boolean K = false;
    private static final boolean V = false;
    private static final boolean e = false;
    private boolean H = false;
    public long l;
    private int c = 0;

    public void L(class00744 class007442) {
        this.field_6011.N(v, (Object)class007442);
    }

    private void L(boolean bl) {
        this.field_6011.N(T, (Object)this.N((Byte)this.field_6011.N(T), 1, bl));
    }

    public boolean L() {
        return ((Byte)this.field_6011.N(T) & 4) != 0;
    }

    public class00744 M() {
        return (class00744)this.field_6011.N(j);
    }

    private void P() {
        this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.NO, this.method_5634(), 1.0f, 1.0f);
    }

    public boolean method_5696() {
        return this.i();
    }

    public void method_18382() {
        double d = this.method_23317();
        double d2 = this.method_23318();
        double d3 = this.method_23321();
        super.method_18382();
        this.method_5814(d, d2, d3);
    }

    public boolean method_6034() {
        return super.method_6034() && this.W();
    }

    public boolean method_5659(class07307 class073072) {
        if (class073072.B()) {
            return this.method_5767();
        }
        return true;
    }

    public class04641 method_5657() {
        if (this.i()) {
            return class04641.field_15975;
        }
        return super.method_5657();
    }

    public class07082 method_5664(class08036 class080362, class06889 class068892, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (this.i() || class065842.N(class06570.lN)) {
            return class07082.i;
        }
        if (class080362.method_7325()) {
            return class07082.N;
        }
        if (class080362.method_73183().method_8608()) {
            return class07082.y;
        }
        class07085 class070852 = this.method_32326(class065842);
        if (class065842.R()) {
            class07085 class070853;
            class07085 class070854 = this.N(class068892);
            class07085 class070855 = class070853 = this.N(class070854) ? class070852 : class070854;
            if (this.method_6084(class070853) && this.N(class080362, class070853, class065842, class070502)) {
                return class07082.y;
            }
        } else {
            if (this.N(class070852)) {
                return class07082.u;
            }
            if (class070852.N() == class07043.field_6177 && !this.L()) {
                return class07082.u;
            }
            if (this.N(class080362, class070852, class065842, class070502)) {
                return class07082.y;
            }
        }
        return class07082.i;
    }

    public void method_5674(class02131<?> class021312) {
        if (T.equals(class021312)) {
            this.method_18382();
            this.field_23807 = !this.i();
        }
        super.method_5674(class021312);
    }

    public class06584 method_31480() {
        return new class06584((class07310)class06570.GA);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(T, (Object)0);
        class042932.N(b, (Object)y);
        class042932.N(j, (Object)L);
        class042932.N(v, (Object)u);
        class042932.N(n, (Object)i);
        class042932.N(t, (Object)R);
        class042932.N(G, (Object)M);
    }

    public void method_5768(class04782 class047822) {
        this.method_5650(class07062.field_26998);
        this.method_32876((class03556)class01194.s);
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.method_31481()) {
            return false;
        }
        if (!((Boolean)class047822.method_64395().N(class07305.I)).booleanValue() && class070722.u() instanceof class07079) {
            return false;
        }
        if (class070722.N(class03696.u)) {
            this.method_5768(class047822);
            return false;
        }
        if (this.method_5679(class047822, class070722) || this.H || this.i()) {
            return false;
        }
        if (class070722.N(class03696.E)) {
            this.y(class047822, class070722);
            this.method_5768(class047822);
            return false;
        }
        if (class070722.N(class03696.n)) {
            if (this.method_5809()) {
                this.N(class047822, class070722, 0.15f);
            } else {
                this.method_5639(5.0f);
            }
            return false;
        }
        if (class070722.N(class03696.t) && this.method_6032() > 0.5f) {
            this.N(class047822, class070722, 4.0f);
            return false;
        }
        boolean bl = class070722.N(class03696.Y);
        boolean bl2 = class070722.N(class03696.k);
        if (!bl && !bl2) {
            return false;
        }
        class07049 class070492 = class070722.u();
        if (class070492 instanceof class08036) {
            class08036 class080362 = (class08036)class070492;
            if (!class080362.method_31549().i) {
                return false;
            }
        }
        if (class070722.B()) {
            this.P();
            this.m();
            this.method_5768(class047822);
            return true;
        }
        long l = class047822.N();
        if (l - this.l <= 5L || bl2) {
            this.N(class047822, class070722);
            this.m();
            this.method_5768(class047822);
        } else {
            class047822.method_8421((class07049)this, (byte)32);
            this.method_32875((class03556)class01194.P, class070722.u());
            this.l = l;
        }
        return true;
    }

    public boolean method_5810() {
        return false;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Invisible", this.method_5767());
        class083292.N("Small", this.y());
        class083292.N("ShowArms", this.L());
        class083292.N("DisabledSlots", this.c);
        class083292.N("NoBasePlate", !this.u());
        if (this.i()) {
            class083292.N("Marker", this.i());
        }
        class083292.N("Pose", class00691.y, (Object)this.E());
    }

    public class06889 method_31166(float f) {
        if (this.i()) {
            class00734 class007342 = this.i(false).N(this.method_73189());
            class07209 class072092 = this.method_24515();
            int n = Integer.MIN_VALUE;
            for (class07209 class072093 : class07209.method_10097((class07209)class07209.method_49637((double)class007342.N, (double)class007342.y, (double)class007342.L), (class07209)class07209.method_49637((double)class007342.u, (double)class007342.i, (double)class007342.R))) {
                int n2 = Math.max(this.method_73183().method_8314(class00772.field_9282, class072093), this.method_73183().method_8314(class00772.field_9284, class072093));
                if (n2 == 15) {
                    return class06889.y((class00753)class072093);
                }
                if (n2 <= n) continue;
                n = n2;
                class072092 = class072093.method_10062();
            }
            return class06889.y((class00753)class072092);
        }
        return super.method_31166(f);
    }

    public boolean method_5863() {
        return super.method_5863() && !this.i();
    }

    public boolean method_5640(double d) {
        double d2 = this.method_5829().N() * 4.0;
        if (Double.isNaN(d2) || d2 == 0.0) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }

    public void method_5636(float f) {
        this.field_5982 = f;
        this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = Float.valueOf(this.field_5982);
        float f2 = f;
        this.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(f2);
        this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(f2);
    }

    public void method_5847(float f) {
        this.field_5982 = f;
        this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = Float.valueOf(this.field_5982);
        float f2 = f;
        this.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(f2);
        this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(f2);
    }

    public boolean method_6109() {
        return this.y();
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.method_5648(class082992.N("Invisible", false));
        this.L(class082992.N("Small", false));
        this.N(class082992.N("ShowArms", false));
        this.c = class082992.N("DisabledSlots", 0);
        this.y(class082992.N("NoBasePlate", false));
        this.u(class082992.N("Marker", false));
        this.field_5960 = !this.W();
        class082992.N("Pose", class00691.y).ifPresent(this::N);
    }

    public class07070 method_6068() {
        return class07070.field_6183;
    }

    public void method_5800(class04782 class047822, class00672 class006722) {
    }

    public void method_5711(byte by) {
        if (by == 32) {
            if (this.method_73183().method_8608()) {
                this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.NI, this.method_5634(), 0.3f, 1.0f, false);
                this.l = this.method_73183().N();
            }
        } else {
            super.method_5711(by);
        }
    }

    public void method_5648(boolean bl) {
        this.H = bl;
        super.method_5648(bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean method_5698(class07049 class070492) {
        if (!(class070492 instanceof class08036)) return false;
        class08036 class080362 = (class08036)class070492;
        if (this.method_73183().method_8505((class07049)class080362, this.method_24515())) return false;
        return true;
    }

    public class00681(class07078<? extends class00681> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class00681(class07299 class072992, double d, double d2, double d3) {
        this((class07078<? extends class00681>)class07078.B, class072992);
        this.method_5814(d, d2, d3);
    }

    public class00744 B() {
        return (class00744)this.field_6011.N(v);
    }

    public class00744 Z() {
        return (class00744)this.field_6011.N(n);
    }

    public boolean i() {
        return ((Byte)this.field_6011.N(T) & 0x10) != 0;
    }

    private class01325 i(boolean bl) {
        if (bl) {
            return w;
        }
        return this.method_6109() ? k : this.method_5864().E();
    }

    public void i(class00744 class007442) {
        this.field_6011.N(t, (Object)class007442);
    }

    private void m() {
        if (this.method_73183() instanceof class04782) {
            ((class04782)this.method_73183()).method_65096((class07126)new class07105(class07107.y, class00869.m.W()), this.method_23317(), this.method_23323(0.6666666666666666), this.method_23321(), 10, (double)(this.method_17681() / 4.0f), (double)(this.method_17682() / 4.0f), (double)(this.method_17681() / 4.0f), 0.05);
        }
    }

    public class00744 U() {
        return (class00744)this.field_6011.N(G);
    }

    public class00744 z() {
        return (class00744)this.field_6011.N(t);
    }

    public boolean u() {
        return ((Byte)this.field_6011.N(T) & 8) == 0;
    }

    private void u(boolean bl) {
        this.field_6011.N(T, (Object)this.N((Byte)this.field_6011.N(T), 16, bl));
    }

    public void u(class00744 class007442) {
        this.field_6011.N(n, (Object)class007442);
    }

    private void y(class04782 class047822, class07072 class070722) {
        this.P();
        this.method_16080(class047822, class070722);
        for (class07085 class070852 : class07085.field_54086) {
            class06584 class065842 = this.fields_13212a028292fd3c078969e3ee4c71d9e8_1.N(class070852, class06584.E);
            if (class065842.R()) continue;
            class00891.N_21((class07299)this.method_73183(), (class07209)this.method_24515().method_10084(), (class06584)class065842);
        }
    }

    public void y(class00744 class007442) {
        this.field_6011.N(j, (Object)class007442);
    }

    public void y(boolean bl) {
        this.field_6011.N(T, (Object)this.N((Byte)this.field_6011.N(T), 8, bl));
    }

    public boolean y() {
        return ((Byte)this.field_6011.N(T) & 1) != 0;
    }

    public class00691 E() {
        return new class00691(this.R(), this.M(), this.B(), this.Z(), this.z(), this.U());
    }

    private List N(class07299 class072992, class07049 class070492, class00734 class007342, Predicate predicate) {
        if (predicate == I) {
            return class072992.N(class07504.class, class007342, class075042 -> class075042 != class070492 && class075042.Z());
        }
        return class072992.method_8333(class070492, class007342, predicate);
    }

    public static class05300 N() {
        return class00681.method_26827().N(class05298.O, 0.0);
    }

    public void N(class00691 class006912) {
        this.N(class006912.N());
        this.y(class006912.y());
        this.L(class006912.L());
        this.u(class006912.u());
        this.i(class006912.i());
        this.R(class006912.R());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private class07085 N(class06889 class068892) {
        class07085 class070852 = class07085.field_6173;
        boolean bl = this.y();
        double d = class068892.B / (double)(this.method_55693() * this.method_17825());
        class07085 class070853 = class07085.field_6166;
        if (d >= 0.1) {
            double d2 = bl ? 0.8 : 0.45;
            if (d < 0.1 + d2 && this.method_6084(class070853)) {
                return class07085.field_6166;
            }
        }
        double d3 = bl ? 0.3 : 0.0;
        if (d >= 0.9 + d3) {
            double d4 = bl ? 1.0 : 0.7;
            if (d < 0.9 + d4 && this.method_6084(class07085.field_6174)) {
                return class07085.field_6174;
            }
        }
        if (d >= 0.4) {
            double d5 = bl ? 1.0 : 0.8;
            if (d < 0.4 + d5 && this.method_6084(class07085.field_6172)) {
                return class07085.field_6172;
            }
        }
        if (d >= 1.6 && this.method_6084(class07085.field_6169)) {
            return class07085.field_6169;
        }
        if (this.method_6084(class07085.field_6173)) return class070852;
        if (!this.method_6084(class07085.field_6171)) return class070852;
        return class07085.field_6171;
    }

    private void N(class04782 class047822, class07072 class070722) {
        class06584 class065842 = new class06584((class07310)class06570.GA);
        class065842.N(class02484.B, (Object)this.method_5797());
        class00891.N_21((class07299)this.method_73183(), (class07209)this.method_24515(), (class06584)class065842);
        this.y(class047822, class070722);
    }

    private void N(class04782 class047822, class07072 class070722, float f) {
        float f2 = this.method_6032();
        if ((f2 -= f) <= 0.5f) {
            this.y(class047822, class070722);
            this.method_5768(class047822);
        } else {
            this.method_6033(f2);
            this.method_32875((class03556)class01194.P, class070722.u());
        }
    }

    public void N(boolean bl) {
        this.field_6011.N(T, (Object)this.N((Byte)this.field_6011.N(T), 4, bl));
    }

    private byte N(byte by, int n, boolean bl) {
        by = bl ? (byte)(by | n) : (byte)(by & ~n);
        return by;
    }

    public void N(class00744 class007442) {
        this.field_6011.N(b, (Object)class007442);
    }

    private boolean N(class08036 class080362, class07085 class070852, class06584 class065842, class07050 class070502) {
        class06584 class065843 = this.method_6118(class070852);
        if (!class065843.R() && (this.c & 1 << class070852.y(8)) != 0) {
            return false;
        }
        if (class065843.R() && (this.c & 1 << class070852.y(16)) != 0) {
            return false;
        }
        if (class080362.method_56992() && class065843.R() && !class065842.R()) {
            this.method_5673(class070852, class065842.L(1));
            return true;
        }
        if (!class065842.R() && class065842.c() > 1) {
            if (!class065843.R()) {
                return false;
            }
            this.method_5673(class070852, class065842.N(1));
            return true;
        }
        this.method_5673(class070852, class065842);
        class080362.method_6122(class070502, class065843);
        return true;
    }

    private boolean N(class07085 class070852) {
        return (this.c & 1 << class070852.y(0)) != 0 || class070852.N() == class07043.field_6177 && !this.L();
    }

    private boolean W() {
        return !this.i() && !this.method_5740();
    }

    public class00744 R() {
        return (class00744)this.field_6011.N(b);
    }

    public void R(class00744 class007442) {
        this.field_6011.N(G, (Object)class007442);
    }

    public void method_6087(class07049 class070492) {
    }

    public void method_6031(float f) {
        this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = Float.valueOf(this.field_5982);
        this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.method_36454());
    }

    public void method_6027() {
        this.method_5648(this.H);
    }

    public @Nullable class04891 method_6002() {
        return class04909.NO;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.i(this.i());
    }

    public boolean method_36608() {
        return !this.method_5767() && !this.i();
    }

    public boolean method_6086() {
        return false;
    }

    public class07443 method_39760() {
        return new class07443(class04909.Ng, class04909.Ng);
    }

    public void method_6091(class06889 class068892) {
        if (!this.W()) {
            return;
        }
        super.method_6091(class068892);
    }

    public @Nullable class04891 method_6011(class07072 class070722) {
        return class04909.NI;
    }

    public void method_6070() {
        Predicate<class07049> var7 = I;
        class00734 class007342 = this.method_5829();
        class00681 class006812 = this;
        class07299 class072992 = this.method_73183();
        for (class07049 class070492 : this.N(class072992, (class07049)class006812, class007342, var7)) {
            if (!(this.method_5858(class070492) <= 0.2)) continue;
            class070492.method_5697((class07049)this);
        }
    }

    public boolean method_56991(class07085 class070852) {
        return class070852 != class07085.field_48824 && class070852 != class07085.field_55946 && !this.N(class070852);
    }

    public boolean method_6102() {
        return false;
    }
}

