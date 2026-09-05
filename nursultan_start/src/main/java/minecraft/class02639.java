/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02758
 *  minecraft.class02840
 *  minecraft.class03856
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08042
 *  minecraft.class08261
 *  minecraft.class08476
 *  minecraft.class08827
 *  minecraft.class08943
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02758;
import minecraft.class02840;
import minecraft.class03856;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08042;
import minecraft.class08261;
import minecraft.class08476;
import minecraft.class08827;
import minecraft.class08943;

public class class02639
extends class02840<class08042, class08261, class03856> {
    private static final class01894 N = class01894.y((String)"textures/entity/illager/vex.png");
    private static final class01894 i = class01894.y((String)"textures/entity/illager/vex_charging.png");

    public class02639(class04832 class048322) {
        super(class048322, (class06078)new class03856(class048322.N(class04802.uC)), 0.3f);
        this.N((class06249)new class02758((class06252)this));
    }

    public class08261 method_55269() {
        return new class08261();
    }

    protected int method_24087(class08042 class080422, class07209 class072092) {
        return 15;
    }

    public class01894 N(class08261 class082612) {
        if (class082612.N) {
            return i;
        }
        return N;
    }

    public void method_62354(class08042 class080422, class08261 class082612, float f) {
        super.method_62354((class07438)class080422, (class08476)class082612, f);
        class08827.N((class07438)class080422, (class08827)class082612, (class08943)this.L, (float)f);
        class082612.N = class080422.W();
    }
}

