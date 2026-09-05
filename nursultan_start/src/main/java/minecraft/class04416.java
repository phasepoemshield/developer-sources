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

public class class04416
extends class05848 {
    private final double N;
    private final double y;
    private final double L;

    public class04416(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        super(class034482, d, d2, d3, class083882);
        this.field_3852 = d4;
        this.field_3869 = d5;
        this.field_3850 = d6;
        this.field_3874 = d;
        this.field_3854 = d2;
        this.field_3871 = d3;
        this.N = this.field_3874;
        this.y = this.field_3854;
        this.L = this.field_3871;
        this.field_17867 = 0.1f * (this.field_3840.z() * 0.2f + 0.5f);
        float f = this.field_3840.z() * 0.6f + 0.4f;
        this.field_62633 = f * 0.9f;
        this.field_62634 = f * 0.3f;
        this.field_62635 = f;
        this.field_3847 = (int)(this.field_3840.z() * 10.0f) + 40;
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3069(double d, double d2, double d3) {
        this.method_3067(this.method_3064().u(d, d2, d3));
        this.method_3072();
    }

    public int method_3068(float f) {
        int n = super.method_3068(f);
        float f2 = (float)this.field_3866 / (float)this.field_3847;
        f2 *= f2;
        f2 *= f2;
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n3 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n2 | n3 << 16;
    }

    public void method_3070() {
        float f;
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3866++ >= this.field_3847) {
            this.method_3085();
            return;
        }
        float f2 = f = (float)this.field_3866 / (float)this.field_3847;
        f = -f + f * f * 2.0f;
        f = 1.0f - f;
        this.field_3874 = this.N + this.field_3852 * (double)f;
        this.field_3854 = this.y + this.field_3869 * (double)f + (double)(1.0f - f2);
        this.field_3871 = this.L + this.field_3850 * (double)f;
    }

    public float method_18132(float f) {
        float f2 = ((float)this.field_3866 + f) / (float)this.field_3847;
        f2 = 1.0f - f2;
        f2 *= f2;
        f2 = 1.0f - f2;
        return this.field_17867 * f2;
    }
}

