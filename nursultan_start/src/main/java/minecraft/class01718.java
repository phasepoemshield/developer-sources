/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02543
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04816
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class07550
 *  minecraft.class08476
 *  minecraft.class08786
 */
package minecraft;

import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02543;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04816;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class07550;
import minecraft.class08476;
import minecraft.class08786;

public class class01718
extends class02840<class07550, class08786, class04816> {
    private static final class01894 N = class01894.y((String)"textures/entity/creeper/creeper.png");

    public class01718(class04832 class048322) {
        super(class048322, (class06078)new class04816(class048322.N(class04802.Nl)), 0.5f);
        this.N((class06249)new class02543((class06252)this, class048322.R()));
    }

    public class08786 method_55269() {
        return new class08786();
    }

    public class01894 N(class08786 class087862) {
        return N;
    }

    public void method_62354(class07550 class075502, class08786 class087862, float f) {
        super.method_62354((class07438)class075502, (class08476)class087862, f);
        class087862.N = class075502.u(f);
        class087862.y = class075502.B();
    }

    protected void y(class08786 class087862, class01421 class014212) {
        float f = class087862.N;
        float f2 = 1.0f + class04995.m((double)(f * 100.0f)) * f * 0.01f;
        f = class04995.N((float)f, (float)0.0f, (float)1.0f);
        f *= f;
        f *= f;
        float f3 = (1.0f + f * 0.4f) * f2;
        float f4 = (1.0f + f * 0.1f) / f2;
        class014212.y(f3, f4, f3);
    }

    protected float i(class08786 class087862) {
        float f = class087862.N;
        if ((int)(f * 10.0f) % 2 == 0) {
            return 0.0f;
        }
        return class04995.N((float)f, (float)0.5f, (float)1.0f);
    }
}

