/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class05863
 *  minecraft.class06069
 *  minecraft.class06143
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class05863;
import minecraft.class06069;
import minecraft.class06143;

public class class01804
extends class05848 {
    private final class06143 N;
    private static final int y = 8;

    protected class01804(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, float f, class06143 class061432) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class061432.method_74304());
        this.N = class061432;
        this.field_28786 = 0.96f;
        this.field_3844 = -0.1f;
        this.field_28787 = true;
        this.field_3852 *= 0.0;
        this.field_3869 *= 0.9;
        this.field_3850 *= 0.0;
        this.field_3852 += d4;
        this.field_3869 += d5;
        this.field_3850 += d6;
        this.field_17867 *= 0.75f * f;
        this.field_3847 = (int)(8.0f / class04995.y((class06069)this.field_3840, (float)0.5f, (float)1.0f) * f);
        this.field_3847 = Math.max(this.field_3847, 1);
        this.method_74306(class061432);
        this.field_3862 = true;
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public class05863 method_55245() {
        return class05863.y;
    }

    public int method_3068(float f) {
        return 240;
    }

    public void method_3070() {
        super.method_3070();
        this.method_74306(this.N);
    }

    public float method_18132(float f) {
        return this.field_17867 * class04995.N((float)(((float)this.field_3866 + f) / (float)this.field_3847 * 32.0f), (float)0.0f, (float)1.0f);
    }
}

