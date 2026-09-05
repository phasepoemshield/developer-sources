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

public class class03183
extends class05848 {
    public class03183(class03448 class034482, double d, double d2, double d3, class08388 class083882) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class083882);
        this.field_28787 = true;
        this.field_28786 = 0.86f;
        this.field_3852 *= (double)0.01f;
        this.field_3869 *= (double)0.01f;
        this.field_3850 *= (double)0.01f;
        this.field_3869 += 0.1;
        this.field_17867 *= 1.5f;
        this.field_3847 = 16;
        this.field_3862 = false;
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public float method_18132(float f) {
        return this.field_17867 * class04995.N((float)(((float)this.field_3866 + f) / (float)this.field_3847 * 32.0f), (float)0.0f, (float)1.0f);
    }
}

