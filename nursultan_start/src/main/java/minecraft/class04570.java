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

public class class04570
extends class05848 {
    private final class06143 N;

    public class04570(class03448 class034482, double d, double d2, double d3, double d4, class06143 class061432) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class061432.method_74304());
        float f;
        this.N = class061432;
        this.field_3847 = 4;
        this.field_62633 = f = this.field_3840.z() * 0.6f + 0.4f;
        this.field_62634 = f;
        this.field_62635 = f;
        this.field_17867 = 1.0f - (float)d4 * 0.5f;
        this.method_74306(class061432);
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public int method_3068(float f) {
        return 0xF000F0;
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3866++ >= this.field_3847) {
            this.method_3085();
            return;
        }
        this.method_74306(this.N);
    }
}

