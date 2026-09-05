/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10714
 *  minecraft.class00500
 *  minecraft.class01001
 *  minecraft.class01210
 *  minecraft.class01251
 *  minecraft.class01279
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01517
 *  minecraft.class02131
 *  minecraft.class02135
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03557
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06165
 *  minecraft.class06584
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07459
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07633
 *  minecraft.class07952
 *  minecraft.class07956
 *  minecraft.class07962
 *  minecraft.class07978
 *  minecraft.class07993
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10714;
import minecraft.class00500;
import minecraft.class01001;
import minecraft.class01210;
import minecraft.class01251;
import minecraft.class01279;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01517;
import minecraft.class02131;
import minecraft.class02135;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03557;
import minecraft.class03696;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06165;
import minecraft.class06584;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07459;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07633;
import minecraft.class07875;
import minecraft.class07887;
import minecraft.class07898;
import minecraft.class07952;
import minecraft.class07956;
import minecraft.class07962;
import minecraft.class07978;
import minecraft.class07993;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import org.jspecify.annotations.Nullable;

public class class07869
extends class07633
implements class01279 {
    private static final class02131<Boolean> N = class03289.N(class07869.class, (class04383)class02154.U);
    private static final float y = 6.0f;
    private float L;
    private float u;
    private int i;
    private static final class02135 R = class01517.N((int)20, (int)39);
    private long M;
    private @Nullable class08372<class07438> B;

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)false);
    }

    public void method_5773() {
        super.method_5773();
        if (this.method_73183().method_8608()) {
            if (this.u != this.L) {
                this.method_18382();
            }
            this.L = this.u;
            this.u = this.n() ? class04995.N((float)(this.u + 1.0f), (float)0.0f, (float)6.0f) : class04995.N((float)(this.u - 1.0f), (float)0.0f, (float)6.0f);
        }
        if (this.i > 0) {
            --this.i;
        }
        if (!this.method_73183().method_8608()) {
            this.N((class04782)this.method_73183(), true);
        }
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.lW, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        this.N(class083292);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(this.method_73183(), class082992);
    }

    public class07869(class07078<? extends class07869> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class04891 s() {
        if (this.method_6109()) {
            return class04909.lz;
        }
        return class04909.lZ;
    }

    public boolean n() {
        return (Boolean)this.field_6011.N(N);
    }

    public static class05300 m() {
        return class07633.Ne().N(class05298.n, 30.0).N(class05298.P, 20.0).N(class05298.l, 0.25).N(class05298.u, 6.0);
    }

    protected void v() {
        if (this.i <= 0) {
            this.method_56078(class04909.lm);
            this.i = 40;
        }
    }

    public float u(float f) {
        return class04995.B((float)f, (float)this.L, (float)this.u) / 6.0f;
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        return (class07077)class07078.yL.N((class07299)class047822, class06113.field_16466);
    }

    public long E() {
        return this.M;
    }

    public boolean N(class06584 class065842) {
        return false;
    }

    public void N(boolean bl) {
        this.field_6011.N(N, (Object)bl);
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (class074462 == null) {
            class074462 = new class10714(1.0f);
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    public void N(long l) {
        this.M = l;
    }

    public void N(@Nullable class08372<class07438> class083722) {
        this.B = class083722;
    }

    public static boolean N(class07078<class07869> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        if (class072842.i(class072092).N(class03557.NE)) {
            return class07869.N((class07295)class072842, (class07209)class072092) && class072842.method_8320(class072092.method_10074()).N(class01210.Lb);
        }
        return class07869.L(class070782, (class07284)class072842, (class06113)class061132, (class07209)class072092, (class06069)class060692);
    }

    public @Nullable class08372<class07438> W() {
        return this.B;
    }

    protected void l_() {
        super.l_();
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class07875(this));
        this.e.N(1, (class07473)new class07993((class07475)this, 2.0, class074752 -> class074752.method_6109() ? class03696.I : class03696.J));
        this.e.N(4, (class07473)new class07459((class07633)this, 1.25));
        this.e.N(5, (class07473)new class07978((class07475)this, 1.0));
        this.e.N(6, (class07473)new class07962((class07079)this, class08036.class, 6.0f));
        this.e.N(7, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class07887(this));
        this.H.N(2, (class07473)new class07898(this));
        this.H.N(3, (class07473)new class07952((class07079)this, class08036.class, 10, true, false, (arg_0, arg_1) -> ((class07869)this).N(arg_0, arg_1)));
        this.H.N(4, (class07473)new class07952((class07079)this, class06165.class, 10, true, true, null));
        this.H.N(5, (class07473)new class01251((class07079)this, false));
    }

    public class04891 method_6002() {
        return class04909.lU;
    }

    public class01325 method_55694(class01312 class013122) {
        if (this.u > 0.0f) {
            float f = this.u / 6.0f;
            float f2 = 1.0f + f;
            return super.method_55694(class013122).N(1.0f, f2);
        }
        return super.method_55694(class013122);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.lE;
    }

    public float method_6120() {
        return 0.98f;
    }

    public void W_() {
        this.y(R.N(this.field_5974));
    }
}

