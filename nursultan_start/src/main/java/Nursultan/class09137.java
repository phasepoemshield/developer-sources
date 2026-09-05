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

import Nursultan.class09170;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class09137 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public class09137() {
        this.u();
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_2 = false;
        }
    }

    private boolean y(int n, int n2) {
        return n == (Integer)this.N_0 || n2 == (Integer)this.N_1;
    }

    private int N(float f, float f2) {
        if (Math.abs(f) <= 1.0E-4f) {
            return 0;
        }
        return Math.round(f / f2);
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

    private int[] N(boolean bl, int n) {
        if (!bl) {
            return new int[]{0};
        }
        return new int[]{n, -n, n * 2, -n * 2, n * 3, -n * 3, n * 4, -n * 4};
    }

    public class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2) {
        if (class114992 == null || class114993 == null || class114994 == null) {
            return class114994;
        }
        float f = (float)Math.max(d, (double)0.035f);
        int n = this.N(class09170.N((float)class114992.y(), (float)class114994.y()), f);
        int n2 = this.N(class114994.R() - class114992.R(), f);
        if (!((Boolean)this.N_2).booleanValue() || !this.y(n, n2)) {
            this.N(n, n2);
            return class114994;
        }
        class11499 class114995 = this.N(class110872, class074382, class114992, class114993, d, f, bl, bl2, n, n2);
        if (class114995 != null) {
            n = this.N(class09170.N((float)class114992.y(), (float)class114995.y()), f);
            n2 = this.N(class114995.R() - class114992.R(), f);
            this.N(n, n2);
            return class114995;
        }
        this.N(n, n2);
        return class114994;
    }

    private float N(float f, float f2, float f3, boolean bl) {
        float f4;
        float f5 = Math.abs(f2);
        float f6 = f4 = bl ? 0.85f : 0.45f;
        if (f5 <= f3 * f4) {
            return class04995.N((float)f, (float)(-f3 * (bl ? 4.0f : 2.0f)), (float)(f3 * (bl ? 4.0f : 2.0f)));
        }
        float f7 = Math.max(f3, Math.abs(f2) + f3 * (bl ? 1.6f : 0.85f));
        return class04995.N((float)f, (float)(-f7), (float)f7);
    }

    private boolean N(class11087 class110872, class07438 class074382, class11499 class114992, boolean bl, boolean bl2) {
        return class114992 != null && (!bl || bl2 || class110872.N(class074382, class114992));
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, double d, float f, boolean bl, boolean bl2, int n, int n2) {
        int[] nArray;
        int n3 = this.N(n, class09170.N((float)class114992.y(), (float)class114993.y()));
        int n4 = this.N(n2, class114993.R() - class114992.R());
        int[] nArray2 = this.N(n == (Integer)this.N_0, n3);
        for (int n5 : nArray = this.N(n2 == (Integer)this.N_1, n4)) {
            for (int n6 : nArray2) {
                int n7;
                int n8;
                class11499 class114994;
                if (n6 == 0 && n5 == 0 || !this.N(class110872, class074382, class114994 = this.N(class114992, class114993, d, f, n8 = n + n6, n7 = n2 + n5), bl, bl2) || !this.N(class114994, class114992, f)) continue;
                return class114994;
            }
        }
        return null;
    }

    private boolean N(class11499 class114992, class11499 class114993, float f) {
        int n = this.N(class09170.N((float)class114993.y(), (float)class114992.y()), f);
        int n2 = this.N(class114992.R() - class114993.R(), f);
        return n != (Integer)this.N_0 && n2 != (Integer)this.N_1;
    }

    private class11499 N(class11499 class114992, class11499 class114993, double d, float f, int n, int n2) {
        float f2 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f3 = class114993.R() - class114992.R();
        float f4 = this.N((float)n * f, f2, f, true);
        float f5 = this.N((float)n2 * f, f3, f, false);
        return new class11499(class114992.y() + this.N(f4, d), class04995.N((float)(class114992.R() + this.N(f5, d)), (float)-90.0f, (float)90.0f));
    }

    private void N(int n, int n2) {
        this.N_0 = n;
        this.N_1 = n2;
        this.N_2 = true;
    }

    public void N() {
        this.N_0 = 0;
        this.N_1 = 0;
        this.N_2 = false;
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
}

