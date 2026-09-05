/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11097
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class09136;
import Nursultan.class09139;
import Nursultan.class11097;
import minecraft.class04995;

public class class09159 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;

    public class09159() {
        this.y();
        this.N_3 = Float.valueOf(1.0f);
    }

    private void y() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = 0L;
            this.N_2 = 0L;
            this.N_3 = Float.valueOf(0.0f);
        }
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.N_3 = Float.valueOf(1.0f);
    }

    public class09136 N(class11097 class110972, float f, float f2, float f3, boolean bl) {
        float f4;
        if (class110972.N()) {
            return new class09136(f3, 0.0f);
        }
        long l = System.currentTimeMillis();
        this.N(l, class110972, bl);
        float f5 = f;
        float f6 = f2;
        if (class110972.z() && !class110972.M() && !class110972.B()) {
            f4 = class04995.N((float)(class110972.L() / 2.8f), (float)0.16f, (float)0.72f);
            f5 = Math.min(f5, Math.max(f3, class110972.L() * f4 + f3 * 0.65f));
            f6 *= class04995.N((float)f4, (float)0.18f, (float)0.58f);
        }
        if (l < (Long)this.N_1 && !class110972.B()) {
            f5 = Math.min(f5, f3 * class09139.N(0.7, 1.35));
            f6 *= 0.18f;
        }
        if (l < (Long)this.N_2 || class110972.B()) {
            f4 = class110972.B() ? class09139.N(0.72, 0.92) : class09139.N(0.42, 0.66);
            f5 = Math.max(f5, class110972.L() * f4);
            f6 = Math.max(f6, class110972.B() ? class09139.N(0.72, 0.94) : class09139.N(0.48, 0.72));
        }
        return new class09136(Math.max(f3, f5 *= ((Float)this.N_3).floatValue()), class04995.N((float)f6, (float)0.0f, (float)1.0f));
    }

    private void N(long l, class11097 class110972, boolean bl) {
        double d;
        double d2;
        if (l < (Long)this.N_0) {
            return;
        }
        this.N_3 = Float.valueOf(class09139.N(0.74, bl ? 1.28 : 1.08));
        if (!class110972.B() && class110972.L() < 3.0f) {
            d2 = Math.random();
            double d3 = d = class110972.z() ? 0.46 : 0.24;
            if (d2 < d) {
                this.N_1 = l + (long)class09139.N(45.0, 115.0);
            }
        }
        if (class110972.M() || class110972.L() > 2.4f) {
            d2 = Math.random();
            double d4 = d = bl ? 0.42 : 0.2;
            if (d2 < d) {
                this.N_2 = l + (long)class09139.N(55.0, 125.0);
            }
        }
        this.N_0 = l + (long)class09139.N(bl ? 70.0 : 115.0, bl ? 180.0 : 310.0);
    }
}

