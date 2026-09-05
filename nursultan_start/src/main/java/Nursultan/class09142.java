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

import Nursultan.class09151;
import Nursultan.class09166;
import Nursultan.class09170;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class09142 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public static Object y_0;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object L_7;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public boolean u_init;

    private boolean L(long l) {
        if (!((Boolean)this.u_3).booleanValue()) {
            return false;
        }
        if (l > (Long)this.u_2 || (Integer)this.L_4 >= (Integer)this.L_5) {
            this.u_3 = false;
            return false;
        }
        return true;
    }

    public class09142() {
        this.u();
        this.N_0 = new class09166();
        this.N_1 = new float[8];
        this.N_2 = new float[8];
        this.N_3 = new float[8];
        this.N_4 = new float[8];
        this.N_5 = new float[8];
        this.L_0 = new float[8];
        this.L_1 = new float[8];
        this.L_2 = new float[8];
        this.L_3 = Integer.MIN_VALUE;
    }

    static {
        class09142.Z();
    }

    private static void Z() {
        y_0 = 8;
    }

    private void u() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_3 = 0;
            this.L_4 = 0;
            this.L_5 = 0;
            this.L_6 = 0;
            this.L_7 = 0;
        }
        if (!this.u_init) {
            this.u_init = true;
            this.u_0 = 0;
            this.u_1 = 0;
            this.u_2 = 0L;
            this.u_3 = false;
        }
    }

    private float y(float f, double d, boolean bl) {
        if (d <= 1.0E-5) {
            return Math.max(bl ? 0.35f : 0.25f, f);
        }
        float f2 = bl ? 0.35f : 0.25f;
        return (float)Math.max(1, Math.round(Math.max(f2, f) / (float)d)) * (float)d;
    }

    private float y(int n, float f) {
        if (n == 0) {
            return ((class09166)this.N_0).y(0.18f, 0.42f);
        }
        if (n == 1) {
            return ((class09166)this.N_0).y(0.38f, 0.68f);
        }
        if (n >= (Integer)this.L_5 - 2) {
            return ((class09166)this.N_0).y(0.86f, 1.18f);
        }
        return ((class09166)this.N_0).y(0.58f, 1.02f) + (float)Math.sin((double)f * Math.PI * 1.25) * ((class09166)this.N_0).y(-0.1f, 0.16f);
    }

    private float y(float f, float f2, float f3, float f4, boolean bl) {
        float f5;
        float f6 = f5 = Math.abs(f3) > f4 ? f3 : f2;
        if (Math.abs(f5) <= 1.0E-4f) {
            float f7 = f4 * (bl ? 2.4f : 0.9f);
            return class04995.N((float)f, (float)(-f7), (float)f7);
        }
        if (Math.signum(f) != Math.signum(f5) && Math.abs(f5) > f4 * 1.6f) {
            f = Math.signum(f5) * Math.abs(f);
        }
        float f8 = f4 * ((class09166)this.N_0).y(bl ? 1.8f : 0.75f, bl ? 5.6f : 2.1f);
        float f9 = Math.abs(f5) + f8;
        return class04995.N((float)f, (float)(-f9), (float)f9);
    }

    private int y(float f, float f2) {
        if (Math.abs(f) <= 1.0E-4f) {
            return 0;
        }
        return Math.round(f / f2);
    }

    private float N(float f, float f2, float f3) {
        float f4;
        float f5 = f4 = Math.abs(f3) > 1.0E-4f ? f3 : f2;
        if (Math.abs(f4) <= 1.0E-4f) {
            return f;
        }
        return Math.signum(f4) * Math.abs(f);
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2) {
        if (!bl || bl2 || class110872.N(class074382, class114993)) {
            return class114993;
        }
        float f = class09170.N((float)class114992.y(), (float)class114993.y());
        float f2 = class114993.R() - class114992.R();
        for (float f3 : new float[]{0.74f, 0.52f, 0.31f, 0.16f}) {
            class11499 class114995 = new class11499(class114992.y() + this.N(f * f3, d), class04995.N((float)(class114992.R() + this.N(f2 * f3, d)), (float)-90.0f, (float)90.0f));
            if (!class110872.N(class074382, class114995)) continue;
            return class114995;
        }
        return class110872.N(class074382, class114992) ? class114992 : class114994;
    }

    private void N(class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2, boolean bl3, long l) {
        float f = (float)Math.max(d, (double)0.035f);
        float f2 = class09170.N((float)class114992.y(), (float)class114994.y());
        float f3 = class114994.R() - class114992.R();
        float f4 = class09170.N((float)class114992.y(), (float)class114993.y());
        float f5 = class114993.R() - class114992.R();
        float f6 = this.N(f2, f4);
        float f7 = this.N(f3, f5);
        this.L_4 = 0;
        this.L_5 = bl3 ? ((class09166)this.N_0).N(5, 7) : (bl ? ((class09166)this.N_0).N(5, 8) : ((class09166)this.N_0).N(4, 7));
        this.u_2 = l + (long)((class09166)this.N_0).y(bl2 ? 118.0f : 145.0f, bl3 ? 230.0f : (bl ? 245.0f : 285.0f));
        this.L_6 = 0;
        this.L_7 = 0;
        this.u_0 = 0;
        this.u_1 = 0;
        for (int i = 0; i < (Integer)this.L_5; ++i) {
            float f8;
            float f9 = (float)i / (float)Math.max(1, (Integer)this.L_5 - 1);
            float f10 = (float)Math.sin((double)f9 * Math.PI);
            float f11 = i == 0 ? ((class09166)this.N_0).y(0.12f, bl3 ? 0.18f : (bl ? 0.32f : 0.24f)) : 0.0f;
            float f12 = f8 = i >= (Integer)this.L_5 - 2 ? ((class09166)this.N_0).y(0.08f, 0.22f) : 0.0f;
            if (bl3) {
                float f13 = this.N(i, f9);
                float f14 = this.y(i, f9);
                ((float[])this.N_1)[i] = class04995.N((float)(f13 + f10 * ((class09166)this.N_0).y(-0.08f, 0.16f) + f11 - f8 * 0.72f), (float)0.58f, (float)1.22f);
                ((float[])this.N_2)[i] = class04995.N((float)(f14 + f10 * ((class09166)this.N_0).y(-0.06f, 0.14f) - (i == 0 ? ((class09166)this.N_0).y(0.04f, 0.12f) : 0.0f)), (float)0.28f, (float)1.16f);
            } else {
                ((float[])this.N_1)[i] = class04995.N((float)(((class09166)this.N_0).y(0.72f, 1.08f) + f10 * ((class09166)this.N_0).y(-0.18f, 0.28f) + f11 - f8), (float)0.48f, (float)1.34f);
                ((float[])this.N_2)[i] = class04995.N((float)(((class09166)this.N_0).y(0.54f, 0.98f) + f10 * ((class09166)this.N_0).y(-0.12f, 0.24f) - (i == 0 ? ((class09166)this.N_0).y(0.1f, 0.24f) : 0.0f)), (float)0.34f, (float)1.22f);
            }
            if (i > 0 && Math.abs(((float[])this.N_1)[i] - ((float[])this.N_1)[i - 1]) < 0.045f) {
                float[] fArray = (float[])this.N_1;
                int n = i;
                fArray[n] = fArray[n] + (float)((class09166)this.N_0).N() * ((class09166)this.N_0).y(0.05f, 0.16f);
            }
            if (i > 0 && Math.abs(((float[])this.N_2)[i] - ((float[])this.N_2)[i - 1]) < 0.035f) {
                float[] fArray = (float[])this.N_2;
                int n = i;
                fArray[n] = fArray[n] + (float)((class09166)this.N_0).N() * ((class09166)this.N_0).y(0.04f, 0.12f);
            }
            ((float[])this.N_3)[i] = f6 * f * ((class09166)this.N_0).y(bl3 ? 0.16f : (bl ? 0.42f : 0.25f), bl3 ? 1.45f : (bl ? 2.85f : 1.95f));
            ((float[])this.N_4)[i] = f7 * f * ((class09166)this.N_0).y(bl3 ? 0.14f : 0.12f, bl3 ? 0.95f : (bl ? 1.08f : 0.72f));
            if (i > 0 && ((class09166)this.N_0).N(0.34f)) {
                ((float[])this.N_3)[i] = -((float[])this.N_3)[i] * ((class09166)this.N_0).y(0.35f, 0.86f);
            }
            if (i > 1 && ((class09166)this.N_0).N(0.28f)) {
                ((float[])this.N_4)[i] = -((float[])this.N_4)[i] * ((class09166)this.N_0).y(0.25f, 0.72f);
            }
            if (bl3) {
                this.N(i, f9, f6, f7, f);
            }
            if (bl3) {
                ((float[])this.N_5)[i] = ((class09166)this.N_0).y(i == 0 ? 0.92f : 0.78f, i == 0 ? 1.22f : 1.12f);
                ((float[])this.L_0)[i] = ((class09166)this.N_0).y(i <= 1 ? 0.62f : 0.78f, i <= 1 ? 0.92f : 1.16f);
                continue;
            }
            ((float[])this.N_5)[i] = ((class09166)this.N_0).y(0.82f, bl ? 1.44f : 1.26f);
            ((float[])this.L_0)[i] = ((class09166)this.N_0).y(0.68f, bl ? 1.22f : 1.08f);
        }
        this.u_3 = true;
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

    public void N() {
        this.L_3 = Integer.MIN_VALUE;
        this.L_4 = 0;
        this.L_5 = 0;
        this.L_6 = 0;
        this.L_7 = 0;
        this.u_0 = 0;
        this.u_1 = 0;
        this.u_2 = 0L;
        this.u_3 = false;
        ((class09166)this.N_0).y();
        for (int i = 0; i < 8; ++i) {
            ((float[])this.N_1)[i] = 1.0f;
            ((float[])this.N_2)[i] = 1.0f;
            ((float[])this.N_3)[i] = 0.0f;
            ((float[])this.N_4)[i] = 0.0f;
            ((float[])this.N_5)[i] = 1.0f;
            ((float[])this.L_0)[i] = 1.0f;
            ((float[])this.L_1)[i] = 0.0f;
            ((float[])this.L_2)[i] = 0.0f;
        }
    }

    private float N(float f, double d, boolean bl) {
        if (Math.abs(f) <= 1.0E-4f || d <= 1.0E-5) {
            return f;
        }
        float f2 = (float)d;
        int n = Math.round(f / f2);
        if (n == 0) {
            n = f > 0.0f ? 1 : -1;
        }
        int n2 = bl ? ((Integer)this.L_6).intValue() : ((Integer)this.L_7).intValue();
        int n3 = bl ? ((Integer)this.u_0).intValue() : ((Integer)this.u_1).intValue();
        int n4 = n - n2;
        if (n == n2 || n4 == n3 && Math.abs(n) > 1) {
            if ((n += (n > 0 ? 1 : -1) * ((class09166)this.N_0).N(1, bl ? 3 : 2)) == 0) {
                n = n2 >= 0 ? 1 : -1;
            }
            n4 = n - n2;
        }
        if (bl) {
            this.L_6 = n;
            this.u_0 = n4;
        } else {
            this.L_7 = n;
            this.u_1 = n4;
        }
        return (float)n * f2;
    }

    public class09151 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2, boolean bl3, float f, float f2, boolean bl4, boolean bl5, boolean bl6) {
        float f3;
        float f4;
        float f5;
        float f6;
        if (class110872 == null || class074382 == null || class114992 == null || class114993 == null || class114994 == null) {
            return class09151.N(class114994, f, f2);
        }
        long l = System.currentTimeMillis();
        this.N(class110872, class114992, class114993, class114994, d, bl4, bl5, bl6, l);
        if (!this.L(l)) {
            return class09151.N(class114994, f, f2);
        }
        int n = (Integer)this.L_4;
        this.L_4 = n + 1;
        int n2 = n;
        float f7 = (float)Math.max(d, (double)0.035f);
        float f8 = class09170.N((float)class114992.y(), (float)class114994.y());
        float f9 = f6 = bl ? 0.0f : class114994.R() - class114992.R();
        if (Math.abs(f8) <= f7 * 0.35f && Math.abs(f6) <= f7 * 0.25f) {
            if (!bl6 || bl) {
                return class09151.N(class114994, f, f2);
            }
            f5 = class09170.N((float)class114992.y(), (float)class114993.y());
            f4 = class114993.R() - class114992.R();
            f8 += this.N(f5, f8) * f7 * ((class09166)this.N_0).y(0.32f, 0.86f);
            f6 += this.N(f4, f6) * f7 * ((class09166)this.N_0).y(0.24f, 0.62f);
        }
        f5 = class09170.N((float)class114992.y(), (float)class114993.y());
        f4 = bl ? 0.0f : class114993.R() - class114992.R();
        float f10 = f8 * ((float[])this.N_1)[n2] + this.N(((float[])this.N_3)[n2], f8, f5);
        float f11 = f3 = bl ? 0.0f : f6 * ((float[])this.N_2)[n2] + this.N(((float[])this.N_4)[n2], f6, f4);
        if (bl6) {
            f10 += ((float[])this.L_1)[n2] + this.N(f4, f7, true, n2);
            f10 = this.N(f10, f8, f5, f7, true);
            f3 = bl ? 0.0f : this.N(f3 += bl ? 0.0f : ((float[])this.L_2)[n2] + this.N(f5, f7, false, n2), f6, f4, f7, false);
        }
        f10 = this.y(f10, f8, f5, f7, true);
        f3 = bl ? 0.0f : this.y(f3, f6, f4, f7, false);
        f10 = this.N(f10, d, true);
        f3 = bl ? 0.0f : this.N(f3, d, false);
        class11499 class114995 = new class11499(class114992.y() + f10, class04995.N((float)(class114992.R() + f3), (float)-90.0f, (float)90.0f));
        class114995 = this.N(class110872, class074382, class114994, class114995, class114992, d, bl2, bl3);
        float f12 = Math.abs(class09170.N((float)class114992.y(), (float)class114995.y()));
        float f13 = Math.abs(class114995.R() - class114992.R());
        float f14 = this.y(Math.max(f12, f * ((float[])this.N_5)[n2]), d, true);
        float f15 = this.y(Math.max(f13, f2 * ((float[])this.L_0)[n2]), d, false);
        return new class09151(class114995, f14, f15, true);
    }

    private float N(int n, float f) {
        if (n == 0) {
            return ((class09166)this.N_0).y(0.82f, 1.08f);
        }
        if (n == 1) {
            return ((class09166)this.N_0).y(0.54f, 0.82f);
        }
        if (n >= (Integer)this.L_5 - 2) {
            return ((class09166)this.N_0).y(0.74f, 1.04f);
        }
        return ((class09166)this.N_0).y(0.68f, 1.12f) + (float)Math.sin((double)f * Math.PI * 1.7) * ((class09166)this.N_0).y(-0.12f, 0.18f);
    }

    private float N(float f, float f2, float f3, float f4, boolean bl) {
        int n = this.y(f, f4);
        int n2 = this.y(f2, f4);
        int n3 = bl ? ((Integer)this.L_6).intValue() : ((Integer)this.L_7).intValue();
        int n4 = bl ? ((Integer)this.u_0).intValue() : ((Integer)this.u_1).intValue();
        int n5 = n - n3;
        if (n == n2 || n == n3 || n5 == n4) {
            float f5 = this.N(f3, f);
            float f6 = f4 * ((class09166)this.N_0).y(bl ? 0.55f : 0.28f, bl ? 1.85f : 1.08f);
            f += f5 * f6;
        }
        return f;
    }

    private void N(class11087 class110872, class11499 class114992, class11499 class114993, class11499 class114994, double d, boolean bl, boolean bl2, boolean bl3, long l) {
        int n = class110872.u();
        if ((Integer)this.L_3 == Integer.MIN_VALUE) {
            this.L_3 = n;
            if (n <= 0 || class110872.y().y() > 95L) {
                return;
            }
        } else {
            if (n == (Integer)this.L_3) {
                return;
            }
            this.L_3 = n;
        }
        if (class110872.y().y() > 95L) {
            return;
        }
        this.N(class114992, class114993, class114994, d, bl, bl2, bl3, l);
    }

    private void N(int n, float f, float f2, float f3, float f4) {
        float f5 = (float)Math.sin((double)f * Math.PI);
        float f6 = n >= (Integer)this.L_5 - 2 ? -1.0f : 1.0f;
        float f7 = n == 1 || n == (Integer)this.L_5 - 1 ? -f2 : f2;
        float f8 = n <= 1 ? -f3 : f3;
        ((float[])this.L_1)[n] = f7 * f4 * ((class09166)this.N_0).y(0.18f, 1.65f) * (0.42f + f5 * 0.78f) * f6;
        ((float[])this.L_2)[n] = f8 * f4 * ((class09166)this.N_0).y(0.12f, 0.95f) * (0.28f + f5 * 0.9f);
        if (n > 0 && Math.abs(((float[])this.L_1)[n] - ((float[])this.L_1)[n - 1]) < f4 * 0.28f) {
            float[] fArray = (float[])this.L_1;
            int n2 = n;
            fArray[n2] = fArray[n2] + f7 * f4 * ((class09166)this.N_0).y(0.32f, 0.9f);
        }
        if (n > 0 && Math.abs(((float[])this.L_2)[n] - ((float[])this.L_2)[n - 1]) < f4 * 0.18f) {
            float[] fArray = (float[])this.L_2;
            int n3 = n;
            fArray[n3] = fArray[n3] + f8 * f4 * ((class09166)this.N_0).y(0.2f, 0.62f);
        }
    }

    private float N(float f, float f2, boolean bl, int n) {
        if (Math.abs(f) <= f2 * 0.7f) {
            return 0.0f;
        }
        float f3 = Math.signum(f);
        float f4 = bl ? (n <= 1 ? 0.46f : 0.18f) : (n <= 1 ? -0.32f : 0.28f);
        float f5 = bl ? 0.52f : 0.34f;
        return f3 * f2 * f5 * f4;
    }

    private float N(float f, float f2) {
        if (Math.abs(f) > 1.0E-4f) {
            return f > 0.0f ? 1.0f : -1.0f;
        }
        if (Math.abs(f2) > 1.0E-4f) {
            return f2 > 0.0f ? 1.0f : -1.0f;
        }
        return ((class09166)this.N_0).N();
    }
}

