/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04416
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04416;
import minecraft.class08388;

public class class01360
extends class04416 {
    public class01360(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        super(class034482, d, d2, d3, d4, d5, d6, class083882);
        this.field_17867 *= 1.5f;
        this.field_3847 = (int)(this.field_3840.z() * 2.0f) + 60;
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
        this.field_3874 += this.field_3852 * (double)f;
        this.field_3854 += this.field_3869 * (double)f;
        this.field_3871 += this.field_3850 * (double)f;
    }

    public float method_18132(float f) {
        float f2 = 1.0f - ((float)this.field_3866 + f) / ((float)this.field_3847 * 1.5f);
        return this.field_17867 * f2;
    }
}

