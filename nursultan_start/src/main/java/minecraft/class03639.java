/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class06143
 */
package minecraft;

import minecraft.class03448;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class06143;

public class class03639
extends class05848 {
    private final class06143 N;

    public class03639(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06143 class061432) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class061432.method_74304());
        this.N = class061432;
        this.field_3852 *= (double)0.3f;
        this.field_3869 = this.field_3840.z() * 0.2f + 0.1f;
        this.field_3850 *= (double)0.3f;
        this.method_3080(0.01f, 0.01f);
        this.field_3847 = (int)(8.0 / ((double)this.field_3840.z() * 0.8 + 0.2));
        this.method_74306(class061432);
        this.field_3844 = 0.0f;
        this.field_3852 = d4;
        this.field_3869 = d5;
        this.field_3850 = d6;
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        int n = 60 - this.field_3847;
        if (this.field_3847-- <= 0) {
            this.method_3085();
            return;
        }
        this.field_3869 -= (double)this.field_3844;
        this.method_3069(this.field_3852, this.field_3869, this.field_3850);
        this.field_3852 *= (double)0.98f;
        this.field_3869 *= (double)0.98f;
        this.field_3850 *= (double)0.98f;
        float f = (float)n * 0.001f;
        this.method_3080(f, f);
        this.method_74307(this.N.method_18138(n % 4, 4));
    }
}

