/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09383
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class01210
 *  minecraft.class01217
 *  minecraft.class01317
 *  minecraft.class01328
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02329
 *  minecraft.class03289
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04499
 *  minecraft.class04770
 *  minecraft.class04774
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06685
 *  minecraft.class06702
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07150
 *  minecraft.class07172
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07328
 *  minecraft.class07438
 *  minecraft.class07460
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07513
 *  minecraft.class07623
 *  minecraft.class07952
 *  minecraft.class07956
 *  minecraft.class07962
 *  minecraft.class07977
 *  minecraft.class07984
 *  minecraft.class07989
 *  minecraft.class07991
 *  minecraft.class08007
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09383;
import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class01210;
import minecraft.class01217;
import minecraft.class01317;
import minecraft.class01328;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02329;
import minecraft.class03289;
import minecraft.class03696;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04499;
import minecraft.class04770;
import minecraft.class04774;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06685;
import minecraft.class06702;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07150;
import minecraft.class07172;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07328;
import minecraft.class07438;
import minecraft.class07460;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07513;
import minecraft.class07623;
import minecraft.class07952;
import minecraft.class07956;
import minecraft.class07962;
import minecraft.class07977;
import minecraft.class07984;
import minecraft.class07989;
import minecraft.class07991;
import minecraft.class08007;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class00680
extends class07150
implements class07172 {
    private static final class02131<Integer> N = class03289.N(class00680.class, (class04383)class02154.y);
    private static final class02131<Integer> y = class03289.N(class00680.class, (class04383)class02154.y);
    private static final class02131<Integer> L = class03289.N(class00680.class, (class04383)class02154.y);
    private static final List<class02131<Integer>> u = ImmutableList.of(N, y, L);
    private static final class02131<Integer> i = class03289.N(class00680.class, (class04383)class02154.y);
    private static final int R = 220;
    private static final int M = 0;
    private final float[] B = new float[2];
    private final float[] Z = new float[2];
    private final float[] W = new float[2];
    private final float[] T = new float[2];
    private final int[] b = new int[2];
    private final int[] X = new int[2];
    private int a;
    private final class04774 p = (class04774)new class04774(this.method_5476(), class06685.field_5783, class06702.field_5795).N(true);
    private static final class01317 F = (class074382, class047822) -> !class074382.method_5864().N(class01217.w) && class074382.method_6102();
    private static final class01328 A = class01328.N().N(20.0).N(F);

    private double L(int n) {
        if (n <= 0) {
            return this.method_23317();
        }
        float f = class04995.P((double)((((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() + (float)(180 * (n - 1))) * ((float)Math.PI / 180)));
        return this.method_23317() + (double)f * 1.3 * (double)this.method_55693();
    }

    public void M() {
        this.N(220);
        this.p.N(0.0f);
        this.method_6033(this.method_6063() / 3.0f);
    }

    public void method_5837(class04770 class047702) {
        super.method_5837(class047702);
        this.p.N(class047702);
    }

    public void method_5742(class04770 class047702) {
        super.method_5742(class047702);
        this.p.y(class047702);
    }

    public void method_5982() {
        if (this.method_73183().y() == class07086.field_5801 && !this.method_5864().b()) {
            this.method_31472();
            return;
        }
        ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)0);
        class042932.N(y, (Object)0);
        class042932.N(L, (Object)0);
        class042932.N(i, (Object)0);
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class07049 class070492;
        if (this.method_5679(class047822, class070722)) {
            return false;
        }
        if (class070722.N(class03696.v) || class070722.u() instanceof class00680) {
            return false;
        }
        if (this.m() > 0 && !class070722.N(class03696.u)) {
            return false;
        }
        if (this.v() && ((class070492 = class070722.L()) instanceof class08007 || class070492 instanceof class04499)) {
            return false;
        }
        class070492 = class070722.u();
        if (class070492 != null && class070492.method_5864().N(class01217.w)) {
            return false;
        }
        if (this.a <= 0) {
            this.a = 20;
        }
        int n = 0;
        while (n < this.X.length) {
            int n2 = n++;
            this.X[n2] = this.X[n2] + 3;
        }
        return super.method_64397(class047822, class070722, f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Invul", this.m());
    }

    public void method_5665(@Nullable class00392 class003922) {
        super.method_5665(class003922);
        this.p.N(this.method_5476());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("Invul", 0));
        if (this.method_16914()) {
            this.p.N(this.method_5476());
        }
    }

    protected boolean method_5860(class07049 class070492) {
        return false;
    }

    public boolean method_5822(boolean bl) {
        return false;
    }

    public void method_5844(class00500 class005002, class06889 class068892) {
    }

    public class00680(class07078<? extends class00680> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.q = new class07460((class07079)this, 10, false);
        this.method_6033(this.method_6063());
        this.J = 50;
    }

    public static class05300 B() {
        return class07150.Y().N(class05298.n, 300.0).N(class05298.l, (double)0.6f).N(class05298.m, (double)0.6f).N(class05298.P, 40.0).N(class05298.y, 4.0);
    }

    private double i(int n) {
        if (n <= 0) {
            return this.method_23321();
        }
        float f = class04995.m((double)((((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() + (float)(180 * (n - 1))) * ((float)Math.PI / 180)));
        return this.method_23321() + (double)f * 1.3 * (double)this.method_55693();
    }

    protected class04891 s() {
        return class04909.IA;
    }

    public int m() {
        return (Integer)this.field_6011.N(i);
    }

    public boolean v() {
        return this.method_6032() <= this.method_6063() / 2.0f;
    }

    private double u(int n) {
        float f = n <= 0 ? 3.0f : 2.2f;
        return this.method_23318() + (double)(f * this.method_55693());
    }

    public int y(int n) {
        return (Integer)this.field_6011.N(u.get(n));
    }

    public float[] E() {
        return this.Z;
    }

    public void N(int n) {
        this.field_6011.N(i, (Object)n);
    }

    public static boolean N(class00500 class005002) {
        return !class005002.P() && !class005002.N(class01210.NA);
    }

    private float N(float f, float f2, float f3) {
        float f4 = class04995.R((float)(f2 - f));
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    protected class07623 N(class07299 class072992) {
        class07991 class079912 = new class07991((class07079)this, class072992);
        class079912.y(false);
        class079912.N(true);
        return class079912;
    }

    public void N(int n, int n2) {
        this.field_6011.N(u.get(n), (Object)n2);
    }

    protected void N(class04782 class047822) {
        int n;
        int n2;
        if (this.m() > 0) {
            int n3 = this.m() - 1;
            this.p.N(1.0f - (float)n3 / 220.0f);
            if (n3 <= 0) {
                class047822.method_8537((class07049)this, this.method_23317(), this.method_23320(), this.method_23321(), 7.0f, false, class07328.field_40890);
                if (!this.method_5701()) {
                    class047822.method_8474(1023, this.method_24515(), 0);
                }
            }
            this.N(n3);
            if (this.field_6012 % 10 == 0) {
                this.method_6025(10.0f);
            }
            return;
        }
        super.N(class047822);
        for (n2 = 1; n2 < 3; ++n2) {
            if (this.field_6012 < this.b[n2 - 1]) continue;
            this.b[n2 - 1] = this.field_6012 + 10 + this.field_5974.y(10);
            if (class047822.y() == class07086.field_5802 || class047822.y() == class07086.field_5807) {
                int n4 = n2 - 1;
                int n5 = this.X[n4];
                this.X[n4] = n5 + 1;
                if (n5 > 15) {
                    float f = 10.0f;
                    float f2 = 5.0f;
                    double d = class04995.N((class06069)this.field_5974, (double)(this.method_23317() - 10.0), (double)(this.method_23317() + 10.0));
                    double d2 = class04995.N((class06069)this.field_5974, (double)(this.method_23318() - 5.0), (double)(this.method_23318() + 5.0));
                    double d3 = class04995.N((class06069)this.field_5974, (double)(this.method_23321() - 10.0), (double)(this.method_23321() + 10.0));
                    this.N(n2 + 1, d, d2, d3, true);
                    this.X[n2 - 1] = 0;
                }
            }
            if ((n = this.y(n2)) > 0) {
                class07438 class074382 = (class07438)class047822.method_8469(n);
                if (class074382 == null || !this.method_18395(class074382) || this.method_5858((class07049)class074382) > 900.0 || !this.method_6057((class07049)class074382)) {
                    this.N(n2, 0);
                    continue;
                }
                this.N(n2 + 1, class074382);
                this.b[n2 - 1] = this.field_6012 + 40 + this.field_5974.y(20);
                this.X[n2 - 1] = 0;
                continue;
            }
            List var4 = class047822.N(class07438.class, A, (class07438)this, this.method_5829().L(20.0, 8.0, 20.0));
            if (var4.isEmpty()) continue;
            class07438 class074383 = (class07438)var4.get(this.field_5974.y(var4.size()));
            this.N(n2, class074383.method_5628());
        }
        if (this.T() != null) {
            this.N(0, this.T().method_5628());
        } else {
            this.N(0, 0);
        }
        if (this.a > 0) {
            --this.a;
            if (this.a == 0 && ((Boolean)class047822.method_64395().N(class07305.I)).booleanValue()) {
                n2 = 0;
                n = class04995.y((float)(this.method_17681() / 2.0f + 1.0f));
                int n6 = class04995.y((float)this.method_17682());
                for (class07209 class072092 : class07209.method_10094((int)(this.method_31477() - n), (int)this.method_31478(), (int)(this.method_31479() - n), (int)(this.method_31477() + n), (int)(this.method_31478() + n6), (int)(this.method_31479() + n))) {
                    class00500 class005002 = class047822.method_8320(class072092);
                    if (!class00680.N(class005002)) continue;
                    n2 = class047822.N(class072092, true, (class07049)this) || n2 != 0 ? 1 : 0;
                }
                if (n2 != 0) {
                    class047822.method_8444(null, 1022, this.method_24515(), 0);
                }
            }
        }
        if (this.field_6012 % 20 == 0) {
            this.method_6025(1.0f);
        }
        this.p.N(this.method_6032() / this.method_6063());
    }

    private void N(int n, double d, double d2, double d3, boolean bl) {
        if (!this.method_5701()) {
            this.method_73183().method_8444(null, 1024, this.method_24515(), 0);
        }
        double d4 = this.L(n);
        double d5 = this.u(n);
        double d6 = this.i(n);
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        class06889 class068892 = new class06889(d7, d8, d9);
        class07513 class075132 = new class07513(this.method_73183(), (class07438)this, class068892.u());
        class075132.L((class07049)this);
        if (bl) {
            class075132.y(true);
        }
        class075132.method_5814(d4, d5, d6);
        this.method_73183().method_8649((class07049)class075132);
    }

    public void N(class07438 class074382, float f) {
        this.N(0, class074382);
    }

    private void N(int n, class07438 class074382) {
        this.N(n, class074382.method_23317(), class074382.method_23318() + (double)class074382.method_5751() * 0.5, class074382.method_23321(), n == 0 && this.field_5974.z() < 0.001f);
    }

    public float[] W() {
        return this.B;
    }

    protected void l_() {
        this.e.N(0, (class07473)new class09383(this));
        this.e.N(2, (class07473)new class07984((class07172)this, 1.0, 40, 20.0f));
        this.e.N(5, (class07473)new class07977((class07475)this, 1.0));
        this.e.N(6, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(7, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class07989((class07475)this, new Class[0]));
        this.H.N(2, (class07473)new class07952((class07079)this, class07438.class, 0, false, false, F));
    }

    public boolean method_6049(class07055 class070552) {
        if (class070552.N(class07047.v)) {
            return false;
        }
        return super.method_6049(class070552);
    }

    public class04891 method_6002() {
        return class04909.IC;
    }

    public void method_6007() {
        int n;
        class07049 class070492;
        class06889 class068892 = this.method_18798().u(1.0, 0.6, 1.0);
        if (!this.method_73183().method_8608() && this.y(0) > 0 && (class070492 = this.method_73183().method_8469(this.y(0))) != null) {
            double d = class068892.B;
            if (this.method_23318() < class070492.method_23318() || !this.v() && this.method_23318() < class070492.method_23318() + 5.0) {
                d = Math.max(0.0, d);
                d += 0.3 - d * (double)0.6f;
            }
            class068892 = new class06889(class068892.M, d, class068892.Z);
            class06889 class068893 = new class06889(class070492.method_23317() - this.method_23317(), 0.0, class070492.method_23321() - this.method_23321());
            if (class068893.z() > 9.0) {
                class06889 class068894 = class068893.u();
                class068892 = class068892.y(class068894.M * 0.3 - class068892.M * 0.6, 0.0, class068894.Z * 0.3 - class068892.Z * 0.6);
            }
        }
        this.method_18799(class068892);
        if (class068892.z() > 0.05) {
            this.method_36456((float)class04995.u((double)class068892.Z, (double)class068892.M) * 57.295776f - 90.0f);
        }
        super.method_6007();
        for (n = 0; n < 2; ++n) {
            this.T[n] = this.Z[n];
            this.W[n] = this.B[n];
        }
        for (n = 0; n < 2; ++n) {
            int n2 = this.y(n + 1);
            class07049 class070493 = null;
            if (n2 > 0) {
                class070493 = this.method_73183().method_8469(n2);
            }
            if (class070493 != null) {
                double d = this.L(n + 1);
                double d2 = this.u(n + 1);
                double d3 = this.i(n + 1);
                double d4 = class070493.method_23317() - d;
                double d5 = class070493.method_23320() - d2;
                double d6 = class070493.method_23321() - d3;
                double d7 = Math.sqrt(d4 * d4 + d6 * d6);
                float f = (float)(class04995.u((double)d6, (double)d4) * 57.2957763671875) - 90.0f;
                float f2 = (float)(-(class04995.u((double)d5, (double)d7) * 57.2957763671875));
                this.B[n] = this.N(this.B[n], f2, 40.0f);
                this.Z[n] = this.N(this.Z[n], f, 10.0f);
                continue;
            }
            this.Z[n] = this.N(this.Z[n], ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue(), 10.0f);
        }
        n = this.v() ? 1 : 0;
        for (int i = 0; i < 3; ++i) {
            double d = this.L(i);
            double d8 = this.u(i);
            double d9 = this.i(i);
            float f = 0.3f * this.method_55693();
            this.method_73183().method_8406((class07126)class07107.NZ, d + this.field_5974.E() * (double)f, d8 + this.field_5974.E() * (double)f, d9 + this.field_5974.E() * (double)f, 0.0, 0.0, 0.0);
            if (n == 0 || this.method_73183().field_9229.y(4) != 0) continue;
            this.method_73183().method_8406((class07126)class02329.N((class07103)class07107.t, (float)0.7f, (float)0.7f, (float)0.5f), d + this.field_5974.E() * (double)f, d8 + this.field_5974.E() * (double)f, d9 + this.field_5974.E() * (double)f, 0.0, 0.0, 0.0);
        }
        if (this.m() > 0) {
            float f = 3.3f * this.method_55693();
            for (int i = 0; i < 3; ++i) {
                this.method_73183().method_8406((class07126)class02329.N((class07103)class07107.t, (float)0.7f, (float)0.7f, (float)0.9f), this.method_23317() + this.field_5974.E(), this.method_23318() + (double)(this.field_5974.z() * f), this.method_23321() + this.field_5974.E(), 0.0, 0.0, 0.0);
            }
        }
    }

    public boolean method_37222(class07055 class070552, @Nullable class07049 class070492) {
        return false;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.IS;
    }

    public void method_6099(class04782 class047822, class07072 class070722, boolean bl) {
        super.method_6099(class047822, class070722, bl);
        class00717 class007172 = this.method_5706(class047822, (class07310)class06570.Gg);
        if (class007172 != null) {
            class007172.B();
        }
    }
}

