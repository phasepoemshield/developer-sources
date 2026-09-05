/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00250
 *  minecraft.class00500
 *  minecraft.class00675
 *  minecraft.class00734
 *  minecraft.class01194
 *  minecraft.class01217
 *  minecraft.class02329
 *  minecraft.class03556
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04882
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class06171
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07427
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07625
 *  minecraft.class07952
 *  minecraft.class07957
 *  minecraft.class07962
 *  minecraft.class07989
 *  minecraft.class07999
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class00250;
import minecraft.class00500;
import minecraft.class00675;
import minecraft.class00734;
import minecraft.class01194;
import minecraft.class01217;
import minecraft.class02329;
import minecraft.class03556;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04882;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class06171;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07131;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07427;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07625;
import minecraft.class07952;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07989;
import minecraft.class07999;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07153
extends class04882 {
    private static final Predicate<class07049> R = class070492 -> !(class070492 instanceof class07153) && class070492.method_5805();
    private static final Predicate<class07049> M = class070492 -> R.test((class07049)class070492) && !class070492.method_5864().equals(class07078.B);
    private static final Predicate<class07438> B = class074382 -> !(class074382 instanceof class07153) && class074382.method_5805() && class074382.method_66247();
    private static final double Z = 0.3;
    private static final double W = 0.35;
    private static final int T = 8356754;
    private static final float b = 0.57254905f;
    private static final float X = 0.5137255f;
    private static final float a = 0.49803922f;
    public static final int N = 10;
    public static final int y = 40;
    private static final int p = 0;
    private static final int F = 0;
    private static final int A = 0;
    private int f = 0;
    private int C = 0;
    private int S = 0;

    private void L(class07049 class070492) {
        double d = class070492.method_23317() - this.method_23317();
        double d2 = class070492.method_23321() - this.method_23321();
        double d3 = Math.max(d * d + d2 * d2, 0.001);
        class070492.method_5762(d / d3 * 4.0, 0.2, d2 / d3 * 4.0);
    }

    public static class05300 M() {
        return class07150.Y().N(class05298.n, 100.0).N(class05298.l, 0.3).N(class05298.b, 0.75).N(class05298.u, 12.0).N(class05298.i, 1.5).N(class05298.P, 32.0).N(class05298.O, 1.0);
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.lf, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("AttackTick", this.f);
        class083292.N("StunTick", this.C);
        class083292.N("RoarTick", this.S);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.f = class082992.N("AttackTick", 0);
        this.C = class082992.N("StunTick", 0);
        this.S = class082992.N("RoarTick", 0);
    }

    public void method_5711(byte by) {
        if (by == 4) {
            this.f = 10;
            this.method_5783(class04909.la, 1.0f, 1.0f);
        } else if (by == 39) {
            this.C = 40;
        } else if (by == 69) {
            this.NJ();
            this.G();
        }
        super.method_5711(by);
    }

    public class07153(class07078<? extends class07153> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 20;
        this.N(class04425.field_6, 0.0f);
    }

    public int B() {
        return this.f;
    }

    protected @Nullable class04891 s() {
        return class04909.lX;
    }

    private void n() {
        if (this.field_5974.y(6) == 0) {
            double d = this.method_23317() - (double)this.method_17681() * Math.sin(((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * ((float)Math.PI / 180)) + (this.field_5974.U() * 0.6 - 0.3);
            double d2 = this.method_23318() + (double)this.method_17682() - 0.3;
            double d3 = this.method_23321() + (double)this.method_17681() * Math.cos(((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * ((float)Math.PI / 180)) + (this.field_5974.U() * 0.6 - 0.3);
            this.method_73183().method_8406((class07126)class02329.N(class07107.t, (float)0.49803922f, (float)0.5137255f, (float)0.57254905f), d, d2, d3, 0.0, 0.0, 0.0);
        }
    }

    public int m() {
        return this.S;
    }

    private void t() {
        Object object;
        if (this.method_5805() && (object = this.method_73183()) instanceof class04782) {
            class04782 class047822 = (class04782)object;
            object = (Boolean)class047822.method_64395().N(class07305.I) != false ? R : M;
            for (class07438 class074382 : this.method_73183().N(class07438.class, this.method_5829().M(4.0), (Predicate)object)) {
                if (!(class074382 instanceof class00675)) {
                    class074382.method_64397(class047822, this.method_48923().y((class07438)this), 6.0f);
                }
                if (class074382 instanceof class08036) continue;
                this.L((class07049)class074382);
            }
            this.method_32876((class03556)class01194.n);
            class047822.method_8421((class07049)this, (byte)69);
        }
    }

    public boolean v() {
        return false;
    }

    protected void r() {
        boolean bl = !(this.method_5642() instanceof class07079) || this.method_5642().method_5864().N(class01217.L);
        boolean bl2 = !(this.method_5854() instanceof class00250);
        this.e.N(class07430.field_18405, bl);
        this.e.N(class07430.field_18407, bl && bl2);
        this.e.N(class07430.field_18406, bl);
        this.e.N(class07430.field_18408, bl);
    }

    protected class00734 y(double d) {
        return super.y(d).R(0.05, 0.0, 0.05);
    }

    public class04891 E() {
        return class04909.lp;
    }

    public boolean N(class05487 class054872) {
        return !class054872.u(this.method_5829());
    }

    public void N(class04782 class047822, int n, boolean bl) {
    }

    public int W() {
        return this.C;
    }

    private void G() {
        for (class07438 class074382 : this.method_73183().N(class07438.class, this.method_5829().M(4.0), B)) {
            this.L((class07049)class074382);
        }
    }

    public int NR() {
        return 45;
    }

    protected void l_() {
        super.l_();
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(4, (class07473)new class07999((class07475)this, 1.0, true));
        this.e.N(5, (class07473)new class07957((class07475)this, 0.4));
        this.e.N(6, (class07473)new class07962((class07079)this, class08036.class, 6.0f));
        this.e.N(10, (class07473)new class07962((class07079)this, class07079.class, 8.0f));
        this.H.N(2, (class07473)new class07989((class07475)this, new Class[]{class04882.class}).N(new Class[0]));
        this.H.N(3, (class07473)new class07952((class07079)this, class08036.class, true));
        this.H.N(4, (class07473)new class07952((class07079)this, class06171.class, true, (class074382, class047822) -> !class074382.method_6109()));
        this.H.N(4, (class07473)new class07952((class07079)this, class07625.class, true));
    }

    private void NJ() {
        class06889 class068892 = this.method_5829().R();
        for (int i = 0; i < 40; ++i) {
            double d = this.field_5974.E() * 0.2;
            double d2 = this.field_5974.E() * 0.2;
            double d3 = this.field_5974.E() * 0.2;
            this.method_73183().method_8406((class07126)class07107.NR, class068892.M, class068892.B, class068892.Z, d, d2, d3);
        }
    }

    public boolean method_6057(class07049 class070492) {
        if (this.C > 0 || this.S > 0) {
            return false;
        }
        return super.method_6057(class070492);
    }

    public class04891 method_6002() {
        return class04909.lF;
    }

    public void method_6007() {
        super.method_6007();
        if (!this.method_5805()) {
            return;
        }
        if (this.method_6062()) {
            this.method_5996(class05298.l).N(0.0);
        } else {
            double d = this.T() != null ? 0.35 : 0.3;
            double d2 = this.method_5996(class05298.l).y();
            this.method_5996(class05298.l).N(class04995.u((double)0.1, (double)d2, (double)d));
        }
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (this.field_5976 && ((Boolean)class047822.method_64395().N(class07305.I)).booleanValue()) {
                boolean bl = false;
                class00734 class007342 = this.method_5829().M(0.2);
                for (class07209 class072092 : class07209.method_10094(class04995.N((double)class007342.N), class04995.N((double)class007342.y), class04995.N((double)class007342.L), class04995.N((double)class007342.u), class04995.N((double)class007342.i), class04995.N((double)class007342.R))) {
                    if (!(class047822.method_8320(class072092).i() instanceof class07131)) continue;
                    bl = class047822.N(class072092, true, (class07049)this) || bl;
                }
                if (!bl && this.method_24828()) {
                    this.method_6043();
                }
            }
        }
        if (this.S > 0) {
            --this.S;
            if (this.S == 10) {
                this.t();
            }
        }
        if (this.f > 0) {
            --this.f;
        }
        if (this.C > 0) {
            --this.C;
            this.n();
            if (this.C == 0) {
                this.method_5783(class04909.lS, 1.0f, 1.0f);
                this.S = 20;
            }
        }
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        this.f = 10;
        class047822.method_8421((class07049)this, (byte)4);
        this.method_5783(class04909.la, 1.0f, 1.0f);
        return super.method_6121(class047822, class070492);
    }

    public void method_6060(class07438 class074382) {
        if (this.S == 0) {
            if (this.field_5974.U() < 0.5) {
                this.C = 40;
                this.method_5783(class04909.lC, 1.0f, 1.0f);
                this.method_73183().method_8421((class07049)this, (byte)39);
                class074382.method_5697((class07049)this);
            } else {
                this.L((class07049)class074382);
            }
            class074382.field_6037 = true;
        }
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.lA;
    }

    public boolean method_6062() {
        return super.method_6062() || this.f > 0 || this.C > 0 || this.S > 0;
    }
}

