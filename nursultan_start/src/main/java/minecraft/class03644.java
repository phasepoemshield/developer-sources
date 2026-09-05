/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class07209
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class01231;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class07209;
import minecraft.class08388;

public class class03644
extends class05848 {
    private float N;

    public class03644(class03448 class034482, double d, double d2, double d3, class08388 class083882) {
        super(class034482, d, d2, d3, class083882);
        this.field_3847 = (int)(this.field_3840.z() * 60.0f) + 30;
        this.field_3862 = false;
        this.field_3852 = 0.0;
        this.field_3869 = -0.05;
        this.field_3850 = 0.0;
        this.method_3080(0.02f, 0.02f);
        this.field_17867 *= this.field_3840.z() * 0.6f + 0.2f;
        this.field_3844 = 0.002f;
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3866++ >= this.field_3847) {
            this.method_3085();
            return;
        }
        float f = 0.6f;
        this.field_3852 += (double)(0.6f * class04995.P((double)this.N));
        this.field_3850 += (double)(0.6f * class04995.m((double)this.N));
        this.field_3852 *= 0.07;
        this.field_3850 *= 0.07;
        this.method_3069(this.field_3852, this.field_3869, this.field_3850);
        if (!this.field_3851.method_8316(class07209.method_49637((double)this.field_3874, (double)this.field_3854, (double)this.field_3871)).N(class01231.N) || this.field_3845) {
            this.method_3085();
        }
        this.N += 0.08f;
    }
}

