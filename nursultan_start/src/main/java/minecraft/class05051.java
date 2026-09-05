/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04406
 *  minecraft.class04417
 *  minecraft.class05327
 *  minecraft.class06069
 *  minecraft.class06143
 *  minecraft.class07134
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class05327;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class07134;

public class class05051
implements class04417<class07134> {
    private final class06143 N;

    public class05051(class06143 class061432) {
        this.N = class061432;
    }

    public class04406 method_3090(class07134 class071342, class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06069 class060692) {
        double d7 = (double)class060692.z() * -1.9 * (double)class060692.z() * 0.1;
        double d8 = (double)class060692.z() * -0.5 * (double)class060692.z() * 0.1 * 5.0;
        double d9 = (double)class060692.z() * -1.9 * (double)class060692.z() * 0.1;
        return new class05327(class034482, d, d2, d3, d7, d8, d9, 1.0f, this.N);
    }
}

