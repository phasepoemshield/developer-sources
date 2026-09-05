/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02245
 *  minecraft.class02840
 *  minecraft.class03094
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07438
 *  minecraft.class08257
 *  minecraft.class08476
 *  minecraft.class08837
 *  minecraft.class08943
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02245;
import minecraft.class02840;
import minecraft.class03094;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06163;
import minecraft.class06174;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class08257;
import minecraft.class08476;
import minecraft.class08837;
import minecraft.class08943;

public class class06158
extends class02840<class06163, class08257, class03094> {
    private static final class01894 N = class01894.y((String)"textures/entity/wandering_trader.png");

    public class06158(class04832 class048322) {
        super(class048322, (class06078)new class03094(class048322.N(class04802.iN)), 0.5f);
        this.N((class06249)new class02245((class06252)((Object)this), class048322.R(), class048322.U()));
        this.N(new class06174(this));
    }

    public class08257 method_55269() {
        return new class08257();
    }

    public void method_62354(class06163 class061632, class08257 class082572, float f) {
        super.method_62354((class07438)class061632, (class08476)class082572, f);
        class08837.N((class07438)class061632, (class08837)class082572, (class08943)this.L);
        class082572.N = class061632.I() > 0;
    }

    public class01894 N(class08257 class082572) {
        return N;
    }
}

