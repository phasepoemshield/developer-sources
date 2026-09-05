/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class09138;
import Nursultan.class09155;
import Nursultan.class09166;
import minecraft.class04995;

public class class09167 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public boolean L_init;
    public Object u_0;
    public boolean u_init;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public boolean i_init;
    public Object R_0;
    public Object R_1;
    public boolean R_init;
    public Object M_0;
    public Object M_1;
    public Object M_2;
    public Object M_3;
    public boolean M_init;
    public Object B_0;
    public Object B_1;
    public Object B_2;
    public boolean B_init;
    public static Object Z_0;
    public Object z_0;
    public Object z_1;
    public Object z_2;
    public Object z_3;
    public Object z_4;
    public Object z_5;
    public Object z_6;
    public Object z_7;
    public boolean z_init;

    private float L(long l) {
        float f = (float)Math.sin((float)l * 0.021f + ((Float)this.B_0).floatValue());
        float f2 = (float)Math.sin((float)l * 0.047f + ((Float)this.B_0).floatValue() * 1.7f);
        return class04995.N((float)(f * 0.65f + f2 * 0.35f), (float)-1.0f, (float)1.0f);
    }

    private float L(float f) {
        float f2 = class04995.N((float)f, (float)0.0f, (float)1.0f);
        float f3 = (float)Math.sin((double)f2 * Math.PI);
        float f4 = 1.0f + (float)Math.sin((double)f2 * Math.PI * (double)((float)((Integer)this.B_1).intValue() + 1.35f) + (double)((Float)this.B_0).floatValue()) * 0.34f;
        if ((Integer)this.B_1 == 0) {
            f3 = (float)Math.pow(1.0f - f2, 0.62) * 0.72f + f3 * 0.34f;
        } else if ((Integer)this.B_1 == 1) {
            f3 = (float)Math.pow(f2, 1.65) * 0.84f + f3 * 0.22f;
        }
        return class04995.N((float)(f3 * f4), (float)0.0f, (float)1.0f);
    }

    public class09167() {
        this.R();
        this.N_0 = new class09166();
        this.N_1 = new int[12];
        this.N_2 = new int[12];
        this.y_0 = new int[12];
        this.y_1 = new int[12];
        this.i_0 = Float.valueOf(1.0f);
        this.i_1 = Float.valueOf(1.0f);
        this.L_3 = Float.valueOf(1.0f);
        this.L_4 = Float.valueOf(1.0f);
        this.L_5 = Float.valueOf(1.0f);
        this.B_2 = -1;
    }

    static {
        class09167.y();
    }

    private int Z() {
        int n = ((class09166)this.N_0).N(0, 4);
        if (n == (Integer)this.B_2) {
            n = (n + ((class09166)this.N_0).N(1, 4)) % 5;
        }
        return n;
    }

    private float u(long l) {
        if ((Long)this.y_4 <= (Long)this.y_3) {
            return 1.0f;
        }
        return class04995.N((float)((float)(l - (Long)this.y_3) / (float)((Long)this.y_4 - (Long)this.y_3)), (float)0.0f, (float)1.0f);
    }

    private float y(long l) {
        if (l < (Long)this.y_5 || l >= (Long)this.y_6) {
            return 0.0f;
        }
        return class04995.N((float)((float)Math.sin((double)class04995.N((float)((float)(l - (Long)this.y_5) / (float)Math.max(1L, (Long)this.y_6 - (Long)this.y_5)), (float)0.0f, (float)1.0f) * Math.PI)), (float)0.0f, (float)1.0f);
    }

    private static void y() {
        Z_0 = 12;
    }

    private int y(float f, float f2) {
        if (Math.abs(f) <= 1.0E-4f) {
            return 0;
        }
        return Math.round(f / f2);
    }

    private boolean y(float f, float f2, float f3) {
        int n = this.y(f, f3);
        int n2 = this.y(f2, f3);
        if (n == 0 && n2 == 0) {
            return false;
        }
        int n3 = (Boolean)this.z_6 != false ? n - (Integer)this.z_2 : 0;
        int n4 = (Boolean)this.z_6 != false ? n2 - (Integer)this.z_3 : 0;
        int n5 = n4;
        if (((Boolean)this.z_6).booleanValue() && n == (Integer)this.z_2 && n2 == (Integer)this.z_3) {
            return true;
        }
        if (((Boolean)this.z_6).booleanValue() && (n3 != 0 || n4 != 0) && n3 == (Integer)this.z_4 && n4 == (Integer)this.z_5 && Math.abs(n) + Math.abs(n2) > 3) {
            return true;
        }
        for (int i = 0; i < (Integer)this.z_1; ++i) {
            if (((int[])this.N_1)[i] == n && ((int[])this.N_2)[i] == n2) {
                return true;
            }
            if (((int[])this.y_0)[i] != n3 || ((int[])this.y_1)[i] != n4 || n3 == 0 && n4 == 0) continue;
            return true;
        }
        return false;
    }

    private float y(float f) {
        float f2 = class04995.N((float)f, (float)0.0f, (float)1.0f);
        return switch ((Integer)this.B_1) {
            case 0 -> 0.78f * (1.0f - (float)Math.pow(f2, 0.42)) - 0.22f * (float)Math.sin((double)f2 * Math.PI);
            case 1 -> -0.34f * (1.0f - f2) + 0.92f * (float)Math.pow(f2, 2.2);
            case 2 -> (float)Math.sin((double)f2 * Math.PI * (double)2.15f + (double)((Float)this.B_0).floatValue()) * 0.58f;
            case 3 -> {
                if (f2 < 0.36f) {
                    yield -0.54f + f2 * 0.72f;
                }
                if (f2 < 0.72f) {
                    yield 0.84f;
                }
                yield -0.18f;
            }
            default -> (float)Math.sin((double)(f2 * 1.35f + 0.18f) * Math.PI + (double)((Float)this.B_0).floatValue()) * 0.66f;
        };
    }

    private float N(float f, float f2) {
        if (Math.abs(f2) > 1.0E-4f) {
            return f2 > 0.0f ? 1.0f : -1.0f;
        }
        if (Math.abs(f) > 1.0E-4f) {
            return f > 0.0f ? 1.0f : -1.0f;
        }
        return ((class09166)this.N_0).N();
    }

    private float N(long l, boolean bl) {
        float f = bl ? 0.067f : 0.052f;
        float f2 = (float)Math.sin((float)l * f + ((Float)this.B_0).floatValue());
        float f3 = (float)Math.sin((float)l * (f * 1.91f) + ((Float)this.B_0).floatValue() * (bl ? 1.43f : 0.81f));
        float f4 = f3 > 0.0f ? 0.32f : -0.32f;
        return class04995.N((float)(f2 * 0.58f + f3 * 0.28f + f4), (float)-1.0f, (float)1.0f);
    }

    private class09155 N(float f, float f2, float f3, float f4, float f5, float f6, boolean bl) {
        float f7 = f;
        float f8 = f2;
        for (int i = 0; i < 7 && this.y(f7, f8, f5); ++i) {
            float f9 = this.N(f7, f3);
            float f10 = this.N(f8, f4);
            float f11 = 0.75f + (float)i * 0.34f + f6 * 0.75f;
            float f12 = bl ? 0.66f : 1.0f;
            float f13 = f9 * f5 * ((class09166)this.N_0).y(0.65f, 2.15f + f11) * f12;
            float f14 = f10 * f5 * ((class09166)this.N_0).y(0.28f, 1.32f + f11 * 0.44f) * (bl ? 0.58f : 1.0f);
            if ((i & 1) == 1) {
                f14 = -f14 * ((class09166)this.N_0).y(0.55f, 1.18f);
            }
            f7 = this.N(f7 + f13, f3, f5, true, bl);
            f8 = this.N(f8 + f14, f4, f5, false, bl);
        }
        return new class09155(f7, f8);
    }

    private float N(float f) {
        float f2 = class04995.N((float)f, (float)0.0f, (float)1.0f);
        return switch ((Integer)this.B_1) {
            case 1 -> class04995.N((float)(1.0f - f2 * 2.7f), (float)0.0f, (float)1.0f);
            case 3 -> {
                if (f2 < 0.34f) {
                    yield class04995.N((float)(1.0f - f2 * 2.1f), (float)0.0f, (float)1.0f);
                }
                yield class04995.N((float)((f2 - 0.76f) * 3.8f), (float)0.0f, (float)1.0f);
            }
            default -> class04995.N((float)((float)Math.sin((double)f2 * Math.PI * 2.0 + (double)((Float)this.B_0).floatValue()) * 0.38f), (float)0.0f, (float)1.0f);
        };
    }

    public void N() {
        this.y_2 = 0L;
        this.y_3 = 0L;
        this.y_4 = 0L;
        this.y_5 = 0L;
        this.y_6 = 0L;
        this.i_0 = Float.valueOf(1.0f);
        this.i_1 = Float.valueOf(1.0f);
        this.i_2 = Float.valueOf(0.0f);
        this.i_3 = Float.valueOf(0.0f);
        this.M_0 = Float.valueOf(0.0f);
        this.M_1 = Float.valueOf(0.0f);
        this.M_2 = Float.valueOf(0.0f);
        this.M_3 = Float.valueOf(0.0f);
        this.R_0 = Float.valueOf(0.0f);
        this.R_1 = Float.valueOf(0.0f);
        this.L_0 = Float.valueOf(0.0f);
        this.L_1 = Float.valueOf(0.0f);
        this.L_2 = Float.valueOf(0.0f);
        this.L_3 = Float.valueOf(1.0f);
        this.L_4 = Float.valueOf(1.0f);
        this.L_5 = Float.valueOf(1.0f);
        this.B_0 = Float.valueOf(0.0f);
        this.B_1 = 0;
        this.B_2 = -1;
        this.z_0 = 0;
        this.z_1 = 0;
        this.z_2 = 0;
        this.z_3 = 0;
        this.z_4 = 0;
        this.z_5 = 0;
        this.z_6 = false;
        this.z_7 = false;
        this.u_0 = false;
        for (int i = 0; i < 12; ++i) {
            ((int[])this.N_1)[i] = 0;
            ((int[])this.N_2)[i] = 0;
            ((int[])this.y_0)[i] = 0;
            ((int[])this.y_1)[i] = 0;
        }
        ((class09166)this.N_0).y();
    }

    private void N(float f, float f2, float f3) {
        int n = this.y(f, f3);
        int n2 = this.y(f2, f3);
        int n3 = (Boolean)this.z_6 != false ? n - (Integer)this.z_2 : 0;
        int n4 = (Boolean)this.z_6 != false ? n2 - (Integer)this.z_3 : 0;
        ((int[])this.N_1)[((Integer)this.z_0).intValue()] = n;
        ((int[])this.N_2)[((Integer)this.z_0).intValue()] = n2;
        ((int[])this.y_0)[((Integer)this.z_0).intValue()] = n3;
        ((int[])this.y_1)[((Integer)this.z_0).intValue()] = n4;
        this.z_0 = ((Integer)this.z_0 + 1) % 12;
        this.z_1 = Math.min(12, (Integer)this.z_1 + 1);
        this.z_2 = n;
        this.z_3 = n2;
        this.z_4 = n3;
        this.z_5 = n4;
        this.z_6 = true;
    }

    public class09138 N(float f, float f2, float f3, float f4, float f5, float f6, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        long l = System.currentTimeMillis();
        this.N(l, f4, f5, f6, bl, bl2, bl3, bl4, bl5);
        float f12 = Math.abs(f);
        float f13 = Math.abs(f2);
        boolean bl6 = bl4 || bl5;
        float f14 = class04995.N((float)((f12 + f13 * 1.45f) / 34.0f), (float)0.0f, (float)1.0f);
        float f15 = class04995.N((float)(f4 * 0.72f + f5 * 0.82f + (bl2 ? 0.35f : 0.0f)), (float)0.0f, (float)1.65f);
        float f16 = this.u(l);
        float f17 = this.y(f16);
        float f18 = this.N(f16);
        float f19 = this.L(f16);
        float f20 = this.y(l);
        float f21 = this.L(l);
        float f22 = bl6 ? 0.64f : 1.0f;
        float f23 = ((Float)this.i_0).floatValue() + ((Float)this.i_2).floatValue() * f17 * f22 + ((Float)this.M_2).floatValue() * f20 - ((Float)this.M_0).floatValue() * f18;
        float f24 = ((Float)this.i_1).floatValue() - ((Float)this.i_3).floatValue() * f17 * 0.72f + f21 * ((Float)this.i_3).floatValue() * 0.34f + ((Float)this.M_3).floatValue() * f20 - ((Float)this.M_1).floatValue() * f18;
        float f25 = ((Float)this.L_5).floatValue() * f3 * ((Float)this.R_0).floatValue() * f15 * f14 * f22;
        float f26 = -((Float)this.L_5).floatValue() * f3 * ((Float)this.R_1).floatValue() * f15 * f14 * (bl6 ? 0.58f : 1.0f);
        float f27 = this.N(l, true) * f3 * ((Float)this.L_0).floatValue() * f14 * f22;
        float f28 = this.N(l, false) * f3 * ((Float)this.L_1).floatValue() * f14;
        float f29 = f3 * ((Float)this.L_2).floatValue() * f15 * class04995.N((float)(0.35f + f14), (float)0.0f, (float)1.25f) * f19 * f22;
        float f30 = (float)Math.sqrt(f * f + f2 * f2);
        if (f30 > 1.0E-4f) {
            f11 = -f2 / f30 * ((Float)this.L_5).floatValue();
            f10 = f / f30 * ((Float)this.L_5).floatValue() * ((Float)this.L_3).floatValue();
        } else {
            f11 = ((Float)this.L_5).floatValue();
            f10 = -((Float)this.L_5).floatValue() * ((Float)this.L_3).floatValue();
        }
        if (f12 > 54.0f) {
            f25 *= 0.42f;
            f27 *= 0.55f;
            f29 *= 0.62f;
        }
        float f31 = f * f23 + f25 + f27 + f11 * f29;
        float f32 = f2 * f24 + f26 + f28 + f10 * f29;
        class09155 class091552 = this.N(f31, f32, f, f2, f3, f14, bl6);
        f31 = class091552.y();
        f32 = class091552.N();
        this.N(f31, f32, f3);
        float f33 = bl6 ? 0.94f : (f9 = bl ? 0.8f : 0.86f);
        float f34 = bl6 ? 0.88f : (f8 = bl ? 0.7f : 0.78f);
        float f35 = bl6 ? 1.14f : (f7 = bl ? 1.18f : 1.24f);
        float f36 = bl6 ? 1.1f : (bl ? 1.14f : 1.18f);
        boolean bl7 = f20 > 0.36f && (Boolean)this.z_7 != false || f19 > 0.55f && (Boolean)this.u_0 != false;
        boolean bl8 = bl7 && (bl6 || bl3 || f14 > 0.34f);
        return new class09138(f31, f32, f9, f8, f7, f36, class04995.N((float)(((Float)this.L_4).floatValue() + f20 * 0.72f + Math.max(f17, 0.0f) * 0.44f), (float)0.76f, (float)2.15f), class04995.N((float)(((Float)this.L_4).floatValue() * 0.88f + f20 * 0.44f + Math.abs(f21) * 0.28f), (float)0.66f, (float)1.75f), bl7, bl8);
    }

    private void N(long l, float f, float f2, float f3, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        boolean bl6 = bl4 || bl5;
        boolean bl7 = bl6;
        if (l >= (Long)this.y_2) {
            this.B_2 = (int)((Integer)this.B_1);
            this.B_1 = this.Z();
            float f4 = Math.abs(f3) > 0.45f ? Math.signum(f3) : 0.0f;
            float f5 = f4;
            this.L_5 = Float.valueOf(f4 != 0.0f && ((class09166)this.N_0).N(0.58f + f2 * 0.16f) ? -f4 : (((class09166)this.N_0).N(0.62f + f2 * 0.12f) ? -((Float)this.L_5).floatValue() : (float)((class09166)this.N_0).N()));
            float f6 = f * 0.62f + f2 * 0.92f + (bl2 ? 0.42f : 0.0f) + (bl3 ? 0.26f : 0.0f);
            this.i_0 = Float.valueOf(this.N(((Float)this.i_0).floatValue(), bl6 ? 0.96f : (bl ? 0.82f : 0.88f), bl6 ? 1.08f : 1.1f, 0.045f));
            this.i_1 = Float.valueOf(this.N(((Float)this.i_1).floatValue(), bl6 ? 0.9f : (bl ? 0.74f : 0.82f), bl6 ? 1.03f : 1.03f, 0.04f));
            this.i_2 = Float.valueOf(((class09166)this.N_0).y(0.08f, 0.25f + f6 * 0.09f));
            this.i_3 = Float.valueOf(((class09166)this.N_0).y(0.04f, 0.18f + f6 * 0.06f));
            this.M_0 = Float.valueOf(((class09166)this.N_0).y(0.06f, bl6 ? 0.13f : 0.22f));
            this.M_1 = Float.valueOf(((class09166)this.N_0).y(0.04f, bl6 ? 0.1f : 0.18f));
            this.R_0 = Float.valueOf(((class09166)this.N_0).y(0.7f, 3.6f + f6 * 1.55f));
            this.R_1 = Float.valueOf(((class09166)this.N_0).y(0.26f, 1.65f + f6 * 0.84f));
            this.L_0 = Float.valueOf(((class09166)this.N_0).y(0.42f, 1.55f + f6 * 0.58f));
            this.L_1 = Float.valueOf(((class09166)this.N_0).y(0.14f, 0.82f + f6 * 0.28f));
            this.L_2 = Float.valueOf(((class09166)this.N_0).y(1.15f, 4.7f + f6 * 2.3f));
            this.L_3 = Float.valueOf(((class09166)this.N_0).y(0.35f, 1.18f));
            this.L_4 = Float.valueOf(((class09166)this.N_0).y(bl3 || bl6 ? 1.08f : 0.82f, bl3 || bl6 ? 1.72f : 1.36f));
            this.B_0 = Float.valueOf(((class09166)this.N_0).N(0.0f, (float)Math.PI * 2));
            this.u_0 = ((class09166)this.N_0).N(bl3 || bl6 ? 0.46f : 0.3f);
            this.y_3 = l;
            this.y_4 = l + (long)((class09166)this.N_0).y(bl3 ? 62.0f : 84.0f, bl6 ? 145.0f : 230.0f);
            this.y_2 = l + (long)((class09166)this.N_0).y(bl3 ? 54.0f : 78.0f, bl6 ? 155.0f : 250.0f);
        }
        if (l >= (Long)this.y_6 && ((class09166)this.N_0).N(bl3 || bl4 ? 0.44f : 0.26f)) {
            boolean bl8 = ((class09166)this.N_0).N(bl4 || bl5 ? 0.76f : 0.54f);
            this.M_2 = Float.valueOf(bl8 ? ((class09166)this.N_0).y(0.1f, 0.28f) : -((class09166)this.N_0).y(0.07f, 0.18f));
            this.M_3 = Float.valueOf(bl8 ? ((class09166)this.N_0).y(0.05f, 0.16f) : -((class09166)this.N_0).y(0.04f, 0.13f));
            this.z_7 = bl8 && ((class09166)this.N_0).N(0.62f);
            this.y_5 = l;
            this.y_6 = l + (long)((class09166)this.N_0).y(28.0f, bl4 ? 86.0f : 118.0f);
        }
    }

    private float N(float f, float f2, float f3, boolean bl, boolean bl2) {
        if (Math.abs(f2) <= 1.0E-4f) {
            return class04995.N((float)f, (float)(-f3 * (bl ? 3.0f : 1.8f)), (float)(f3 * (bl ? 3.0f : 1.8f)));
        }
        float f4 = Math.signum(f2);
        if (Math.signum(f) != f4 && Math.abs(f2) > f3 * 2.5f) {
            return class04995.N((float)f, (float)(-f3 * (bl ? 1.1f : 0.85f)), (float)(f3 * (bl ? 1.1f : 0.85f)));
        }
        float f5 = bl2 ? (bl ? 1.14f : 1.1f) : (bl ? 1.24f : 1.18f);
        float f6 = f3 * (bl ? 2.4f : 1.35f);
        return class04995.N((float)f, (float)(-Math.abs(f2) * f5 - f6), (float)(Math.abs(f2) * f5 + f6));
    }

    private float N(float f, float f2, float f3, float f4) {
        float f5 = ((class09166)this.N_0).y(f2, f3);
        if (Math.abs(f5 - f) < f4) {
            f5 += (float)((class09166)this.N_0).N() * ((class09166)this.N_0).y(f4, f4 * 3.4f);
        }
        return class04995.N((float)f5, (float)f2, (float)f3);
    }

    private void R() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_2 = 0L;
            this.y_3 = 0L;
            this.y_4 = 0L;
            this.y_5 = 0L;
            this.y_6 = 0L;
        }
        if (!this.i_init) {
            this.i_init = true;
            this.i_0 = Float.valueOf(0.0f);
            this.i_1 = Float.valueOf(0.0f);
            this.i_2 = Float.valueOf(0.0f);
            this.i_3 = Float.valueOf(0.0f);
        }
        if (!this.M_init) {
            this.M_init = true;
            this.M_0 = Float.valueOf(0.0f);
            this.M_1 = Float.valueOf(0.0f);
            this.M_2 = Float.valueOf(0.0f);
            this.M_3 = Float.valueOf(0.0f);
        }
        if (!this.R_init) {
            this.R_init = true;
            this.R_0 = Float.valueOf(0.0f);
            this.R_1 = Float.valueOf(0.0f);
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = Float.valueOf(0.0f);
            this.L_1 = Float.valueOf(0.0f);
            this.L_2 = Float.valueOf(0.0f);
            this.L_3 = Float.valueOf(0.0f);
            this.L_4 = Float.valueOf(0.0f);
            this.L_5 = Float.valueOf(0.0f);
        }
        if (!this.B_init) {
            this.B_init = true;
            this.B_0 = Float.valueOf(0.0f);
            this.B_1 = 0;
            this.B_2 = 0;
        }
        if (!this.z_init) {
            this.z_init = true;
            this.z_0 = 0;
            this.z_1 = 0;
            this.z_2 = 0;
            this.z_3 = 0;
            this.z_4 = 0;
            this.z_5 = 0;
            this.z_6 = false;
            this.z_7 = false;
        }
        if (!this.u_init) {
            this.u_init = true;
            this.u_0 = false;
        }
    }
}

