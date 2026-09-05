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

public class class03182
extends class05848 {
    private final float N;
    private final class06143 y;

    public class03182(class03448 class034482, double d, double d2, double d3, float f, float f2, float f3, class06143 class061432) {
        super(class034482, d, d2, d3, class061432.method_74304());
        this.y = class061432;
        this.field_62633 = f;
        this.field_62634 = f2;
        this.field_62635 = f3;
        float f4 = 0.9f;
        this.field_17867 *= 0.67499995f;
        int n = (int)(32.0 / ((double)this.field_3840.z() * 0.8 + 0.2));
        this.field_3847 = (int)Math.max((float)n * 0.9f, 1.0f);
        this.method_74306(class061432);
        this.N = (this.field_3840.z() - 0.5f) * 0.1f;
        this.field_62637 = this.field_3840.z() * ((float)Math.PI * 2);
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3866++ >= this.field_3847) {
            this.method_3085();
            return;
        }
        this.method_74306(this.y);
        this.field_62638 = this.field_62637;
        this.field_62637 += (float)Math.PI * this.N * 2.0f;
        if (this.field_3845) {
            this.field_62637 = 0.0f;
            this.field_62638 = 0.0f;
        }
        this.method_3069(this.field_3852, this.field_3869, this.field_3850);
        this.field_3869 -= (double)0.003f;
        this.field_3869 = Math.max(this.field_3869, (double)-0.14f);
    }

    public float method_18132(float f) {
        return this.field_17867 * class04995.N((float)(((float)this.field_3866 + f) / (float)this.field_3847 * 32.0f), (float)0.0f, (float)1.0f);
    }
}

