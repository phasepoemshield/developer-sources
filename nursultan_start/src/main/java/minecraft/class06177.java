/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04909
 *  minecraft.class05253
 *  minecraft.class05487
 *  minecraft.class05568
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07475
 *  minecraft.class07969
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04909;
import minecraft.class05253;
import minecraft.class05487;
import minecraft.class05568;
import minecraft.class06165;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07475;
import minecraft.class07969;
import minecraft.class08092;

public class class06177
extends class07969 {
    private static final int Z = 40;
    protected int M;
    final /* synthetic */ class06165 B;

    public void L() {
        this.M = 0;
        this.B.N(false);
        super.L();
    }

    protected void P() {
        if (!((Boolean)class06177.N_18((class07299)this.B.method_73183()).method_64395().N(class07305.I)).booleanValue()) {
            return;
        }
        class00500 class005002 = this.B.method_73183().method_8320(this.i);
        if (class005002.N(class00869.sM)) {
            this.y(class005002);
        } else if (class05568.j_((class00500)class005002)) {
            this.N(class005002);
        }
    }

    public class06177(class06165 class061652, double d, int n, int n2) {
        this.B = class061652;
        super((class07475)class061652, d, n, n2);
    }

    public double Z() {
        return 2.0;
    }

    public void i() {
        if (this.W()) {
            if (this.M >= 40) {
                this.P();
            } else {
                ++this.M;
            }
        } else if (!this.W() && class06165.u(this.B).z() < 0.05f) {
            this.B.method_5783(class04909.Ey, 1.0f, 1.0f);
        }
        super.i();
    }

    private void y(class00500 class005002) {
        int n = (Integer)class005002.L((class08092)class05253.L);
        class005002.y((class08092)class05253.L, (Comparable)Integer.valueOf(1));
        int n2 = 1 + this.B.method_73183().field_9229.y(2) + (n == 3 ? 1 : 0);
        if (this.B.method_6118(class07085.field_6173).R()) {
            this.B.method_5673(class07085.field_6173, new class06584((class07310)class06570.wN));
            --n2;
        }
        if (n2 > 0) {
            class00891.N_21((class07299)this.B.method_73183(), (class07209)this.i, (class06584)new class06584((class07310)class06570.wN, n2));
        }
        this.B.method_5783(class04909.QV, 1.0f, 1.0f);
        this.B.method_73183().method_8652(this.i, (class00500)class005002.y((class08092)class05253.L, (Comparable)Integer.valueOf(1)), 2);
        this.B.method_73183().N((class03556)class01194.L, this.i, class01164.N((class07049)this.B));
    }

    public boolean E() {
        return this.u % 100 == 0;
    }

    protected boolean N(class05487 class054872, class07209 class072092) {
        class00500 class005002 = class054872.method_8320(class072092);
        return class005002.N(class00869.sM) && (Integer)class005002.L((class08092)class05253.L) >= 2 || class05568.j_((class00500)class005002);
    }

    public boolean N() {
        return !this.B.method_6113() && super.N();
    }

    private void N(class00500 class005002) {
        class05568.N((class07049)this.B, (class00500)class005002, (class07299)this.B.method_73183(), (class07209)this.i);
    }
}

