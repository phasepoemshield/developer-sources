/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09132
 *  Nursultan.class09166
 *  Nursultan.class11499
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class09132;
import Nursultan.class09166;
import Nursultan.class09170;
import Nursultan.class11499;
import minecraft.class04995;

public class class09171 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;
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
    public Object L_6;
    public boolean L_init;

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = Float.valueOf(0.0f);
            this.L_1 = Float.valueOf(0.0f);
            this.L_2 = Float.valueOf(0.0f);
            this.L_3 = Float.valueOf(0.0f);
            this.L_4 = Float.valueOf(0.0f);
            this.L_5 = Float.valueOf(0.0f);
            this.L_6 = Float.valueOf(0.0f);
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_1 = 0;
            this.y_2 = 0;
            this.y_3 = 0;
            this.y_4 = 0;
            this.y_5 = 0;
            this.y_6 = false;
        }
    }

    public class09171() {
        this.M();
        this.N_0 = new class09166();
    }

    private float y() {
        if ((Integer)this.y_4 <= 1) {
            return 1.0f;
        }
        return class04995.N((float)((float)((Integer)this.y_3).intValue() / (float)((Integer)this.y_4 - 1)), (float)0.0f, (float)1.0f);
    }

    private float y(float f) {
        float f2 = class04995.N((float)f, (float)0.0f, (float)1.0f);
        return switch ((Integer)this.y_5) {
            case 0 -> (float)Math.sin((double)f2 * Math.PI);
            case 1 -> (float)Math.pow(1.0f - f2, 0.58);
            case 2 -> (float)Math.pow(f2, 0.72);
            case 3 -> {
                if (f2 < 0.42f) {
                    yield 1.0f - f2 * 0.45f;
                }
                yield (float)Math.sin((double)f2 * Math.PI) * 0.72f;
            }
            default -> 0.45f + (float)Math.sin((double)(f2 * 1.7f + ((Float)this.y_0).floatValue()) * Math.PI) * 0.55f;
        };
    }

    public class09132 N(class11499 class114992, class11499 class114993, float f, float f2, float f3, boolean bl, boolean bl2, boolean bl3, boolean bl4, float f4, float f5) {
        float f6;
        boolean bl5;
        float f7 = class09170.N(class114992.y(), class114993.y());
        float f8 = class114993.R() - class114992.R();
        float f9 = Math.abs(f7);
        int n = f7 > 0.0f ? 1 : (f7 < 0.0f ? -1 : 0);
        boolean bl6 = (Integer)this.y_1 != 0 && n != 0 && n != (Integer)this.y_1;
        boolean bl7 = bl5 = bl && (f9 > 54.0f - f2 * 16.0f || bl6 && f9 > 22.0f || Math.abs(f3) > 18.0f && f9 > 18.0f);
        if (!bl5 && (Integer)this.y_2 <= 0) {
            if (n != 0) {
                this.y_1 = n;
            }
            this.N(0.0f, 0.0f);
            return class09132.N((class11499)class114993, (float)f4, (float)f5);
        }
        if (bl5) {
            if ((Integer)this.y_2 <= 0) {
                this.N(f2, bl, bl2, bl3, bl4, f9, Math.abs(f8));
            } else {
                this.y_2 = Math.max((Integer)this.y_2, ((class09166)this.N_0).N(2, bl4 || bl3 ? 4 : 5));
            }
        } else {
            this.y_2 = (Integer)this.y_2 - 1;
        }
        float f10 = class04995.N((float)(0.48f + f2 * 0.34f + (bl4 ? 0.12f : 0.0f) + (bl3 ? 0.1f : 0.0f)), (float)0.0f, (float)1.0f);
        float f11 = this.y();
        float f12 = this.y(f11);
        float f13 = ((Float)this.L_0).floatValue() + f12 * ((class09166)this.N_0).y(-0.08f, 0.16f);
        float f14 = ((Float)this.L_1).floatValue() - f12 * ((class09166)this.N_0).y(0.03f, 0.14f);
        if (bl2) {
            f13 *= ((class09166)this.N_0).N(0.62f, 0.84f);
            f14 *= ((class09166)this.N_0).N(0.55f, 0.78f);
        }
        float f15 = (float)Math.sin((double)(f11 * 2.35f + ((Float)this.y_0).floatValue()) * Math.PI);
        float f16 = (float)Math.sin((double)(f11 * 4.7f + ((Float)this.y_0).floatValue() * 0.41f) * Math.PI);
        float f17 = ((Float)this.L_6).floatValue() * f * ((Float)this.L_2).floatValue() * (0.55f + f10 * 0.45f) * f12;
        float f18 = f7 * f13 + f17 + f15 * f * ((Float)this.L_4).floatValue() + f16 * f * ((class09166)this.N_0).y(-0.8f, 0.8f);
        float f19 = -f * ((Float)this.L_3).floatValue() * (0.35f + f12) * (f8 > 0.0f ? 1.0f : 0.42f);
        float f20 = f8 * f14 + f19 + f15 * f * ((Float)this.L_5).floatValue();
        if (((Boolean)this.y_6).booleanValue()) {
            f6 = Math.max(f * ((class09166)this.N_0).N(26.0f, 48.0f), f9 * ((class09166)this.N_0).N(0.54f, 0.92f));
            float f21 = Math.max(f * ((class09166)this.N_0).N(10.0f, 22.0f), Math.abs(f8) * ((class09166)this.N_0).N(0.46f, 0.82f));
            if ((Integer)this.y_5 == 2 || (Integer)this.y_5 == 4) {
                f6 *= ((class09166)this.N_0).y(1.18f, 1.65f);
            }
            f18 = ((Float)this.N_1).floatValue() + class04995.N((float)(f18 - ((Float)this.N_1).floatValue()), (float)(-f6), (float)f6);
            f20 = ((Float)this.N_2).floatValue() + class04995.N((float)(f20 - ((Float)this.N_2).floatValue()), (float)(-f21), (float)f21);
        }
        f6 = Math.min(f9, Math.max(f * 7.0f, f9 * (bl3 || bl4 ? 0.42f : 0.34f)));
        if (f9 > f && Math.abs(f18) < f6) {
            f18 = Math.signum(f7) * f6;
        }
        f18 = class04995.N((float)f18, (float)(-Math.max(f * 12.0f, f9 * 0.94f)), (float)Math.max(f * 12.0f, f9 * 0.94f));
        f20 = class04995.N((float)f20, (float)(-Math.max(f * 3.5f, Math.abs(f8) * 0.86f + f)), (float)Math.max(f * 3.5f, Math.abs(f8) * 0.86f + f));
        class11499 class114994 = new class11499(class114992.y() + f18, class04995.N((float)(class114992.R() + f20), (float)-90.0f, (float)90.0f));
        float f22 = ((class09166)this.N_0).N(1.6232324f, 1.9373773f);
        float f23 = ((class09166)this.N_0).N(1.1736283f, 1.6737733f);
        this.y_1 = n != 0 ? n : (Integer)this.y_1;
        this.N(f18, f20);
        this.y_3 = (Integer)this.y_3 + 1;
        return new class09132(class114994, Math.max(f4, Math.abs(f18) * f22), Math.max(f5, Math.abs(f20) * f23), true);
    }

    private void N(float f, boolean bl, boolean bl2, boolean bl3, boolean bl4, float f2, float f3) {
        float f4 = class04995.N((float)(f + (bl ? 0.32f : 0.0f) + (bl3 ? 0.18f : 0.0f) + (bl4 ? 0.16f : 0.0f)), (float)0.0f, (float)1.35f);
        this.y_5 = ((class09166)this.N_0).N(0, 4);
        this.y_4 = ((class09166)this.N_0).N(3, bl4 || bl3 ? 5 : 7);
        this.y_2 = (int)((Integer)this.y_4);
        this.y_3 = 0;
        this.L_0 = Float.valueOf(((class09166)this.N_0).y(bl2 ? 0.42f : 0.56f, bl2 ? 0.76f : 0.92f) + f4 * ((class09166)this.N_0).y(0.04f, 0.16f));
        this.L_1 = Float.valueOf(((class09166)this.N_0).y(0.26f, 0.58f) + f4 * ((class09166)this.N_0).y(0.02f, 0.1f));
        this.L_2 = Float.valueOf(((class09166)this.N_0).y(1.4f, 6.8f + f4 * 2.2f));
        this.L_3 = Float.valueOf(((class09166)this.N_0).y(0.85f, bl ? 4.1f : 2.6f) + class04995.N((float)(f3 / 8.0f), (float)0.0f, (float)1.4f));
        this.L_4 = Float.valueOf(((class09166)this.N_0).y(0.8f, 3.4f + f4));
        this.L_5 = Float.valueOf(((class09166)this.N_0).y(0.22f, 1.25f));
        this.L_6 = Float.valueOf(this.N(f2));
        this.y_0 = Float.valueOf(((class09166)this.N_0).N(0.0f, 2.0f));
        if ((Integer)this.y_5 == 1) {
            this.L_0 = Float.valueOf(((Float)this.L_0).floatValue() * ((class09166)this.N_0).y(0.82f, 0.96f));
            this.L_2 = Float.valueOf(((Float)this.L_2).floatValue() * ((class09166)this.N_0).y(1.25f, 1.7f));
        } else if ((Integer)this.y_5 == 2) {
            this.L_0 = Float.valueOf(((Float)this.L_0).floatValue() * ((class09166)this.N_0).y(1.04f, 1.18f));
            this.L_1 = Float.valueOf(((Float)this.L_1).floatValue() * ((class09166)this.N_0).y(0.72f, 0.9f));
        } else if ((Integer)this.y_5 == 3) {
            this.L_3 = Float.valueOf(((Float)this.L_3).floatValue() * ((class09166)this.N_0).y(1.25f, 1.75f));
            this.L_1 = Float.valueOf(((Float)this.L_1).floatValue() * ((class09166)this.N_0).y(0.58f, 0.82f));
        } else if ((Integer)this.y_5 == 4) {
            this.L_4 = Float.valueOf(((Float)this.L_4).floatValue() * ((class09166)this.N_0).y(1.35f, 1.9f));
        }
    }

    private float N(float f) {
        if ((Integer)this.y_1 != 0 && f > 18.0f && ((class09166)this.N_0).N(0.58f)) {
            return -((Integer)this.y_1).intValue();
        }
        if (((Boolean)this.y_6).booleanValue() && Math.abs(((Float)this.N_1).floatValue()) > 1.0E-4f && ((class09166)this.N_0).N(0.52f)) {
            return -Math.signum(((Float)this.N_1).floatValue());
        }
        return ((class09166)this.N_0).N();
    }

    private void N(float f, float f2) {
        this.N_1 = Float.valueOf(f);
        this.N_2 = Float.valueOf(f2);
        this.y_6 = true;
    }

    public void N() {
        this.N_1 = Float.valueOf(0.0f);
        this.N_2 = Float.valueOf(0.0f);
        this.L_0 = Float.valueOf(0.0f);
        this.L_1 = Float.valueOf(0.0f);
        this.L_2 = Float.valueOf(0.0f);
        this.L_3 = Float.valueOf(0.0f);
        this.L_4 = Float.valueOf(0.0f);
        this.L_5 = Float.valueOf(0.0f);
        this.L_6 = Float.valueOf(1.0f);
        this.y_0 = Float.valueOf(0.0f);
        this.y_1 = 0;
        this.y_2 = 0;
        this.y_3 = 0;
        this.y_4 = 0;
        this.y_5 = 0;
        this.y_6 = false;
        ((class09166)this.N_0).y();
    }
}

