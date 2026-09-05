/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00965
 *  minecraft.class03448
 *  minecraft.class04395
 *  minecraft.class05363
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class00965;
import minecraft.class03448;
import minecraft.class04395;
import minecraft.class05363;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class08388;

public class class04026
extends class05848 {
    private final double N;
    private final double y;
    private final double L;
    private final boolean u;
    private final class04395 i;

    public class04026(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        this(class034482, d, d2, d3, d4, d5, d6, false, class04395.N, class083882);
    }

    class04026(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, boolean bl, class04395 class043952, class08388 class083882) {
        super(class034482, d, d2, d3, class083882);
        this.u = bl;
        this.i = class043952;
        this.method_74308(class043952.y());
        this.field_3852 = d4;
        this.field_3869 = d5;
        this.field_3850 = d6;
        this.N = d;
        this.y = d2;
        this.L = d3;
        this.field_3858 = d + d4;
        this.field_3838 = d2 + d5;
        this.field_3856 = d3 + d6;
        this.field_3874 = this.field_3858;
        this.field_3854 = this.field_3838;
        this.field_3871 = this.field_3856;
        this.field_17867 = 0.1f * (this.field_3840.z() * 0.5f + 0.2f);
        float f = this.field_3840.z() * 0.6f + 0.4f;
        this.field_62633 = 0.9f * f;
        this.field_62634 = 0.9f * f;
        this.field_62635 = f;
        this.field_3862 = false;
        this.field_3847 = (int)(this.field_3840.z() * 10.0f) + 30;
    }

    public class05846 method_74255() {
        if (this.i.N()) {
            return class05846.L;
        }
        return class05846.u;
    }

    public void method_3074(class00965 class009652, class05363 class053632, float f) {
        this.method_74308(this.i.N(this.field_3866, this.field_3847, f));
        super.method_3074(class009652, class053632, f);
    }

    public void method_3069(double d, double d2, double d3) {
        this.method_3067(this.method_3064().u(d, d2, d3));
        this.method_3072();
    }

    public int method_3068(float f) {
        if (this.u) {
            return 240;
        }
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
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3866++ >= this.field_3847) {
            this.method_3085();
            return;
        }
        float f = (float)this.field_3866 / (float)this.field_3847;
        f = 1.0f - f;
        float f2 = 1.0f - f;
        f2 *= f2;
        f2 *= f2;
        this.field_3874 = this.N + this.field_3852 * (double)f;
        this.field_3854 = this.y + this.field_3869 * (double)f - (double)(f2 * 1.2f);
        this.field_3871 = this.L + this.field_3850 * (double)f;
    }
}

