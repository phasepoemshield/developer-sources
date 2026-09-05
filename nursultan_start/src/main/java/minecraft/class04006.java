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
 *  org.joml.Quaternionf
 */
package minecraft;

import minecraft.class00965;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class08388;
import org.joml.Quaternionf;

public class class04006
extends class05848 {
    private static final float N = 1.0472f;
    private int y;

    class04006(class03448 class034482, double d, double d2, double d3, int n, class08388 class083882) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class083882);
        this.field_17867 = 0.85f;
        this.y = n;
        this.field_3847 = 30;
        this.field_3844 = 0.0f;
        this.field_3852 = 0.0;
        this.field_3869 = 0.1;
        this.field_3850 = 0.0;
    }

    public class05846 method_74255() {
        return class05846.u;
    }

    public void method_3074(class00965 class009652, class05363 class053632, float f) {
        if (this.y > 0) {
            return;
        }
        this.field_62636 = 1.0f - class04995.N((float)(((float)this.field_3866 + f) / (float)this.field_3847), (float)0.0f, (float)1.0f);
        Quaternionf quaternionf = new Quaternionf();
        quaternionf.rotationX(-1.0472f);
        this.method_60373(class009652, class053632, quaternionf, f);
        quaternionf.rotationYXZ((float)(-Math.PI), 1.0472f, 0.0f);
        this.method_60373(class009652, class053632, quaternionf, f);
    }

    public int method_3068(float f) {
        return 240;
    }

    public void method_3070() {
        if (this.y > 0) {
            --this.y;
            return;
        }
        super.method_3070();
    }

    public float method_18132(float f) {
        return this.field_17867 * class04995.N((float)(((float)this.field_3866 + f) / (float)this.field_3847 * 0.75f), (float)0.0f, (float)1.0f);
    }
}

