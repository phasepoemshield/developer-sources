/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02758
 *  minecraft.class02805
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08476
 *  minecraft.class08827
 *  minecraft.class08943
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02758;
import minecraft.class02805;
import minecraft.class02840;
import minecraft.class03629;
import minecraft.class03630;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08476;
import minecraft.class08827;
import minecraft.class08943;

public class class03637
extends class02840<class03630, class02805, class03629> {
    private static final class01894 N = class01894.y((String)"textures/entity/allay/allay.png");

    public class03637(class04832 class048322) {
        super(class048322, (class06078)new class03629(class048322.N(class04802.L)), 0.4f);
        this.N((class06249)new class02758((class06252)this));
    }

    public class02805 method_55269() {
        return new class02805();
    }

    public class01894 N(class02805 class028052) {
        return N;
    }

    public void method_62354(class03630 class036302, class02805 class028052, float f) {
        super.method_62354((class07438)class036302, (class08476)class028052, f);
        class08827.N((class07438)class036302, (class08827)class028052, (class08943)this.L, (float)f);
        class028052.N = class036302.E();
        class028052.y = class036302.W();
        class028052.L = class036302.i(f);
        class028052.u = class036302.u(f);
    }

    protected int method_24087(class03630 class036302, class07209 class072092) {
        return 15;
    }
}

