/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09170
 *  Nursultan.class11087
 *  Nursultan.class11499
 *  minecraft.class04995
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09131;
import Nursultan.class09163;
import Nursultan.class09166;
import Nursultan.class09170;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class09161 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
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
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public static Object i_0;

    private int L() {
        if (!((Boolean)this.N_4).booleanValue() || (Integer)this.y_7 == 0) {
            return 0;
        }
        return ((int[])this.L_2)[((Integer)this.y_6 - 1 + 18) % 18];
    }

    private int M() {
        if (!((Boolean)this.N_4).booleanValue() || (Integer)this.y_7 == 0) {
            return 0;
        }
        return ((int[])this.L_1)[((Integer)this.y_6 - 1 + 18) % 18];
    }

    public class09161() {
        this.R();
        this.u_0 = new class09166();
        this.u_1 = new int[18];
        this.u_2 = new int[18];
        this.u_3 = new int[18];
        this.L_0 = new int[18];
        this.L_1 = new int[18];
        this.L_2 = new int[18];
        this.L_3 = new int[18];
        this.L_4 = new int[18];
        this.L_5 = new int[18];
        this.y_0 = new int[18];
    }

    static {
        class09161.z();
    }

    private static void z() {
        i_0 = 18;
    }

    private boolean y(int n, boolean bl) {
        int n2;
        int n3;
        int n4;
        if (!((Boolean)this.N_4).booleanValue()) {
            return false;
        }
        int n5 = bl ? ((Integer)this.N_2).intValue() : ((Integer)this.N_3).intValue();
        int n6 = n - n5;
        int n7 = this.N(bl);
        if (n == n5 || n6 == n7 && Math.abs(n6) <= 2) {
            return true;
        }
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        for (n4 = 0; n4 < (Integer)this.y_7; ++n4) {
            n3 = bl ? ((int[])this.L_3)[n4] : ((int[])this.L_4)[n4];
            int n11 = n2 = bl ? ((int[])this.L_5)[n4] : ((int[])this.y_0)[n4];
            if (n3 == n) {
                ++n8;
            }
            if (Math.abs(n3) == Math.abs(n)) {
                ++n9;
            }
            if (n2 != n6 || n6 == 0) continue;
            ++n10;
        }
        if (n8 > 0 || n9 > 1 || n10 > 0) {
            return true;
        }
        if ((Integer)this.y_7 >= 4) {
            int n12;
            int n13;
            n4 = ((Integer)this.y_6 - 1 + 18) % 18;
            n3 = ((Integer)this.y_6 - 2 + 18) % 18;
            n2 = bl ? ((int[])this.L_3)[n4] : ((int[])this.L_4)[n4];
            int n14 = n - n2;
            if (n14 == (n13 = n2 - (n12 = bl ? ((int[])this.L_3)[n3] : ((int[])this.L_4)[n3]))) {
                return true;
            }
        }
        return false;
    }

    private float y(float f, double d) {
        if (Math.abs(f) <= 1.0E-4f || d <= 1.0E-5) {
            return f;
        }
        int n = Math.round(f / (float)d);
        if (n == 0) {
            n = f > 0.0f ? 1 : -1;
        }
        return (float)n * (float)d;
    }

    private void N(long l, float f, boolean bl, boolean bl2) {
        if (l < (Long)this.y_1) {
            return;
        }
        float f2 = (bl ? 0.58f : 0.0f) + (bl2 ? 0.42f : 0.0f);
        this.y_2 = Float.valueOf(((class09166)this.u_0).y(-f * (0.28f + f2 * 0.22f), f * (0.36f + f2 * 0.36f)));
        this.y_3 = Float.valueOf(((class09166)this.u_0).y(-f * (0.14f + f2 * 0.12f), f * (0.18f + f2 * 0.18f)));
        this.y_4 = Float.valueOf(((class09166)this.u_0).y(-0.083728f - f2 * 0.027362f, 0.117263f + f2 * 0.043728f));
        this.y_5 = Float.valueOf(((class09166)this.u_0).y(-0.063728f - f2 * 0.018273f, 0.092736f + f2 * 0.027362f));
        this.y_1 = l + (long)((class09166)this.u_0).y(bl ? 28.372639f : 42.736282f, bl2 ? 88.82736f : 136.37263f);
    }

    public void N() {
        this.y_1 = 0L;
        this.y_2 = Float.valueOf(0.0f);
        this.y_3 = Float.valueOf(0.0f);
        this.y_4 = Float.valueOf(0.0f);
        this.y_5 = Float.valueOf(0.0f);
        this.y_6 = 0;
        this.y_7 = 0;
        this.N_0 = 0;
        this.N_1 = 0;
        this.N_2 = 0;
        this.N_3 = 0;
        this.N_4 = false;
        for (int i = 0; i < 18; ++i) {
            ((int[])this.u_1)[i] = 0;
            ((int[])this.u_2)[i] = 0;
            ((int[])this.u_3)[i] = 0;
            ((int[])this.L_0)[i] = 0;
            ((int[])this.L_1)[i] = 0;
            ((int[])this.L_2)[i] = 0;
            ((int[])this.L_3)[i] = 0;
            ((int[])this.L_4)[i] = 0;
            ((int[])this.L_5)[i] = 0;
            ((int[])this.y_0)[i] = 0;
        }
        ((class09166)this.u_0).y();
    }

    private int N(boolean bl) {
        if (!((Boolean)this.N_4).booleanValue() || (Integer)this.y_7 == 0) {
            return 0;
        }
        int n = ((Integer)this.y_6 - 1 + 18) % 18;
        return bl ? ((int[])this.L_5)[n] : ((int[])this.y_0)[n];
    }

    private int N(float f, double d) {
        if (Math.abs(f) <= 1.0E-4f || d <= 1.0E-5) {
            return 0;
        }
        int n = Math.round(f / (float)d);
        return n == 0 ? (f > 0.0f ? 1 : -1) : n;
    }

    private int N(int n, int n2, boolean bl) {
        if (n > n2) {
            return ((class09166)this.u_0).N(0.68f) ? 1 : -1;
        }
        if (n < n2) {
            return ((class09166)this.u_0).N(0.68f) ? -1 : 1;
        }
        int n3 = this.N(bl);
        if (n3 != 0) {
            return -Integer.signum(n3);
        }
        return ((class09166)this.u_0).N();
    }

    private void N(float f, float f2, float f3, float f4, double d, float f5) {
        int n = this.N(f, d);
        int n2 = this.N(f2, d);
        int n3 = (Boolean)this.N_4 != false ? n - (Integer)this.N_0 : 0;
        int n4 = (Boolean)this.N_4 != false ? n2 - (Integer)this.N_1 : 0;
        int n5 = Math.round(f3 / f5);
        int n6 = Math.round(f4 / f5);
        int n7 = (Boolean)this.N_4 != false ? n5 - (Integer)this.N_2 : 0;
        int n8 = (Boolean)this.N_4 != false ? n6 - (Integer)this.N_3 : 0;
        ((int[])this.u_1)[((Integer)this.y_6).intValue()] = (n + 32768) * 65537 ^ n2 + 32768;
        ((int[])this.u_2)[((Integer)this.y_6).intValue()] = (n5 + 32768) * 65537 ^ n6 + 32768;
        ((int[])this.u_3)[((Integer)this.y_6).intValue()] = n;
        ((int[])this.L_0)[((Integer)this.y_6).intValue()] = n2;
        ((int[])this.L_1)[((Integer)this.y_6).intValue()] = n3;
        ((int[])this.L_2)[((Integer)this.y_6).intValue()] = n4;
        ((int[])this.L_3)[((Integer)this.y_6).intValue()] = n5;
        ((int[])this.L_4)[((Integer)this.y_6).intValue()] = n6;
        ((int[])this.L_5)[((Integer)this.y_6).intValue()] = n7;
        ((int[])this.y_0)[((Integer)this.y_6).intValue()] = n8;
        this.y_6 = ((Integer)this.y_6 + 1) % 18;
        this.y_7 = Math.min(18, (Integer)this.y_7 + 1);
        this.N_0 = n;
        this.N_1 = n2;
        this.N_2 = n5;
        this.N_3 = n6;
        this.N_4 = true;
    }

    private float N(float f, float f2, boolean bl, boolean bl2) {
        int n = Math.max(1, Math.round(f / f2));
        int n2 = bl ? ((Integer)this.N_2).intValue() : ((Integer)this.N_3).intValue();
        for (int i = 0; i < 7 && this.y(n, bl); ++i) {
            int n3 = this.N(n, n2, bl);
            int n4 = bl ? (bl2 ? 9 : 6) : (bl2 ? 6 : 4);
            n += n3 * ((class09166)this.u_0).N(1 + i / 2, n4);
            n = Math.max(1, n);
        }
        return (float)n * f2;
    }

    private boolean N(float f, float f2, double d, boolean bl) {
        int n;
        int n2;
        int n3;
        int n4 = this.N(f, d);
        int n5 = n3 = bl ? 0 : this.N(f2, d);
        if (n4 == 0 && n3 == 0) {
            return false;
        }
        int n6 = (Boolean)this.N_4 != false ? n4 - (Integer)this.N_0 : 0;
        int n7 = n2 = (Boolean)this.N_4 != false ? n3 - (Integer)this.N_1 : 0;
        if (((Boolean)this.N_4).booleanValue() && n4 == (Integer)this.N_0 && n3 == (Integer)this.N_1) {
            return true;
        }
        if (((Boolean)this.N_4).booleanValue() && n6 == this.M() && n2 == this.L() && Math.abs(n4) + Math.abs(n3) > 1) {
            return true;
        }
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        for (n = 0; n < (Integer)this.y_7; ++n) {
            if (((int[])this.u_3)[n] == n4 && ((int[])this.L_0)[n] == n3) {
                ++n8;
            }
            if (((int[])this.L_1)[n] == n6 && ((int[])this.L_2)[n] == n2 && (n6 != 0 || n2 != 0)) {
                ++n9;
            }
            if (Math.abs(((int[])this.u_3)[n]) != Math.abs(n4) || Math.abs(((int[])this.L_0)[n]) != Math.abs(n3)) continue;
            ++n10;
        }
        if (n8 > 0 || n9 > 0 || n10 > 1) {
            return true;
        }
        if ((Integer)this.y_7 >= 4) {
            n = ((Integer)this.y_6 - 1 + 18) % 18;
            int n11 = ((Integer)this.y_6 - 2 + 18) % 18;
            int n12 = n4 - ((int[])this.u_3)[n];
            int n13 = n3 - ((int[])this.L_0)[n];
            int n14 = ((int[])this.u_3)[n] - ((int[])this.u_3)[n11];
            int n15 = ((int[])this.L_0)[n] - ((int[])this.L_0)[n11];
            return n12 == n14 && n13 == n15 && (n12 != 0 || n13 != 0);
        }
        return false;
    }

    public class09131 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, float f, float f2) {
        if (class114992 == null || class114993 == null || class114994 == null) {
            return new class09131(class114994, f, f2);
        }
        float f3 = (float)Math.max(d, (double)0.035f);
        this.N(System.currentTimeMillis(), f3, bl4, bl5);
        float f4 = class09170.N((float)class114992.y(), (float)class114994.y());
        float f5 = bl ? 0.0f : class114994.R() - class114992.R();
        float f6 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f7 = class114993.R() - class114992.R();
        float f8 = ((Float)this.y_2).floatValue() + ((class09166)this.u_0).N(true, f3 * (0.263728f + (bl4 ? 0.327362f : 0.0f)));
        float f9 = bl ? 0.0f : ((Float)this.y_3).floatValue() + ((class09166)this.u_0).N(false, f3 * (0.127362f + (bl5 ? 0.172638f : 0.0f)));
        f4 = this.N(f4 + f8, f6, f3, true, bl4 || bl5);
        f5 = bl ? 0.0f : this.N(f5 + f9, f7, f3, false, bl4 || bl5);
        f4 = this.N(f4, d, true);
        f5 = bl ? 0.0f : this.N(f5, d, false);
        class09163 class091632 = this.N(f4, f5, f6, f7, d, bl, bl4 || bl5);
        f4 = class091632.N();
        f5 = class091632.y();
        class11499 class114995 = new class11499(class114992.y() + f4, class04995.N((float)(class114992.R() + f5), (float)-90.0f, (float)90.0f));
        if (bl2 && !bl3 && class110872 != null && !class110872.N(class074382, class114995)) {
            class114995 = this.N(class110872, class074382, class114992, class114994, f4, f5, d, bl);
            f4 = class09170.N((float)class114992.y(), (float)class114995.y());
            f5 = bl ? 0.0f : class114995.R() - class114992.R();
        }
        float f10 = Math.max(0.004f, f3 * 0.183728f);
        float f11 = this.N(Math.max(Math.abs(f4) + f10, f * (1.0f + ((Float)this.y_4).floatValue())), f10, true, bl4 || bl5);
        float f12 = this.N(Math.max(Math.abs(f5) + f10, f2 * (1.0f + ((Float)this.y_5).floatValue())), f10, false, bl4 || bl5);
        this.N(f4, f5, f11, f12, d, f10);
        return new class09131(class114995, f11, f12);
    }

    private class09163 N(float f, float f2, float f3, float f4, double d, boolean bl, boolean bl2) {
        if (d <= 1.0E-5) {
            return new class09163(f, f2);
        }
        float f5 = f;
        float f6 = bl ? 0.0f : f2;
        for (int i = 0; i < 8 && this.N(f5, f6, d, bl); ++i) {
            float f7;
            float f8 = this.N(f3, f5);
            float f9 = bl ? 0.0f : this.N(f4, f6);
            float f10 = f8 * (float)d * ((class09166)this.u_0).y(0.75f + (float)i * 0.24f, bl2 ? 4.8f : 3.2f);
            float f11 = bl ? 0.0f : (f7 = f9 * (float)d * ((class09166)this.u_0).y(0.38f + (float)i * 0.12f, bl2 ? 2.8f : 1.75f));
            if ((i & 1) == 1 && !bl) {
                f7 = -f7 * ((class09166)this.u_0).y(0.55f, 1.15f);
            }
            if (i >= 3 && ((class09166)this.u_0).N(0.42f)) {
                f10 = -f10 * ((class09166)this.u_0).y(0.35f, 0.8f);
            }
            f5 = this.N(f5 + f10, f3, (float)Math.max(d, (double)0.035f), true, bl2);
            f6 = bl ? 0.0f : this.N(f6 + f7, f4, (float)Math.max(d, (double)0.035f), false, bl2);
            f5 = this.y(f5, d);
            f6 = bl ? 0.0f : this.y(f6, d);
        }
        return new class09163(f5, f6);
    }

    private float N(float f, double d, boolean bl) {
        int n;
        if (Math.abs(f) <= 1.0E-4f || d <= 1.0E-5) {
            return f;
        }
        int n2 = Math.round(f / (float)d);
        if (n2 == 0) {
            n2 = f > 0.0f ? 1 : -1;
        }
        int n3 = n = bl ? ((Integer)this.N_0).intValue() : ((Integer)this.N_1).intValue();
        if (n2 == n && Math.abs(n2) > 1 || this.N(n2, bl) > 2) {
            int n4;
            int n5 = n4 = n2 == 0 ? ((class09166)this.u_0).N() : (n2 > 0 ? 1 : -1);
            if ((n2 += n4 * ((class09166)this.u_0).N(1, bl ? 4 : 3)) == 0) {
                n2 = n4;
            }
        }
        return (float)n2 * (float)d;
    }

    private float N(float f, float f2, float f3, boolean bl, boolean bl2) {
        if (Math.abs(f2) <= 1.0E-4f) {
            float f4 = f3 * (bl ? 4.372638f : 2.172638f);
            return class04995.N((float)f, (float)(-f4), (float)f4);
        }
        float f5 = f3 * (bl ? 2.827362f : 1.372638f) * (bl2 ? 1.427362f : 1.0f);
        return class04995.N((float)f, (float)(-Math.abs(f2) - f5), (float)(Math.abs(f2) + f5));
    }

    private float N(float f, float f2) {
        if (Math.abs(f) > 1.0E-4f) {
            return f > 0.0f ? 1.0f : -1.0f;
        }
        if (Math.abs(f2) > 1.0E-4f) {
            return f2 > 0.0f ? 1.0f : -1.0f;
        }
        return ((class09166)this.u_0).N();
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, float f2, double d, boolean bl) {
        for (float f3 : new float[]{0.82f, 0.64f, 0.46f, 0.28f, -0.22f}) {
            class11499 class114994 = new class11499(class114992.y() + this.y(f * f3, d), class04995.N((float)(class114992.R() + (bl ? 0.0f : this.y(f2 * f3, d))), (float)-90.0f, (float)90.0f));
            if (!class110872.N(class074382, class114994)) continue;
            return class114994;
        }
        return class114993;
    }

    private int N(int n, boolean bl) {
        int n2 = 0;
        for (int i = 0; i < (Integer)this.y_7; ++i) {
            int n3;
            int n4 = n3 = bl ? ((int[])this.u_3)[i] : ((int[])this.L_0)[i];
            if (n3 != n && Math.abs(n3) != Math.abs(n)) continue;
            ++n2;
        }
        return n2;
    }

    private void R() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_1 = 0L;
            this.y_2 = Float.valueOf(0.0f);
            this.y_3 = Float.valueOf(0.0f);
            this.y_4 = Float.valueOf(0.0f);
            this.y_5 = Float.valueOf(0.0f);
            this.y_6 = 0;
            this.y_7 = 0;
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_2 = 0;
            this.N_3 = 0;
            this.N_4 = false;
        }
    }
}

