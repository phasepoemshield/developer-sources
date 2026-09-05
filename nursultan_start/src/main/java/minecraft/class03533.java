/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01342
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05846
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class01342;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05846;
import minecraft.class08388;

public class class03533
extends class01342 {
    public class03533(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        super(class034482, d, d2, d3, d4, d5, d6, class083882);
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3069(double d, double d2, double d3) {
        this.method_3067(this.method_3064().u(d, d2, d3));
        this.method_3072();
    }

    public int method_3068(float f) {
        float f2 = ((float)this.field_3866 + f) / (float)this.field_3847;
        f2 = class04995.N((float)f2, (float)0.0f, (float)1.0f);
        int n = super.method_3068(f);
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n2 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n2 = 240;
        }
        return n2 | n3 << 16;
    }

    public float method_18132(float f) {
        float f2 = ((float)this.field_3866 + f) / (float)this.field_3847;
        return this.field_17867 * (1.0f - f2 * f2 * 0.5f);
    }
}

