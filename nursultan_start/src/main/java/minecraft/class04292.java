/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02787
 *  minecraft.class02795
 *  minecraft.class03811
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07438
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02787;
import minecraft.class02795;
import minecraft.class03811;
import minecraft.class04257;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class07438;
import minecraft.class08476;

public class class04292
extends class02795<class03811, class02787, class04257> {
    private static final class01894 N = class01894.y((String)"textures/entity/armadillo.png");

    public class04292(class04832 class048322) {
        super(class048322, (class06078)new class04257(class048322.N(class04802.u)), (class06078)new class04257(class048322.N(class04802.i)), 0.4f);
    }

    public class02787 method_55269() {
        return new class02787();
    }

    public void method_62354(class03811 class038112, class02787 class027872, float f) {
        super.method_62354((class07438)class038112, (class08476)class027872, f);
        class027872.N = class038112.m();
        class027872.u.N(class038112.R);
        class027872.y.N(class038112.u);
        class027872.L.N(class038112.i);
    }

    public class01894 N(class02787 class027872) {
        return N;
    }
}

