/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01188
 *  minecraft.class01894
 *  minecraft.class02562
 *  minecraft.class02624
 *  minecraft.class03090
 *  minecraft.class04256
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06247
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07079
 *  minecraft.class08018
 *  minecraft.class08118
 *  minecraft.class08283
 *  minecraft.class08467
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01188;
import minecraft.class01894;
import minecraft.class02562;
import minecraft.class02624;
import minecraft.class03090;
import minecraft.class04256;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06247;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07079;
import minecraft.class08018;
import minecraft.class08118;
import minecraft.class08283;
import minecraft.class08467;
import minecraft.class08476;

public class class02534
extends class04256<class08018, class08283, class03090<class08283>> {
    private static final class01894 N = class01894.y((String)"textures/entity/zombie_villager/zombie_villager.png");

    public class02534(class04832 class048322) {
        super(class048322, (class01188)new class03090(class048322.N(class04802.iI)), (class01188)new class03090(class048322.N(class04802.io)), 0.5f, class02624.N);
        this.N((class06249)new class02562((class06252)this, class08118.N((class08118)class04802.iV, (class01140)class048322.R(), class03090::new), class08118.N((class08118)class04802.iK, (class01140)class048322.R(), class03090::new), class048322.B()));
        this.N((class06249)new class06247((class06252)this, class048322.i(), "zombie_villager", (class06078)new class03090(class048322.N(class04802.iJ)), (class06078)new class03090(class048322.N(class04802.iq))));
    }

    public class08283 method_55269() {
        return new class08283();
    }

    protected boolean L(class08283 class082832) {
        return super.L((class08476)class082832) || class082832.y;
    }

    public class01894 N(class08283 class082832) {
        return N;
    }

    public void method_62354(class08018 class080182, class08283 class082832, float f) {
        super.method_62354((class07079)class080182, (class08467)class082832, f);
        class082832.y = class080182.v();
        class082832.a = class080182.t();
        class082832.N = class080182.Nl();
    }
}

