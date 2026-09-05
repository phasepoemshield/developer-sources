/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class03298
 *  minecraft.class03557
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05487
 *  minecraft.class05974
 *  minecraft.class06187
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class03298;
import minecraft.class03557;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class05487;
import minecraft.class05974;
import minecraft.class06187;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;

abstract class class05154
extends class04890 {
    protected class06187 N;

    public class05154(class04878 class048782, int n, class06187 class061872, class05163 class051632) {
        super(class048782, n, class051632);
        this.N = class061872;
    }

    public class05154(class04878 class048782, class07001 class070012) {
        super(class048782, class070012);
        this.N = class06187.N((int)class070012.y("MST", 0));
    }

    protected boolean N(class07284 class072842, class05163 class051632) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = Math.max(this.k.B() - 1, class051632.B());
        int n6 = Math.max(this.k.Z() - 1, class051632.Z());
        int n7 = Math.max(this.k.z() - 1, class051632.z());
        int n8 = Math.min(this.k.U() + 1, class051632.U());
        class07218 class072182 = new class07218((n5 + n8) / 2, (n6 + (n4 = Math.min(this.k.E() + 1, class051632.E()))) / 2, (n7 + (n3 = Math.min(this.k.W() + 1, class051632.W()))) / 2);
        if (class072842.i((class07209)class072182).N(class03557.h)) {
            return true;
        }
        for (n2 = n5; n2 <= n8; ++n2) {
            for (n = n7; n <= n3; ++n) {
                if (class072842.method_8320((class07209)class072182.N(n2, n6, n)).T()) {
                    return true;
                }
                if (!class072842.method_8320((class07209)class072182.N(n2, n4, n)).T()) continue;
                return true;
            }
        }
        for (n2 = n5; n2 <= n8; ++n2) {
            for (n = n6; n <= n4; ++n) {
                if (class072842.method_8320((class07209)class072182.N(n2, n, n7)).T()) {
                    return true;
                }
                if (!class072842.method_8320((class07209)class072182.N(n2, n, n3)).T()) continue;
                return true;
            }
        }
        for (n2 = n7; n2 <= n3; ++n2) {
            for (n = n6; n <= n4; ++n) {
                if (class072842.method_8320((class07209)class072182.N(n5, n, n2)).T()) {
                    return true;
                }
                if (!class072842.method_8320((class07209)class072182.N(n8, n, n2)).T()) continue;
                return true;
            }
        }
        return false;
    }

    protected boolean N(class07290 class072902, class05163 class051632, int n, int n2, int n3, int n4) {
        for (int i = n; i <= n2; ++i) {
            if (!this.N(class072902, i, n3 + 1, n4, class051632).P()) continue;
            return false;
        }
        return true;
    }

    protected void N(class05974 class059742, class05163 class051632, class00500 class005002, int n, int n2, int n3) {
        if (!this.y((class05487)class059742, n, n2, n3, class051632)) {
            return;
        }
        class07218 class072182 = this.L(n, n2, n3);
        if (!class059742.method_8320((class07209)class072182).L((class07290)class059742, (class07209)class072182, class07211.field_11036)) {
            class059742.method_8652((class07209)class072182, class005002, 2);
        }
    }

    protected void N(class03298 class032982, class07001 class070012) {
        class070012.N("MST", this.N.ordinal());
    }

    protected boolean N(class05487 class054872, int n, int n2, int n3, class05163 class051632) {
        class00500 class005002 = this.N((class07290)class054872, n, n2, n3, class051632);
        return !class005002.N(this.N.L().i()) && !class005002.N(this.N.y().i()) && !class005002.N(this.N.u().i()) && !class005002.N(class00869.Rg);
    }
}

