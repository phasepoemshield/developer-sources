/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class06143
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class06143;

public class class05571
extends class05848 {
    private final class06143 N;

    class05571(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06143 class061432) {
        super(class034482, d, d2, d3, d4, d5, d6, class061432.method_74304());
        this.field_28786 = 0.96f;
        this.field_28787 = true;
        this.N = class061432;
        this.field_17867 *= 0.75f;
        this.field_3862 = false;
        this.method_74306(class061432);
    }

    public class05846 method_74255() {
        return class05846.u;
    }

    public int method_3068(float f) {
        float f2 = ((float)this.field_3866 + f) / (float)this.field_3847;
        f2 = class04995.N((float)f2, (float)0.0f, (float)1.0f);
        int n = super.method_3068(f);
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n2 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n2 = 240;
        }
        return n2 | n3 << 16;
    }

    public void method_3070() {
        super.method_3070();
        this.method_74306(this.N);
    }
}

