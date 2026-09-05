/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11322
 *  Nursultan.class11328
 *  Nursultan.class11385
 *  Nursultan.class11400
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class11782
 *  Nursultan.class11929
 *  Nursultan.class12002
 *  minecraft.class02484
 *  minecraft.class02833
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05298
 *  minecraft.class05946
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07085
 *  minecraft.class07314
 *  minecraft.class07463
 *  minecraft.class08044
 *  minecraft.class08172
 */
package Nursultan;

import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11322;
import Nursultan.class11328;
import Nursultan.class11385;
import Nursultan.class11400;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class11782;
import Nursultan.class11929;
import Nursultan.class12002;
import java.util.Comparator;
import minecraft.class02484;
import minecraft.class02833;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05298;
import minecraft.class05946;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07085;
import minecraft.class07314;
import minecraft.class07463;
import minecraft.class08044;
import minecraft.class08172;

@class11080(L="SpearBoost", y=class11072.MOVEMENT, N=class11106.TOOLS)
public class SpearBoost
extends class11067 {
    public static Object L_0;
    public static Object L_1;
    public Object u_0;
    public Object u_1;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public boolean i_init;
    public Object R_0;
    public Object R_1;
    public Object R_2;
    public Object R_3;
    public Object R_4;
    public boolean R_init;

    private double L(class06584 class065842) {
        return ((class02833)class065842.a_(class02484.b, (Object)class02833.N)).y().stream().filter(class028242 -> class028242.N() == class05298.R && class028242.L().y(class07085.field_6173) && class028242.y().L() == class07463.field_6328).mapToDouble(class028242 -> class028242.y().y()).sum();
    }

    private void P() {
        this.s();
        int n = class11281.y((class11328)((class11328)this.R_1));
        if (class11281.y((int)n)) {
            return;
        }
        class08172 class081722 = (class08172)((class04453)((class06202)this.y_0).T_4).method_31548().method_5438(n).method_58694(class02484.c);
        if (class081722 == null) {
            return;
        }
        if (((Boolean)((class11507)this.u_0).i()).booleanValue()) {
            this.R_2 = true;
        }
        class11322.u((int)n);
        this.i_0 = true;
        ((class03443)((class06202)this.y_0).T_2).N(class081722);
        ((class04453)((class06202)this.y_0).T_4).method_6104(class07050.field_5808);
        this.i_1 = true;
        this.R_4 = false;
        this.i_3 = 0;
    }

    private boolean T() {
        this.s();
        int n = class11281.y((class11328)((class11328)this.R_1));
        if (class11281.y((int)n)) {
            return false;
        }
        class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_31548().method_5438(n);
        return !((class04453)((class06202)this.y_0).T_4).method_75202(class065842, 0);
    }

    public SpearBoost() {
        this.s();
        this.u_0 = class11524.N((class11512)this, (String)"auto-jump", (boolean)true);
        this.u_1 = class11524.N((class11512)this, (String)"rapid", (boolean)false);
        this.R_0 = class11524.N((class11512)this, (String)"boost-key", (class12002)class12002.UNKNOWN);
        this.R_1 = class065842 -> class065842.L(class02484.c) && class11929.N((class06584)class065842, (class05946)class07314.X) > 0;
    }

    static {
        SpearBoost.t();
    }

    public boolean i() {
        this.s();
        this.R_2 = false;
        this.R_3 = false;
        this.R_4 = false;
        this.i_1 = false;
        this.i_2 = 0;
        this.i_3 = 0;
        this.m();
        return true;
    }

    private void s() {
        if (!this.R_init) {
            this.R_init = true;
            this.R_2 = false;
            this.R_3 = false;
            this.R_4 = false;
        }
        if (!this.i_init) {
            this.i_init = true;
            this.i_0 = false;
            this.i_1 = false;
            this.i_2 = 0;
            this.i_3 = 0;
        }
    }

    private boolean n() {
        this.s();
        if (!this.l()) {
            return false;
        }
        return (Boolean)((class11507)this.u_1).i() != false || this.T();
    }

    private boolean l() {
        this.s();
        return (class04453)((class06202)this.y_0).T_4 != null && ((class04453)((class06202)this.y_0).T_4).method_76458() && !class11281.y((int)class11281.y((class11328)((class11328)this.R_1)));
    }

    private void m() {
        this.s();
        if (!((Boolean)this.i_0).booleanValue()) {
            return;
        }
        this.i_0 = false;
        class11322.i();
    }

    private static void t() {
        L_0 = 2;
        L_1 = 30;
    }

    private void v() {
        this.s();
        int n = this.y(class11281.y((class11328)((class11328)this.R_1)));
        if (!class11281.y((int)n)) {
            class11322.u((int)n);
            this.i_0 = true;
        }
    }

    private int y(int n) {
        int n2 = ((class04453)((class06202)this.y_0).T_4).method_31548().N();
        return class11281.i(class065842 -> true).filter(class112972 -> class112972.y() != n).max(Comparator.comparingInt(class112972 -> -this.N(class112972.y(), n2)).thenComparingDouble(class112972 -> this.L(class112972.N()))).map(class11297::y).orElse(-1);
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.s();
        if ((class04453)((class06202)this.y_0).T_4 == null || (class03448)((class06202)this.y_0).T_3 == null) {
            return;
        }
        if (class114002.y((class12002)((class11527)this.R_0).i(), ((class11527)this.R_0).L())) {
            this.R_3 = true;
            this.R_4 = true;
        } else if (class114002.N((class12002)((class11527)this.R_0).i())) {
            this.R_3 = false;
        }
    }

    @class11782
    public void N(class11385 class113852) {
        this.s();
        if (!((Boolean)this.R_2).booleanValue() && !((Boolean)this.R_3).booleanValue()) {
            return;
        }
        if (((Boolean)((class11507)this.u_0).i()).booleanValue()) {
            class113852.i(true);
        }
        this.R_2 = false;
    }

    private int N(int n, int n2) {
        int n3 = Math.abs(n - n2);
        return Math.min(n3, class08044.L() - n3);
    }

    @class11782
    public void N(class10992 class109922) {
        this.s();
        if (!((Boolean)this.R_3 != false || (Boolean)this.R_4 != false || (Integer)this.i_2 != 0) || !this.l()) {
            this.m();
            this.i_1 = false;
            this.R_4 = false;
            this.i_2 = 0;
            this.i_3 = 0;
            return;
        }
        if (((Boolean)this.R_4).booleanValue() && !((Boolean)this.R_3).booleanValue()) {
            this.i_3 = (Integer)this.i_3 + 1;
            if ((Integer)this.i_3 > 30) {
                this.R_4 = false;
            }
        } else {
            this.i_3 = 0;
        }
        if (!((Boolean)this.i_1).booleanValue()) {
            if (this.l() && this.T()) {
                this.P();
                this.i_2 = 0;
                return;
            }
            this.i_1 = true;
        }
        if ((Integer)this.i_2 == 0) {
            this.v();
        } else if (this.n()) {
            this.P();
        }
        this.i_2 = ((Integer)this.i_2 + 1) % 2;
    }
}

