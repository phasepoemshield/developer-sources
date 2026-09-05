/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class06069
 *  minecraft.class06143
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class06069;
import minecraft.class06143;

public class class04044
extends class05848 {
    private static final int N = 11993298;
    private static final int y = 14614777;
    private static final float L = 0.7176471f;
    private static final float u = 0.0f;
    private static final float i = 0.8235294f;
    private static final float R = 0.8745098f;
    private static final float M = 0.0f;
    private static final float B = 0.9764706f;
    private boolean Z;
    private final class06143 z;

    class04044(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06143 class061432) {
        super(class034482, d, d2, d3, class061432.method_74304());
        this.field_28786 = 0.96f;
        this.field_3852 = d4;
        this.field_3869 = d5;
        this.field_3850 = d6;
        this.field_62633 = class04995.N((class06069)this.field_3840, (float)0.7176471f, (float)0.8745098f);
        this.field_62634 = class04995.N((class06069)this.field_3840, (float)0.0f, (float)0.0f);
        this.field_62635 = class04995.N((class06069)this.field_3840, (float)0.8235294f, (float)0.9764706f);
        this.field_17867 *= 0.75f;
        this.field_3847 = (int)(20.0 / ((double)this.field_3840.z() * 0.8 + 0.2));
        this.Z = false;
        this.field_3862 = false;
        this.z = class061432;
        this.method_74306(class061432);
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
        this.method_74306(this.z);
        if (this.field_3845) {
            this.field_3869 = 0.0;
            this.Z = true;
        }
        if (this.Z) {
            this.field_3869 += 0.002;
        }
        this.method_3069(this.field_3852, this.field_3869, this.field_3850);
        if (this.field_3854 == this.field_3838) {
            this.field_3852 *= 1.1;
            this.field_3850 *= 1.1;
        }
        this.field_3852 *= (double)this.field_28786;
        this.field_3850 *= (double)this.field_28786;
        if (this.Z) {
            this.field_3869 *= (double)this.field_28786;
        }
    }

    public float method_18132(float f) {
        return this.field_17867 * class04995.N((float)(((float)this.field_3866 + f) / (float)this.field_3847 * 32.0f), (float)0.0f, (float)1.0f);
    }
}

