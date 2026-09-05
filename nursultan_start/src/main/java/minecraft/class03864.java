/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class03448;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class08388;

public class class03864
extends class05848 {
    public class03864(class03448 class034482, double d, double d2, double d3, class08388 class083882) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class083882);
        this.field_3844 = 0.75f;
        this.field_28786 = 0.999f;
        this.field_3852 *= (double)0.8f;
        this.field_3869 *= (double)0.8f;
        this.field_3850 *= (double)0.8f;
        this.field_3869 = this.field_3840.z() * 0.4f + 0.05f;
        this.field_17867 *= this.field_3840.z() * 2.0f + 0.2f;
        this.field_3847 = (int)(16.0 / ((double)this.field_3840.z() * 0.8 + 0.2));
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public int method_3068(float f) {
        int n = super.method_3068(f);
        int n2 = 240;
        int n3 = n >> 16 & 0xFF;
        return 0xF0 | n3 << 16;
    }

    public void method_3070() {
        super.method_3070();
        if (!this.field_3843) {
            float f = (float)this.field_3866 / (float)this.field_3847;
            if (this.field_3840.z() > f) {
                this.field_3851.method_8406((class07126)class07107.NZ, this.field_3874, this.field_3854, this.field_3871, this.field_3852, this.field_3869, this.field_3850);
            }
        }
    }

    public float method_18132(float f) {
        float f2 = ((float)this.field_3866 + f) / (float)this.field_3847;
        return this.field_17867 * (1.0f - f2 * f2);
    }
}

