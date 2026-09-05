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

public class class04008
extends class05848 {
    public class04008(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        super(class034482, d, d2, d3, d4, d5, d6, class083882);
        float f;
        this.field_62633 = f = this.field_3840.z() * 0.1f + 0.2f;
        this.field_62634 = f;
        this.field_62635 = f;
        this.method_3080(0.02f, 0.02f);
        this.field_17867 *= this.field_3840.z() * 0.6f + 0.5f;
        this.field_3852 *= (double)0.02f;
        this.field_3869 *= (double)0.02f;
        this.field_3850 *= (double)0.02f;
        this.field_3847 = (int)(20.0 / ((double)this.field_3840.z() * 0.8 + 0.2));
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3069(double d, double d2, double d3) {
        this.method_3067(this.method_3064().u(d, d2, d3));
        this.method_3072();
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3847-- <= 0) {
            this.method_3085();
            return;
        }
        this.method_3069(this.field_3852, this.field_3869, this.field_3850);
        this.field_3852 *= 0.99;
        this.field_3869 *= 0.99;
        this.field_3850 *= 0.99;
    }
}

