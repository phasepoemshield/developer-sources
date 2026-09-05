/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00207
 *  minecraft.class00210
 *  minecraft.class01894
 *  minecraft.class02795
 *  minecraft.class02976
 *  minecraft.class03797
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class08476
 *  minecraft.class08719
 *  minecraft.class08787
 */
package minecraft;

import minecraft.class00207;
import minecraft.class00210;
import minecraft.class01894;
import minecraft.class02795;
import minecraft.class02976;
import minecraft.class03797;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class08476;
import minecraft.class08719;
import minecraft.class08787;

public class class02000
extends class02795<class02976, class08787, class03797> {
    private static final class01894 N = class01894.y((String)"textures/entity/camel/camel.png");

    public class02000(class04832 class048322) {
        super(class048322, (class06078)new class03797(class048322.N(class04802.V)), (class06078)new class03797(class048322.N(class04802.e)), 0.7f);
        this.N((class06249)this.N(class048322));
    }

    public class08787 method_55269() {
        return new class08787();
    }

    public void method_62354(class02976 class029762, class08787 class087872, float f) {
        super.method_62354((class07438)class029762, (class08476)class087872, f);
        class087872.N = class029762.method_6118(class07085.field_55946).t();
        class087872.y = class029762.method_5782();
        class087872.L = Math.max((float)class029762.n() - f, 0.0f);
        class087872.u.N(class029762.h);
        class087872.i.N(class029762.r);
        class087872.R.N(class029762.NN);
        class087872.M.N(class029762.Ny);
        class087872.B.N(class029762.NL);
    }

    public class01894 N(class08787 class087872) {
        return N;
    }

    protected class00207<class08787, class03797, class00210> N(class04832 class048322) {
        return new class00207((class06252)this, class048322.B(), class08719.field_56125, class087872 -> class087872.N, (class06078)new class00210(class048322.N(class04802.H)), (class06078)new class00210(class048322.N(class04802.c)));
    }
}

