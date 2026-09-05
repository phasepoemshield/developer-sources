/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class03448
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class07209
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class01231;
import minecraft.class03448;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class07209;
import minecraft.class08388;

public class class03209
extends class05848 {
    public class03209(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        super(class034482, d, d2, d3, class083882);
        this.field_3844 = -0.125f;
        this.field_28786 = 0.85f;
        this.method_3080(0.02f, 0.02f);
        this.field_17867 *= this.field_3840.z() * 0.6f + 0.2f;
        this.field_3852 = d4 * (double)0.2f + (double)((this.field_3840.z() * 2.0f - 1.0f) * 0.02f);
        this.field_3869 = d5 * (double)0.2f + (double)((this.field_3840.z() * 2.0f - 1.0f) * 0.02f);
        this.field_3850 = d6 * (double)0.2f + (double)((this.field_3840.z() * 2.0f - 1.0f) * 0.02f);
        this.field_3847 = (int)(40.0 / ((double)this.field_3840.z() * 0.8 + 0.2));
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3070() {
        super.method_3070();
        if (!this.field_3843 && !this.field_3851.method_8316(class07209.method_49637((double)this.field_3874, (double)this.field_3854, (double)this.field_3871)).N(class01231.N)) {
            this.method_3085();
        }
    }
}

