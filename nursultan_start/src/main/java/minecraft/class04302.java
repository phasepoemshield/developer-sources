/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00965
 *  minecraft.class03448
 *  minecraft.class04404
 *  minecraft.class04406
 *  minecraft.class04410
 *  minecraft.class05363
 *  minecraft.class05846
 *  minecraft.class06143
 *  net.irisshaders.iris.Iris
 */
package minecraft;

import minecraft.class00965;
import minecraft.class03448;
import minecraft.class04404;
import minecraft.class04406;
import minecraft.class04410;
import minecraft.class05363;
import minecraft.class05846;
import minecraft.class06143;
import net.irisshaders.iris.Iris;

class class04302
extends class04404 {
    private boolean y;
    private boolean L;
    private final class04410 u;
    private float i;
    private float R;
    private float M;
    private boolean B;

    class04302(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class04410 class044102, class06143 class061432) {
        super(class034482, d, d2, d3, class061432, 0.1f);
        this.field_3852 = d4;
        this.field_3869 = d5;
        this.field_3850 = d6;
        this.u = class044102;
        this.field_17867 *= 0.75f;
        this.field_3847 = 48 + this.field_3840.y(12);
        this.method_74306(class061432);
    }

    public void y(boolean bl) {
        this.L = bl;
    }

    public void N(boolean bl) {
        this.y = bl;
    }

    public class05846 method_74255() {
        return Iris.IS_FOOL ? class05846.N : class05846.L;
    }

    public void method_3074(class00965 class009652, class05363 class053632, float f) {
        if (!this.L || this.field_3866 < this.field_3847 / 3 || (this.field_3866 + this.field_3847) / 3 % 2 == 0) {
            super.method_3074(class009652, class053632, f);
        }
    }

    public void method_3070() {
        super.method_3070();
        if (this.y && this.field_3866 < this.field_3847 / 2 && (this.field_3866 + this.field_3847) % 2 == 0) {
            class04302 class043022 = new class04302(this.field_3851, this.field_3874, this.field_3854, this.field_3871, 0.0, 0.0, 0.0, this.u, this.N);
            class043022.method_74308(0.99f);
            class043022.method_74305(this.field_62633, this.field_62634, this.field_62635);
            class043022.field_3866 = class043022.field_3847 / 2;
            if (this.B) {
                class043022.B = true;
                class043022.i = this.i;
                class043022.R = this.R;
                class043022.M = this.M;
            }
            class043022.L = this.L;
            this.u.N((class04406)class043022);
        }
    }
}

