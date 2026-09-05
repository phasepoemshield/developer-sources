/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00965
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class00965;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class08388;

public class class04305
extends class05848 {
    class04305(class03448 class034482, double d, double d2, double d3, class08388 class083882) {
        super(class034482, d, d2, d3, class083882);
        this.field_3847 = 4;
    }

    public class05846 method_74255() {
        return class05846.u;
    }

    public void method_3074(class00965 class009652, class05363 class053632, float f) {
        this.method_74308(0.6f - ((float)this.field_3866 + f - 1.0f) * 0.25f * 0.5f);
        super.method_3074(class009652, class053632, f);
    }

    public float method_18132(float f) {
        return 7.1f * class04995.m((double)(((float)this.field_3866 + f - 1.0f) * 0.25f * (float)Math.PI));
    }
}

