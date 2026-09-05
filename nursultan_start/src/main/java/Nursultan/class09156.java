/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09139;
import Nursultan.class09168;

public class class09156 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public class09156() {
        this.u();
        this.N_2 = Float.valueOf(1.0f);
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = 0L;
            this.N_2 = Float.valueOf(0.0f);
        }
    }

    private float y(boolean bl, boolean bl2, boolean bl3, float f) {
        float f2;
        float f3 = bl3 ? 1.48f : (f2 = bl2 ? 1.34f : 1.38f);
        float f4 = bl3 ? 2.2f : (bl || f >= 9.0f ? 2.2f : 2.04f);
        return (float)((double)class09139.N((double)f2, (double)f4) + Math.random() * 9.7137E-4);
    }

    private void N(long l, float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        if (l < (Long)this.N_0) {
            return;
        }
        if (l < (Long)this.N_1 || f <= f2 * 3.0f) {
            return;
        }
        float f3 = this.N(bl, bl2, bl3, f);
        if (Math.random() > (double)f3) {
            this.N_1 = l + (long)class09139.N(45.0, bl2 ? 135.0 : 95.0);
            return;
        }
        this.N_2 = Float.valueOf(this.y(bl, bl2, bl3, f));
        this.N_0 = l + (long)class09139.N(bl3 ? 42.0 : 58.0, bl3 ? 92.0 : 148.0);
        this.N_1 = l + (long)class09139.N(bl ? 95.0 : 145.0, bl2 ? 360.0 : 280.0);
    }

    public class09168 N(float f, float f2, float f3, boolean bl, boolean bl2, boolean bl3) {
        long l = System.currentTimeMillis();
        this.N(l, f2, f3, bl, bl2, bl3);
        if (l >= (Long)this.N_0) {
            return new class09168(f, false);
        }
        return new class09168(f * ((Float)this.N_2).floatValue(), true);
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = 0L;
        this.N_2 = Float.valueOf(1.0f);
    }

    private float N(boolean bl, boolean bl2, boolean bl3, float f) {
        float f2;
        float f3 = bl3 ? 0.72f : (f2 = bl ? 0.58f : 0.38f);
        if (bl2) {
            f2 += 0.2f;
        }
        if (f >= 7.0f) {
            f2 += 0.1f;
        }
        return Math.min(f2, 0.86f);
    }
}

