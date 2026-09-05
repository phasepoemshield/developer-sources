/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02221
 *  minecraft.class02245
 *  minecraft.class02795
 *  minecraft.class03094
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06174
 *  minecraft.class06247
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class08041
 *  minecraft.class08257
 *  minecraft.class08476
 *  minecraft.class08837
 *  minecraft.class08943
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02221;
import minecraft.class02245;
import minecraft.class02795;
import minecraft.class03094;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06174;
import minecraft.class06247;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class08041;
import minecraft.class08257;
import minecraft.class08476;
import minecraft.class08837;
import minecraft.class08943;

public class class02624
extends class02795<class08041, class08257, class03094> {
    private static final class01894 i = class01894.y((String)"textures/entity/villager/villager.png");
    public static final class02221 N = new class02221(-0.1171875f, -0.07421875f, 1.0f);

    public class02624(class04832 class048322) {
        super(class048322, (class06078)new class03094(class048322.N(class04802.uS)), (class06078)new class03094(class048322.N(class04802.uD)), 0.5f);
        this.N((class06249)new class02245((class06252)this, class048322.R(), class048322.U(), N));
        this.N((class06249)new class06247((class06252)this, class048322.i(), "villager", (class06078)new class03094(class048322.N(class04802.ux)), (class06078)new class03094(class048322.N(class04802.uh))));
        this.N((class06249)new class06174((class06252)this));
    }

    public class08257 method_55269() {
        return new class08257();
    }

    protected float u(class08257 class082572) {
        float f = super.method_55831((class08476)class082572);
        if (class082572.NB) {
            return f * 0.5f;
        }
        return f;
    }

    public void method_62354(class08041 class080412, class08257 class082572, float f) {
        super.method_62354((class07438)class080412, (class08476)class082572, f);
        class08837.N((class07438)class080412, (class08837)class082572, (class08943)this.L);
        class082572.N = class080412.I() > 0;
        class082572.y = class080412.t();
    }

    public class01894 N(class08257 class082572) {
        return i;
    }
}

