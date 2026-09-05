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

public class class01902
extends class05848 {
    class01902(class03448 class034482, double d, double d2, double d3, class08388 class083882) {
        super(class034482, d, d2 - 0.125, d3, class083882);
        this.method_3080(0.01f, 0.01f);
        this.field_17867 *= this.field_3840.z() * 0.6f + 0.2f;
        this.field_3847 = (int)(16.0 / ((double)this.field_3840.z() * 0.8 + 0.2));
        this.field_3862 = false;
        this.field_28786 = 1.0f;
        this.field_3844 = 0.0f;
    }

    class01902(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        super(class034482, d, d2 - 0.125, d3, d4, d5, d6, class083882);
        this.method_3080(0.01f, 0.01f);
        this.field_17867 *= this.field_3840.z() * 0.6f + 0.6f;
        this.field_3847 = (int)(16.0 / ((double)this.field_3840.z() * 0.8 + 0.2));
        this.field_3862 = false;
        this.field_28786 = 1.0f;
        this.field_3844 = 0.0f;
    }

    public class05846 method_74255() {
        return class05846.L;
    }
}

