/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class02795
 *  minecraft.class03091
 *  minecraft.class04255
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class07894
 *  minecraft.class08285
 *  minecraft.class08445
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02566;
import minecraft.class02795;
import minecraft.class03091;
import minecraft.class04255;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class07894;
import minecraft.class08285;
import minecraft.class08445;
import minecraft.class08476;

public class class02942
extends class02795<class07894, class08285, class03091> {
    public class02942(class04832 class048322) {
        super(class048322, (class06078)new class03091(class048322.N(class04802.iT)), (class06078)new class03091(class048322.N(class04802.ij)), 0.5f);
        this.N((class06249)new class04255((class06252)this, class048322.R(), class048322.B()));
        this.N((class06249)new class08445((class06252)this));
    }

    public class08285 method_55269() {
        return new class08285();
    }

    public class01894 N(class08285 class082852) {
        return class082852.M;
    }

    public void method_62354(class07894 class078942, class08285 class082852, float f) {
        super.method_62354((class07438)class078942, (class08476)class082852, f);
        class082852.N = class078942.P_();
        class082852.y = class078942.Ng();
        class082852.L = class078942.n();
        class082852.u = class078942.R(f);
        class082852.i = class078942.i(f);
        class082852.M = class078942.m();
        class082852.R = class078942.u(f);
        class082852.B = class078942.NQ() ? class078942.t() : null;
        class082852.Z = class078942.NZ().t();
    }

    protected int M(class08285 class082852) {
        float f = class082852.R;
        if (f == 1.0f) {
            return -1;
        }
        return class02566.N((float)1.0f, (float)f, (float)f, (float)f);
    }
}

