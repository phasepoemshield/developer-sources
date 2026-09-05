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

public class class03030
extends class05848 {
    private final class06143 N;

    public class03030(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06143 class061432) {
        super(class034482, d, d2, d3, class061432.method_74304());
        float f;
        this.field_3844 = -0.1f;
        this.field_28786 = 0.9f;
        this.N = class061432;
        this.field_3852 = d4 + (double)((this.field_3840.z() * 2.0f - 1.0f) * 0.05f);
        this.field_3869 = d5 + (double)((this.field_3840.z() * 2.0f - 1.0f) * 0.05f);
        this.field_3850 = d6 + (double)((this.field_3840.z() * 2.0f - 1.0f) * 0.05f);
        this.field_62633 = f = this.field_3840.z() * 0.3f + 0.7f;
        this.field_62634 = f;
        this.field_62635 = f;
        this.field_17867 = 0.1f * (this.field_3840.z() * this.field_3840.z() * 6.0f + 1.0f);
        this.field_3847 = (int)(16.0 / ((double)this.field_3840.z() * 0.8 + 0.2)) + 2;
        this.method_74306(class061432);
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3070() {
        super.method_3070();
        this.method_74306(this.N);
    }
}

