/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11087
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class11087;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07438;

public class class09133 {
    public Object N_0;
    public boolean N_init;

    private int L(class07209 class072092) {
        int n = 0;
        if (this.y(class072092.method_10069(1, 0, 0)) || this.y(class072092.method_10069(1, 1, 0))) {
            ++n;
        }
        if (this.y(class072092.method_10069(-1, 0, 0)) || this.y(class072092.method_10069(-1, 1, 0))) {
            ++n;
        }
        if (this.y(class072092.method_10069(0, 0, 1)) || this.y(class072092.method_10069(0, 1, 1))) {
            ++n;
        }
        if (this.y(class072092.method_10069(0, 0, -1)) || this.y(class072092.method_10069(0, 1, -1))) {
            ++n;
        }
        return n;
    }

    public class09133() {
        this.R();
    }

    private boolean y(class07209 class072092) {
        class00500 class005002 = ((class03448)((class06202)class11087.N_0).T_3).method_8320(class072092);
        if (class005002 == null || class005002.P()) {
            return false;
        }
        class00494 class004942 = class005002.M((class07290)((class03448)((class06202)class11087.N_0).T_3), class072092);
        return class004942 != null && !class004942.method_1110();
    }

    public void N() {
        this.N_0 = 0;
    }

    public boolean N(class07438 class074382, class00734 class007342, class06889 class068892, double d, float f) {
        if ((class04453)((class06202)class11087.N_0).T_4 == null || (class03448)((class06202)class11087.N_0).T_3 == null || class074382 == null || class007342 == null || class068892 == null) {
            this.N_0 = 0;
            return false;
        }
        if (d > (double)(f + 0.75f)) {
            this.N_0 = Math.max(0, (Integer)this.N_0 - 1);
            return (Integer)this.N_0 >= 2;
        }
        class07209 class072092 = class07209.method_49637((double)((class04453)((class06202)class11087.N_0).T_4).method_23317(), (double)((class04453)((class06202)class11087.N_0).T_4).method_23318(), (double)((class04453)((class06202)class11087.N_0).T_4).method_23321());
        int n = this.L(class072092);
        int n2 = this.N(class072092, 1, class072092.method_10264(), class072092.method_10264() + 1);
        int n3 = this.N(class072092, 2, class072092.method_10264(), class072092.method_10264() + 1);
        int n4 = this.N(class072092);
        boolean bl = n >= 3 || n2 >= 6;
        boolean bl2 = n4 >= 2 && (n2 >= 3 || n3 >= 8);
        boolean bl3 = n2 >= 5 && n3 >= 8;
        this.N_0 = bl || bl2 || bl3 ? Integer.valueOf(Math.min(8, (Integer)this.N_0 + 2)) : Integer.valueOf(Math.max(0, (Integer)this.N_0 - 1));
        return (Integer)this.N_0 >= 2;
    }

    private int N(class07209 class072092) {
        int n = 0;
        int n2 = class072092.method_10264() + 2;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                if (!this.y(new class07209(class072092.method_10263() + i, n2, class072092.method_10260() + j))) continue;
                ++n;
            }
        }
        return n;
    }

    private int N(class07209 class072092, int n, int n2, int n3) {
        int n4 = 0;
        for (int i = -n; i <= n; ++i) {
            block1: for (int j = -n; j <= n; ++j) {
                if (Math.abs(i) != n && Math.abs(j) != n) continue;
                for (int k = n2; k <= n3; ++k) {
                    if (!this.y(new class07209(class072092.method_10263() + i, k, class072092.method_10260() + j))) continue;
                    ++n4;
                    continue block1;
                }
            }
        }
        return n4;
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
        }
    }
}

