/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class06143
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class06143;
import minecraft.class08036;

public class class04418
extends class05848 {
    private final class06143 N;

    public class04418(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06143 class061432) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class061432.method_74304());
        float f;
        this.field_28786 = 0.96f;
        this.N = class061432;
        float f2 = 2.5f;
        this.field_3852 *= (double)0.1f;
        this.field_3869 *= (double)0.1f;
        this.field_3850 *= (double)0.1f;
        this.field_3852 += d4;
        this.field_3869 += d5;
        this.field_3850 += d6;
        this.field_62633 = f = 1.0f - this.field_3840.z() * 0.3f;
        this.field_62634 = f;
        this.field_62635 = f;
        this.field_17867 *= 1.875f;
        int n = (int)(8.0 / ((double)this.field_3840.z() * 0.8 + 0.3));
        this.field_3847 = (int)Math.max((float)n * 2.5f, 1.0f);
        this.field_3862 = false;
        this.method_74306(class061432);
    }

    public class05846 method_74255() {
        return class05846.u;
    }

    public void method_3070() {
        super.method_3070();
        if (!this.field_3843) {
            double d;
            this.method_74306(this.N);
            class08036 class080362 = this.field_3851.N(this.field_3874, this.field_3854, this.field_3871, 2.0, false);
            if (class080362 != null && this.field_3854 > (d = class080362.method_23318())) {
                this.field_3854 += (d - this.field_3854) * 0.2;
                this.field_3869 += (class080362.method_18798().B - this.field_3869) * 0.2;
                this.method_3063(this.field_3874, this.field_3854, this.field_3871);
            }
        }
    }

    public float method_18132(float f) {
        return this.field_17867 * class04995.N((float)(((float)this.field_3866 + f) / (float)this.field_3847 * 32.0f), (float)0.0f, (float)1.0f);
    }
}

