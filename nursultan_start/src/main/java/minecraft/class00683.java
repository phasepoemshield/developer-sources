/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09384
 *  Nursultan.class09386
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01226
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03810
 *  minecraft.class03831
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07172
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07434
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07459
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07536
 *  minecraft.class07633
 *  minecraft.class07862
 *  minecraft.class07877
 *  minecraft.class07951
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07959
 *  minecraft.class07960
 *  minecraft.class07962
 *  minecraft.class07984
 *  minecraft.class07993
 *  minecraft.class08005
 *  minecraft.class08021
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09384;
import Nursultan.class09386;
import minecraft.class00500;
import minecraft.class00704;
import minecraft.class00718;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01226;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03810;
import minecraft.class03831;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07172;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07434;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07459;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07536;
import minecraft.class07633;
import minecraft.class07862;
import minecraft.class07877;
import minecraft.class07951;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07959;
import minecraft.class07960;
import minecraft.class07962;
import minecraft.class07984;
import minecraft.class07993;
import minecraft.class08005;
import minecraft.class08021;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class00683
extends class07877
implements class07172 {
    private static final int C = 5;
    private static final class02131<Integer> S = class03289.N(class00683.class, (class04383)class02154.y);
    private static final class02131<Integer> x = class03289.N(class00683.class, (class04383)class02154.y);
    private static final class01325 D = class07078.NQ.E().N(class03810.N().N(class03831.field_47743, 0.0f, class07078.NQ.U() - 0.8125f, -0.3f)).N(0.5f);
    public boolean f;
    private @Nullable class00683 h;
    private @Nullable class00683 r;

    protected double NY() {
        return 2.0;
    }

    protected boolean L(class08036 class080362, class06584 class065842) {
        int n = 0;
        int n2 = 0;
        float f = 0.0f;
        boolean bl = false;
        if (class065842.N(class06570.bL)) {
            n = 10;
            n2 = 3;
            f = 2.0f;
        } else if (class065842.N(class00869.zy.B())) {
            n = 90;
            n2 = 6;
            f = 10.0f;
            if (this.I() && this.K() == 0 && this.T_()) {
                bl = true;
                this.i(class080362);
            }
        }
        if (this.method_6032() < this.method_6063() && f > 0.0f) {
            this.method_6025(f);
            bl = true;
        }
        if (this.method_6109() && n > 0) {
            this.method_73183().method_8406((class07126)class07107.F, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), 0.0, 0.0, 0.0);
            if (!this.method_73183().method_8608()) {
                this.L(n);
                bl = true;
            }
        }
        if (!(n2 <= 0 || !bl && this.I() || this.Ng() >= this.NV() || this.method_73183().method_8608())) {
            this.z(n2);
            bl = true;
        }
        if (bl && !this.method_5701() && this.G() != null) {
            this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), this.G(), this.method_5634(), 1.0f, 1.0f + (this.field_5974.z() - this.field_5974.z()) * 0.2f);
        }
        return bl;
    }

    protected void L(class04782 class047822) {
        if (!this.yi() && this.method_6109()) {
            super.L(class047822);
        }
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.NS);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(S, (Object)0);
        class042932.N(x, (Object)0);
    }

    public boolean method_5747(double d, float f, class07072 class070722) {
        int n = this.method_23329(d, f);
        if (n <= 0) {
            return false;
        }
        if (d >= 6.0) {
            this.method_64419(class070722, n);
            this.method_67345(d, f, class070722);
        }
        this.method_23328();
        return true;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.Ts, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Variant", class00704.field_56660, (Object)this.yN());
        class083292.N("Strength", this.Nh());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.NS) {
            return (T)class00683.method_66651(class024772, (Object)((Object)this.yN()));
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        this.E(class082992.N("Strength", 0));
        super.method_5749(class082992);
        this.N(class082992.N("Variant", class00704.field_56660).orElse(class00704.field_57635));
    }

    protected class06889 method_52533(class07049 class070492, class01325 class013252, float f) {
        return class00683.method_55665((class07049)this, (class07049)class070492, (class03810)class013252.u());
    }

    public class00683(class07078<? extends class00683> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.f().N(40.0f);
    }

    private void i(class07438 class074382) {
        class08021 class080212 = new class08021(this.method_73183(), this);
        double d = class074382.method_23317() - this.method_23317();
        double d2 = class074382.method_23323(0.3333333333333333) - class080212.method_23318();
        double d3 = class074382.method_23321() - this.method_23321();
        double d4 = Math.sqrt(d * d + d3 * d3) * (double)0.2f;
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class08005.N((class08005)class080212, (class04782)class047822, (class06584)class06584.E, (double)d, (double)(d2 + d4), (double)d3, (float)1.5f, (float)10.0f);
        }
        if (!this.method_5701()) {
            this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.TP, this.method_5634(), 1.0f, 1.0f + (this.field_5974.z() - this.field_5974.z()) * 0.2f);
        }
        this.f = true;
    }

    protected class04891 s() {
        return class04909.TZ;
    }

    protected void l() {
        this.method_5783(class04909.TU, 1.0f, (this.field_5974.z() - this.field_5974.z()) * 0.2f + 1.0f);
    }

    public void U(boolean bl) {
        this.f = bl;
    }

    private void y(class06069 class060692) {
        int n = class060692.z() < 0.04f ? 5 : 3;
        this.E(1 + class060692.y(n));
    }

    private void E(int n) {
        this.field_6011.N(S, (Object)Math.max(1, Math.min(5, n)));
    }

    private void N(class00704 class007042) {
        this.field_6011.N(x, (Object)class007042.field_41592);
    }

    public boolean N(class07633 class076332) {
        return class076332 != this && class076332 instanceof class00683 && this.NS() && ((class00683)class076332).NS();
    }

    public @Nullable class00683 y(class04782 class047822, class07077 class070772) {
        class00683 class006832 = this.yy();
        if (class006832 != null) {
            this.N(class070772, (class07862)class006832);
            class00683 class006833 = (class00683)class070772;
            int n = this.field_5974.y(Math.max(this.Nh(), class006833.Nh())) + 1;
            if (this.field_5974.z() < 0.03f) {
                ++n;
            }
            class006832.E(n);
            class006832.N(this.field_5974.Z() ? this.yN() : class006833.yN());
        }
        return class006832;
    }

    public void N(class00683 class006832) {
        this.h = class006832;
        this.h.r = this;
    }

    public void N(class07438 class074382, float f) {
        this.i(class074382);
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.NS);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class00704 class007042;
        class06069 class060692 = class010012.method_8409();
        this.y(class060692);
        if (class074462 instanceof class09384) {
            class007042 = ((class09384)class074462).N;
        } else {
            class007042 = (class00704)((Object)class07536.N((Object[])class00704.values(), (class06069)class060692));
            class074462 = new class09384(class007042);
        }
        this.N(class007042);
        return super.N(class010012, class070522, class061132, class074462);
    }

    public boolean yi() {
        return this.h != null;
    }

    public boolean yu() {
        return this.r != null;
    }

    public boolean ND() {
        return false;
    }

    protected class04891 G() {
        return class04909.TW;
    }

    public @Nullable class00683 yR() {
        return this.h;
    }

    public boolean aa_() {
        return false;
    }

    public class06889 ac_() {
        return new class06889(0.0, 0.75 * (double)this.method_5751(), (double)this.method_17681() * 0.5);
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.NS) {
            this.N((class00704)((Object)class00683.method_66651((class02477)class02484.NS, t)));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    protected void l_() {
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class07959((class07862)this, 1.2));
        this.e.N(2, (class07473)new class07951(this, (double)2.1f));
        this.e.N(3, (class07473)new class07984((class07172)this, 1.25, 40, 20.0f));
        this.e.N(3, (class07473)new class07993((class07475)this, 1.2));
        this.e.N(4, (class07473)new class07434((class07633)this, 1.0));
        this.e.N(5, (class07473)new class07960((class07475)this, 1.25, class065842 -> class065842.N(class01226.Nx), false));
        this.e.N(6, (class07473)new class07459((class07633)this, 1.0));
        this.e.N(7, (class07473)new class07957((class07475)this, 0.7));
        this.e.N(8, (class07473)new class07962((class07079)this, class08036.class, 6.0f));
        this.e.N(9, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class09386(this));
        this.H.N(2, (class07473)new class00718(this));
    }

    public int N_() {
        return this.v() ? this.Nh() : 0;
    }

    public static class05300 Nr() {
        return class00683.W();
    }

    public int Nh() {
        return (Integer)this.field_6011.N(S);
    }

    public void yL() {
        if (this.h != null) {
            this.h.r = null;
        }
        this.h = null;
    }

    protected @Nullable class00683 yy() {
        return (class00683)class07078.NQ.N(this.method_73183(), class06113.field_16466);
    }

    public boolean Np() {
        return false;
    }

    public class00704 yN() {
        return class00704.N((Integer)this.field_6011.N(x));
    }

    public int NV() {
        return 30;
    }

    protected boolean Nq() {
        return false;
    }

    public class04891 method_6002() {
        return class04909.TE;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? D : super.method_55694(class013122);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Tm;
    }

    public boolean method_56991(class07085 class070852) {
        return true;
    }

    public boolean method_6062() {
        return this.method_29504() || this.o();
    }

    protected class04891 M_() {
        return class04909.Tz;
    }
}

