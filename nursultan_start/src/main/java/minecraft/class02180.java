/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02407
 *  minecraft.class02840
 *  minecraft.class04390
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07162
 *  minecraft.class07438
 *  minecraft.class08473
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02407;
import minecraft.class02840;
import minecraft.class04390;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07162;
import minecraft.class07438;
import minecraft.class08473;
import minecraft.class08476;

public class class02180
extends class02840<class07162, class08473, class04390> {
    public static final class01894 N = class01894.y((String)"textures/entity/slime/slime.png");

    public class02180(class04832 class048322) {
        super(class048322, (class06078)new class04390(class048322.N(class04802.us)), 0.25f);
        this.N((class06249)new class02407((class06252)this, class048322.R()));
    }

    public class08473 method_55269() {
        return new class08473();
    }

    public class01894 N(class08473 class084732) {
        return N;
    }

    protected void y(class08473 class084732, class01421 class014212) {
        float f = 0.999f;
        class014212.y(0.999f, 0.999f, 0.999f);
        class014212.N(0.0f, 0.001f, 0.0f);
        float f2 = class084732.y;
        float f3 = class084732.N / (f2 * 0.5f + 1.0f);
        float f4 = 1.0f / (f3 + 1.0f);
        class014212.y(f4 * f2, 1.0f / f4 * f2, f4 * f2);
    }

    public void method_62354(class07162 class071622, class08473 class084732, float f) {
        super.method_62354((class07438)class071622, (class08476)class084732, f);
        class084732.N = class04995.B((float)f, (float)class071622.R, (float)class071622.i);
        class084732.y = class071622.t();
    }

    protected float u(class08473 class084732) {
        return (float)class084732.y * 0.25f;
    }
}

