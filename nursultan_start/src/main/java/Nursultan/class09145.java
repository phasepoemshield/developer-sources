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

import Nursultan.class09139;
import Nursultan.class09170;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class09145 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public boolean L_init;

    private boolean L(int n) {
        if (n == Integer.MIN_VALUE) {
            return false;
        }
        int n2 = 0;
        for (int i = 0; i < (Integer)this.L_0; ++i) {
            if (((int[])this.y_0)[i] != n) continue;
            ++n2;
        }
        return n2 >= 2;
    }

    public class09145() {
        this.i();
        this.y_0 = new int[20];
        this.y_1 = new int[20];
        this.y_2 = new int[20];
    }

    static {
        class09145.R();
    }

    private void i() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_3 = 0;
            this.y_4 = 0;
            this.y_5 = 0;
            this.y_6 = 0;
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
            this.L_1 = 0;
            this.L_2 = 0;
            this.L_3 = 0;
            this.L_4 = false;
        }
    }

    private int y(float f, float f2) {
        if (Math.abs(f) <= 1.0E-4f) {
            return 0;
        }
        return Math.round(f / f2);
    }

    public class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2, boolean bl3) {
        int n;
        int n2;
        int n3;
        float f = (float)Math.max(d, (double)0.035f);
        float f2 = class09170.N((float)class114992.y(), (float)class114994.y());
        float f3 = bl ? 0.0f : class114994.R() - class114992.R();
        int n4 = this.y(f2, f);
        int n5 = this.y(f3, f);
        int n6 = this.N(f2, f3);
        int n7 = this.N(n6);
        if (n4 == 0 && n5 == 0) {
            this.y_3 = 0;
            this.y_4 = 0;
            this.y_5 = n6;
            this.L_4 = true;
            return class114994;
        }
        boolean bl4 = (Boolean)this.L_4 != false && n4 == (Integer)this.y_3 && n5 == (Integer)this.y_4;
        boolean bl5 = (Boolean)this.L_4 != false && n6 == (Integer)this.y_5 && n6 != Integer.MIN_VALUE && (n4 != 0 || n5 != 0);
        boolean bl6 = this.N(n4, n5);
        boolean bl7 = this.L(n6);
        boolean bl8 = !bl && n4 != 0 && Math.abs(n4) == Math.abs(n5);
        boolean bl9 = bl8;
        if (bl4) {
            int n8 = (Integer)this.L_1 + 1;
            n3 = n8;
            this.L_1 = n8;
        } else {
            n3 = 0;
        }
        this.L_1 = n3;
        if (bl5) {
            int n9 = (Integer)this.L_2 + 1;
            n2 = n9;
            this.L_2 = n9;
        } else {
            n2 = 0;
        }
        this.L_2 = n2;
        if (n7 == 0 && n6 != Integer.MIN_VALUE && (Integer)this.L_0 > 0) {
            int n10 = (Integer)this.L_3 + 1;
            n = n10;
            this.L_3 = n10;
        } else {
            n = 0;
        }
        this.L_3 = n;
        class11499 class114995 = class114994;
        if (bl4 || bl6 || (Integer)this.L_2 >= 1 || (Integer)this.L_3 >= 1 || bl7 || bl8) {
            class114995 = this.N(class110872, class074382, class114992, class114993, class114994, d, f, bl, bl2, bl3, n4, n5);
            f2 = class09170.N((float)class114992.y(), (float)class114995.y());
            f3 = bl ? 0.0f : class114995.R() - class114992.R();
            n4 = this.y(f2, f);
            n5 = this.y(f3, f);
            n6 = this.N(f2, f3);
            n7 = this.N(n6);
            this.L_1 = n4 == (Integer)this.y_3 && n5 == (Integer)this.y_4 ? (Integer)this.L_1 : 0;
            this.L_2 = n6 == (Integer)this.y_5 ? (Integer)this.L_2 : 0;
            this.L_3 = n7 == 0 && n6 != Integer.MIN_VALUE && (Integer)this.L_0 > 0 ? (Integer)this.L_3 : 0;
        }
        this.y_3 = n4;
        this.y_4 = n5;
        this.y_5 = n6;
        this.N(n4, n5, n6);
        this.L_4 = true;
        return class114995;
    }

    private boolean N(int n, int n2) {
        if (n == 0 && n2 == 0) {
            return false;
        }
        for (int i = 0; i < (Integer)this.L_0; ++i) {
            if (((int[])this.y_1)[i] != n || ((int[])this.y_2)[i] != n2) continue;
            return true;
        }
        return false;
    }

    public void N() {
        this.y_3 = 0;
        this.y_4 = 0;
        this.y_5 = Integer.MIN_VALUE;
        this.y_6 = 0;
        this.L_0 = 0;
        this.L_1 = 0;
        this.L_2 = 0;
        this.L_3 = 0;
        this.L_4 = false;
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, float f, boolean bl, boolean bl2, boolean bl3, int n, int n2) {
        class11499 class114995;
        int n3 = this.N(n, class09170.N((float)class114992.y(), (float)class114993.y()));
        int n4 = this.N(n2, class114993.R() - class114992.R());
        int[] nArray = new int[]{1, -1, 2, -2, 3, -3};
        int[] nArray2 = new int[]{1, -1, 2, -2};
        if (!bl) {
            for (int n5 : nArray) {
                class114995 = this.N(class114992, class114993, d, f, n, n2 + n4 * n5, false);
                if (!this.N(class110872, class074382, class114995, bl2, bl3) || !this.N(class114992, class114995, f)) continue;
                return class114995;
            }
        }
        for (int n5 : nArray2) {
            class114995 = this.N(class114992, class114993, d, f, n + n3 * n5, bl ? 0 : n2, bl);
            if (!this.N(class110872, class074382, class114995, bl2, bl3) || !this.N(class114992, class114995, f)) continue;
            return class114995;
        }
        float f2 = class09170.N((float)class114992.y(), (float)class114994.y());
        float f3 = bl ? 0.0f : class114994.R() - class114992.R();
        float f4 = (float)n3 * f * class09139.N((double)0.35f, (double)0.85f);
        float f5 = bl ? 0.0f : (float)n4 * f * class09139.N((double)0.2f, (double)0.65f);
        class114995 = new class11499(class114992.y() + this.N(f2 + f4, d), class04995.N((float)(class114992.R() + this.N(f3 + f5, d)), (float)-90.0f, (float)90.0f));
        return this.N(class110872, class074382, class114995, bl2, bl3) ? class114995 : class114994;
    }

    private float N(float f, double d) {
        if (Math.abs(f) <= 1.0E-4f || d <= 1.0E-5) {
            return f;
        }
        int n = Math.round(f / (float)d);
        if (n == 0) {
            n = f > 0.0f ? 1 : -1;
        }
        return (float)n * (float)d;
    }

    private boolean N(class11087 class110872, class07438 class074382, class11499 class114992, boolean bl, boolean bl2) {
        return !bl || bl2 || class110872.N(class074382, class114992);
    }

    private void N(int n, int n2, int n3) {
        if (n3 == Integer.MIN_VALUE) {
            return;
        }
        ((int[])this.y_1)[((Integer)this.y_6).intValue()] = n;
        ((int[])this.y_2)[((Integer)this.y_6).intValue()] = n2;
        ((int[])this.y_0)[((Integer)this.y_6).intValue()] = n3;
        this.y_6 = ((Integer)this.y_6 + 1) % 20;
        this.L_0 = Math.min(20, (Integer)this.L_0 + 1);
    }

    private boolean N(class11499 class114992, class11499 class114993, float f) {
        int n = this.y(class09170.N((float)class114992.y(), (float)class114993.y()), f);
        int n2 = this.y(class114993.R() - class114992.R(), f);
        int n3 = this.N(class09170.N((float)class114992.y(), (float)class114993.y()), class114993.R() - class114992.R());
        return !(n == (Integer)this.y_3 && n2 == (Integer)this.y_4 || n3 == (Integer)this.y_5 || this.N(n, n2) || this.L(n3) || n2 != 0 && Math.abs(n) == Math.abs(n2));
    }

    private class11499 N(class11499 class114992, class11499 class114993, double d, float f, int n, int n2, boolean bl) {
        float f2 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f3 = class114993.R() - class114992.R();
        float f4 = this.N((float)n * f, f2, f);
        float f5 = bl ? 0.0f : this.N((float)n2 * f, f3, f);
        return new class11499(class114992.y() + this.N(f4, d), class04995.N((float)(class114992.R() + this.N(f5, d)), (float)-90.0f, (float)90.0f));
    }

    private float N(float f, float f2, float f3) {
        if (Math.abs(f2) <= f3 * 1.15f) {
            return f;
        }
        float f4 = Math.max(f3, Math.abs(f2) - f3 * 0.35f);
        return class04995.N((float)f, (float)(-f4), (float)f4);
    }

    private int N(int n, float f) {
        if (n != 0) {
            return n > 0 ? 1 : -1;
        }
        if (Math.abs(f) > 1.0E-4f) {
            return f > 0.0f ? 1 : -1;
        }
        return Math.random() > 0.5 ? 1 : -1;
    }

    private int N(int n) {
        if (n == Integer.MIN_VALUE || (Integer)this.L_0 == 0) {
            return Integer.MIN_VALUE;
        }
        int n2 = ((int[])this.y_0)[((Integer)this.y_6 - 1 + 20) % 20];
        return Math.abs(n - n2);
    }

    private int N(float f, float f2) {
        if (Math.abs(f) <= 1.0E-4f && Math.abs(f2) <= 1.0E-4f) {
            return Integer.MIN_VALUE;
        }
        return (int)Math.round(Math.toDegrees(Math.atan2(Math.abs(f2), Math.abs(f))) % 90.0 * 10.0);
    }

    private static void R() {
        N_0 = 20;
    }
}

