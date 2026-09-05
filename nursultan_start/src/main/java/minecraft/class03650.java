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

public class class03650
extends class04404 {
    public class03650(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06143 class061432) {
        super(class034482, d, d2, d3, class061432, 1.25f);
        this.field_28786 = 0.6f;
        this.field_3852 = d4;
        this.field_3869 = d5;
        this.field_3850 = d6;
        this.field_17867 *= 0.75f;
        this.field_3847 = 60 + this.field_3840.y(12);
        this.method_74306(class061432);
        if (this.field_3840.y(4) == 0) {
            this.method_74305(0.6f + this.field_3840.z() * 0.2f, 0.6f + this.field_3840.z() * 0.3f, this.field_3840.z() * 0.2f);
        } else {
            this.method_74305(0.1f + this.field_3840.z() * 0.2f, 0.4f + this.field_3840.z() * 0.3f, this.field_3840.z() * 0.2f);
        }
    }
}

