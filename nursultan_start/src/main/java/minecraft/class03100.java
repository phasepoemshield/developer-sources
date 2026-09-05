/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02235
 *  minecraft.class02568
 *  minecraft.class02840
 *  minecraft.class04256
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06069
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06374
 *  minecraft.class06889
 *  minecraft.class07438
 *  minecraft.class07525
 *  minecraft.class08467
 *  minecraft.class08476
 *  minecraft.class08785
 *  minecraft.class08800
 *  minecraft.class08943
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02235;
import minecraft.class02568;
import minecraft.class02840;
import minecraft.class04256;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06069;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06374;
import minecraft.class06889;
import minecraft.class07438;
import minecraft.class07525;
import minecraft.class08467;
import minecraft.class08476;
import minecraft.class08785;
import minecraft.class08800;
import minecraft.class08943;

public class class03100
extends class02840<class07525, class08785, class06374<class08785>> {
    private static final class01894 N = class01894.y((String)"textures/entity/enderman/enderman.png");
    private final class06069 i = class06069.u();

    public class03100(class04832 class048322) {
        super(class048322, (class06078)new class06374(class048322.N(class04802.Nx)), 0.5f);
        this.N((class06249)new class02568((class06252)this));
        this.N((class06249)new class02235((class06252)this));
    }

    public class01894 y(class08785 class087852) {
        return N;
    }

    public class08785 method_55269() {
        return new class08785();
    }

    public void method_62354(class07525 class075252, class08785 class087852, float f) {
        super.method_62354((class07438)class075252, (class08476)class087852, f);
        class04256.N((class07438)class075252, (class08467)class087852, (float)f, (class08943)this.L);
        class087852.N = class075252.t();
        class087852.y = class075252.n();
    }

    public class06889 method_23169(class08785 class087852) {
        class06889 class068892 = super.method_23169((class08800)class087852);
        if (class087852.N) {
            double d = 0.02 * (double)class087852.NL;
            return class068892.y(this.i.E() * d, 0.0, this.i.E() * d);
        }
        return class068892;
    }
}

