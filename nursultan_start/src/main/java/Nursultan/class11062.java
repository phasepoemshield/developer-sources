/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09139
 *  Nursultan.class09170
 *  Nursultan.class11499
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
import Nursultan.class09170;
import Nursultan.class11064;
import Nursultan.class11065;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public class class11062 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public boolean y_init;

    public class11062() {
        this.y();
        this.y_1 = Float.valueOf(1.0f);
    }

    private void y(long l) {
        this.N_2 = l;
        this.y_5 = true;
        this.y_0 = l + (long)class09139.N((double)95.0, (double)165.0);
    }

    private void y() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = 0L;
            this.N_2 = 0L;
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0L;
            this.y_1 = Float.valueOf(0.0f);
            this.y_2 = Float.valueOf(0.0f);
            this.y_3 = Float.valueOf(0.0f);
            this.y_4 = Float.valueOf(0.0f);
            this.y_5 = false;
        }
    }

    private boolean N(class11087 class110872, boolean bl, boolean bl2) {
        return bl || bl2 || class110872.y().y() > 545L;
    }

    private boolean N(long l, float f, float f2, float f3, boolean bl, boolean bl2) {
        if (bl || bl2 || f < 0.34f) {
            return false;
        }
        boolean bl3 = f2 <= 1.75f && f3 <= 0.95f;
        boolean bl4 = f >= 0.72f && f2 <= 4.2f && f3 <= 2.0f;
        return bl3 || bl4 || l >= (Long)this.N_2 - 45L;
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.y_0 = 0L;
        this.y_1 = Float.valueOf(1.0f);
        this.y_2 = Float.valueOf(0.0f);
        this.y_3 = Float.valueOf(0.0f);
        this.y_4 = Float.valueOf(0.16f);
        this.y_5 = false;
    }

    private boolean N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, boolean bl, boolean bl2, boolean bl3) {
        long l = System.currentTimeMillis();
        if (!bl || bl2 || bl3 || class110872.y().y() < 120L) {
            this.N_0 = l + (long)class09139.N((double)110.0, (double)260.0);
            return false;
        }
        float f = Math.abs(class09170.N((float)class114992.y(), (float)class114993.y()));
        float f2 = Math.abs(class114993.R() - class114992.R());
        if (f > 5.8f || f2 > 2.65f) {
            this.N_0 = l + (long)class09139.N((double)95.0, (double)210.0);
            return false;
        }
        double d = ((class04453)((class06202)class11087.N_0).T_4).method_33571().R(class11064.y((class07049)class074382));
        float f3 = class04995.N((float)((float)(3.6 - d) / 3.6f), (float)0.0f, (float)1.0f);
        float f4 = class04995.N((float)((5.8f - f) / 5.8f), (float)0.0f, (float)1.0f);
        double d2 = 0.12 + (double)f3 * 0.12 + (double)f4 * 0.16;
        if (Math.random() > d2) {
            this.N_0 = l + (long)class09139.N((double)140.0, (double)360.0);
            return false;
        }
        return true;
    }

    private void N(long l, class00734 class007342) {
        float f = class09139.N((double)0.0, (double)(Math.PI * 2));
        this.y_1 = Float.valueOf((float)Math.cos(f));
        this.y_2 = Float.valueOf((float)Math.sin(f));
        double d = class007342.i - class007342.y;
        boolean bl = Math.random() < 0.36;
        this.y_3 = Float.valueOf(class09139.N((double)(-d * (bl ? 0.22 : 0.13)), (double)(d * (bl ? 0.24 : 0.16))));
        this.y_4 = Float.valueOf(class09139.N((double)(bl ? 0.2 : 0.12), (double)(bl ? 0.42 : 0.26)));
        this.N_1 = l;
        this.N_2 = l + (long)class09139.N((double)(bl ? 230.0 : 190.0), (double)(bl ? 420.0 : 340.0));
        this.N_0 = l + (long)class09139.N((double)(bl ? 620.0 : 460.0), (double)(bl ? 1250.0 : 980.0));
        this.y_5 = false;
        this.y_0 = 0L;
    }

    private class06889 N(class06889 class068892, class06889 class068893, double d) {
        return new class06889(class04995.u((double)d, (double)class068892.M, (double)class068893.M), class04995.u((double)d, (double)class068892.B, (double)class068893.B), class04995.u((double)d, (double)class068892.Z, (double)class068893.Z));
    }

    public class11065 N(class11087 class110872, class07438 class074382, class00734 class007342, class06889 class068892, class11499 class114992, class11499 class114993, boolean bl, boolean bl2, boolean bl3) {
        float f;
        long l = System.currentTimeMillis();
        if (this.N(class110872, bl2, bl3)) {
            this.N_2 = l;
            this.y_5 = false;
        }
        if (l >= (Long)this.N_2 && l >= (Long)this.N_0 && this.N(class110872, class074382, class114992, class114993, bl, bl2, bl3)) {
            this.N(l, class007342);
        }
        if (((Boolean)this.y_5).booleanValue() && l < (Long)this.y_0) {
            return new class11065(class068892, false, true);
        }
        if (l >= (Long)this.y_0) {
            this.y_5 = false;
        }
        if (l >= (Long)this.N_2) {
            return new class11065(class068892, false);
        }
        float f2 = class04995.N((float)((float)(l - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1)), (float)0.0f, (float)1.0f);
        float f3 = (float)Math.sin((double)f2 * Math.PI);
        if (f3 <= 0.08f) {
            return new class11065(class068892, false);
        }
        class06889 class068893 = class007342.R();
        double d = Math.max(0.08, (class007342.u - class007342.N) * 0.5);
        double d2 = Math.max(0.08, (class007342.R - class007342.L) * 0.5);
        class06889 class068894 = new class06889(class068893.M + (double)((Float)this.y_1).floatValue() * (d + (double)((Float)this.y_4).floatValue()), class04995.N((double)(class068892.B + (double)((Float)this.y_3).floatValue()), (double)(class007342.y - (class007342.i - class007342.y) * 0.18), (double)(class007342.i + (class007342.i - class007342.y) * 0.16)), class068893.Z + (double)((Float)this.y_2).floatValue() * (d2 + (double)((Float)this.y_4).floatValue()));
        class06889 class068895 = this.N(class068892, class068894, f3);
        class11499 class114994 = class09170.N((class06889)class068895);
        float f4 = Math.abs(class09170.N((float)class114992.y(), (float)class114994.y()));
        if (this.N(l, f2, f4, f = Math.abs(class114994.R() - class114992.R()), bl2, bl3)) {
            this.y(l);
            return new class11065(class068892, false, true);
        }
        return new class11065(class068895, true);
    }
}

