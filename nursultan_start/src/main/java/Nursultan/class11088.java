/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09139
 *  Nursultan.class11499
 *  minecraft.class00734
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09139;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11088 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;

    public class11088() {
        this.z();
    }

    static {
        class11088.R();
    }

    private void z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
            this.N_1 = false;
            this.N_2 = false;
            this.N_3 = 0.0;
            this.N_4 = 0.0;
            this.N_5 = 0.0;
            this.N_6 = 0.0;
            this.N_7 = 0L;
        }
    }

    public void y() {
        this.N_0 = false;
        this.N_1 = false;
        this.N_2 = false;
        this.N_3 = 0.0;
        this.N_4 = 0.0;
        this.N_5 = 0.0;
        this.N_6 = 0.0;
        this.N_7 = 0L;
    }

    public boolean N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class00734 class007342, class06889 class068892, class06889 class068893, double d, double d2, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (class110872 == null || class074382 == null || class114992 == null || class114993 == null || class007342 == null || class068892 == null || class068893 == null) {
            this.y();
            return false;
        }
        boolean bl5 = class110872.N(class074382, class114993);
        boolean bl6 = bl4 || bl5;
        boolean bl7 = bl && this.N(class068893, d, bl2);
        long l = System.currentTimeMillis();
        if (bl7 && bl6 && d2 <= (double)(f + 1.35f)) {
            this.N_0 = true;
            this.N_7 = l + 420L;
        } else if (bl3 && bl && bl6 && d2 <= (double)(f + 1.25f)) {
            this.N_0 = true;
            this.N_7 = l + 320L;
        }
        if (((Boolean)this.N_0).booleanValue()) {
            if (this.N(class114992, class007342, class068892, f, bl4)) {
                this.y();
                this.N(class068893, d);
                return false;
            }
            if (l > (Long)this.N_7) {
                this.N_0 = false;
                this.N(class068893, d);
                return false;
            }
            this.N(class068893, d);
            return bl && bl6;
        }
        this.N(class068893, d);
        return false;
    }

    private boolean N(class11499 class114992, class00734 class007342, class06889 class068892, float f, boolean bl) {
        class06889 class068893;
        if (bl) {
            return false;
        }
        class06889 class068894 = class09139.N((float)class114992.R(), (float)class114992.y());
        class06889 class068895 = class068892.i(class068894.L((double)f + 1.35));
        class06889 class068896 = this.N(class068892, class068895, class007342.R());
        return class068896.R(class068893 = new class06889(class04995.N((double)class068896.M, (double)class007342.N, (double)class007342.u), class04995.N((double)class068896.B, (double)class007342.y, (double)class007342.i), class04995.N((double)class068896.Z, (double)class007342.L, (double)class007342.R))) >= 1.0;
    }

    public boolean N() {
        return (Boolean)this.N_0;
    }

    private void N(class06889 class068892, double d) {
        if (((Boolean)this.N_1).booleanValue()) {
            this.N_4 = d - (Double)this.N_3;
            this.N_2 = true;
        }
        this.N_1 = true;
        this.N_3 = d;
        this.N_5 = ((class04453)((class06202)class11087.N_0).T_4).method_23317() - class068892.M;
        this.N_6 = ((class04453)((class06202)class11087.N_0).T_4).method_23321() - class068892.Z;
    }

    private class06889 N(class06889 class068892, class06889 class068893, class06889 class068894) {
        class06889 class068895 = class068893.u(class068892);
        double d = class068895.B();
        if (d <= 1.0E-6) {
            return class068892;
        }
        double d2 = class068894.u(class068892).y(class068895) / d;
        return class068892.i(class068895.L(class04995.N((double)d2, (double)0.0, (double)1.0)));
    }

    private double N(double d, double d2, double d3, double d4, double d5) {
        double d6 = -((Double)this.N_5 * d3 + (Double)this.N_6 * d4) / d5;
        d6 = class04995.N((double)d6, (double)0.0, (double)1.0);
        double d7 = (Double)this.N_5 + d3 * d6;
        double d8 = (Double)this.N_6 + d4 * d6;
        return Math.hypot(d7, d8);
    }

    private boolean N(class06889 class068892, double d, boolean bl) {
        double d2;
        double d3;
        if (!((Boolean)this.N_1).booleanValue()) {
            return false;
        }
        double d4 = ((class04453)((class06202)class11087.N_0).T_4).method_23317() - class068892.M;
        double d5 = ((class04453)((class06202)class11087.N_0).T_4).method_23321() - class068892.Z;
        double d6 = d4 - (Double)this.N_5;
        double d7 = d6 * d6 + (d3 = d5 - (Double)this.N_6) * d3;
        if (d7 < 0.0064) {
            return false;
        }
        boolean bl2 = (Double)this.N_5 * d4 + (Double)this.N_6 * d5 <= 0.0;
        double d8 = this.N(d4, d5, d6, d3, d7);
        double d9 = d2 = bl ? 1.18 : 1.05;
        if (d8 > d2) {
            return false;
        }
        double d10 = d - (Double)this.N_3;
        boolean bl3 = (Boolean)this.N_2 != false && (Double)this.N_4 < -0.025 && d10 > 0.025;
        boolean bl4 = bl2 && Math.min((Double)this.N_3, d) <= 1.65;
        boolean bl5 = Math.min((Double)this.N_3, d) <= 0.92 && d10 > 0.025;
        return bl3 || bl4 || bl5;
    }

    private static void R() {
        y_0 = 1.05;
        y_1 = 0.08;
        y_2 = 0.025;
        y_3 = 1.0;
        y_4 = 420L;
    }
}

