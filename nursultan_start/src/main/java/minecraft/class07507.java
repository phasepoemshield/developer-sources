/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class03696
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07307
 *  minecraft.class07310
 *  minecraft.class07328
 *  minecraft.class08005
 *  minecraft.class08007
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class03696;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07307;
import minecraft.class07310;
import minecraft.class07328;
import minecraft.class07504;
import minecraft.class08005;
import minecraft.class08007;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07507
extends class07504 {
    private static final byte y = 10;
    private static final String L = "explosion_power";
    private static final String u = "explosion_speed_factor";
    private static final String B = "fuse";
    private static final float Z = 4.0f;
    private static final float z = 1.0f;
    private static final int U = -1;
    private @Nullable class07072 E;
    private int W = -1;
    private float m = 4.0f;
    private float P = 1.0f;

    private static boolean L(class07072 class070722) {
        class07049 class070492 = class070722.L();
        if (class070492 instanceof class08005) {
            return ((class08005)class070492).method_5809();
        }
        return class070722.N(class03696.Z) || class070722.N(class03696.E);
    }

    public boolean method_5853(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, float f) {
        if (this.E() && (class005002.N(class01210.e) || class072902.method_8320(class072092.method_10084()).N(class01210.e))) {
            return false;
        }
        return super.method_5853(class073072, class072902, class072092, class005002, f);
    }

    public float method_5774(class07307 class073072, class07290 class072902, class07209 class072092, class00500 class005002, class04688 class046882, float f) {
        if (this.E() && (class005002.N(class01210.e) || class072902.method_8320(class072092.method_10084()).N(class01210.e))) {
            return 0.0f;
        }
        return super.method_5774(class073072, class072902, class072092, class005002, class046882, f);
    }

    @Override
    public class06584 method_31480() {
        return new class06584((class07310)class06570.sE);
    }

    @Override
    public void method_5773() {
        double d;
        super.method_5773();
        if (this.W > 0) {
            --this.W;
            this.method_73183().method_8406((class07126)class07107.NZ, this.method_23317(), this.method_23318() + 0.5, this.method_23321(), 0.0, 0.0, 0.0);
        } else if (this.W == 0) {
            this.N(this.E, this.method_18798().z());
        }
        if (this.field_5976 && (d = this.method_18798().z()) >= (double)0.01f) {
            this.N(this.E, d);
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class08007 class080072;
        class07049 class070492 = class070722.L();
        if (class070492 instanceof class08007 && (class080072 = (class08007)class070492).method_5809()) {
            class07072 class070723 = this.method_48923().u((class07049)this, class070722.u());
            this.N(class070723, class080072.method_18798().B());
        }
        return super.method_64397(class047822, class070722, f);
    }

    public boolean method_5747(double d, float f, class07072 class070722) {
        if (d >= 3.0) {
            double d2 = d / 10.0;
            this.N(this.E, d2 * d2);
        }
        return super.method_5747(d, f, class070722);
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N(B, this.W);
        if (this.m != 4.0f) {
            class083292.N(L, this.m);
        }
        if (this.P != 1.0f) {
            class083292.N(u, this.P);
        }
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.W = class082992.N(B, -1);
        this.m = class04995.N((float)class082992.N(L, 4.0f), (float)0.0f, (float)128.0f);
        this.P = class04995.N((float)class082992.N(u, 1.0f), (float)0.0f, (float)128.0f);
    }

    public void method_5711(byte by) {
        if (by == 10) {
            this.N((class07072)null);
        } else {
            super.method_5711(by);
        }
    }

    public class07507(class07078<? extends class07507> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public int U() {
        return this.W;
    }

    protected class06581 z() {
        return class06570.sE;
    }

    protected boolean y(class07072 class070722) {
        return class07507.L(class070722);
    }

    public boolean E() {
        return this.W > -1;
    }

    @Override
    public void N(class04782 class047822, int n, int n2, int n3, boolean bl) {
        if (bl && this.W < 0) {
            this.N((class07072)null);
        }
    }

    public void N(class04782 class047822, class07072 class070722) {
        double d = this.method_18798().z();
        if (class07507.L(class070722) || d >= (double)0.01f) {
            if (this.W < 0) {
                this.N(class070722);
                this.W = this.field_5974.y(20) + this.field_5974.y(20);
            }
            return;
        }
        this.N(class047822, this.z());
    }

    public void N(@Nullable class07072 class070722) {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782 && !((Boolean)((class04782)class072992).method_64395().N(class07305.Nu)).booleanValue()) {
            return;
        }
        this.W = 80;
        if (!this.method_73183().method_8608()) {
            if (class070722 != null && this.E == null) {
                this.E = this.method_48923().u((class07049)this, class070722.u());
            }
            this.method_73183().method_8421((class07049)this, (byte)10);
            if (!this.method_5701()) {
                this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.Qp, class04911.field_15245, 1.0f, 1.0f);
            }
        }
    }

    protected void N(@Nullable class07072 class070722, double d) {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (((Boolean)class047822.method_64395().N(class07305.Nu)).booleanValue()) {
                double d2 = Math.min(Math.sqrt(d), 5.0);
                class047822.method_55117((class07049)this, class070722, null, this.method_23317(), this.method_23318(), this.method_23321(), (float)((double)this.m + (double)this.P * this.field_5974.U() * 1.5 * d2), false, class07328.field_40891);
                this.method_31472();
            } else if (this.E()) {
                this.method_31472();
            }
        }
    }

    @Override
    public class00500 R() {
        return class00869.Ln.W();
    }
}

