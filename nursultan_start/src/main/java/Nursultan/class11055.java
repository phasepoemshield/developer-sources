/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09139
 *  Nursultan.class09170
 *  Nursultan.class11499
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09139;
import Nursultan.class09170;
import Nursultan.class11064;
import Nursultan.class11086;
import Nursultan.class11087;
import Nursultan.class11499;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07438;

public class class11055 {
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
    public boolean y_init;

    private void L(long l) {
        float f = Math.random() > 0.5 ? 1.0f : -1.0f;
        float f2 = Math.random() > 0.5 ? 1.0f : -1.0f;
        boolean bl = Math.random() < 0.16;
        this.y_0 = Float.valueOf(f * class09139.N((double)(bl ? 0.72 : 0.32), (double)(bl ? 1.45 : 0.92)));
        this.N_3 = Float.valueOf(f2 * class09139.N((double)0.12, (double)(bl ? 0.82 : 0.48)));
        this.y_1 = Float.valueOf(class09139.N((double)0.82, (double)(bl ? 1.32 : 1.12)));
        this.y_2 = Float.valueOf(class09139.N((double)0.0, (double)(Math.PI * 2)));
        this.y_3 = Float.valueOf(f * class09139.N((double)(bl ? 0.08 : 0.035), (double)(bl ? 0.28 : 0.14)));
        this.N_1 = l;
        this.N_2 = l + (long)class09139.N((double)(bl ? 135.0 : 110.0), (double)(bl ? 265.0 : 225.0));
        this.N_0 = l + (long)class09139.N((double)(bl ? 720.0 : 560.0), (double)(bl ? 1750.0 : 1350.0));
        this.y_4 = true;
    }

    public class11055() {
        this.B();
        this.y_1 = Float.valueOf(1.0f);
    }

    private void B() {
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
            this.y_4 = false;
        }
    }

    private boolean y(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (!bl || bl2 || bl3 || bl4) {
            return false;
        }
        long l = class110872.y().y();
        if (l < 42L || l > 500L) {
            return false;
        }
        float f = Math.abs(class09170.N((float)class114992.y(), (float)class114993.y()));
        float f2 = Math.abs(class114993.R() - class114992.R());
        if (f > 4.5f || f2 > 2.35f) {
            return false;
        }
        if (((class04453)((class06202)class11087.N_0).T_4).method_33571().R(class11064.y((class07049)class074382)) > (double)(class110872.N(class074382) + 0.9f)) {
            return false;
        }
        float f3 = l < 180L ? 0.055f : 0.09f;
        float f4 = f3;
        if (f < 1.7f && f2 < 0.65f) {
            f3 += 0.025f;
        }
        return Math.random() < (double)f3;
    }

    public class11086 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        long l = System.currentTimeMillis();
        if (this.N(class110872, bl2, bl3)) {
            this.y_4 = false;
        }
        if (l >= (Long)this.N_2) {
            this.y_4 = false;
        }
        if (!((Boolean)this.y_4).booleanValue() && l >= (Long)this.N_0 && this.y(class110872, class074382, class114992, class114993, bl, bl2, bl3, bl4)) {
            this.L(l);
        }
        if (!((Boolean)this.y_4).booleanValue()) {
            return class11086.u();
        }
        float f = class04995.N((float)((float)(l - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1)), (float)0.0f, (float)1.0f);
        float f2 = (float)Math.sin((double)f * Math.PI);
        float f3 = 1.0f + (float)Math.sin((double)f * Math.PI * 2.0 + (double)((Float)this.y_2).floatValue()) * 0.18f;
        float f4 = class04995.N((float)((float)Math.pow(f2, ((Float)this.y_1).floatValue()) * f3), (float)0.0f, (float)1.0f);
        float f5 = ((Float)this.N_3).floatValue() * f4;
        float f6 = ((Float)this.y_0).floatValue() * f4 + (float)Math.sin((double)f * Math.PI * (double)3.35f + (double)((Float)this.y_2).floatValue()) * ((Float)this.y_3).floatValue() * f4;
        boolean bl5 = f4 > 0.18f;
        return new class11086(true, f5, f6, bl5);
    }

    public void N() {
        this.N_0 = 0L;
        this.N_1 = 0L;
        this.N_2 = 0L;
        this.N_3 = Float.valueOf(0.0f);
        this.y_0 = Float.valueOf(0.0f);
        this.y_1 = Float.valueOf(1.0f);
        this.y_2 = Float.valueOf(0.0f);
        this.y_3 = Float.valueOf(0.0f);
        this.y_4 = false;
    }

    private boolean N(class11087 class110872, boolean bl, boolean bl2) {
        return bl || bl2 || class110872.y().y() > 530L;
    }
}

