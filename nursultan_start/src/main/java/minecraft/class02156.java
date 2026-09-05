/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02795
 *  minecraft.class03092
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07438
 *  minecraft.class08476
 *  minecraft.class08478
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02148;
import minecraft.class02795;
import minecraft.class03092;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class07438;
import minecraft.class08476;
import minecraft.class08478;

public class class02156
extends class02795<class02148, class08478, class03092> {
    private static final class01894 N = class01894.y((String)"textures/entity/goat/goat.png");

    public class02156(class04832 class048322) {
        super(class048322, (class06078)new class03092(class048322.N(class04802.yE)), (class06078)new class03092(class048322.N(class04802.yW)), 0.7f);
    }

    public class08478 method_55269() {
        return new class08478();
    }

    public void method_62354(class02148 class021482, class08478 class084782, float f) {
        super.method_62354((class07438)class021482, (class08476)class084782, f);
        class084782.N = class021482.v();
        class084782.y = class021482.n();
        class084782.L = class021482.w();
    }

    public class01894 N(class08478 class084782) {
        return N;
    }
}

