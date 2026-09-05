/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class09126;
import Nursultan.class09139;
import minecraft.class04995;

public class class09162 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public boolean y_init;

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
            this.N_1 = 0L;
            this.N_2 = 0L;
            this.N_3 = Float.valueOf(0.0f);
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_1 = Float.valueOf(0.0f);
            this.y_2 = Float.valueOf(0.0f);
            this.y_3 = Float.valueOf(0.0f);
            this.y_4 = 0;
            this.y_5 = false;
        }
    }

    public class09162() {
        this.M();
    }

    private float z() {
        if ((Long)this.N_2 <= 0L) {
            return 1.0f;
        }
        return class04995.N((float)((float)(System.currentTimeMillis() - (Long)this.N_1) / (float)((Long)this.N_2).longValue()), (float)0.0f, (float)1.0f);
    }

    private int y(float f) {
        if (Math.abs(f) <= 1.0E-4f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    private float y(long l) {
        if ((Long)this.N_0 <= 0L) {
            this.N_0 = l;
            return 1.0f;
        }
        float f = class04995.N((float)((float)(l - (Long)this.N_0) / 50.0f), (float)0.35f, (float)1.8f);
        this.N_0 = l;
        return f;
    }

    private float y(float f, float f2, float f3, float f4, boolean bl, boolean bl2, boolean bl3) {
        float f5 = Math.abs(f);
        if (f5 <= 1.0E-4f || Math.abs(f2) <= 1.0E-4f) {
            this.y_3 = Float.valueOf(((Float)this.y_3).floatValue() * 0.45f);
            return 0.0f;
        }
        float f6 = this.z();
        float f7 = this.N(f6);
        float f8 = (bl ? 0.66f : 0.52f) + (float)Math.pow(class04995.N((float)(f5 / 28.0f), (float)0.0f, (float)1.0f), 0.34) * 0.24f;
        if (bl2 || bl3) {
            f8 += 0.14f;
        }
        float f9 = this.R() && !bl3 ? class04995.B((float)f7, (float)Math.min(f8, 0.62f), (float)f8) : f8;
        float f10 = Math.max(f3 * 0.45f, f5 * f9 + f3 * class09139.N((double)1.2f, 5.0));
        float f11 = class04995.N((float)f2, (float)(-f10), (float)f10);
        float f12 = (f3 * (this.R() ? class04995.B((float)f7, (float)(bl ? 8.0f : 5.6f), (float)(bl ? 17.0f : 11.5f)) : (bl ? 13.5f : 8.8f)) + (float)Math.pow(Math.abs(f11 - ((Float)this.y_1).floatValue()) + f3 * 0.5f, 0.92) * 1.35f) * class04995.N((float)f4, (float)0.45f, (float)1.65f);
        float f13 = ((Float)this.y_1).floatValue() + class04995.N((float)(f11 - ((Float)this.y_1).floatValue()), (float)(-f12), (float)f12);
        this.y_3 = Float.valueOf(((Float)this.y_3).floatValue() * 0.18f + f13 * 0.82f);
        f13 = class04995.B((float)(this.R() ? 0.035f : 0.02f), (float)f13, (float)((Float)this.y_3).floatValue());
        if (Math.signum(f13) != Math.signum(f) && f5 > f3) {
            f13 = Math.signum(f) * Math.min(Math.abs(f13), f10);
        }
        return class04995.N((float)f13, (float)(-f5), (float)f5);
    }

    public class09126 N(float f, float f2, float f3, float f4, float f5, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        long l = System.currentTimeMillis();
        float f6 = this.y(l);
        int n = this.y(f);
        float f7 = (Boolean)this.y_5 != false ? Math.abs(f - ((Float)this.N_3).floatValue()) : 0.0f;
        boolean bl6 = (Boolean)this.y_5 != false && n != 0 && (Integer)this.y_4 != 0 && n != (Integer)this.y_4 && Math.abs(f) > Math.max(4.2f, f5 * 12.0f);
        boolean bl7 = Math.abs(f) > Math.max(7.2f, f5 * 17.0f) && (f7 > Math.max(3.6f, f5 * 8.5f) || bl6 || Math.abs(f3) > Math.max(4.0f, f5 * 9.0f));
        boolean bl8 = bl7;
        if (bl7 && !bl5) {
            this.N(l, f, f7, bl2, bl3, bl4);
        }
        float f8 = this.N(f, f3, f5, f6, bl2, bl3, bl5);
        float f9 = bl ? 0.0f : this.y(f2, f4, f5, f6, bl2, bl3, bl5);
        this.N_3 = Float.valueOf(f);
        this.y_0 = Float.valueOf(f8);
        this.y_1 = Float.valueOf(f9);
        if (n != 0) {
            this.y_4 = n;
        }
        this.y_5 = true;
        return new class09126(f8, f9);
    }

    private void N(long l, float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        float f3 = class04995.N((float)((Math.abs(f) + f2 * 0.45f) / 120.0f), (float)0.0f, (float)1.0f);
        float f4 = bl || bl2 ? 12.0f : 16.0f;
        float f5 = bl3 ? 34.0f : 52.0f;
        this.N_1 = l;
        this.N_2 = (long)class09139.N((double)(f4 + f3 * 6.0f), (double)(f5 + f3 * 14.0f));
        this.y_4 = this.y(f);
        this.y_2 = Float.valueOf(((Float)this.y_2).floatValue() * 0.96f);
        this.y_3 = Float.valueOf(((Float)this.y_3).floatValue() * 0.88f);
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.N_3 = Float.valueOf(0.0f);
        this.y_0 = Float.valueOf(0.0f);
        this.y_1 = Float.valueOf(0.0f);
        this.y_2 = Float.valueOf(0.0f);
        this.y_3 = Float.valueOf(0.0f);
        this.y_4 = 0;
        this.y_5 = false;
    }

    private float N(float f, float f2, float f3, float f4, boolean bl, boolean bl2, boolean bl3) {
        float f5 = Math.abs(f);
        if (f5 <= 1.0E-4f || Math.abs(f2) <= 1.0E-4f) {
            this.y_2 = Float.valueOf(((Float)this.y_2).floatValue() * 0.35f);
            return 0.0f;
        }
        float f6 = this.z();
        float f7 = this.N(f6);
        float f8 = class04995.N((float)(f5 / 96.0f), (float)0.0f, (float)1.0f);
        float f9 = (bl ? 0.82f : 0.7f) + (float)Math.pow(f8, 0.28) * (bl ? 0.22f : 0.24f);
        if (bl2) {
            f9 += 0.14f;
        }
        if (bl3) {
            f9 += 0.2f;
        }
        float f10 = this.R() && !bl3 ? class04995.B((float)f7, (float)Math.min(f9, bl ? 0.78f : 0.7f), (float)f9) : f9;
        float f11 = Math.max(f3, f5 * f10 + f3 * class09139.N(4.0, bl ? 18.0 : 13.0));
        float f12 = class04995.N((float)f2, (float)(-f11), (float)f11);
        float f13 = f3 * (this.R() ? class04995.B((float)f7, (float)(bl ? 22.0f : 16.0f), (float)(bl ? 46.0f : 34.0f)) : (bl ? 36.0f : 26.0f));
        float f14 = (float)Math.pow(Math.abs(f12 - ((Float)this.y_0).floatValue()) + f3, 0.94) * (bl ? 2.35f : 1.85f);
        float f15 = (f13 + f14) * class04995.N((float)f4, (float)0.45f, (float)1.65f);
        float f16 = ((Float)this.y_0).floatValue() + class04995.N((float)(f12 - ((Float)this.y_0).floatValue()), (float)(-f15), (float)f15);
        float f17 = this.R() ? class04995.B((float)f7, (float)0.88f, (float)0.96f) : (bl ? 0.92f : 0.84f);
        this.y_2 = Float.valueOf(((Float)this.y_2).floatValue() * (1.0f - f17) + f16 * f17);
        f16 = class04995.B((float)(this.R() ? 0.04f : 0.03f), (float)f16, (float)((Float)this.y_2).floatValue());
        if (Math.signum(f16) != Math.signum(f) && f5 > f3 * 2.0f) {
            f16 = Math.signum(f) * Math.min(Math.abs(f16), f11);
        }
        return class04995.N((float)f16, (float)(-f5), (float)f5);
    }

    private float N(float f) {
        float f2 = class04995.N((float)f, (float)0.0f, (float)1.0f);
        float f3 = 1.0f - (float)Math.pow(1.0f - f2, 8.0);
        float f4 = (float)Math.sin((double)f2 * Math.PI) * 0.06f;
        return class04995.N((float)(f3 + f4), (float)0.0f, (float)1.0f);
    }

    private boolean R() {
        return (Long)this.N_2 > 0L && System.currentTimeMillis() - (Long)this.N_1 < (Long)this.N_2;
    }
}

