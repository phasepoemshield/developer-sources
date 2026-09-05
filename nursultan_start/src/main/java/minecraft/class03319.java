/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10172
 *  minecraft.class03448
 *  minecraft.class04406
 *  minecraft.class04417
 *  minecraft.class04684
 *  minecraft.class06069
 *  minecraft.class06143
 *  minecraft.class07134
 */
package minecraft;

import Nursultan.class10172;
import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class04684;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class07134;

public class class03319
implements class04417<class07134> {
    private final class06143 N;

    public class03319(class06143 class061432) {
        this.N = class061432;
    }

    public class04406 method_3090(class07134 class071342, class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06069 class060692) {
        class10172 class101722 = new class10172(class034482, d, d2, d3, class04684.N, this.N.method_18139(class060692));
        class101722.field_3847 = (int)(16.0 / ((double)class060692.z() * 0.8 + 0.2));
        class101722.field_3844 = 0.007f;
        class101722.method_74305(0.92f, 0.782f, 0.72f);
        return class101722;
    }
}

