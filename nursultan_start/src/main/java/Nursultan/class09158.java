/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09169
 *  Nursultan.class11087
 *  Nursultan.class11499
 *  minecraft.class04995
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09150;
import Nursultan.class09166;
import Nursultan.class09169;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class07438;

public class class09158 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public boolean u_init;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;
    public Object i_5;
    public Object i_6;
    public boolean i_init;
    public static Object R_0;
    public Object M_0;
    public Object M_1;
    public Object M_2;
    public Object M_3;
    public boolean M_init;

    private void L(float f, float f2, float f3) {
        int n = this.L(f, f3);
        int n2 = this.L(f2, f3);
        int n3 = (Boolean)this.i_6 != false ? n - (Integer)this.i_2 : 0;
        int n4 = (Boolean)this.i_6 != false ? n2 - (Integer)this.i_3 : 0;
        ((int[])this.N_1)[((Integer)this.i_0).intValue()] = n;
        ((int[])this.N_2)[((Integer)this.i_0).intValue()] = n2;
        ((int[])this.N_3)[((Integer)this.i_0).intValue()] = n3;
        ((int[])this.N_4)[((Integer)this.i_0).intValue()] = n4;
        this.i_0 = ((Integer)this.i_0 + 1) % 14;
        this.i_1 = Math.min(14, (Integer)this.i_1 + 1);
        this.i_2 = n;
        this.i_3 = n2;
        this.i_4 = n3;
        this.i_5 = n4;
        this.i_6 = true;
    }

    private int L(float f, float f2) {
        if (Math.abs(f) <= 1.0E-4f) {
            return 0;
        }
        return Math.round(f / f2);
    }

    public class09158() {
        this.i();
        this.N_0 = new class09166();
        this.N_1 = new int[14];
        this.N_2 = new int[14];
        this.N_3 = new int[14];
        this.N_4 = new int[14];
        this.M_3 = Float.valueOf(1.0f);
        this.u_1 = Float.valueOf(1.0f);
        this.u_3 = Float.valueOf(1.0f);
        this.y_1 = Float.valueOf(1.0f);
        this.y_2 = Float.valueOf(1.0f);
        this.y_3 = Float.valueOf(1.0f);
    }

    static {
        class09158.u();
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_5 = 0L;
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0L;
            this.L_1 = 0L;
            this.L_2 = 0L;
        }
        if (!this.M_init) {
            this.M_init = true;
            this.M_0 = 0L;
            this.M_1 = 0L;
            this.M_2 = 0L;
            this.M_3 = Float.valueOf(0.0f);
        }
        if (!this.u_init) {
            this.u_init = true;
            this.u_0 = Float.valueOf(0.0f);
            this.u_1 = Float.valueOf(0.0f);
            this.u_2 = Float.valueOf(0.0f);
            this.u_3 = Float.valueOf(0.0f);
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_1 = Float.valueOf(0.0f);
            this.y_2 = Float.valueOf(0.0f);
            this.y_3 = Float.valueOf(0.0f);
            this.y_4 = Float.valueOf(0.0f);
        }
        if (!this.i_init) {
            this.i_init = true;
            this.i_0 = 0;
            this.i_1 = 0;
            this.i_2 = 0;
            this.i_3 = 0;
            this.i_4 = 0;
            this.i_5 = 0;
            this.i_6 = false;
        }
    }

    private static void u() {
        R_0 = 14;
    }

    private float y(long l) {
        if (l < (Long)this.L_0 || l >= (Long)this.L_1) {
            return 0.0f;
        }
        float f = class04995.N((float)((float)(l - (Long)this.L_0) / (float)Math.max(1L, (Long)this.L_1 - (Long)this.L_0)), (float)0.0f, (float)1.0f);
        float f2 = (float)Math.sin((double)f * Math.PI);
        float f3 = 1.0f + (float)Math.sin((double)f * Math.PI * 2.0 + (double)((Float)this.y_0).floatValue()) * 0.22f;
        return class04995.N((float)((float)Math.pow(f2, ((Float)this.u_3).floatValue()) * f3), (float)0.0f, (float)1.0f);
    }

    private boolean y(float f, float f2, float f3) {
        int n = this.L(f, f3);
        int n2 = this.L(f2, f3);
        if (n == 0 && n2 == 0) {
            return false;
        }
        int n3 = (Boolean)this.i_6 != false ? n - (Integer)this.i_2 : 0;
        int n4 = (Boolean)this.i_6 != false ? n2 - (Integer)this.i_3 : 0;
        int n5 = n4;
        if (((Boolean)this.i_6).booleanValue() && n == (Integer)this.i_2 && n2 == (Integer)this.i_3) {
            return true;
        }
        if (((Boolean)this.i_6).booleanValue() && (n3 != 0 || n4 != 0) && n3 == (Integer)this.i_4 && n4 == (Integer)this.i_5 && Math.abs(n) + Math.abs(n2) > 3) {
            return true;
        }
        for (int i = 0; i < (Integer)this.i_1; ++i) {
            if (((int[])this.N_1)[i] == n && ((int[])this.N_2)[i] == n2) {
                return true;
            }
            if (((int[])this.N_3)[i] != n3 || ((int[])this.N_4)[i] != n4 || n3 == 0 && n4 == 0) continue;
            return true;
        }
        return false;
    }

    private float y(float f, float f2) {
        if (Math.abs(f2) > 1.0E-4f) {
            return f2 > 0.0f ? 1.0f : -1.0f;
        }
        if (Math.abs(f) > 1.0E-4f) {
            return f > 0.0f ? 1.0f : -1.0f;
        }
        return ((class09166)this.N_0).N();
    }

    private class09150 N(class11087 class110872, class07438 class074382, class11499 class114992, float f, float f2, float f3, float f4, float f5, double d, boolean bl, boolean bl2, boolean bl3) {
        float f6 = f;
        float f7 = f2;
        for (int i = 0; i < 8 && this.y(f6, f7, f5); ++i) {
            float f8 = this.y(f6, f3);
            float f9 = bl ? this.y(f7, f4) : 0.0f;
            float f10 = 0.45f + (float)i * 0.22f;
            float f11 = f8 * f5 * ((class09166)this.N_0).y(0.28f, 1.18f + f10);
            float f12 = bl ? f9 * f5 * ((class09166)this.N_0).y(0.22f, 0.86f + f10 * 0.55f) : 0.0f;
            float f13 = f12;
            if (i % 2 == 1 && bl) {
                f12 = -f12 * ((class09166)this.N_0).y(0.56f, 1.16f);
            }
            float f14 = this.N(this.N(f6 + f11, f3, f5, true, bl3), d);
            float f15 = bl ? this.N(this.N(f7 + f12, f4, f5, false, bl3), d) : 0.0f;
            class11499 class114993 = new class11499(class114992.y() + f14, class04995.N((float)(class114992.R() + f15), (float)-90.0f, (float)90.0f));
            if (bl2 && !bl3 && class074382 != null && !class110872.N(class074382, class114993)) continue;
            f6 = f14;
            f7 = f15;
            break;
        }
        return new class09150(f6, f7);
    }

    private float N(float f, float f2, float f3, boolean bl) {
        if (!bl) {
            return 0.0f;
        }
        if (Math.abs(f) > f3 * 0.35f) {
            return f;
        }
        return (Math.abs(f2) > f3 ? Math.signum(f2) * ((Float)this.M_3).floatValue() : (float)((class09166)this.N_0).N()) * f3 * ((class09166)this.N_0).y(0.45f, 1.75f);
    }

    private void N(long l, float f, boolean bl, boolean bl2, boolean bl3) {
        if (l < (Long)this.L_2) {
            return;
        }
        float f2 = (bl ? 0.16f : 0.0f) + (bl2 ? 0.1f : 0.0f) + (bl3 ? 0.12f : 0.0f);
        float f3 = 0.9f - f2 * 0.04f;
        float f4 = 1.14f + f2 * 0.12f;
        float f5 = 0.86f - f2 * 0.035f;
        float f6 = 1.1f + f2 * 0.08f;
        this.y_1 = Float.valueOf(this.N(((Float)this.y_1).floatValue(), f3, f4));
        this.y_2 = Float.valueOf(this.N(((Float)this.y_2).floatValue(), f5, f6));
        if (((class09166)this.N_0).N(bl || bl3 ? 0.26f : 0.12f)) {
            this.y_3 = Float.valueOf(((class09166)this.N_0).N(0.58f) ? ((class09166)this.N_0).y(1.08f, bl ? 1.34f : 1.22f) : ((class09166)this.N_0).y(0.76f, 0.92f));
            this.M_0 = l + (long)((class09166)this.N_0).y(35.0f, bl2 ? 92.0f : 120.0f);
        }
        this.L_2 = l + (long)((class09166)this.N_0).y(bl ? 95.0f : 140.0f, bl2 ? 260.0f : 420.0f);
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

    private boolean N(long l, float f, float f2, float f3, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        float f4;
        if (l < (Long)this.N_5 || l < (Long)this.L_1 || f2 <= f3 * 0.65f) {
            return false;
        }
        float f5 = bl3 && !bl4 ? f3 * 6.0f : f3 * 3.2f;
        float f6 = f5;
        if (f < f5 && !bl2) {
            return false;
        }
        float f7 = bl4 ? 0.46f : (bl ? 0.38f : (f4 = bl2 ? 0.3f : 0.18f));
        if (bl3 && !bl4) {
            f4 -= 0.06f;
        }
        return ((class09166)this.N_0).N(class04995.N((float)f4, (float)0.08f, (float)0.55f));
    }

    private boolean N(long l, class11087 class110872, class07438 class074382, class11499 class114992, float f, float f2, boolean bl, boolean bl2) {
        if (class074382 == null || !bl || bl2 || l >= (Long)this.M_2 || Math.abs(((Float)this.y_4).floatValue()) <= 1.0E-4f) {
            return false;
        }
        float f3 = this.N(l, f2, false, false);
        class11499 class114993 = new class11499(class114992.y() + f, class04995.N((float)(class114992.R() + f3), (float)-90.0f, (float)90.0f));
        return class110872.N(class074382, class114993);
    }

    private void N(long l, float f, float f2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        float f3;
        if (!bl || !bl4 || bl5) {
            if (l >= (Long)this.M_2) {
                this.y_4 = Float.valueOf(0.0f);
            }
            return;
        }
        if (l < (Long)this.M_2 || l < (Long)this.M_1) {
            return;
        }
        float f4 = bl3 ? 0.1f : (f3 = bl2 ? 0.13f : 0.075f);
        if (!((class09166)this.N_0).N(f3)) {
            this.M_1 = l + (long)((class09166)this.N_0).y(180.0f, 420.0f);
            return;
        }
        float f5 = Math.abs(f) > f2 * 0.45f ? Math.signum(f) : (float)((class09166)this.N_0).N();
        this.y_4 = Float.valueOf(f5 * f2 * ((class09166)this.N_0).y(bl2 ? 0.42f : 0.28f, bl2 ? 1.65f : 1.1f));
        this.M_2 = l + (long)((class09166)this.N_0).y(bl2 ? 42.0f : 58.0f, bl3 ? 115.0f : 165.0f);
        this.M_1 = l + (long)((class09166)this.N_0).y(bl3 ? 420.0f : 620.0f, bl3 ? 980.0f : 1450.0f);
    }

    private float N(long l, float f, boolean bl, boolean bl2) {
        if (l >= (Long)this.M_2 || (Long)this.M_2 <= 0L) {
            return 0.0f;
        }
        float f2 = class04995.N((float)((float)Math.sin((double)class04995.N((float)((float)((Long)this.M_2 - l) / Math.max(1.0f, bl ? 95.0f : 145.0f)), (float)0.0f, (float)1.0f) * Math.PI)), (float)0.28f, (float)1.0f);
        float f3 = bl2 ? 1.16f : 1.0f;
        return ((Float)this.y_4).floatValue() * f2 * f3 + ((class09166)this.N_0).N(false, f * 0.34f);
    }

    private float N(float f, float f2, float f3) {
        float f4 = ((class09166)this.N_0).y(f2, f3);
        if (Math.abs(f4 - f) < 0.045f) {
            f4 += (float)((class09166)this.N_0).N() * ((class09166)this.N_0).y(0.055f, 0.16f);
        }
        return class04995.N((float)f4, (float)f2, (float)f3);
    }

    private class09150 N(class11087 class110872, class07438 class074382, class11499 class114992, float f, float f2, float f3, float f4, boolean bl) {
        float[] fArray = new float[]{0.82f, 0.66f, 0.48f, 0.32f, 0.18f, 0.0f};
        for (float f5 : fArray) {
            float f6 = class04995.B((float)f5, (float)f, (float)f3);
            float f7 = bl ? class04995.B((float)f5, (float)f2, (float)f4) : 0.0f;
            class11499 class114993 = new class11499(class114992.y() + f6, class04995.N((float)(class114992.R() + f7), (float)-90.0f, (float)90.0f));
            if (!class110872.N(class074382, class114993)) continue;
            return new class09150(f6, f7);
        }
        return new class09150(f, f2);
    }

    private float[] N(long l, float f, float f2, float f3, float f4, float f5, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        float f6 = this.y(l);
        float f7 = f3;
        float f8 = f4;
        float f9 = bl && Math.abs(f8) > f5 * 0.18f ? f8 : this.N(f2, f, f5, bl);
        float f10 = this.N(f7, f9);
        if (f10 <= 1.0E-4f) {
            return new float[]{f3, f4};
        }
        float f11 = (bl2 ? 1.18f : 1.0f) + (bl3 ? 0.14f : 0.0f) + (bl4 ? 0.18f : 0.0f);
        float f12 = Math.min(f5 * (bl2 ? 4.8f : 3.1f) * f11, Math.max(f5 * 0.35f, f10 * ((Float)this.u_0).floatValue())) * f6;
        float f13 = (float)Math.sin((double)f6 * Math.PI * (double)2.7f + (double)((Float)this.y_0).floatValue()) * f5 * ((class09166)this.N_0).y(0.16f, 0.58f);
        float f14 = -f9 / f10 * ((Float)this.M_3).floatValue();
        float f15 = f7 / f10 * ((Float)this.M_3).floatValue() * ((Float)this.u_1).floatValue();
        f7 += f14 * f12 - Math.signum(f7) * Math.abs(f7) * ((Float)this.u_2).floatValue() * f6;
        if (bl) {
            f8 += f15 * f12 + f13;
        }
        return new float[]{f7, f8};
    }

    private float N(float f, float f2) {
        return (float)Math.sqrt(f * f + f2 * f2);
    }

    private float N(float f, float f2, float f3, boolean bl, boolean bl2) {
        if (Math.abs(f) <= 1.0E-4f) {
            return 0.0f;
        }
        if (Math.abs(f2) <= 1.0E-4f) {
            float f4 = f3 * (bl ? 2.4f : (bl2 ? 3.2f : 1.65f));
            return class04995.N((float)f, (float)(-f4), (float)f4);
        }
        float f5 = Math.signum(f2);
        if (Math.signum(f) != f5 && Math.abs(f2) > f3 * 3.0f) {
            float f6 = f3 * (bl ? 0.85f : 1.45f);
            return class04995.N((float)f, (float)(-f6), (float)f6);
        }
        float f7 = f3 * (bl ? 2.8f : (bl2 ? 2.2f : 1.25f));
        return class04995.N((float)f, (float)(-Math.abs(f2) - f7), (float)(Math.abs(f2) + f7));
    }

    private void N(long l, float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        this.M_3 = Float.valueOf(((class09166)this.N_0).N(0.54f) ? -((Float)this.M_3).floatValue() : (float)((class09166)this.N_0).N());
        float f3 = (bl ? 0.18f : 0.0f) + (bl2 ? 0.1f : 0.0f) + (bl3 ? 0.14f : 0.0f);
        float f4 = class04995.N((float)(f / Math.max(f2 * 16.0f, 8.0f)), (float)0.0f, (float)1.0f);
        this.u_0 = Float.valueOf(((class09166)this.N_0).y(0.035f + f3 * 0.02f, 0.12f + f3 * 0.05f + f4 * 0.035f));
        this.u_1 = Float.valueOf(((class09166)this.N_0).y(0.38f, 0.92f + f3 * 0.16f));
        this.u_2 = Float.valueOf(((class09166)this.N_0).y(0.0f, bl ? 0.07f : 0.045f));
        this.u_3 = Float.valueOf(((class09166)this.N_0).y(0.86f, 1.34f));
        this.y_0 = Float.valueOf(((class09166)this.N_0).N(0.0f, (float)Math.PI * 2));
        this.L_0 = l;
        this.L_1 = l + (long)((class09166)this.N_0).y(bl ? 70.0f : 95.0f, bl2 ? 170.0f : 245.0f);
        this.N_5 = l + (long)((class09166)this.N_0).y(bl ? 210.0f : 320.0f, bl2 ? 620.0f : 980.0f);
    }

    public void N() {
        this.N_5 = 0L;
        this.L_0 = 0L;
        this.L_1 = 0L;
        this.L_2 = 0L;
        this.M_0 = 0L;
        this.M_1 = 0L;
        this.M_2 = 0L;
        this.M_3 = Float.valueOf(1.0f);
        this.u_0 = Float.valueOf(0.0f);
        this.u_1 = Float.valueOf(1.0f);
        this.u_2 = Float.valueOf(0.0f);
        this.u_3 = Float.valueOf(1.0f);
        this.y_0 = Float.valueOf(0.0f);
        this.y_1 = Float.valueOf(1.0f);
        this.y_2 = Float.valueOf(1.0f);
        this.y_3 = Float.valueOf(1.0f);
        this.y_4 = Float.valueOf(0.0f);
        this.i_0 = 0;
        this.i_1 = 0;
        this.i_2 = 0;
        this.i_3 = 0;
        this.i_4 = 0;
        this.i_5 = 0;
        this.i_6 = false;
        for (int i = 0; i < 14; ++i) {
            ((int[])this.N_1)[i] = 0;
            ((int[])this.N_2)[i] = 0;
            ((int[])this.N_3)[i] = 0;
            ((int[])this.N_4)[i] = 0;
        }
        ((class09166)this.N_0).y();
    }

    public class09169 N(class11087 class110872, class07438 class074382, class11499 class114992, float f, float f2, float f3, float f4, float f5, float f6, double d, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        Object object;
        if (class114992 == null) {
            return new class09169(f3, f4, f5, f6, bl);
        }
        float f7 = (float)Math.max(d, (double)0.035f);
        long l = System.currentTimeMillis();
        this.N(l, f7, bl2, bl3, bl5);
        this.N(l, f2, f7, bl, bl2, bl3, bl4, bl5);
        float f8 = this.N(f, f2);
        float f9 = this.N(f3, f4);
        if (this.N(l, f8, f9, f7, bl2, bl3, bl4, bl5)) {
            this.N(l, f8, f7, bl2, bl3, bl5);
        }
        boolean bl6 = !bl || this.N(l, class110872, class074382, class114992, f3, f7, bl4, bl5);
        float f10 = f3;
        float f11 = bl6 ? f4 : 0.0f;
        float f12 = f11;
        if (bl && bl6 && Math.abs(f11) <= f7 * 0.18f) {
            f11 = this.N(l, f7, bl2, bl3);
        }
        if (f9 > f7 * 0.55f || Math.abs(f11) > f7 * 0.35f) {
            object = this.N(l, f, f2, f10, f11, f7, bl6, bl2, bl3, bl5);
            f10 = object[0];
            f11 = bl6 ? object[1] : 0.0f;
        }
        f10 = this.N(this.N(f10, f, f7, true, bl5), d);
        f11 = bl6 ? this.N(this.N(f11, f2, f7, false, bl5 || bl), d) : 0.0f;
        object = (Object)this.N(class110872, class074382, class114992, f10, f11, f, f2, f7, d, bl6, bl4, bl5);
        f10 = ((class09150)((Object)object)).y();
        f11 = bl6 ? ((class09150)((Object)object)).N() : 0.0f;
        class11499 class114993 = new class11499(class114992.y() + f10, class04995.N((float)(class114992.R() + f11), (float)-90.0f, (float)90.0f));
        if (bl4 && !bl5 && class074382 != null && !class110872.N(class074382, class114993)) {
            class09150 class091502 = this.N(class110872, class074382, class114992, f3, bl ? 0.0f : f4, f10, f11, bl6);
            f10 = class091502.y();
            f11 = class091502.N();
            bl6 = !bl || Math.abs(f11) > 1.0E-4f;
        }
        this.L(f10, f11, f7);
        float f13 = l < (Long)this.M_0 ? ((Float)this.y_3).floatValue() : 1.0f;
        float f14 = Math.max(f7, f5 * ((Float)this.y_1).floatValue() * f13);
        float f15 = Math.max(f7, f6 * ((Float)this.y_2).floatValue() * class04995.B((float)0.58f, (float)f13, (float)1.0f));
        return new class09169(f10, bl6 ? f11 : 0.0f, f14, f15, bl && !bl6);
    }
}

