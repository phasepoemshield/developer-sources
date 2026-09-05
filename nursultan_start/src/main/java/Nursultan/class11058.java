/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09122
 *  Nursultan.class09132
 *  Nursultan.class09133
 *  Nursultan.class09138
 *  Nursultan.class09166
 *  Nursultan.class09167
 *  Nursultan.class09170
 *  Nursultan.class09171
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

import Nursultan.class09122;
import Nursultan.class09132;
import Nursultan.class09133;
import Nursultan.class09138;
import Nursultan.class09166;
import Nursultan.class09167;
import Nursultan.class09170;
import Nursultan.class09171;
import Nursultan.class11064;
import Nursultan.class11087;
import Nursultan.class11088;
import Nursultan.class11499;
import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public class class11058 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public Object y_7;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public boolean u_init;

    private void L(int n) {
        this.y_5 = n;
        this.y_6 = 0L;
        this.y_7 = Float.valueOf(0.0f);
        this.L_0 = Float.valueOf(0.0f);
        this.L_1 = Float.valueOf(0.0f);
        this.L_2 = Float.valueOf(0.0f);
        this.N_0 = Float.valueOf(0.0f);
        this.N_1 = Float.valueOf(0.0f);
        this.N_2 = 0L;
        this.N_3 = Float.valueOf(0.5f);
        this.N_4 = Float.valueOf(0.68f);
        this.N_5 = Float.valueOf(0.5f);
        this.N_6 = false;
        this.u_0 = false;
        this.u_1 = false;
        ((class09166)this.y_0).y();
        ((class09167)this.y_1).N();
        ((class11088)this.y_2).y();
        ((class09171)this.y_3).N();
        ((class09133)this.y_4).N();
    }

    public class11058() {
        this.R();
        this.y_0 = new class09166();
        this.y_1 = new class09167();
        this.y_2 = new class11088();
        this.y_3 = new class09171();
        this.y_4 = new class09133();
        this.y_5 = Integer.MIN_VALUE;
        this.N_3 = Float.valueOf(0.5f);
        this.N_4 = Float.valueOf(0.68f);
        this.N_5 = Float.valueOf(0.5f);
    }

    public boolean y() {
        return ((class11088)this.y_2).N();
    }

    private float y(float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        float f3 = f * (bl2 || bl3 ? 14.0f : 9.0f);
        float f4 = f2 * (bl ? 0.66f : 0.84f);
        return Math.max(f3, f4);
    }

    private boolean N(class00734 class007342, class06889 class068892, double d) {
        boolean bl = class007342.M(0.025).u(class068892);
        boolean bl2 = class068892.M >= class007342.N - 0.34 && class068892.M <= class007342.u + 0.34 && class068892.Z >= class007342.L - 0.34 && class068892.Z <= class007342.R + 0.34 && class068892.B >= class007342.y - 0.45 && class068892.B <= class007342.i + 0.95;
        return bl || bl2 || d <= 0.82;
    }

    private float N(float f, float f2, float f3, float f4) {
        float f5 = Math.abs(f2);
        if (f5 <= 1.0E-4f) {
            return f;
        }
        float f6 = Math.signum(f2);
        if (Math.signum(f) != f6) {
            return f2 * f3;
        }
        float f7 = f5 * f3;
        if (Math.abs(f) < f7) {
            return f6 * f7;
        }
        return class04995.N((float)f, (float)(-f5 * f4), (float)(f5 * f4));
    }

    private float N(float f, float f2, boolean bl) {
        float f3 = 9.0f - f2 * 1.6f + (bl ? 2.2f : 0.0f);
        return Math.max(f * 3.0f, class04995.N((float)f3, (float)5.0f, (float)12.0f));
    }

    private float N(float f, float f2, boolean bl, boolean bl2) {
        float f3 = 42.0f - f2 * 7.5f - ((Float)this.L_0).floatValue() * 4.5f;
        if (bl) {
            f3 += 10.0f;
        }
        if (bl2) {
            f3 += 4.0f;
        }
        return Math.max(f * 10.0f, class04995.N((float)f3, (float)26.0f, (float)(bl ? 56.0f : 46.0f)));
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, boolean bl, boolean bl2) {
        long l = System.currentTimeMillis();
        if (l >= (Long)this.y_6) {
            float f2 = bl2 ? 1.0f : 0.0f;
            this.L_1 = Float.valueOf(((class09166)this.y_0).N(true, f * (0.28f + f2 * 0.18f)));
            this.L_2 = Float.valueOf(((class09166)this.y_0).N(false, f * (0.16f + f2 * 0.08f)));
            this.y_6 = l + (long)((class09166)this.y_0).y(bl2 ? 65.0f : 105.0f, bl2 ? 150.0f : 260.0f);
        }
        class11499 class114994 = new class11499(class114993.y() + ((Float)this.L_1).floatValue(), class04995.N((float)(class114993.R() + ((Float)this.L_2).floatValue()), (float)-90.0f, (float)90.0f));
        return !bl || class110872.N(class074382, class114994) ? class114994 : class114993;
    }

    private class06889 N(class00734 class007342, float f, float f2, float f3) {
        return new class06889(class04995.u((double)f, (double)class007342.N, (double)class007342.u), class04995.u((double)f2, (double)class007342.y, (double)class007342.i), class04995.u((double)f3, (double)class007342.L, (double)class007342.R));
    }

    private class06889 N(class00734 class007342, boolean bl) {
        long l = System.currentTimeMillis();
        if (bl || l >= (Long)this.N_2) {
            float f = ((class09166)this.y_0).N();
            this.N_3 = Float.valueOf(class04995.N((float)(0.5f + f * ((class09166)this.y_0).y(0.08f, 0.28f)), (float)0.2f, (float)0.8f));
            this.N_4 = Float.valueOf(((class09166)this.y_0).y(0.58f, 0.86f));
            this.N_5 = Float.valueOf(class04995.N((float)(0.5f + ((class09166)this.y_0).y(-0.24f, 0.24f)), (float)0.2f, (float)0.8f));
            this.N_2 = l + (long)((class09166)this.y_0).y(58.0f, 155.0f);
        }
        return this.N(class007342, ((Float)this.N_3).floatValue(), ((Float)this.N_4).floatValue(), ((Float)this.N_5).floatValue());
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        float f3;
        float f4 = this.N(f, f2, bl, bl2);
        class11499 class114994 = this.N(class114992, class114993, f4, f3 = this.N(f, f2, bl));
        if (class110872.N(class074382, class114994)) {
            return class114994;
        }
        class11499 class114995 = this.N(class114992, class09170.N((class06889)this.N(class11064.u((class07049)class074382), true)), f4, f3);
        if (class110872.N(class074382, class114995)) {
            return class114995;
        }
        class11499 class114996 = this.N(class114992, class09170.N((class06889)class11064.y((class07049)class074382)), f4 * 1.18f, f3);
        if (class110872.N(class074382, class114996)) {
            return class114996;
        }
        if (bl3 && class110872.N(class074382, class114992)) {
            return this.N(class110872, class074382, class114992, f, bl2);
        }
        return class114994;
    }

    private void N(class11499 class114992, class11499 class114993) {
        this.N_0 = Float.valueOf(class09170.N((float)class114992.y(), (float)class114993.y()));
        this.N_1 = Float.valueOf(class114993.R() - class114992.R());
        this.u_0 = true;
    }

    private class11499 N(class11499 class114992, class11499 class114993, float f, float f2) {
        float f3 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f4 = class114993.R() - class114992.R();
        return new class11499(class114992.y() + class04995.N((float)f3, (float)(-f), (float)f), class04995.N((float)(class114992.R() + class04995.N((float)f4, (float)(-f2), (float)f2)), (float)-90.0f, (float)90.0f));
    }

    public void N() {
        this.y_5 = Integer.MIN_VALUE;
        this.y_6 = 0L;
        this.y_7 = Float.valueOf(0.0f);
        this.L_0 = Float.valueOf(0.0f);
        this.L_1 = Float.valueOf(0.0f);
        this.L_2 = Float.valueOf(0.0f);
        this.N_0 = Float.valueOf(0.0f);
        this.N_1 = Float.valueOf(0.0f);
        this.N_2 = 0L;
        this.N_3 = Float.valueOf(0.5f);
        this.N_4 = Float.valueOf(0.68f);
        this.N_5 = Float.valueOf(0.5f);
        this.N_6 = false;
        this.u_0 = false;
        this.u_1 = false;
        ((class09166)this.y_0).y();
        ((class09167)this.y_1).N();
        ((class11088)this.y_2).y();
        ((class09171)this.y_3).N();
        ((class09133)this.y_4).N();
    }

    private float N(float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        float f3 = f * (bl2 || bl3 ? 34.0f : 24.0f);
        float f4 = f2 * (bl ? 0.72f : 0.92f);
        return Math.max(f3, f4);
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, float f2, float f3, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        float f4 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f5 = class114993.R() - class114992.R();
        float f6 = Math.abs(f4);
        float f7 = Math.abs(f5);
        if (f6 <= f * 0.8f && f7 <= f * 0.55f) {
            class11499 class114994 = this.N(class110872, class074382, class114992, class114993, f, bl, bl4);
            this.N(class114992, class114994);
            return class114994;
        }
        class09138 class091382 = ((class09167)this.y_1).N(f4, f5, f, f2, ((Float)this.L_0).floatValue(), f3, bl, bl2, bl3, bl4, bl5);
        float f8 = class091382.R();
        float f9 = class091382.i();
        float f10 = class091382.B();
        float f11 = class091382.Z();
        float f12 = class091382.z();
        float f13 = class091382.M();
        this.u_1 = class091382.N();
        f12 = this.N(f12, f4, f8, f10);
        f13 = this.N(f13, f5, f9, f11);
        if (((Boolean)this.u_0).booleanValue() && !class091382.u()) {
            float f14 = this.N(f, f6, bl, bl3, bl4) * class091382.L();
            float f15 = this.y(f, f7, bl, bl3, bl4) * class091382.y();
            f12 = ((Float)this.N_0).floatValue() + class04995.N((float)(f12 - ((Float)this.N_0).floatValue()), (float)(-f14), (float)f14);
            f13 = ((Float)this.N_1).floatValue() + class04995.N((float)(f13 - ((Float)this.N_1).floatValue()), (float)(-f15), (float)f15);
            f12 = this.N(f12, f4, f8, f10);
            f13 = this.N(f13, f5, f9, f11);
        }
        class11499 class114995 = new class11499(class114992.y() + f12, class04995.N((float)(class114992.R() + f13), (float)-90.0f, (float)90.0f));
        if (bl && !class110872.N(class074382, class114995)) {
            class114995 = this.N(class110872, class074382, class114992, class114993, f12, f13, f);
        }
        this.N(class114992, class114995);
        return class114995;
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, float f2, float f3) {
        float[] fArray = new float[]{0.82f, 0.66f, 0.48f, 0.3f};
        for (float f4 : fArray) {
            class11499 class114994 = new class11499(class114992.y() + class04995.B((float)f4, (float)class09170.N((float)class114992.y(), (float)class114993.y()), (float)f), class04995.N((float)(class114992.R() + class04995.B((float)f4, (float)(class114993.R() - class114992.R()), (float)f2)), (float)-90.0f, (float)90.0f));
            if (!class110872.N(class074382, class114994)) continue;
            return class114994;
        }
        Object object = new class11499(class114992.y() + ((class09166)this.y_0).N(true, f3 * 0.22f), class04995.N((float)(class114992.R() + ((class09166)this.y_0).N(false, f3 * 0.12f)), (float)-90.0f, (float)90.0f));
        return (float[])(class110872.N(class074382, (class11499)object) ? object : (float[])class114993);
    }

    public class09122 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, float f2, double d, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        if ((class04453)((class06202)class11087.N_0).T_4 == null || class110872 == null || class074382 == null || class114992 == null || class114993 == null) {
            return new class09122(class114993, f, f2, bl, bl3, bl4);
        }
        if (((Integer)this.y_5).intValue() != class074382.method_5628()) {
            this.L(class074382.method_5628());
        }
        float f3 = (float)Math.max(d, (double)0.035f);
        class06889 class068892 = class11064.y((class07049)class074382);
        class06889 class068893 = ((class04453)((class06202)class11087.N_0).T_4).method_33571();
        class00734 class007342 = class11064.u((class07049)class074382);
        double d2 = Math.hypot(((class04453)((class06202)class11087.N_0).T_4).method_23317() - class068892.M, ((class04453)((class06202)class11087.N_0).T_4).method_23321() - class068892.Z);
        double d3 = class068893.R(class068892);
        float f4 = class110872.N(class074382);
        boolean bl7 = d2 <= Math.min(2.85, (double)(f4 + 0.45f)) && d3 <= (double)(f4 + 1.35f);
        float f5 = this.N(class068892, bl7);
        this.u_1 = false;
        boolean bl8 = this.N(class007342, class068893, d2);
        boolean bl9 = ((class09133)this.y_4).N(class074382, class007342, class068893, d2, f4);
        float f6 = class04995.N((float)((float)((2.85 - d2) / 1.65) + (bl9 ? 0.22f : 0.0f)), (float)0.0f, (float)1.0f);
        if (!((class11088)this.y_2).N(class110872, class074382, class114992, class114993, class007342, class068893, class068892, d2, d3, f4, bl7, bl8, bl9, bl2)) {
            return new class09122(class114993, f, f2, bl, bl3, bl4, false, false, f6, bl8, bl9);
        }
        float f7 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f8 = class114993.R() - class114992.R();
        boolean bl10 = Math.abs(f7) > class04995.N((float)(96.0f - f6 * 18.0f), (float)72.0f, (float)96.0f);
        boolean bl11 = bl10;
        class09132 class091322 = ((class09171)this.y_3).N(class114992, class114993, f3, f6, f5, bl8, bl2, bl4, bl5, f, f2);
        if (class091322.u() && !bl2) {
            this.N(class114992, class091322.N());
            return new class09122(class091322.N(), class091322.y(), class091322.L(), false, false, true, true, true, f6, bl8, bl9);
        }
        if (bl2) {
            if (bl10 && bl8) {
                class11499 class114994 = this.N(class110872, class074382, class114992, f3, bl5);
                this.N(class114992, class114994);
                return new class09122(class114994, f, f2, bl && !bl9, false, false, false, true, f6, bl8, bl9);
            }
            class11499 class114995 = this.N(class110872, class074382, class114992, class114993, f3, f6, f5, true, bl8, bl4 || bl9, bl5, bl6);
            return new class09122(class114995, f, f2, bl && !bl9, false, bl4 || (Boolean)this.u_1 != false || bl9, false, true, f6, bl8, bl9);
        }
        if (bl8 && bl10) {
            class11499 class114996 = this.N(class110872, class074382, class114992, class114993, f3, f6, bl4, bl5);
            return new class09122(class114996, f, f2, false, false, true, false, true, f6, bl8, bl9);
        }
        return new class09122(this.N(class110872, class074382, class114992, class114993, f3, f6, f5, false, bl8, bl4 || bl9, bl5, bl6), f, f2, bl && !bl9, bl3, bl4 || (Boolean)this.u_1 != false || bl9, false, true, f6, bl8, bl9);
    }

    private float N(class06889 class068892, boolean bl) {
        if (!bl) {
            this.L_0 = Float.valueOf(((Float)this.L_0).floatValue() * 0.72f);
            this.N_6 = false;
            return 0.0f;
        }
        float f = (float)Math.toDegrees(Math.atan2(((class04453)((class06202)class11087.N_0).T_4).method_23321() - class068892.Z, ((class04453)((class06202)class11087.N_0).T_4).method_23317() - class068892.M));
        float f2 = (Boolean)this.N_6 != false ? class09170.N((float)((Float)this.y_7).floatValue(), (float)f) : 0.0f;
        this.y_7 = Float.valueOf(f);
        this.N_6 = true;
        this.L_0 = Float.valueOf(((Float)this.L_0).floatValue() * 0.68f + class04995.N((float)(Math.abs(f2) / 18.0f), (float)0.0f, (float)1.0f) * 0.32f);
        return f2;
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, float f2, boolean bl, boolean bl2) {
        float f3 = this.N(f, f2, true, bl2);
        float f4 = this.N(f, f2, true);
        class11499 class114994 = class09170.N((class06889)this.N(class11064.u((class07049)class074382), true));
        float f5 = class114994.R() - class114992.R();
        float[] fArray = new float[]{0.0f, (float)((class09166)this.y_0).N() * f * ((class09166)this.y_0).y(1.0f, 3.0f), (float)(-((class09166)this.y_0).N()) * f * ((class09166)this.y_0).y(1.0f, 3.0f), 7.5f, -7.5f, 15.0f, -15.0f, 26.0f, -26.0f, class04995.N((float)class09170.N((float)class114992.y(), (float)class114993.y()), (float)(-f3), (float)f3)};
        float[] fArray2 = new float[]{class04995.N((float)f5, (float)(-f4), (float)f4), 0.0f, class04995.N((float)(class114993.R() - class114992.R()), (float)(-f4), (float)f4), class04995.N((float)(f5 * 0.58f), (float)(-f4), (float)f4), class04995.N((float)(f5 - 2.8f), (float)(-f4), (float)f4), class04995.N((float)(f5 - 5.0f), (float)(-f4), (float)f4)};
        class11499 class114995 = null;
        double d = Double.MAX_VALUE;
        for (float f6 : fArray) {
            for (float f7 : fArray2) {
                double d2;
                class11499 class114996 = new class11499(class114992.y() + f6, class04995.N((float)(class114992.R() + f7), (float)-90.0f, (float)90.0f));
                if (!class110872.N(class074382, class114996) || !((d2 = (double)Math.abs(f6) * 1.35 + (double)Math.abs(f7) * 0.72) < d)) continue;
                class114995 = class114996;
                d = d2;
            }
        }
        if (class114995 != null) {
            return class114995;
        }
        return this.N(class114992, class114994, f3, f4);
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, float f, boolean bl) {
        class11499 class114993;
        long l = System.currentTimeMillis();
        if (l >= (Long)this.y_6) {
            float f2 = bl ? 1.0f : 0.0f;
            this.L_1 = Float.valueOf(((class09166)this.y_0).N(true, f * (0.55f + f2 * 0.25f)));
            this.L_2 = Float.valueOf(((class09166)this.y_0).N(false, f * (0.22f + f2 * 0.12f)));
            this.y_6 = l + (long)((class09166)this.y_0).y(bl ? 90.0f : 145.0f, bl ? 210.0f : 360.0f);
        }
        return class110872.N(class074382, class114993 = new class11499(class114992.y() + ((Float)this.L_1).floatValue(), class04995.N((float)(class114992.R() + ((Float)this.L_2).floatValue()), (float)-90.0f, (float)90.0f))) ? class114993 : class114992;
    }

    private void R() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_5 = 0;
            this.y_6 = 0L;
            this.y_7 = Float.valueOf(0.0f);
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = Float.valueOf(0.0f);
            this.L_1 = Float.valueOf(0.0f);
            this.L_2 = Float.valueOf(0.0f);
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = 0L;
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = Float.valueOf(0.0f);
            this.N_5 = Float.valueOf(0.0f);
            this.N_6 = false;
        }
        if (!this.u_init) {
            this.u_init = true;
            this.u_0 = false;
            this.u_1 = false;
        }
    }
}

