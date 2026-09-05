/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class03448;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class08388;

public class class05860
extends class05848 {
    class05860(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, boolean bl, class08388 class083882) {
        super(class034482, d, d2, d3, class083882);
        this.method_3087(3.0f);
        this.method_3080(0.25f, 0.25f);
        this.field_3847 = bl ? this.field_3840.y(50) + 280 : this.field_3840.y(50) + 80;
        this.field_3844 = 3.0E-6f;
        this.field_3852 = d4;
        this.field_3869 = d5 + (double)(this.field_3840.z() / 500.0f);
        this.field_3850 = d6;
    }

    @Override
    public class05846 method_74255() {
        return class05846.u;
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3866++ >= this.field_3847 || this.field_62636 <= 0.0f) {
            this.method_3085();
            return;
        }
        this.field_3852 += (double)(this.field_3840.z() / 5000.0f * (float)(this.field_3840.Z() ? 1 : -1));
        this.field_3850 += (double)(this.field_3840.z() / 5000.0f * (float)(this.field_3840.Z() ? 1 : -1));
        this.field_3869 -= (double)this.field_3844;
        this.method_3069(this.field_3852, this.field_3869, this.field_3850);
        if (this.field_3866 >= this.field_3847 - 60 && this.field_62636 > 0.01f) {
            this.field_62636 -= 0.015f;
        }
    }
}

