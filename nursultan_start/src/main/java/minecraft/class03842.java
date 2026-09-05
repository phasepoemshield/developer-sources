/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01188
 *  minecraft.class01894
 *  minecraft.class02562
 *  minecraft.class02758
 *  minecraft.class02840
 *  minecraft.class04256
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06168
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class07557
 *  minecraft.class08118
 *  minecraft.class08278
 *  minecraft.class08467
 *  minecraft.class08476
 *  minecraft.class08943
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01188;
import minecraft.class01894;
import minecraft.class02562;
import minecraft.class02758;
import minecraft.class02840;
import minecraft.class04256;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06168;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class07557;
import minecraft.class08118;
import minecraft.class08278;
import minecraft.class08467;
import minecraft.class08476;
import minecraft.class08943;

public class class03842
extends class02840<class07557, class08278, class01188<class08278>> {
    private static final class01894 N = class01894.y((String)"textures/entity/zombie/zombie.png");

    public class03842(class04832 class048322, float f) {
        super(class048322, (class06078)new class06168(class048322.N(class04802.yB)), 0.5f * f);
        this.N((class06249)new class02758((class06252)this));
        this.N((class06249)new class02562((class06252)this, class08118.N((class08118)class04802.yZ, (class01140)class048322.R(), class06168::new), class048322.B()));
    }

    public class08278 method_55269() {
        return new class08278();
    }

    public void method_62354(class07557 class075572, class08278 class082782, float f) {
        super.method_62354((class07438)class075572, (class08476)class082782, f);
        class04256.N((class07438)class075572, (class08467)class082782, (float)f, (class08943)this.L);
    }

    public class01894 N(class08278 class082782) {
        return N;
    }
}

