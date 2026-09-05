/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02203
 *  minecraft.class02795
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07438
 *  minecraft.class07869
 *  minecraft.class08463
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02203;
import minecraft.class02795;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class07438;
import minecraft.class07869;
import minecraft.class08463;
import minecraft.class08476;

public class class02323
extends class02795<class07869, class08463, class02203> {
    private static final class01894 N = class01894.y((String)"textures/entity/bear/polarbear.png");

    public class02323(class04832 class048322) {
        super(class048322, (class06078)new class02203(class048322.N(class04802.LH)), (class06078)new class02203(class048322.N(class04802.Lc)), 0.9f);
    }

    public class08463 method_55269() {
        return new class08463();
    }

    public void method_62354(class07869 class078692, class08463 class084632, float f) {
        super.method_62354((class07438)class078692, (class08476)class084632, f);
        class084632.N = class078692.u(f);
    }

    public class01894 N(class08463 class084632) {
        return N;
    }
}

