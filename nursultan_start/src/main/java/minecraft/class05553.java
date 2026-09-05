/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04406
 *  minecraft.class04417
 *  minecraft.class06069
 *  minecraft.class06143
 *  minecraft.class07134
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class05571;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class07134;

public class class05553
implements class04417<class07134> {
    private final class06143 N;

    public class05553(class06143 class061432) {
        this.N = class061432;
    }

    public class04406 method_3090(class07134 class071342, class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06069 class060692) {
        class05571 class055712 = new class05571(class034482, d, d2, d3, 0.5 - class060692.U(), d5, 0.5 - class060692.U(), this.N);
        if (class060692.Z()) {
            class055712.method_74305(0.6f, 1.0f, 0.8f);
        } else {
            class055712.method_74305(0.08f, 0.4f, 0.4f);
        }
        class055712.field_3869 *= (double)0.2f;
        if (d4 == 0.0 && d6 == 0.0) {
            class055712.field_3852 *= (double)0.1f;
            class055712.field_3850 *= (double)0.1f;
        }
        class055712.method_3077((int)(8.0 / (class060692.U() * 0.8 + 0.2)));
        return class055712;
    }
}

