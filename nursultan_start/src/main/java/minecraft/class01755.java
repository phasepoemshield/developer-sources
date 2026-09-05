/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01533
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class06143
 */
package minecraft;

import minecraft.class01533;
import minecraft.class02566;
import minecraft.class03448;
import minecraft.class06143;

public class class01755
extends class01533 {
    private static final int N = 12235202;

    public class01755(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, float f, class06143 class061432) {
        super(class034482, d, d2, d3, 0.7f, 0.6f, 0.7f, d4, d5 + (double)0.15f, d6, f, class061432, 0.5f, 7, 0.5f, false);
        float f2 = this.field_3840.z() * 0.2f;
        this.field_62633 = (float)class02566.L((int)12235202) / 255.0f - f2;
        this.field_62634 = (float)class02566.u((int)12235202) / 255.0f - f2;
        this.field_62635 = (float)class02566.i((int)12235202) / 255.0f - f2;
    }

    public void method_3070() {
        this.field_3844 = 0.88f * this.field_3844;
        this.field_28786 = 0.92f * this.field_28786;
        super.method_3070();
    }
}

