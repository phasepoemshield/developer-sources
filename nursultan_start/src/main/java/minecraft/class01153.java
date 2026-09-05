/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class04995
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07529
 *  minecraft.class07830
 */
package minecraft;

import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01165;
import minecraft.class01175;
import minecraft.class01183;
import minecraft.class01210;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07529;
import minecraft.class07830;

final class class01153 {
    private class07209 N;
    private final boolean y;
    private int L;
    private final double u;
    private final double i;

    private int L() {
        if (!this.y) {
            return this.N.method_10264();
        }
        return this.N.method_10264() + this.N();
    }

    class01153(class07209 class072092, boolean bl, int n, double d, double d2) {
        this.N = class072092;
        this.y = bl;
        this.L = n;
        this.u = d;
        this.i = d2;
    }

    private int y() {
        if (this.y) {
            return this.N.method_10264();
        }
        return this.N.method_10264() - this.N();
    }

    private int N(float f) {
        return (int)class01175.N(f, (double)this.L, this.i, this.u);
    }

    void N(class05974 class059742, class06069 class060692, class01183 class011832) {
        for (int i = -this.L; i <= this.L; ++i) {
            block1: for (int j = -this.L; j <= this.L; ++j) {
                int n;
                float f = class04995.N((float)(i * i + j * j));
                if (f > (float)this.L || (n = this.N(f)) <= 0) continue;
                if ((double)class060692.z() < 0.2) {
                    n = (int)((float)n * class04995.y((class06069)class060692, (float)0.8f, (float)1.0f));
                }
                class07218 class072182 = this.N.method_10069(i, 0, j).method_25503();
                boolean bl = false;
                int n2 = this.y ? class059742.method_8624(class07830.field_13194, class072182.method_10263(), class072182.method_10260()) : Integer.MAX_VALUE;
                for (int k = 0; k < n && class072182.method_10264() < n2; ++k) {
                    class07209 class072092 = class011832.N((class07209)class072182);
                    if (class01175.y((class07284)class059742, class072092)) {
                        bl = true;
                        class00891 class008912 = class07529.h ? class00869.ND : class00869.vF;
                        class059742.method_8652(class072092, class008912.W(), 2);
                    } else if (bl && class059742.method_8320(class072092).N(class01210.yb)) continue block1;
                    class072182.N(this.y ? class07211.field_11036 : class07211.field_11033);
                }
            }
        }
    }

    boolean N(class01165 class011652) {
        return this.L >= class011652.z && this.u >= (double)class011652.U;
    }

    boolean N(class05974 class059742, class01183 class011832) {
        while (this.L > 1) {
            class07218 class072182 = this.N.method_25503();
            int n = Math.min(10, this.N());
            for (int i = 0; i < n; ++i) {
                if (class059742.method_8320((class07209)class072182).N(class00869.V)) {
                    return false;
                }
                if (class01175.N(class059742, class011832.N((class07209)class072182), this.L)) {
                    this.N = class072182;
                    return true;
                }
                class072182.N(this.y ? class07211.field_11033 : class07211.field_11036);
            }
            this.L /= 2;
        }
        return false;
    }

    private int N() {
        return this.N(0.0f);
    }
}

