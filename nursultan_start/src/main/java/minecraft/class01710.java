/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02249
 *  minecraft.class02795
 *  minecraft.class03114
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class07618
 *  minecraft.class08476
 *  minecraft.class08798
 *  minecraft.class08837
 *  minecraft.class08943
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02249;
import minecraft.class02795;
import minecraft.class03114;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class07618;
import minecraft.class08476;
import minecraft.class08798;
import minecraft.class08837;
import minecraft.class08943;

public class class01710
extends class02795<class07618, class08798, class03114> {
    private static final class01894 N = class01894.y((String)"textures/entity/dolphin.png");

    public class01710(class04832 class048322) {
        super(class048322, (class06078)new class03114(class048322.N(class04802.Ng)), (class06078)new class03114(class048322.N(class04802.NI)), 0.7f);
        this.N((class06249)new class02249((class06252)this));
    }

    public class08798 method_55269() {
        return new class08798();
    }

    public void method_62354(class07618 class076182, class08798 class087982, float f) {
        super.method_62354((class07438)class076182, (class08476)class087982, f);
        class08837.N((class07438)class076182, (class08837)class087982, (class08943)this.L);
        class087982.N = class076182.method_18798().z() > 1.0E-7;
    }

    public class01894 N(class08798 class087982) {
        return N;
    }
}

