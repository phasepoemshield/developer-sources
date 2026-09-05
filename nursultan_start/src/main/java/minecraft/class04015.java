/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class04404
 *  minecraft.class06143
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class02566;
import minecraft.class03448;
import minecraft.class04404;
import minecraft.class06143;
import minecraft.class07209;

public class class04015
extends class04404 {
    class04015(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, int n, class06143 class061432) {
        super(class034482, d, d2, d3, class061432, 0.0f);
        this.field_28786 = 0.92f;
        this.field_17867 = 0.5f;
        this.method_74308(1.0f);
        this.method_74305(class02566.m((int)n), class02566.P((int)n), class02566.s((int)n));
        this.field_3847 = (int)(this.field_17867 * 12.0f / (this.field_3840.z() * 0.8f + 0.2f));
        this.method_74306(class061432);
        this.field_3862 = false;
        this.field_3852 = d4;
        this.field_3869 = d5;
        this.field_3850 = d6;
    }

    public void method_3070() {
        super.method_3070();
        if (!this.field_3843) {
            this.method_74306(this.N);
            if (this.field_3866 > this.field_3847 / 2) {
                this.method_74308(1.0f - ((float)this.field_3866 - (float)(this.field_3847 / 2)) / (float)this.field_3847);
            }
            if (this.field_3851.method_8320(class07209.method_49637((double)this.field_3874, (double)this.field_3854, (double)this.field_3871)).P()) {
                this.field_3869 -= (double)0.0074f;
            }
        }
    }
}

