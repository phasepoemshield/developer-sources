/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class08388;

public class class01843
extends class05848 {
    public class01843(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class083882);
        float f;
        this.field_28786 = 0.7f;
        this.field_3844 = 0.5f;
        this.field_3852 *= (double)0.1f;
        this.field_3869 *= (double)0.1f;
        this.field_3850 *= (double)0.1f;
        this.field_3852 += d4 * 0.4;
        this.field_3869 += d5 * 0.4;
        this.field_3850 += d6 * 0.4;
        this.field_62633 = f = this.field_3840.z() * 0.3f + 0.6f;
        this.field_62634 = f;
        this.field_62635 = f;
        this.field_17867 *= 0.75f;
        this.field_3847 = Math.max((int)(6.0 / ((double)this.field_3840.z() * 0.8 + 0.6)), 1);
        this.field_3862 = false;
        this.method_3070();
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3070() {
        super.method_3070();
        this.field_62634 *= 0.96f;
        this.field_62635 *= 0.9f;
    }

    public float method_18132(float f) {
        return this.field_17867 * class04995.N((float)(((float)this.field_3866 + f) / (float)this.field_3847 * 32.0f), (float)0.0f, (float)1.0f);
    }
}

