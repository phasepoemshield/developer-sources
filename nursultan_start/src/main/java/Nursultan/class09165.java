/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class09139;
import minecraft.class04995;

public class class09165 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = 0L;
            this.N_2 = 0L;
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = Float.valueOf(0.0f);
            this.N_5 = Float.valueOf(0.0f);
        }
    }

    public class09165() {
        this.M();
        this.N_5 = Float.valueOf(class09139.N(0.0, Math.PI * 2));
    }

    private void N(long l, float f, float f2, boolean bl, boolean bl2) {
        float f3;
        if (l < (Long)this.N_0 || l < (Long)this.N_2) {
            return;
        }
        boolean bl3 = f > f2 * (bl2 ? 2.4f : 4.0f);
        boolean bl4 = bl3;
        if (!bl3 && !bl) {
            return;
        }
        float f4 = bl2 ? 0.62f : (f3 = bl ? 0.48f : 0.24f);
        if (Math.random() > (double)f3) {
            this.N_0 = l + (long)class09139.N(85.0, 210.0);
            return;
        }
        this.N_3 = Float.valueOf(class09139.N(bl2 ? 0.26 : 0.16, bl ? 0.72 : 0.48));
        this.N_4 = Float.valueOf(class09139.N(0.08, bl ? 0.32 : 0.22));
        this.N_5 = Float.valueOf(class09139.N(0.0, Math.PI * 2));
        this.N_1 = l;
        this.N_2 = l + (long)class09139.N(45.0, 125.0);
        this.N_0 = l + (long)class09139.N(135.0, 360.0);
    }

    public float N(float f, float f2, float f3, boolean bl, boolean bl2, boolean bl3) {
        float f4;
        long l = System.currentTimeMillis();
        this.N(l, f2, f3, bl, bl2);
        float f5 = bl3 ? 34.0f : 9.0f;
        float f6 = class04995.N((float)(f2 / f5), (float)0.0f, (float)1.0f);
        float f7 = 0.82f + (float)Math.sqrt(f6) * (bl3 ? 0.44f : 0.32f);
        float f8 = (float)Math.sin((double)l * (bl3 ? 0.028 : 0.021) + (double)((Float)this.N_5).floatValue()) * (bl3 ? 0.085f : 0.055f);
        float f9 = this.N(l, bl3);
        float f10 = bl2 ? (bl3 ? 1.16f : 1.08f) : (f4 = 1.0f);
        float f11 = bl ? (bl3 ? 1.08f : 1.04f) : 1.0f;
        return Math.max(f3, f * Math.max(0.72f, f7 + f8) * f9 * f4 * f11);
    }

    private float N(long l, boolean bl) {
        if (l < (Long)this.N_1 || l >= (Long)this.N_2) {
            return 1.0f;
        }
        float f = (float)Math.sin((double)class04995.N((float)((float)(l - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1)), (float)0.0f, (float)1.0f) * Math.PI);
        float f2 = bl ? ((Float)this.N_3).floatValue() : ((Float)this.N_4).floatValue();
        return 1.0f + f * f2;
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.N_3 = Float.valueOf(0.0f);
        this.N_4 = Float.valueOf(0.0f);
        this.N_5 = Float.valueOf(class09139.N(0.0, Math.PI * 2));
    }
}

