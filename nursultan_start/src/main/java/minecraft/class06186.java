/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01210
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 */
package minecraft;

import minecraft.class00500;
import minecraft.class01210;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;

class class06186 {
    double N;
    double y;

    class06186() {
    }

    double y() {
        return Math.sqrt(this.N * this.N + this.y * this.y);
    }

    public void y(class06186 class061862) {
        this.N -= class061862.N;
        this.y -= class061862.y;
    }

    public boolean y(class07290 class072902, int n) {
        class07209 class072092 = class07209.method_49637((double)this.N, (double)(this.N(class072902, n) - 1), (double)this.y);
        class00500 class005002 = class072902.method_8320(class072092);
        return class072092.method_10264() < n && !class005002.T() && !class005002.N(class01210.Nh);
    }

    public void N(class06069 class060692, double d, double d2, double d3, double d4) {
        this.N = class04995.N((class06069)class060692, (double)d, (double)d3);
        this.y = class04995.N((class06069)class060692, (double)d2, (double)d4);
    }

    double N(class06186 class061862) {
        double d = this.N - class061862.N;
        double d2 = this.y - class061862.y;
        return Math.sqrt(d * d + d2 * d2);
    }

    public int N(class07290 class072902, int n) {
        class07218 class072182 = new class07218(this.N, (double)(n + 1), this.y);
        boolean bl = class072902.method_8320((class07209)class072182).P();
        class072182.N(class07211.field_11033);
        boolean bl2 = class072902.method_8320((class07209)class072182).P();
        while (class072182.method_10264() > class072902.method_31607()) {
            class072182.N(class07211.field_11033);
            boolean bl3 = class072902.method_8320((class07209)class072182).P();
            if (!bl3 && bl2 && bl) {
                return class072182.method_10264() + 1;
            }
            bl = bl2;
            bl2 = bl3;
        }
        return n + 1;
    }

    public boolean N(double d, double d2, double d3, double d4) {
        boolean bl = false;
        if (this.N < d) {
            this.N = d;
            bl = true;
        } else if (this.N > d3) {
            this.N = d3;
            bl = true;
        }
        if (this.y < d2) {
            this.y = d2;
            bl = true;
        } else if (this.y > d4) {
            this.y = d4;
            bl = true;
        }
        return bl;
    }

    void N() {
        double d = this.y();
        this.N /= d;
        this.y /= d;
    }
}

