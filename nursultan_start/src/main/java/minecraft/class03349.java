/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class03448;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class08388;

public class class03349
extends class05848 {
    private static final float N = 0.0025f;
    private static final int y = 300;
    private static final int L = 300;
    private float u;
    private final float i;
    private final float R;
    private final boolean M;
    private final boolean B;
    private final double Z;
    private final double z;
    private final double U;

    protected class03349(class03448 class034482, double d, double d2, double d3, class08388 class083882, float f, float f2, boolean bl, boolean bl2, float f3, float f4) {
        super(class034482, d, d2, d3, class083882);
        float f5;
        this.u = (float)Math.toRadians(this.field_3840.Z() ? -30.0 : 30.0);
        this.i = (float)Math.toRadians(this.field_3840.Z() ? -5.0 : 5.0);
        this.R = f2;
        this.M = bl;
        this.B = bl2;
        this.field_3847 = 300;
        this.field_3844 = f * 1.2f * 0.0025f;
        this.field_17867 = f5 = f3 * (this.field_3840.Z() ? 0.05f : 0.075f);
        this.method_3080(f5, f5);
        this.field_28786 = 1.0f;
        this.field_3869 = -f4;
        float f6 = this.field_3840.z();
        this.Z = Math.cos(Math.toRadians(f6 * 60.0f)) * (double)this.R;
        this.z = Math.sin(Math.toRadians(f6 * 60.0f)) * (double)this.R;
        this.U = Math.toRadians(1000.0f + f6 * 3000.0f);
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3847-- <= 0) {
            this.method_3085();
        }
        if (this.field_3843) {
            return;
        }
        float f = Math.min((float)(300 - this.field_3847) / 300.0f, 1.0f);
        double d = 0.0;
        double d2 = 0.0;
        if (this.B) {
            d += this.Z * Math.pow(f, 1.25);
            d2 += this.z * Math.pow(f, 1.25);
        }
        if (this.M) {
            d += (double)f * Math.cos((double)f * this.U) * (double)this.R;
            d2 += (double)f * Math.sin((double)f * this.U) * (double)this.R;
        }
        this.field_3852 += d * (double)0.0025f;
        this.field_3850 += d2 * (double)0.0025f;
        this.field_3869 -= (double)this.field_3844;
        this.u += this.i / 20.0f;
        this.field_62638 = this.field_62637;
        this.field_62637 += this.u / 20.0f;
        this.method_3069(this.field_3852, this.field_3869, this.field_3850);
        if (this.field_3845 || this.field_3847 < 299 && (this.field_3852 == 0.0 || this.field_3850 == 0.0)) {
            this.method_3085();
        }
        if (this.field_3843) {
            return;
        }
        this.field_3852 *= (double)this.field_28786;
        this.field_3869 *= (double)this.field_28786;
        this.field_3850 *= (double)this.field_28786;
    }
}

