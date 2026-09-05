/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class09130;
import minecraft.class04995;

public class class09129 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;

    public class09129() {
        this.R();
    }

    private float y(boolean bl) {
        return bl ? ((Float)this.N_0).floatValue() : ((Float)this.N_1).floatValue();
    }

    private void y(boolean bl, float f) {
        if (bl) {
            this.N_0 = Float.valueOf(f);
        } else {
            this.N_1 = Float.valueOf(f);
        }
    }

    private float N(boolean bl) {
        return bl ? ((Float)this.N_2).floatValue() : ((Float)this.N_3).floatValue();
    }

    private float N(float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        float f3;
        float f4;
        float f5 = f4 = bl ? 1.0f : 0.62f;
        float f6 = bl2 ? 7.4f : (f3 = bl3 ? 1.85f : 3.25f);
        float f7 = bl2 ? 0.58f : (bl3 ? 0.24f : 0.36f);
        return f * f4 * f3 + Math.abs(f2) * f7;
    }

    public void N() {
        this.N_0 = Float.valueOf(0.0f);
        this.N_1 = Float.valueOf(0.0f);
        this.N_2 = Float.valueOf(0.0f);
        this.N_3 = Float.valueOf(0.0f);
    }

    private void N(boolean bl, float f) {
        if (bl) {
            this.N_2 = Float.valueOf(f);
        } else {
            this.N_3 = Float.valueOf(f);
        }
    }

    private float N(float f, float f2, double d, float f3, boolean bl, boolean bl2, boolean bl3) {
        float f4;
        if (Math.abs(f) <= 1.0E-4f || Math.abs(f2) <= 1.0E-4f) {
            this.N(bl, this.N(bl) * 0.35f);
            this.y(bl, this.y(bl) * 0.45f);
            return 0.0f;
        }
        float f5 = Math.signum(f);
        float f6 = this.N(bl);
        if (Math.signum(f6) != f5) {
            f6 = 0.0f;
            this.y(bl, 0.0f);
        }
        float f7 = f5 * Math.min(Math.abs(f2), Math.abs(f));
        float f8 = this.N(f3, f7, bl, bl2, bl3);
        float f9 = f6 + class04995.N((float)(f7 - f6), (float)(-f8), (float)f8);
        if (Math.abs(f4) > Math.abs(f)) {
            f9 = f;
        }
        float f10 = this.N(f9, f, d, f3, bl, bl2);
        this.N(bl, f10);
        return f10;
    }

    /*
     * Unable to fully structure code
     */
    private float N(float var1_1, float var2_2, double var3_3, float var5_4, boolean var6_5, boolean var7_6) {
        if (var3_3 <= 1.0E-5) {
            return var1_1;
        }
        var8_7 = var1_1 + this.y(var6_5);
        if (Math.abs(var8_7) <= 1.0E-4f) {
            return 0.0f;
        }
        var9_8 = Math.signum(var8_7);
        var10_9 = Math.round(Math.abs(var8_7) / (float)var3_3);
        if (Math.signum(var2_2) != var9_8) ** GOTO lbl-1000
        v0 = Math.abs(var2_2);
        v1 = var7_6 != false ? 0.62f : 1.08f;
        if (v0 > var5_4 * v1 && Math.abs(var1_1) > var5_4 * 0.48f) {
            v2 = true;
        } else lbl-1000:
        // 2 sources

        {
            v2 = var11_10 = false;
        }
        if (var10_9 == 0 && var11_10) {
            var10_9 = 1;
        }
        if (var10_9 == 0) {
            this.y(var6_5, class04995.N((float)var8_7, (float)(-var5_4 * 1.35f), (float)(var5_4 * 1.35f)));
            return 0.0f;
        }
        var12_11 = var9_8 * (float)var10_9 * (float)var3_3;
        if (Math.signum(var2_2) == var9_8 && Math.abs(var12_11) > Math.abs(var2_2) && Math.abs(var2_2) > var5_4 * 0.65f) {
            var12_11 = var2_2;
        }
        this.y(var6_5, class04995.N((float)(var8_7 - var12_11), (float)(-var5_4 * 1.65f), (float)(var5_4 * 1.65f)));
        return var12_11;
    }

    public class09130 N(float f, float f2, float f3, float f4, double d, boolean bl, boolean bl2, boolean bl3) {
        float f5 = (float)Math.max(d, (double)0.035f);
        float f6 = this.N(f, f3, d, f5, true, bl2, bl3);
        float f7 = bl ? 0.0f : this.N(f2, f4, d, f5, false, bl2, bl3);
        return new class09130(f6, f7);
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
        }
    }
}

