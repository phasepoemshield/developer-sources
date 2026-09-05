/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class03648
 *  minecraft.class04660
 *  minecraft.class04667
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class07617
 *  minecraft.class08476
 *  minecraft.class08796
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02795;
import minecraft.class03648;
import minecraft.class04660;
import minecraft.class04667;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class07617;
import minecraft.class08476;
import minecraft.class08796;
import org.joml.Quaternionfc;

public class class02838
extends class02795<class07617, class08796, class04660> {
    public class02838(class04832 class048322) {
        super(class048322, new class04660(class048322.N(class04802.p)), new class04660(class048322.N(class04802.F)), 0.4f);
        this.N((class06249)new class04667((class06252)this, class048322.R()));
    }

    public class08796 method_55269() {
        return new class08796();
    }

    public class01894 N(class08796 class087962) {
        return class087962.N;
    }

    public void method_62354(class07617 class076172, class08796 class087962, float f) {
        super.method_62354((class07438)class076172, (class08476)class087962, f);
        class087962.N = ((class03648)class076172.B().N()).y().y();
        class087962.u = class076172.method_18276();
        class087962.i = class076172.method_5624();
        class087962.R = class076172.Ng();
        class087962.M = class076172.u(f);
        class087962.B = class076172.i(f);
        class087962.Z = class076172.R(f);
        class087962.y = class076172.G();
        class087962.L = class076172.NQ() ? class076172.v() : null;
    }

    protected void y(class08796 class087962, class01421 class014212, float f, float f2) {
        super.y((class08476)class087962, class014212, f, f2);
        float f3 = class087962.M;
        if (f3 > 0.0f) {
            class014212.N(0.4f * f3, 0.15f * f3, 0.1f * f3);
            class014212.N((Quaternionfc)class02058.R.N(class04995.Z((float)f3, (float)0.0f, (float)90.0f)));
            if (class087962.y) {
                class014212.N(0.15f * f3, 0.0f, 0.0f);
            }
        }
    }
}

