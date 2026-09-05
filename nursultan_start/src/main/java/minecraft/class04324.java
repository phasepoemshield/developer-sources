/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04404
 *  minecraft.class06143
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04404;
import minecraft.class06143;

public class class04324
extends class04404 {
    public class04324(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06143 class061432) {
        super(class034482, d, d2, d3, class061432, 0.0125f);
        this.field_3852 = d4;
        this.field_3869 = d5;
        this.field_3850 = d6;
        this.field_17867 *= 0.75f;
        this.field_3847 = 60 + this.field_3840.y(12);
        this.y(15916745);
        this.method_74306(class061432);
    }

    public void method_3069(double d, double d2, double d3) {
        this.method_3067(this.method_3064().u(d, d2, d3));
        this.method_3072();
    }
}

