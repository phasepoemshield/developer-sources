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

import Nursultan.class09123;
import Nursultan.class09139;
import Nursultan.class09170;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class09152 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = 0;
            this.N_4 = 0;
            this.N_5 = 0;
            this.N_6 = 0;
            this.N_7 = 0;
        }
    }

    public class09152() {
        this.M();
    }

    private float N(float f, float f2, float f3) {
        if (Math.abs(f2) <= f3 * 2.0f) {
            return f;
        }
        float f4 = Math.max(f3, Math.abs(f2) - f3 * class09139.N(0.9, 2.6));
        return class04995.N((float)f, (float)(-f4), (float)f4);
    }

    private void N(long l, float f, boolean bl) {
        if (l < (Long)this.N_0) {
            return;
        }
        this.N_1 = Float.valueOf(class09139.N((double)(-f * (bl ? 1.55f : 0.9f)), (double)(f * (bl ? 1.85f : 0.92f))));
        this.N_2 = Float.valueOf(class09139.N((double)(-f * (bl ? 0.48f : 0.32f)), (double)(f * (bl ? 0.48f : 0.32f))));
        this.N_0 = l + (long)class09139.N(bl ? 70.0 : 180.0, bl ? 190.0 : 420.0);
    }

    private float N(float f, float f2, boolean bl, boolean bl2) {
        int n = Math.max(1, Math.round(f / f2));
        int n2 = bl ? ((Integer)this.N_5).intValue() : ((Integer)this.N_6).intValue();
        int n3 = n2;
        if (n == n2 && bl2 && Math.random() < (double)0.46f) {
            int n4 = Math.random() > 0.5 ? 1 : -1;
            int n5 = bl2 ? 3 : 1;
            n = Math.max(1, n + n4 * Math.max(1, Math.round(class09139.N(1.0, (double)n5))));
        }
        if (bl) {
            this.N_5 = n;
        } else {
            this.N_6 = n;
        }
        return (float)n * f2;
    }

    public void N(class11499 class114992) {
        this.N_0 = 0L;
        this.N_1 = Float.valueOf(0.0f);
        this.N_2 = Float.valueOf(0.0f);
        this.N_3 = 0;
        this.N_4 = 0;
        this.N_5 = 0;
        this.N_6 = 0;
        this.N_7 = 0;
    }

    private int N(float f, float f2) {
        if (Math.abs(f) <= 1.0E-4f) {
            return 0;
        }
        return Math.round(f / f2);
    }

    public class09123 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        int n;
        float f3 = (float)Math.max(class09170.N(), (double)0.035f);
        long l = System.currentTimeMillis();
        this.N(l, f3, bl);
        float f4 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f5 = bl2 ? 0.0f : class114993.R() - class114992.R();
        int n2 = this.N(f4, f3);
        int n3 = this.N(f5, f3);
        if (n2 == (Integer)this.N_3 && n3 == (Integer)this.N_4 && (n2 != 0 || n3 != 0)) {
            int n4 = (Integer)this.N_7 + 1;
            n = n4;
            this.N_7 = n4;
        } else {
            n = 0;
        }
        this.N_7 = n;
        class11499 class114994 = class114993;
        if ((Integer)this.N_7 >= 4 || bl && (Integer)this.N_7 >= 2 || bl && Math.random() < 0.16) {
            class114994 = this.N(class110872, class074382, class114992, class114993, f4, f5, f3, bl2, bl3, bl);
            f4 = class09170.N((float)class114992.y(), (float)class114994.y());
            f5 = bl2 ? 0.0f : class114994.R() - class114992.R();
            n2 = this.N(f4, f3);
            n3 = this.N(f5, f3);
        }
        float f6 = this.N(f, f3, true, bl);
        float f7 = bl2 ? f3 : this.N(f2, f3, false, bl);
        this.N_3 = n2;
        this.N_4 = n3;
        return new class09123(class114994, f6, f7);
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, float f, float f2, float f3, boolean bl, boolean bl2, boolean bl3) {
        float f4;
        if (bl2 && Math.abs(f) + Math.abs(f2) < f3 * 0.8f) {
            return class114993;
        }
        float f5 = Math.abs(f) > 1.0E-4f ? Math.signum(f) : (f4 = Math.random() > 0.5 ? 1.0f : -1.0f);
        float f6 = Math.abs(f2) > 1.0E-4f ? Math.signum(f2) : (Math.random() > 0.5 ? 1.0f : -1.0f);
        float f7 = f4 * f3 * class09139.N(0.54, bl3 ? 3.25 : 1.72) + ((Float)this.N_1).floatValue();
        float f8 = bl ? 0.0f : f6 * f3 * class09139.N(0.22, bl3 ? 1.08 : 0.58) + ((Float)this.N_2).floatValue();
        class11499 class114994 = new class11499(class114992.y() + this.N(f + f7, f, f3), class04995.N((float)(class114992.R() + this.N(f2 + f8, f2, f3)), (float)-90.0f, (float)90.0f));
        if (class110872.N(class074382, class114994)) {
            return class114994;
        }
        return bl2 && class110872.N(class074382, class114992) ? class114992 : class114993;
    }
}

