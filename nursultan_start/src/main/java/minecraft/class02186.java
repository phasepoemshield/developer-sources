/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02426
 *  minecraft.class02795
 *  minecraft.class04535
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07881
 *  minecraft.class08442
 *  minecraft.class08476
 *  minecraft.class08528
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02426;
import minecraft.class02795;
import minecraft.class04535;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07881;
import minecraft.class08442;
import minecraft.class08476;
import minecraft.class08528;

public class class02186
extends class02795<class07881, class08442, class04535> {
    private static final class01894 N = class01894.y((String)"textures/entity/sheep/sheep.png");

    public class02186(class04832 class048322) {
        super(class048322, (class06078)new class04535(class048322.N(class04802.LD)), (class06078)new class04535(class048322.N(class04802.Lh)), 0.7f);
        this.N((class06249)new class08528((class06252)this, class048322.R()));
        this.N((class06249)new class02426((class06252)this, class048322.R()));
    }

    public class08442 method_55269() {
        return new class08442();
    }

    public void method_62354(class07881 class078812, class08442 class084422, float f) {
        super.method_62354((class07438)class078812, (class08476)class084422, f);
        class084422.y = class078812.i(f);
        class084422.N = class078812.u(f);
        class084422.L = class078812.m();
        class084422.u = class078812.W();
        class084422.i = class02186.N((class07049)class078812, (String)"jeb_");
    }

    public class01894 N(class08442 class084422) {
        return N;
    }
}

