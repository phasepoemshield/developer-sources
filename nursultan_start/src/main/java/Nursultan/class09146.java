/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09170
 *  Nursultan.class09172
 *  Nursultan.class11087
 *  Nursultan.class11097
 *  Nursultan.class11499
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class09125;
import Nursultan.class09136;
import Nursultan.class09139;
import Nursultan.class09140;
import Nursultan.class09141;
import Nursultan.class09143;
import Nursultan.class09148;
import Nursultan.class09156;
import Nursultan.class09159;
import Nursultan.class09160;
import Nursultan.class09165;
import Nursultan.class09168;
import Nursultan.class09170;
import Nursultan.class09172;
import Nursultan.class11087;
import Nursultan.class11097;
import Nursultan.class11499;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class06202;

public class class09146 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
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

    private float L(int n) {
        return class04995.N((float)((float)Math.sqrt(Math.max(400.0f, (float)n) / 800.0f)), (float)0.7f, (float)2.0f);
    }

    private float L(long l) {
        if ((Long)this.N_1 <= 0L) {
            this.N_1 = l;
            return 1.0f;
        }
        float f = class04995.N((float)((float)(l - (Long)this.N_1) / 50.0f), (float)0.35f, (float)1.8f);
        this.N_1 = l;
        return f;
    }

    private float M() {
        if ((class05630)((class06202)class11087.N_0).i_7 == null) {
            return 1.0f;
        }
        double d = (Double)((class05630)((class06202)class11087.N_0).i_7).u().method_41753() * 0.6 + 0.2;
        return class04995.N((float)((float)(0.64 + d * d * 1.72)), (float)0.62f, (float)1.72f);
    }

    public class09146() {
        this.i();
        this.L_0 = new class09172();
        this.L_1 = new class09125();
        this.L_2 = new class09140();
        this.L_3 = new class09165();
        this.L_4 = new class09159();
        this.N_0 = new class09156();
        this.N_7 = Float.valueOf(1.0f);
        this.y_0 = Float.valueOf(1.0f);
        this.y_1 = Float.valueOf(1.0f);
        this.y_2 = Float.valueOf(class09139.N(0.0, Math.PI * 2));
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0L;
            this.N_2 = 0L;
            this.N_3 = 0L;
            this.N_4 = 0L;
            this.N_5 = Float.valueOf(0.0f);
            this.N_6 = Float.valueOf(0.0f);
            this.N_7 = Float.valueOf(0.0f);
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_1 = Float.valueOf(0.0f);
            this.y_2 = Float.valueOf(0.0f);
        }
    }

    public class09160 N(class11087 class110872, class11499 class114992, class11097 class110972, boolean bl, boolean bl2, boolean bl3) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        long l = System.currentTimeMillis();
        float f8 = this.L(l);
        this.N(l, bl2);
        float f9 = (float)Math.max(class09170.N(), (double)0.035f);
        float f10 = class110972.U();
        float f11 = class110972.L();
        class09141 class091412 = ((class09172)this.L_0).N(class110972, bl, bl2, bl3, class110872.y().y());
        class09143 class091432 = ((class09125)this.L_1).N(class110972, f9, bl2);
        boolean bl4 = class110972.z() && !class110972.M() && !class110972.R() && !class110972.B() && !bl2 && !bl && f10 <= 7.2f && f11 <= 3.1f;
        boolean bl5 = this.N(l, class110972, bl, bl3);
        boolean bl6 = class110972.B() || bl5 || class091412.y();
        float f12 = this.M();
        float f13 = this.L(class110872.i());
        float f14 = f12 * f13;
        float f15 = this.N(f10, f9, f14, bl6, true);
        float f16 = class110972.N() ? f9 : this.N(f11, f9, f14 * 0.64f, bl6, false);
        float f17 = f16;
        if (bl6) {
            f15 = Math.max(f15, f10 * class09139.N(0.54, 0.78) * ((Float)this.N_7).floatValue());
            f16 = class110972.N() ? f9 : Math.max(f16, f11 * class09139.N(0.34, 0.54) * ((Float)this.N_7).floatValue());
            f7 = f16;
        }
        if (class110972.B()) {
            f15 = Math.max(f15, f10 * class09139.N(0.92, 1.06));
            f16 = class110972.N() ? f9 : Math.max(f16, f11 * class09139.N(0.68, 0.9));
            f7 = f16;
        }
        if (class091412.y()) {
            f15 = Math.max(f15, f10 * class091412.u() * class091412.i() * class09139.N(1.06, 1.18));
            f16 = class110972.N() ? f9 : Math.max(f16, f11 * class091412.B() * class091412.M() * class09139.N(1.02, 1.12));
            f7 = f16;
        }
        if (class091412.N()) {
            f15 = Math.max(f15, Math.abs(class091412.R()) * class09139.N(0.92, 1.18));
            f16 = class110972.N() ? f9 : Math.max(f16, Math.abs(class091412.z()) * class09139.N(0.75, 1.05));
            f7 = f16;
        }
        if (class091432.L()) {
            f7 = class04995.B((float)class091432.u(), (float)1.0f, (float)class091432.N());
            f15 = Math.max(f15, f10 * class09139.N(0.82, 1.04) * f7);
            f16 = class110972.N() ? f9 : Math.max(f16, f11 * class09139.N(0.54, 0.82) * f7);
            f6 = f16;
        }
        if (bl4 && !class091412.y()) {
            f15 = Math.max(f9, Math.min(f15, f10 * 0.62f + f9 * 1.4f));
            f16 = class110972.N() ? f9 : Math.max(f9, Math.min(f16, f11 * 0.56f + f9 * 1.2f));
        } else {
            f15 = ((class09165)this.L_3).N(f15, f10, f9, bl6, class110972.M(), true);
            f16 = class110972.N() ? f9 : ((class09165)this.L_3).N(f16, f11, f9, bl6, class110972.M(), false);
            f7 = f16;
        }
        if (class110972.z() && f10 < 1.15f && f11 < 0.72f) {
            f15 = Math.min(f15, f9 * class09139.N(1.2, 3.3));
            f16 = class110972.N() ? f9 : Math.min(f16, f9 * class09139.N(0.8, 1.9));
        }
        f15 = this.N(f15, f10, f9, bl6);
        f16 = this.N(f16, f11, f9, bl6);
        float f18 = class091432.L() ? class09139.N(0.86, 1.0) : (class091412.y() ? class091412.L() : (class110972.B() ? class09139.N(0.82, 1.0) : (bl5 ? class09139.N(0.82, 1.0) : (f5 = class110972.z() ? class09139.N(0.42, 0.66) : class09139.N(0.66, 0.9)))));
        float f19 = class091432.L() ? class09139.N(0.72, 0.94) : (class091412.y() ? Math.max(0.78f, class091412.L() * 0.72f) : (class110972.B() ? class09139.N(0.68, 0.92) : (bl5 ? class09139.N(0.64, 0.86) : (f4 = class110972.z() ? class09139.N(0.28, 0.46) : class09139.N(0.48, 0.7)))));
        if (bl4 && !class091412.y()) {
            f5 = Math.min(f5, 0.34f);
            f4 = Math.min(f4, 0.26f);
        }
        class09136 class091362 = ((class09159)this.L_4).N(class110972, f16, f4, f9, bl6);
        f16 = class091362.y();
        f4 = class091362.N();
        this.N_5 = Float.valueOf(((Float)this.N_5).floatValue() + (f15 - ((Float)this.N_5).floatValue()) * class04995.N((float)(f5 * f8), (float)0.0f, (float)1.0f));
        this.N_6 = Float.valueOf(((Float)this.N_6).floatValue() + (f16 - ((Float)this.N_6).floatValue()) * class04995.N((float)(f4 * f8), (float)0.0f, (float)1.0f));
        if (class091412.y() || class091432.L()) {
            f6 = class04995.N((float)(class09139.N(class091432.L() ? 0.42 : 0.28, class091432.L() ? 0.68 : 0.48) * f8), (float)0.0f, (float)(class091432.L() ? 0.78f : 0.62f));
            this.N_5 = Float.valueOf(class04995.B((float)f6, (float)((Float)this.N_5).floatValue(), (float)f15));
            if (!class110972.N()) {
                f3 = class04995.N((float)(f6 * class09139.N(0.58, 0.82)), (float)0.0f, (float)0.48f);
                this.N_6 = Float.valueOf(class04995.B((float)f3, (float)((Float)this.N_6).floatValue(), (float)f16));
            }
            f3 = class091432.L() ? class09139.N(0.68, 0.92) : class091412.u();
            f2 = class091432.L() ? class09139.N(0.44, 0.7) : class091412.B();
            this.N_5 = Float.valueOf(Math.max(((Float)this.N_5).floatValue(), this.N(f10 * f3 * 0.94f, f10, f9, true)));
            if (!class110972.N()) {
                this.N_6 = Float.valueOf(Math.max(((Float)this.N_6).floatValue(), this.N(f11 * f2 * 0.82f, f11, f9, true)));
            }
        }
        f6 = (float)Math.sin((double)l * 0.018 + (double)((Float)this.y_2).floatValue()) * f9 * 0.72f * ((Float)this.y_0).floatValue();
        float f20 = class110972.M() ? 1.24f : (f = class091412.N() ? 1.12f : 1.0f);
        if (bl4 && !class091412.y()) {
            f *= 0.14f;
        }
        if (bl4 && !class091412.y()) {
            f6 *= 0.18f;
        }
        f3 = (float)Math.cos((double)l * 0.014 + (double)(((Float)this.y_2).floatValue() * 0.61f)) * f9 * 0.28f * ((Float)this.y_1).floatValue() * f;
        f2 = Math.max(f9, ((Float)this.N_5).floatValue() + f6);
        class09168 class091682 = ((class09156)this.N_0).N(f2, f10, f9, bl6, bl4, class091412.y());
        f2 = class091682.y();
        class09148 class091482 = ((class09140)this.L_2).N(class110872, class114992, class110972, f2, f9, bl6 || class091682.N(), class091412.y() || class091432.L(), bl3);
        f2 = class091482.N();
        float f21 = Math.max(f9, ((Float)this.N_6).floatValue() + (class110972.N() ? 0.0f : f3));
        return new class09160(this.N(f2, f10, f9, bl6 || class091682.N() || class091482.y()), class110972.N() ? f9 : this.N(f21, f11, f9, bl6), bl6 || class091682.N() || class091482.y(), class091412.R(), class091412.z(), class091412.N());
    }

    private boolean N(long l, class11097 class110972, boolean bl, boolean bl2) {
        boolean bl3 = class110972.B() || class110972.Z() && (!class110972.z() || class110972.U() > 8.2f || class110972.L() > 3.5f) || bl2 && bl && (class110972.U() > 4.0f || class110972.L() > 2.25f);
        boolean bl4 = l < (Long)this.N_3;
        boolean bl5 = bl4;
        if (bl3 && l >= (Long)this.N_2 && l >= (Long)this.N_3) {
            this.N_7 = Float.valueOf(class09139.N(1.04, class110972.U() > 18.0f ? 1.46 : 1.28));
            this.N_3 = l + (long)class09139.N(55.0, 138.0);
            this.N_2 = l + (long)class09139.N(230.0, 620.0);
            bl4 = true;
        }
        if (!bl4) {
            this.N_7 = Float.valueOf(1.0f);
        }
        return bl3 || bl4;
    }

    private float N(float f, float f2, float f3, boolean bl) {
        if (f2 <= f3 * 2.4f) {
            return Math.max(f3, f);
        }
        float f4 = bl ? 0.95f : 1.55f;
        float f5 = f3 * f4;
        return class04995.N((float)f, (float)f3, (float)Math.max(f3, f2 - f5));
    }

    private float N(float f, float f2, float f3, boolean bl, boolean bl2) {
        if (f <= 1.0E-4f) {
            return f2;
        }
        float f4 = f / f2;
        float f5 = bl ? (bl2 ? 0.76f : 0.69f) : (bl2 ? 0.62f : 0.56f);
        float f6 = (float)Math.pow(Math.max(1.0f, f4), f5) * f2 * f3 * (bl ? (bl2 ? 2.35f : 1.55f) : (bl2 ? 1.24f : 0.82f));
        float f7 = bl ? (bl2 ? 0.76f : 0.58f) : (bl2 ? 0.42f : 0.3f);
        float f8 = f * f7;
        float f9 = Math.max(f6, f8);
        float f10 = bl2 ? (bl ? 58.0f : 28.0f) : (bl ? 12.0f : 6.6f);
        return class04995.N((float)f9, (float)f2, (float)f10);
    }

    private void N(long l, boolean bl) {
        if (l < (Long)this.N_4) {
            return;
        }
        this.y_0 = Float.valueOf(class09139.N(bl ? 0.9 : 0.78, bl ? 1.28 : 1.16));
        this.y_1 = Float.valueOf(class09139.N(0.72, bl ? 1.18 : 1.06));
        this.y_2 = Float.valueOf(class09139.N(0.0, Math.PI * 2));
        this.N_4 = l + (long)class09139.N(bl ? 85.0 : 160.0, bl ? 210.0 : 420.0);
    }

    public void N() {
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.N_3 = 0L;
        this.N_4 = 0L;
        this.N_5 = Float.valueOf(0.0f);
        this.N_6 = Float.valueOf(0.0f);
        this.N_7 = Float.valueOf(1.0f);
        this.y_0 = Float.valueOf(1.0f);
        this.y_1 = Float.valueOf(1.0f);
        this.y_2 = Float.valueOf(class09139.N(0.0, Math.PI * 2));
        ((class09172)this.L_0).N();
        ((class09125)this.L_1).N();
        ((class09140)this.L_2).N();
        ((class09165)this.L_3).N();
        ((class09159)this.L_4).N();
        ((class09156)this.N_0).N();
    }
}

