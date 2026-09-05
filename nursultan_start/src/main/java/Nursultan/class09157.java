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

import Nursultan.class09166;
import Nursultan.class09170;
import Nursultan.class11087;
import Nursultan.class11499;
import java.util.Arrays;
import minecraft.class04995;
import minecraft.class07438;

public class class09157 {
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
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public static Object u_0;

    private void L(int n, int n2) {
        int n3 = (Boolean)this.y_3 != false ? n - (Integer)this.N_2 : 0;
        int n4 = (Boolean)this.y_3 != false ? n2 - (Integer)this.N_3 : 0;
        int n5 = (Boolean)this.y_3 != false ? n3 - (Integer)this.N_4 : 0;
        int n6 = (Boolean)this.y_3 != false ? n4 - (Integer)this.y_0 : 0;
        ((int[])this.L_1)[((Integer)this.N_0).intValue()] = n;
        ((int[])this.L_2)[((Integer)this.N_0).intValue()] = n2;
        ((int[])this.L_3)[((Integer)this.N_0).intValue()] = n3;
        ((int[])this.L_4)[((Integer)this.N_0).intValue()] = n4;
        ((int[])this.L_5)[((Integer)this.N_0).intValue()] = this.y(n, n2);
        this.N_0 = ((Integer)this.N_0 + 1) % 34;
        this.N_1 = Math.min(34, (Integer)this.N_1 + 1);
        this.N_2 = n;
        this.N_3 = n2;
        this.N_4 = n3;
        this.y_0 = n4;
        this.y_1 = n5;
        this.y_2 = n6;
        this.y_3 = true;
    }

    private float L() {
        if ((Integer)this.N_1 < 12) {
            return 0.0f;
        }
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = 0; i < (Integer)this.N_1; ++i) {
            int n7;
            boolean bl = true;
            boolean bl2 = true;
            boolean bl3 = true;
            boolean bl4 = ((int[])this.L_5)[i] != Integer.MIN_VALUE;
            int n8 = 0;
            for (n7 = 0; n7 < i; ++n7) {
                if (((int[])this.L_1)[i] == ((int[])this.L_1)[n7] && ((int[])this.L_2)[i] == ((int[])this.L_2)[n7]) {
                    bl = false;
                }
                if (Math.abs(((int[])this.L_1)[i]) == Math.abs(((int[])this.L_1)[n7]) && Math.abs(((int[])this.L_2)[i]) == Math.abs(((int[])this.L_2)[n7])) {
                    bl2 = false;
                }
                if (((int[])this.L_3)[i] == ((int[])this.L_3)[n7] && ((int[])this.L_4)[i] == ((int[])this.L_4)[n7]) {
                    bl3 = false;
                }
                if (((int[])this.L_5)[i] != ((int[])this.L_5)[n7]) continue;
                bl4 = false;
            }
            for (n7 = 0; n7 < (Integer)this.N_1; ++n7) {
                if (((int[])this.L_1)[i] != ((int[])this.L_1)[n7] || ((int[])this.L_2)[i] != ((int[])this.L_2)[n7]) continue;
                ++n8;
            }
            if (((int[])this.L_3)[i] == 0 && ((int[])this.L_4)[i] == 0 && (((int[])this.L_1)[i] != 0 || ((int[])this.L_2)[i] != 0)) {
                ++n6;
            }
            if (bl) {
                ++n;
            }
            if (bl2) {
                ++n2;
            }
            if (bl3) {
                ++n3;
            }
            if (bl4) {
                ++n4;
            }
            n5 = Math.max(n5, n8);
        }
        float f = 0.0f;
        if (n < Math.max(5, (Integer)this.N_1 / 4)) {
            f += 0.25f;
        }
        if (n2 < Math.max(4, (Integer)this.N_1 / 5)) {
            f += 0.18f;
        }
        if (n3 < Math.max(4, (Integer)this.N_1 / 5)) {
            f += 0.25f;
        }
        if (n4 < 3 && (Integer)this.N_1 >= 16) {
            f += 0.22f;
        }
        if ((float)n5 / (float)((Integer)this.N_1).intValue() > 0.24f) {
            f += 0.28f;
        }
        if ((float)n6 / (float)((Integer)this.N_1).intValue() > 0.34f) {
            f += 0.24f;
        }
        return f;
    }

    public class09157() {
        this.i();
        this.L_0 = new class09166();
        this.L_1 = new int[34];
        this.L_2 = new int[34];
        this.L_3 = new int[34];
        this.L_4 = new int[34];
        this.L_5 = new int[34];
    }

    static {
        class09157.Z();
    }

    private static void Z() {
        u_0 = 34;
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_2 = 0;
            this.N_3 = 0;
            this.N_4 = 0;
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
            this.y_1 = 0;
            this.y_2 = 0;
            this.y_3 = false;
        }
    }

    private int i(int n) {
        if (n == Integer.MIN_VALUE) {
            return 0;
        }
        int n2 = 0;
        for (int i = 0; i < (Integer)this.N_1; ++i) {
            if (((int[])this.L_5)[i] != n) continue;
            ++n2;
        }
        return n2;
    }

    private int u(int n, int n2) {
        int n3 = 0;
        for (int i = 0; i < (Integer)this.N_1; ++i) {
            if (((int[])this.L_3)[i] != n || ((int[])this.L_4)[i] != n2) continue;
            ++n3;
        }
        return n3;
    }

    private int y(int n, int n2) {
        if (n == 0 && n2 == 0) {
            return Integer.MIN_VALUE;
        }
        return (int)Math.round(Math.toDegrees(Math.atan2(Math.abs(n2), Math.abs(n))) * 8.0);
    }

    public class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        class11499 class114995;
        if (class114992 == null || class114993 == null || class114994 == null) {
            return class114994;
        }
        float f = (float)Math.max(d, (double)0.035f);
        float f2 = class09170.N((float)class114992.y(), (float)class114994.y());
        float f3 = bl ? 0.0f : class114994.R() - class114992.R();
        int n = this.N(f2, f);
        int n2 = this.N(f3, f);
        if (n == 0 && n2 == 0) {
            this.L(n, n2);
            return bl && class114994.R() != class114992.R() ? new class11499(class114994.y(), class114992.R()) : class114994;
        }
        float f4 = this.N(n, n2);
        float f5 = bl4 || bl5 ? 0.34f : 0.48f;
        class11499 class114996 = class114994;
        if ((f4 >= f5 || ((class09166)this.L_0).N(f4 * (bl4 ? 0.32f : 0.18f))) && (class114995 = this.N(class110872, class074382, class114992, class114993, class114994, d, f, bl, bl2, bl3, bl4, bl5, n, n2, f4)) != null) {
            class114996 = class114995;
        }
        if (bl && class114996.R() != class114992.R()) {
            class114996 = new class11499(class114996.y(), class114992.R());
        }
        this.L(this.N(class09170.N((float)class114992.y(), (float)class114996.y()), f), this.N(class114996.R() - class114992.R(), f));
        return class114996;
    }

    private boolean N(class11499 class114992, class11499 class114993, float f) {
        int n = this.N(class09170.N((float)class114992.y(), (float)class114993.y()), f);
        int n2 = this.N(class114993.R() - class114992.R(), f);
        if (n == 0 && n2 == 0) {
            return false;
        }
        int n3 = (Boolean)this.y_3 != false ? n - (Integer)this.N_2 : 0;
        int n4 = (Boolean)this.y_3 != false ? n2 - (Integer)this.N_3 : 0;
        int n5 = this.y(n, n2);
        return !((Boolean)this.y_3 != false && n == (Integer)this.N_2 && n2 == (Integer)this.N_3 || (Boolean)this.y_3 != false && Math.abs(n) == Math.abs((Integer)this.N_2) && Math.abs(n2) == Math.abs((Integer)this.N_3) || (Boolean)this.y_3 != false && n3 == (Integer)this.N_4 && n4 == (Integer)this.y_0 || this.N(n, n2, false) != 0 || this.N(n, n2, true) > 1 || this.u(n3, n4) != 0 || this.i(n5) > 1);
    }

    private static float N(class11499 class114992, class11499 class114993) {
        return class09170.N((float)class114993.y(), (float)class114992.y());
    }

    public void N() {
        Arrays.fill((int[])this.L_1, 0);
        Arrays.fill((int[])this.L_2, 0);
        Arrays.fill((int[])this.L_3, 0);
        Arrays.fill((int[])this.L_4, 0);
        Arrays.fill((int[])this.L_5, Integer.MIN_VALUE);
        this.N_0 = 0;
        this.N_1 = 0;
        this.N_2 = 0;
        this.N_3 = 0;
        this.N_4 = 0;
        this.y_0 = 0;
        this.y_1 = 0;
        this.y_2 = 0;
        this.y_3 = false;
        ((class09166)this.L_0).y();
    }

    private int N(float f, float f2) {
        if (Math.abs(f) <= 1.0E-4f) {
            return 0;
        }
        return Math.round(f / f2);
    }

    private boolean N(class11087 class110872, class07438 class074382, class11499 class114992, boolean bl, boolean bl2) {
        return class114992 != null && (!bl || bl2 || class110872.N(class074382, class114992));
    }

    private int N(int n, float f) {
        if (n != 0) {
            return n > 0 ? 1 : -1;
        }
        if (Math.abs(f) > 1.0E-4f) {
            return f > 0.0f ? 1 : -1;
        }
        return ((class09166)this.L_0).N();
    }

    private float N(float f, float f2, float f3, boolean bl, float f4) {
        if (Math.abs(f2) <= 1.0E-4f) {
            float f5 = f3 * (bl ? 2.6f : 1.2f) * (0.55f + f4);
            return class04995.N((float)f, (float)(-f5), (float)f5);
        }
        float f6 = Math.signum(f2);
        if (Math.signum(f) != f6 && Math.abs(f2) > f3 * 1.15f) {
            f = f6 * Math.abs(f);
        }
        float f7 = f3 * ((class09166)this.L_0).y(bl ? 0.35f : 0.22f, bl ? 2.9f : 1.25f);
        float f8 = Math.max(f3, Math.abs(f2) + f7 * (Math.abs(f2) <= f3 * 3.0f ? 1.0f : -0.45f));
        return class04995.N((float)f, (float)(-f8), (float)f8);
    }

    private int N(int n, int n2, int n3) {
        if (n2 <= 0) {
            return 0;
        }
        int n4 = n < 6 ? n % 3 + 1 : ((class09166)this.L_0).N(1, n2);
        int n5 = n % 2 == 0 ? n3 : -n3;
        int n6 = n5;
        if (n >= 10 && ((class09166)this.L_0).N(0.38f)) {
            n5 *= -1;
        }
        return n4 * n5;
    }

    private float N(int n, int n2) {
        if (!((Boolean)this.y_3).booleanValue()) {
            return 0.0f;
        }
        int n3 = n - (Integer)this.N_2;
        int n4 = n2 - (Integer)this.N_3;
        int n5 = n3 - (Integer)this.N_4;
        int n6 = n4 - (Integer)this.y_0;
        float f = 0.0f;
        if (n == (Integer)this.N_2 && n2 == (Integer)this.N_3) {
            f += 0.55f;
        }
        if (Math.abs(n) == Math.abs((Integer)this.N_2) && Math.abs(n2) == Math.abs((Integer)this.N_3)) {
            f += 0.26f;
        }
        if (n3 == (Integer)this.N_4 && n4 == (Integer)this.y_0) {
            f += n3 == 0 && n4 == 0 ? 0.45f : 0.36f;
        }
        if (n5 == (Integer)this.y_1 && n6 == (Integer)this.y_2) {
            f += 0.22f;
        }
        f += Math.min(0.38f, (float)this.N(n, n2, false) * 0.11f);
        f += Math.min(0.28f, (float)this.N(n, n2, true) * 0.07f);
        f += Math.min(0.34f, (float)this.u(n3, n4) * 0.12f);
        return Math.min(1.6f, f += this.L());
    }

    private int N(int n, int n2, boolean bl) {
        int n3 = 0;
        for (int i = 0; i < (Integer)this.N_1; ++i) {
            boolean bl2 = bl ? Math.abs(((int[])this.L_1)[i]) == Math.abs(n) && Math.abs(((int[])this.L_2)[i]) == Math.abs(n2) : ((int[])this.L_1)[i] == n && ((int[])this.L_2)[i] == n2;
            if (!bl2) continue;
            ++n3;
        }
        return n3;
    }

    private float N(float f, double d) {
        if (Math.abs(f) <= 1.0E-4f || d <= 1.0E-5) {
            return f;
        }
        float f2 = Math.signum(f);
        float f3 = Math.abs(f) / (float)d;
        int n = Math.max(1, (int)Math.floor(f3));
        int n2 = Math.max(n, (int)Math.ceil(f3));
        int n3 = ((class09166)this.L_0).N(f3 - (float)n) ? n2 : n;
        return f2 * (float)n3 * (float)d;
    }

    private class11499 N(class11499 class114992, float f, float f2, double d, float f3, int n, int n2, boolean bl, float f4) {
        float f5 = this.N((float)n * f3, f, f3, true, f4);
        float f6 = bl ? 0.0f : this.N((float)n2 * f3, f2, f3, false, f4);
        return new class11499(class114992.y() + this.N(f5, d), class04995.N((float)(class114992.R() + this.N(f6, d)), (float)-90.0f, (float)90.0f));
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n, int n2, float f2) {
        float f3 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f4 = bl ? 0.0f : class114993.R() - class114992.R();
        int n3 = this.N(n, f3);
        int n4 = bl ? 0 : this.N(n2, f4);
        int n5 = Math.min(9, Math.max(2, Math.round(2.0f + f2 * 5.5f + (bl4 ? 2.0f : 0.0f))));
        int n6 = bl ? 0 : Math.min(5, Math.max(1, Math.round(1.0f + f2 * 3.0f + (bl5 ? 1.0f : 0.0f))));
        for (int i = 0; i < 28; ++i) {
            class11499 class114995;
            int n7 = this.N(i, n5, n3);
            int n8 = bl ? 0 : this.N(i + 7, n6, n4);
            int n9 = n8;
            if (n7 == 0 && n8 == 0 || !this.N(class110872, class074382, class114995 = this.N(class114992, f3, f4, d, f, n + n7, bl ? 0 : n2 + n8, bl, f2), bl2, bl3) || !this.N(class114992, class114995, f)) continue;
            return class114995;
        }
        float f5 = ((class09166)this.L_0).N(true, f * class04995.N((float)(f2 * 2.2f), (float)0.4f, (float)2.8f));
        float f6 = bl ? 0.0f : ((class09166)this.L_0).N(false, f * class04995.N((float)f2, (float)0.18f, (float)1.2f));
        class11499 class114996 = new class11499(class114992.y() + this.N(class09157.N(class114994, class114992) + f5, d), class04995.N((float)(class114992.R() + this.N((bl ? 0.0f : class114994.R() - class114992.R()) + f6, d)), (float)-90.0f, (float)90.0f));
        return this.N(class110872, class074382, class114996, bl2, bl3) && this.N(class114992, class114996, f) ? class114996 : null;
    }
}

