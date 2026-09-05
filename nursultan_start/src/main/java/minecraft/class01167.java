/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02910
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class06143
 */
package minecraft;

import minecraft.class02910;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class06143;

public class class01167<T extends class02910>
extends class05848 {
    private final class06143 N;

    protected class01167(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, T t, class06143 class061432) {
        super(class034482, d, d2, d3, d4, d5, d6, class061432.method_74304());
        this.field_28786 = 0.96f;
        this.field_28787 = true;
        this.N = class061432;
        this.field_3852 *= (double)0.1f;
        this.field_3869 *= (double)0.1f;
        this.field_3850 *= (double)0.1f;
        this.field_17867 *= 0.75f * t.L();
        int n = (int)(8.0 / (this.field_3840.U() * 0.8 + 0.2));
        this.field_3847 = (int)Math.max((float)n * t.L(), 1.0f);
        this.method_74306(class061432);
    }

    protected float N(float f, float f2) {
        return (this.field_3840.z() * 0.2f + 0.8f) * f * f2;
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

