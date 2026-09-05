/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03559
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07438
 *  minecraft.class07952
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07962
 *  minecraft.class07989
 *  minecraft.class07999
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class00500;
import minecraft.class03559;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07952;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07989;
import minecraft.class07999;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;

public class class07560
extends class07150 {
    private static final int N = 2400;
    private static final int y = 0;
    private int L = 0;

    public static class05300 M() {
        return class07150.Y().N(class05298.n, 8.0).N(class05298.l, 0.25).N(class05298.u, 2.0);
    }

    public void method_5773() {
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.method_36454());
        super.method_5773();
    }

    protected class07065 method_33570() {
        return class07065.field_28632;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.UN, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Lifetime", this.L);
    }

    public void method_5636(float f) {
        this.method_36456(f);
        super.method_5636(f);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.L = class082992.N("Lifetime", 0);
    }

    public class07560(class07078<? extends class07560> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 3;
    }

    protected class04891 s() {
        return class04909.zD;
    }

    public static boolean N(class07078<class07560> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        if (!class07560.L(class070782, (class07284)class072842, (class06113)class061132, (class07209)class072092, (class06069)class060692)) {
            return false;
        }
        if (class06113.N((class06113)class061132)) {
            return true;
        }
        return class072842.N((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, 5.0, true) == null;
    }

    protected void l_() {
        this.e.N(1, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class03559((class07079)this, this.method_73183()));
        this.e.N(2, (class07473)new class07999((class07475)((Object)this), 1.0, false));
        this.e.N(3, (class07473)new class07957((class07475)((Object)this), 1.0));
        this.e.N(7, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(8, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class07989((class07475)((Object)this), new Class[0]).N(new Class[0]));
        this.H.N(2, (class07473)new class07952((class07079)this, class08036.class, true));
    }

    public class04891 method_6002() {
        return class04909.zh;
    }

    public void method_6007() {
        super.method_6007();
        if (this.method_73183().method_8608()) {
            for (int i = 0; i < 2; ++i) {
                this.method_73183().method_8406((class07126)class07107.NM, this.method_23322(0.5), this.method_23319(), this.method_23325(0.5), (this.field_5974.U() - 0.5) * 2.0, -this.field_5974.U(), (this.field_5974.U() - 0.5) * 2.0);
            }
        } else {
            if (!this.Nm()) {
                ++this.L;
            }
            if (this.L >= 2400) {
                this.method_31472();
            }
        }
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.zr;
    }
}

