/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02428
 *  minecraft.class02840
 *  minecraft.class04386
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class07888
 *  minecraft.class08476
 *  minecraft.class08806
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02428;
import minecraft.class02840;
import minecraft.class04386;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class07888;
import minecraft.class08476;
import minecraft.class08806;

public class class02653
extends class02840<class07888, class08806, class04386> {
    private static final class01894 N = class01894.y((String)"textures/entity/snow_golem.png");

    public class02653(class04832 class048322) {
        super(class048322, (class06078)new class04386(class048322.N(class04802.uv)), 0.5f);
        this.N((class06249)new class02428((class06252)this, class048322.u()));
    }

    public class08806 method_55269() {
        return new class08806();
    }

    public void method_62354(class07888 class078882, class08806 class088062, float f) {
        super.method_62354((class07438)class078882, (class08476)class088062, f);
        class088062.N = class078882.B();
    }

    public class01894 N(class08806 class088062) {
        return N;
    }
}

