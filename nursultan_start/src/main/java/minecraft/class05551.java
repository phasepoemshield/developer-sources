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

public class class05551
implements class04417<class07134> {
    private static final double N = 0.01;
    private final class06143 y;

    public class05551(class06143 class061432) {
        this.y = class061432;
    }

    public class04406 method_3090(class07134 class071342, class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06069 class060692) {
        class05571 class055712 = new class05571(class034482, d, d2, d3, 0.0, 0.0, 0.0, this.y);
        if (class060692.Z()) {
            class055712.method_74305(0.29f, 0.58f, 0.51f);
        } else {
            class055712.method_74305(0.43f, 0.77f, 0.62f);
        }
        class055712.method_34753(d4 * 0.01, d5 * 0.01, d6 * 0.01);
        int n = 10;
        int n2 = 40;
        class055712.method_3077(class060692.y(30) + 10);
        return class055712;
    }
}

