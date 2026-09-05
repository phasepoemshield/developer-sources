/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09134
 *  Nursultan.class09166
 *  Nursultan.class09170
 *  Nursultan.class11499
 *  minecraft.class04995
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09134;
import Nursultan.class09166;
import Nursultan.class09170;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class11098 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object L_7;
    public boolean L_init;

    public class11098() {
        this.i();
        this.L_0 = new class09166();
        this.L_2 = Float.valueOf(0.72f);
        this.L_3 = Float.valueOf(0.54f);
        this.y_2 = Float.valueOf(1.0f);
    }

    private void i() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = 0L;
            this.L_2 = Float.valueOf(0.0f);
            this.L_3 = Float.valueOf(0.0f);
            this.L_4 = Float.valueOf(0.0f);
            this.L_5 = Float.valueOf(0.0f);
            this.L_6 = Float.valueOf(0.0f);
            this.L_7 = Float.valueOf(0.0f);
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_1 = Float.valueOf(0.0f);
            this.y_2 = Float.valueOf(0.0f);
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = 0;
            this.N_2 = 0;
            this.N_3 = 0;
            this.N_4 = 0;
            this.N_5 = 0;
            this.N_6 = false;
        }
    }

    private float y(float f, double d, boolean bl) {
        if (Math.abs(f) <= 1.0E-4f || d <= 1.0E-5) {
            return f;
        }
        float f2 = (float)d;
        int n = Math.round(f / f2);
        if (n == 0) {
            n = f > 0.0f ? 1 : -1;
        }
        int n2 = bl ? ((Integer)this.N_2).intValue() : ((Integer)this.N_3).intValue();
        int n3 = bl ? ((Integer)this.N_4).intValue() : ((Integer)this.N_5).intValue();
        int n4 = n - n2;
        if (n == n2 || n4 == n3 || Math.abs(n) == Math.abs(n2)) {
            int n5;
            int n6 = n5 = n == 0 ? ((class09166)this.L_0).N() : (n > 0 ? 1 : -1);
            if ((n += n5 * ((class09166)this.L_0).N(1, bl ? 3 : 2)) == 0) {
                n = n5;
            }
            n4 = n - n2;
        }
        if (bl) {
            this.N_2 = n;
            this.N_4 = n4;
        } else {
            this.N_3 = n;
            this.N_5 = n4;
        }
        this.N_6 = true;
        return (float)n * f2;
    }

    private void N(long l, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (l < (Long)this.L_1) {
            return;
        }
        float f2 = (bl ? 0.18f : 0.0f) + (bl2 ? 0.32f : 0.0f) + (bl3 ? 0.18f : 0.0f) + (bl4 ? 0.16f : 0.0f);
        this.N_1 = ((class09166)this.L_0).N(0, 4);
        this.L_2 = Float.valueOf(((class09166)this.L_0).y(0.54f, 0.86f + f2 * 0.12f));
        this.L_3 = Float.valueOf(((class09166)this.L_0).y(0.38f, 0.68f + f2 * 0.08f));
        this.L_4 = Float.valueOf(((class09166)this.L_0).y(0.9f, 4.4f + f2 * 2.0f));
        this.L_5 = Float.valueOf(((class09166)this.L_0).y(0.32f, 1.9f + f2 * 0.85f));
        this.L_6 = Float.valueOf(((class09166)this.L_0).y(0.35f, 2.25f + f2 * 0.9f));
        this.L_7 = Float.valueOf(((class09166)this.L_0).y(0.12f, 1.05f + f2 * 0.45f));
        this.y_0 = Float.valueOf(((class09166)this.L_0).y(0.25f, 1.8f));
        this.y_1 = Float.valueOf(((class09166)this.L_0).y(0.14f, 1.05f + f2 * 0.45f));
        this.y_2 = Float.valueOf(((class09166)this.L_0).N(0.58f) ? -((Float)this.y_2).floatValue() : (float)((class09166)this.L_0).N());
        this.N_0 = Float.valueOf(((class09166)this.L_0).N(0.0f, (float)Math.PI * 2));
        this.L_1 = l + (long)((class09166)this.L_0).y(bl3 || bl4 ? 45.0f : 68.0f, bl2 ? 150.0f : 230.0f);
    }

    private float N(float f, float f2, float f3, boolean bl, float f4) {
        float f5 = Math.abs(f2) > 1.0E-4f ? f2 : f;
        float f6 = bl ? ((Float)this.L_2).floatValue() : ((Float)this.L_3).floatValue();
        float f7 = f * ((class09166)this.L_0).y(0.72f, 1.08f) + f5 * f6 * ((class09166)this.L_0).y(0.14f, 0.36f);
        if (Math.abs(f7) < f3 && Math.abs(f5) > f3 * 2.0f) {
            f7 = Math.signum(f5) * f3 * ((class09166)this.L_0).y(bl ? 1.4f : 0.7f, bl ? 4.2f : 1.9f);
        }
        return f7;
    }

    public class09134 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, float f, float f2) {
        if (class110872 == null || class074382 == null || class114992 == null || class114993 == null || class114994 == null || !bl3 && !bl4 && !bl5 && !bl6) {
            return new class09134(class114994, f, f2);
        }
        float f3 = (float)Math.max(d, (double)0.035f);
        long l = System.currentTimeMillis();
        this.N(l, f3, bl3, bl4, bl5, bl6);
        float f4 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f5 = class114993.R() - class114992.R();
        float f6 = class09170.N((float)class114992.y(), (float)class114994.y());
        float f7 = class114994.R() - class114992.R();
        float f8 = Math.abs(f4) > Math.abs(f6) ? f4 : f6;
        float f9 = Math.abs(f5) > Math.abs(f7) ? f5 : f7;
        float f10 = class04995.N((float)((Math.abs(f8) + Math.abs(f9) * 1.45f) / 76.0f + (bl3 ? 0.18f : 0.0f) + (bl4 ? 0.24f : 0.0f) + (bl6 ? 0.16f : 0.0f)), (float)0.0f, (float)1.18f);
        float f11 = this.N(f6, f4, f3, true, f10);
        float f12 = this.N(f7, f5, f3, false, f10);
        float f13 = (float)Math.sqrt(f8 * f8 + f9 * f9);
        float f14 = f13 > 1.0E-4f ? -f9 / f13 * ((Float)this.y_2).floatValue() : ((Float)this.y_2).floatValue();
        float f15 = f13 > 1.0E-4f ? f8 / f13 * ((Float)this.y_2).floatValue() : -((Float)this.y_2).floatValue();
        float f16 = (float)Math.sin((double)l * 0.027 + (double)((Float)this.N_0).floatValue());
        float f17 = (float)Math.sin((double)l * 0.061 + (double)(((Float)this.N_0).floatValue() * 1.73f));
        float f18 = f16 * 0.62f + f17 * 0.38f;
        float f19 = f3 * ((Float)this.L_4).floatValue() * f10;
        float f20 = f3 * ((Float)this.L_5).floatValue() * f10;
        f11 += f14 * f19 + f18 * f3 * ((Float)this.L_6).floatValue();
        f12 += f15 * f20 + f17 * f3 * ((Float)this.L_7).floatValue();
        if ((Integer)this.N_1 == 1) {
            f11 -= Math.signum(f11) * f3 * ((Float)this.y_0).floatValue() * class04995.N((float)f10, (float)0.25f, (float)1.0f);
            f12 += Math.signum(f9 == 0.0f ? f12 : f9) * f3 * ((Float)this.y_1).floatValue();
        } else if ((Integer)this.N_1 == 2) {
            f11 += Math.signum(f8 == 0.0f ? f11 : f8) * f3 * ((class09166)this.L_0).y(0.65f, 2.6f) * f10;
            f12 -= f3 * ((class09166)this.L_0).y(0.35f, 1.45f) * (bl4 ? 1.0f : 0.55f);
        } else if ((Integer)this.N_1 == 3) {
            f12 *= ((class09166)this.L_0).y(0.62f, 1.28f);
            f11 *= ((class09166)this.L_0).y(0.82f, 1.18f);
        }
        f11 = this.N(f11, f8, f6, f3, true, f10);
        f12 = this.N(f12, f9, f7, f3, false, f10);
        if (Math.abs(f12) <= f3 * 0.45f && Math.abs(f9) > f3 * 1.1f) {
            f12 = Math.signum(f9) * f3 * ((class09166)this.L_0).y(0.85f, bl4 ? 3.4f : 2.1f);
        }
        f11 = this.y(f11, d, true);
        f12 = this.y(f12, d, false);
        class11499 class114995 = new class11499(class114992.y() + f11, class04995.N((float)(class114992.R() + f12), (float)-90.0f, (float)90.0f));
        class114995 = this.N(class110872, class074382, class114992, class114994, class114995, d, bl, bl2);
        float f21 = Math.abs(class09170.N((float)class114992.y(), (float)class114995.y()));
        float f22 = Math.abs(class114995.R() - class114992.R());
        return new class09134(class114995, this.N(Math.max(f21, f * ((class09166)this.L_0).y(0.74f, 1.42f)), d, true), this.N(Math.max(f22, f2 * ((class09166)this.L_0).y(0.62f, 1.28f)), d, false));
    }

    public void N() {
        this.L_1 = 0L;
        this.L_2 = Float.valueOf(0.72f);
        this.L_3 = Float.valueOf(0.54f);
        this.L_4 = Float.valueOf(0.0f);
        this.L_5 = Float.valueOf(0.0f);
        this.L_6 = Float.valueOf(0.0f);
        this.L_7 = Float.valueOf(0.0f);
        this.y_0 = Float.valueOf(0.0f);
        this.y_1 = Float.valueOf(0.0f);
        this.y_2 = Float.valueOf(1.0f);
        this.N_0 = Float.valueOf(0.0f);
        this.N_1 = 0;
        this.N_2 = 0;
        this.N_3 = 0;
        this.N_4 = 0;
        this.N_5 = 0;
        this.N_6 = false;
        ((class09166)this.L_0).y();
    }

    private float N(float f, double d, boolean bl) {
        if (d <= 1.0E-5) {
            return Math.max(bl ? 0.35f : 0.25f, f);
        }
        float f2 = bl ? 0.35f : 0.25f;
        return (float)Math.max(1, Math.round(Math.max(f2, f) / (float)d)) * (float)d;
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

    private float N(float f, float f2, float f3, float f4, boolean bl, float f5) {
        float f6;
        float f7;
        float f8 = f7 = Math.abs(f2) > 1.0E-4f ? f2 : f3;
        if (Math.abs(f7) <= 1.0E-4f) {
            float f9 = f4 * (bl ? 6.0f : 2.8f) * (0.7f + f5);
            return class04995.N((float)f, (float)(-f9), (float)f9);
        }
        if (Math.signum(f) != Math.signum(f7) && Math.abs(f7) > f4 * 3.2f) {
            f6 = f4 * (bl ? 4.2f : 1.6f) * (0.65f + f5 * 0.35f);
            f = class04995.N((float)f, (float)(-f6), (float)f6);
        }
        f6 = bl ? 1.18f : 1.08f;
        float f10 = f4 * (bl ? 4.2f : 1.9f) * (0.5f + f5);
        return class04995.N((float)f, (float)(-Math.abs(f7) * f6 - f10), (float)(Math.abs(f7) * f6 + f10));
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2) {
        if (!bl || bl2 || class110872.N(class074382, class114994)) {
            return class114994;
        }
        float f = class09170.N((float)class114993.y(), (float)class114994.y());
        float f2 = class114994.R() - class114993.R();
        for (float f3 : new float[]{0.86f, 0.64f, 0.42f, 0.24f}) {
            class11499 class114995 = new class11499(class114993.y() + this.N(f * f3, d), class04995.N((float)(class114993.R() + this.N(f2 * f3, d)), (float)-90.0f, (float)90.0f));
            if (!class110872.N(class074382, class114995)) continue;
            return class114995;
        }
        return class110872.N(class074382, class114993) ? class114993 : class114992;
    }
}

