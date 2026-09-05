/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09170
 *  Nursultan.class11087
 *  Nursultan.class11097
 *  Nursultan.class11499
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class09139;
import Nursultan.class09148;
import Nursultan.class09170;
import Nursultan.class11087;
import Nursultan.class11097;
import Nursultan.class11499;
import minecraft.class04995;

public class class09140 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = 0L;
            this.N_2 = 0L;
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = Float.valueOf(0.0f);
            this.N_5 = Float.valueOf(0.0f);
            this.N_6 = 0;
            this.N_7 = 0;
        }
    }

    public class09140() {
        this.L();
        this.N_3 = Float.valueOf(1.0f);
        this.N_4 = Float.valueOf(0.0f);
    }

    private boolean N(class11087 class110872, class11097 class110972, float f, boolean bl, boolean bl2, boolean bl3) {
        if (bl2 || f <= 1.65f || class110872.y().y() < 42L) {
            return false;
        }
        if (class110972.B() || class110972.M()) {
            return true;
        }
        if (!class110972.z() && f > 3.4f) {
            return true;
        }
        if (bl3 && f > 2.4f) {
            return true;
        }
        if (bl && f > 5.0f) {
            return Math.random() < (double)0.64f;
        }
        return (Integer)this.N_7 >= 2 && f > 4.2f || f > 10.0f && Math.random() < (double)0.34f;
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.N_3 = Float.valueOf(1.0f);
        this.N_4 = Float.valueOf(0.0f);
        this.N_5 = Float.valueOf(0.0f);
        this.N_6 = 0;
        this.N_7 = 0;
    }

    private void N(long l, class11097 class110972, float f, boolean bl) {
        boolean bl2 = class110972.M() || class110972.B() || !class110972.z() || f > 12.0f;
        this.N_3 = Float.valueOf(class09139.N(bl2 ? (double)1.34f : (double)1.08f, bl2 ? (double)2.18f : (double)1.62f));
        this.N_4 = Float.valueOf(class09139.N(bl2 ? (double)0.46f : (double)0.3f, bl ? (double)0.82f : (double)(bl2 ? 0.74f : 0.58f)));
        this.N_1 = l;
        this.N_2 = l + (long)class09139.N(bl2 ? 58.0 : 46.0, bl2 ? 128.0 : 96.0);
        this.N_0 = l + (long)class09139.N(bl2 ? 120.0 : 185.0, bl2 ? 420.0 : 680.0);
    }

    public class09148 N(class11087 class110872, class11499 class114992, class11097 class110972, float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        int n;
        float f3;
        float f4;
        int n2;
        long l = System.currentTimeMillis();
        float f5 = class110972.U();
        int n3 = Math.max(1, Math.round(f / f2));
        if (n3 == (Integer)this.N_6) {
            int n4 = (Integer)this.N_7 + 1;
            n2 = n4;
            this.N_7 = n4;
        } else {
            n2 = 0;
        }
        this.N_7 = n2;
        boolean bl4 = l < (Long)this.N_2;
        boolean bl5 = bl4;
        if (!bl4 && l >= (Long)this.N_0 && this.N(class110872, class110972, f5, bl, bl2, bl3)) {
            this.N(l, class110972, f5, bl3);
            bl4 = true;
        }
        float f6 = f;
        boolean bl6 = false;
        if (bl4) {
            f4 = class04995.N((float)((float)(l - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1)), (float)0.0f, (float)1.0f);
            f3 = (float)Math.pow(1.0f - f4, 0.42f);
            float f7 = 0.34f + f3 * ((Float)this.N_3).floatValue();
            float f8 = f5 * ((Float)this.N_4).floatValue() * f7;
            f6 = Math.max(f6, f8);
            f6 *= class09139.N((double)1.08f, (double)(1.0f + ((Float)this.N_3).floatValue() * 0.18f));
            bl6 = true;
        }
        if ((Integer)this.N_7 >= 1 && f5 > f2 * 4.0f) {
            f4 = Math.signum(class09170.N((float)class114992.y(), (float)class110972.y().y()));
            f3 = f4 == 0.0f ? class09139.N(-2.0, 2.0) : f4 * class09139.N(1.0, bl ? 6.0 : 3.0);
            f6 = Math.max(f2, f6 + f3 * f2);
            bl6 |= bl || (Integer)this.N_7 >= 2;
        }
        if ((n = Math.max(1, Math.round(f6 / f2))) == (Integer)this.N_6 && n > 1) {
            n += Math.random() > 0.5 ? 1 : -1;
        }
        f6 = Math.max(f2, (float)n * f2);
        this.N_6 = n;
        this.N_5 = Float.valueOf(f6);
        return new class09148(f6, bl6);
    }
}

