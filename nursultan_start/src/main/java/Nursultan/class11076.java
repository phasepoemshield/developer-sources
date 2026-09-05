/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09139
 *  Nursultan.class09166
 *  minecraft.class00734
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09139;
import Nursultan.class09166;
import Nursultan.class11064;
import Nursultan.class11085;
import Nursultan.class11087;
import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public class class11076 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public boolean L_init;

    private boolean L(class00734 class007342) {
        class06889 class068892 = class007342.R();
        double d = ((class04453)((class06202)class11087.N_0).T_4).method_23317() - class068892.M;
        double d2 = ((class04453)((class06202)class11087.N_0).T_4).method_23321() - class068892.Z;
        if (!((Boolean)this.y_5).booleanValue()) {
            this.y_3 = d;
            this.y_4 = d2;
            this.y_5 = true;
            return false;
        }
        double d3 = (Double)this.y_3 * d + (Double)this.y_4 * d2;
        double d4 = (Double)this.y_3 * d2 - (Double)this.y_4 * d;
        double d5 = d - (Double)this.y_3;
        double d6 = d2 - (Double)this.y_4;
        double d7 = Math.hypot(d5, d6);
        boolean bl = d3 <= 0.0 && d7 > 0.12;
        boolean bl2 = Math.abs(d4) > 0.32 && d7 > 0.2;
        this.y_3 = d;
        this.y_4 = d2;
        return bl || bl2;
    }

    public class11076() {
        this.u();
        this.L_0 = new class09166();
        this.L_2 = class11085.UPPER_CHEST;
        this.L_3 = Float.valueOf(0.5f);
        this.N_0 = Float.valueOf(0.68f);
        this.N_1 = Float.valueOf(0.5f);
        this.N_2 = Float.valueOf(0.5f);
        this.N_3 = Float.valueOf(0.68f);
        this.y_0 = Float.valueOf(0.5f);
        this.y_1 = Float.valueOf(class09139.N((double)0.0, (double)(Math.PI * 2)));
        this.y_2 = Float.valueOf(1.0f);
    }

    private void u() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = 0L;
            this.L_3 = Float.valueOf(0.0f);
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_1 = Float.valueOf(0.0f);
            this.y_2 = Float.valueOf(0.0f);
            this.y_3 = 0.0;
            this.y_4 = 0.0;
            this.y_5 = false;
        }
    }

    public class06889 y(class00734 class007342) {
        return this.N(class007342, ((Float)this.L_3).floatValue(), ((Float)this.N_0).floatValue(), ((Float)this.N_1).floatValue());
    }

    private class06889 N(class06889 class068892, class06889 class068893, double d) {
        return new class06889(class04995.u((double)d, (double)class068892.M, (double)class068893.M), class04995.u((double)d, (double)class068892.B, (double)class068893.B), class04995.u((double)d, (double)class068892.Z, (double)class068893.Z));
    }

    public class06889 N(class00734 class007342, class07438 class074382, boolean bl, boolean bl2, boolean bl3) {
        long l = System.currentTimeMillis();
        boolean bl4 = this.L(class007342);
        if (bl4) {
            this.L_1 = 0L;
        }
        if (l >= (Long)this.L_1 || !bl || bl4) {
            this.N(l, bl, bl2, bl3);
        }
        class06889 class068892 = class007342.R();
        class06889 class068893 = class074382.method_18798();
        class06889 class068894 = ((class04453)((class06202)class11087.N_0).T_4).method_18798();
        double d = class068893.M - class068894.M * 0.42;
        double d2 = class068893.Z - class068894.Z * 0.42;
        double d3 = Math.hypot(d, d2);
        double d4 = ((class04453)((class06202)class11087.N_0).T_4).method_33571().R(class068892);
        double d5 = bl ? class04995.N((double)(d4 * 0.18 + d3 * 2.4), (double)0.18, (double)1.25) : class04995.N((double)(d4 * 0.46 + d3 * 5.8), (double)0.85, (double)5.2);
        class06889 class068895 = this.y(class007342);
        class06889 class068896 = new class06889(class068892.M + d * d5, class068892.B + class068893.B * class04995.N((double)(d5 * 0.42), (double)0.0, (double)1.45), class068892.Z + d2 * d5);
        class068896 = class11064.y((class07049)class074382, class068896);
        float f = bl ? 0.014f : 0.046f;
        double d6 = class007342.u - class007342.N;
        double d7 = class007342.R - class007342.L;
        double d8 = class007342.i - class007342.y;
        double d9 = Math.sin((double)l * 0.0105 + (double)((Float)this.y_1).floatValue()) * d6 * (double)f;
        double d10 = Math.cos((double)l * 0.0073 + (double)(((Float)this.y_1).floatValue() * 0.73f)) * d8 * (double)f * 0.28;
        double d11 = Math.sin((double)l * 0.0121 + (double)(((Float)this.y_1).floatValue() * 1.31f)) * d7 * (double)f;
        double d12 = bl && !bl4 ? (bl2 && bl3 ? 0.13 : 0.075) : (bl2 && bl3 ? 0.58 : 0.38);
        class06889 class068897 = this.N(class068895, class068896, d12).y(d9, d10, d11);
        return this.N(class007342, class068897);
    }

    private class06889 N(class00734 class007342, float f, float f2, float f3) {
        return new class06889(class04995.u((double)f, (double)class007342.N, (double)class007342.u), class04995.u((double)f2, (double)class007342.y, (double)class007342.i), class04995.u((double)f3, (double)class007342.L, (double)class007342.R));
    }

    private void N(long l, boolean bl, boolean bl2, boolean bl3) {
        class11085 class110852 = (class11085)((Object)this.L_2);
        this.N_2 = Float.valueOf(((Float)this.L_3).floatValue());
        this.N_3 = Float.valueOf(((Float)this.N_0).floatValue());
        this.y_0 = Float.valueOf(((Float)this.N_1).floatValue());
        this.L_2 = this.N(bl, bl2, bl3);
        if ((class11085)((Object)this.L_2) == class110852 && ((class09166)this.L_0).N(bl ? 0.62f : 0.44f)) {
            this.L_2 = ((class11085)((Object)this.L_2)).N((class09166)this.L_0);
        }
        this.y_2 = Float.valueOf(((class09166)this.L_0).N(0.55f) ? -((Float)this.y_2).floatValue() : (float)((class09166)this.L_0).N());
        switch (((class11085)((Object)this.L_2)).ordinal()) {
            case 3: {
                this.L_3 = Float.valueOf(class04995.N((float)(0.5f + ((class09166)this.L_0).y(-0.13f, 0.13f)), (float)0.34f, (float)0.66f));
                this.N_0 = Float.valueOf(((class09166)this.L_0).y(0.78f, 0.91f));
                this.N_1 = Float.valueOf(class04995.N((float)(0.5f + ((class09166)this.L_0).y(-0.11f, 0.11f)), (float)0.34f, (float)0.66f));
                break;
            }
            case 2: {
                this.L_3 = Float.valueOf(class04995.N((float)(0.5f + ((Float)this.y_2).floatValue() * ((class09166)this.L_0).y(0.17f, 0.32f)), (float)0.18f, (float)0.82f));
                this.N_0 = Float.valueOf(((class09166)this.L_0).y(0.62f, bl2 ? 0.82f : 0.78f));
                this.N_1 = Float.valueOf(class04995.N((float)(0.5f + ((class09166)this.L_0).y(-0.2f, 0.2f)), (float)0.22f, (float)0.78f));
                break;
            }
            case 0: {
                this.L_3 = Float.valueOf(class04995.N((float)(0.5f + ((class09166)this.L_0).y(-0.22f, 0.22f)), (float)0.24f, (float)0.76f));
                this.N_0 = Float.valueOf(((class09166)this.L_0).y(0.56f, 0.69f));
                this.N_1 = Float.valueOf(class04995.N((float)(0.5f + ((class09166)this.L_0).y(-0.22f, 0.22f)), (float)0.24f, (float)0.76f));
                break;
            }
            default: {
                this.L_3 = Float.valueOf(class04995.N((float)(0.5f + ((class09166)this.L_0).y(-0.19f, 0.19f)), (float)0.26f, (float)0.74f));
                this.N_0 = Float.valueOf(((class09166)this.L_0).y(0.66f, bl2 && bl3 ? 0.86f : 0.82f));
                this.N_1 = Float.valueOf(class04995.N((float)(0.5f + ((class09166)this.L_0).y(-0.2f, 0.2f)), (float)0.24f, (float)0.76f));
            }
        }
        if (bl) {
            this.L_3 = Float.valueOf(class04995.B((float)0.46f, (float)((Float)this.N_2).floatValue(), (float)((Float)this.L_3).floatValue()));
            this.N_0 = Float.valueOf(class04995.B((float)0.58f, (float)((Float)this.N_3).floatValue(), (float)((Float)this.N_0).floatValue()));
            this.N_1 = Float.valueOf(class04995.B((float)0.46f, (float)((Float)this.y_0).floatValue(), (float)((Float)this.N_1).floatValue()));
        }
        this.y_1 = Float.valueOf(class09139.N((double)0.0, (double)(Math.PI * 2)));
        long l2 = (long)(bl ? (bl2 ? 64.0 : 82.0) : 58.0);
        long l3 = (long)(bl ? (bl2 ? 145.0 : 205.0) : 165.0);
        this.L_1 = l + (long)((class09166)this.L_0).y((float)l2, (float)l3);
    }

    private class11085 N(boolean bl, boolean bl2, boolean bl3) {
        float f = ((class09166)this.L_0).N(0.0f, 1.0f);
        if (bl2 && bl3) {
            if (f < 0.42f) {
                return class11085.UPPER_CHEST;
            }
            if (f < 0.74f) {
                return class11085.SHOULDER;
            }
            return class11085.HEAD_LINE;
        }
        if (bl) {
            if (f < 0.38f) {
                return class11085.SHOULDER;
            }
            if (f < 0.76f) {
                return class11085.UPPER_CHEST;
            }
            if (f < 0.91f) {
                return class11085.MID_CHEST;
            }
            return class11085.HEAD_LINE;
        }
        if (f < 0.46f) {
            return class11085.UPPER_CHEST;
        }
        if (f < 0.76f) {
            return class11085.SHOULDER;
        }
        if (f < 0.92f) {
            return class11085.MID_CHEST;
        }
        return class11085.HEAD_LINE;
    }

    public class06889 N(class00734 class007342) {
        return this.N(class007342, 1.0f - ((Float)this.L_3).floatValue(), class04995.N((float)(((Float)this.N_0).floatValue() + ((class09166)this.L_0).N(-0.08f, 0.08f)), (float)0.5f, (float)0.9f), ((Float)this.N_1).floatValue());
    }

    private class06889 N(class00734 class007342, class06889 class068892) {
        double d = class007342.i - class007342.y;
        return new class06889(class04995.N((double)class068892.M, (double)class007342.N, (double)class007342.u), class04995.N((double)class068892.B, (double)(class007342.y + d * 0.46), (double)(class007342.y + d * 0.92)), class04995.N((double)class068892.Z, (double)class007342.L, (double)class007342.R));
    }

    public void N() {
        this.L_1 = 0L;
        this.L_2 = class11085.UPPER_CHEST;
        this.L_3 = Float.valueOf(0.5f);
        this.N_0 = Float.valueOf(0.68f);
        this.N_1 = Float.valueOf(0.5f);
        this.N_2 = Float.valueOf(0.5f);
        this.N_3 = Float.valueOf(0.68f);
        this.y_0 = Float.valueOf(0.5f);
        this.y_1 = Float.valueOf(class09139.N((double)0.0, (double)(Math.PI * 2)));
        this.y_2 = Float.valueOf(1.0f);
        this.y_3 = 0.0;
        this.y_4 = 0.0;
        this.y_5 = false;
        ((class09166)this.L_0).y();
    }
}

