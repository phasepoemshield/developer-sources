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

public class class01800
extends class05848 {
    private final class06143 N;

    protected class01800(class03448 class034482, double d, double d2, double d3, class06143 class061432) {
        super(class034482, d, d2, d3, class061432.method_74304());
        this.N = class061432;
        this.method_74306(class061432);
        this.field_3847 = 12 + this.field_3840.y(4);
        this.field_17867 = 1.0f;
        this.method_3080(1.0f, 1.0f);
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public int method_3068(float f) {
        return 0xF000F0;
    }

    public void method_3070() {
        if (this.field_3866++ >= this.field_3847) {
            this.method_3085();
            return;
        }
        this.method_74306(this.N);
    }
}

