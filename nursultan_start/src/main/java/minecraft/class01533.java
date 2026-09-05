/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class06143
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class06143;

public abstract class class01533
extends class05848 {
    private final class06143 N;

    protected class01533(class03448 class034482, double d, double d2, double d3, float f, float f2, float f3, double d4, double d5, double d6, float f4, class06143 class061432, float f5, int n, float f6, boolean bl) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class061432.method_74304());
        float f7;
        this.field_28786 = 0.96f;
        this.field_3844 = f6;
        this.field_28787 = true;
        this.N = class061432;
        this.field_3852 *= (double)f;
        this.field_3869 *= (double)f2;
        this.field_3850 *= (double)f3;
        this.field_3852 += d4;
        this.field_3869 += d5;
        this.field_3850 += d6;
        this.field_62633 = f7 = this.field_3840.z() * f5;
        this.field_62634 = f7;
        this.field_62635 = f7;
        this.field_17867 *= 0.75f * f4;
        this.field_3847 = (int)((double)n / ((double)this.field_3840.z() * 0.8 + 0.2) * (double)f4);
        this.field_3847 = Math.max(this.field_3847, 1);
        this.method_74306(class061432);
        this.field_3862 = bl;
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3070() {
        super.method_3070();
        this.method_74306(this.N);
    }

    public float method_18132(float f) {
        return this.field_17867 * class04995.N((float)(((float)this.field_3866 + f) / (float)this.field_3847 * 32.0f), (float)0.0f, (float)1.0f);
    }
}

