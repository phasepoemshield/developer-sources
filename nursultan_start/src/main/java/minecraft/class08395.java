/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class07209;
import minecraft.class08388;

public class class08395
extends class05848 {
    private static final float N = 0.3f;
    private static final float y = 0.1f;
    private static final float L = 0.5f;
    private static final float u = 0.3f;
    private static final int i = 200;
    private static final int R = 300;

    public class08395(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        super(class034482, d, d2, d3, d4, d5, d6, class083882);
        this.field_28787 = true;
        this.field_28786 = 0.96f;
        this.field_17867 *= 0.75f;
        this.field_3869 *= (double)0.8f;
        this.field_3852 *= (double)0.8f;
        this.field_3850 *= (double)0.8f;
    }

    private float N(float f) {
        return class04995.N((float)(f / (float)this.field_3847), (float)0.0f, (float)1.0f);
    }

    private static float N(float f, float f2, float f3) {
        if (f >= 1.0f - f2) {
            return (1.0f - f) / f2;
        }
        if (f <= f3) {
            return f / f3;
        }
        return 1.0f;
    }

    public class05846 method_74255() {
        return class05846.u;
    }

    public int method_3068(float f) {
        return (int)(255.0f * class08395.N(this.N((float)this.field_3866 + f), 0.1f, 0.3f));
    }

    public void method_3070() {
        super.method_3070();
        if (!this.field_3851.method_8320(class07209.method_49637((double)this.field_3874, (double)this.field_3854, (double)this.field_3871)).P()) {
            this.method_3085();
            return;
        }
        this.method_74308(class08395.N(this.N(this.field_3866), 0.3f, 0.5f));
        if (this.field_3840.z() > 0.95f || this.field_3866 == 1) {
            this.method_34753(-0.05f + 0.1f * this.field_3840.z(), -0.05f + 0.1f * this.field_3840.z(), -0.05f + 0.1f * this.field_3840.z());
        }
    }
}

