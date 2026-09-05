/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10714
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01312
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07134
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07434
 *  minecraft.class07446
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07628
 *  minecraft.class07633
 *  minecraft.class07872
 *  minecraft.class07952
 *  minecraft.class07957
 *  minecraft.class07962
 *  minecraft.class07982
 *  minecraft.class07983
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10714;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01312;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06101;
import minecraft.class06113;
import minecraft.class06117;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07134;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07434;
import minecraft.class07446;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07628;
import minecraft.class07633;
import minecraft.class07872;
import minecraft.class07952;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07982;
import minecraft.class07983;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class06129
extends class07633 {
    public static final double N = 0.6;
    public static final double y = 0.8;
    public static final double L = 1.33;
    private static final class02131<Boolean> u = class03289.N(class06129.class, (class04383)class02154.U);
    private static final boolean i = false;
    private @Nullable class06117<class08036> R;
    private @Nullable class06101 M;

    private void M(boolean bl) {
        class07134 class071342 = class07107.f;
        if (!bl) {
            class071342 = class07107.NZ;
        }
        for (int i = 0; i < 7; ++i) {
            double d = this.field_5974.E() * 0.02;
            double d2 = this.field_5974.E() * 0.02;
            double d3 = this.field_5974.E() * 0.02;
            this.method_73183().method_8406((class07126)class071342, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d, d2, d3);
        }
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(u, (Object)false);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Trusting", this.B());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("Trusting", false));
    }

    public void method_5711(byte by) {
        if (by == 41) {
            this.M(true);
        } else if (by == 40) {
            this.M(false);
        } else {
            super.method_5711(by);
        }
    }

    public boolean method_21749() {
        return this.method_18276() || super.method_21749();
    }

    public class06129(class07078<? extends class06129> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.m();
    }

    boolean B() {
        return (Boolean)this.field_6011.N(u);
    }

    protected @Nullable class04891 s() {
        return class04909.nF;
    }

    protected void m() {
        if (this.R == null) {
            this.R = new class06117<class08036>(this, class08036.class, 16.0f, 0.8, 1.33);
        }
        this.e.N(this.R);
        if (!this.B()) {
            this.e.N(4, this.R);
        }
    }

    public static boolean N(class07078<class06129> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class060692.y(3) != 0;
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.ND);
    }

    public @Nullable class06129 y(class04782 class047822, class07077 class070772) {
        return (class06129)class07078.Na.N((class07299)class047822, class06113.field_16466);
    }

    public boolean N(class05487 class054872) {
        if (class054872.method_8606((class07049)this) && !class054872.u(this.method_5829())) {
            class07209 class072092 = this.method_24515();
            if (class072092.method_10264() < class054872.method_8615()) {
                return false;
            }
            class00500 class005002 = class054872.method_8320(class072092.method_10074());
            if (class005002.N(class00869.Z) || class005002.N(class01210.H)) {
                return true;
            }
        }
        return false;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (class074462 == null) {
            class074462 = new class10714(1.0f);
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if ((this.M == null || this.M.U()) && !this.B() && this.N(class065842) && class080362.method_5858((class07049)this) < 9.0) {
            this.N(class080362, class070502, class065842);
            if (!this.method_73183().method_8608()) {
                if (this.field_5974.y(3) == 0) {
                    this.N(true);
                    this.M(true);
                    this.method_73183().method_8421((class07049)this, (byte)41);
                } else {
                    this.M(false);
                    this.method_73183().method_8421((class07049)this, (byte)40);
                }
            }
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    public boolean N(double d) {
        return !this.B() && this.field_6012 > 2400;
    }

    public void N(class04782 class047822) {
        if (this.F().y()) {
            double d = this.F().L();
            if (d == 0.6) {
                this.method_18380(class01312.field_18081);
                this.method_5728(false);
            } else if (d == 1.33) {
                this.method_18380(class01312.field_18076);
                this.method_5728(true);
            } else {
                this.method_18380(class01312.field_18076);
                this.method_5728(false);
            }
        } else {
            this.method_18380(class01312.field_18076);
            this.method_5728(false);
        }
    }

    private void N(boolean bl) {
        this.field_6011.N(u, (Object)bl);
        this.m();
    }

    public static class05300 W() {
        return class07633.Ne().N(class05298.n, 10.0).N(class05298.l, (double)0.3f).N(class05298.u, 3.0);
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)(0.5f * this.method_5751()), (double)(this.method_17681() * 0.4f));
    }

    public int m_() {
        return 900;
    }

    protected void l_() {
        this.M = new class06101(this, 0.6, class065842 -> class065842.N(class01226.ND), true);
        this.e.N(1, (class07473)new class07427((class07079)this));
        this.e.N(3, (class07473)this.M);
        this.e.N(7, (class07473)new class07982((class07079)this, 0.3f));
        this.e.N(8, (class07473)new class07983((class07079)this));
        this.e.N(9, (class07473)new class07434((class07633)this, 0.8));
        this.e.N(10, (class07473)new class07957((class07475)this, 0.8, 1.0000001E-5f));
        this.e.N(11, (class07473)new class07962((class07079)this, class08036.class, 10.0f));
        this.H.N(1, (class07473)new class07952((class07079)this, class07628.class, false));
        this.H.N(1, (class07473)new class07952((class07079)this, class07872.class, 10, false, false, class07872.y));
    }

    public class04891 method_6002() {
        return class04909.nA;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.np;
    }
}

