/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00680
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class03095
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08268
 *  minecraft.class08476
 *  minecraft.class08477
 */
package minecraft;

import minecraft.class00680;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02840;
import minecraft.class03095;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08268;
import minecraft.class08476;
import minecraft.class08477;

public class class02618
extends class02840<class00680, class08268, class03095> {
    private static final class01894 N = class01894.y((String)"textures/entity/wither/wither_invulnerable.png");
    private static final class01894 i = class01894.y((String)"textures/entity/wither/wither.png");

    public class02618(class04832 class048322) {
        super(class048322, (class06078)new class03095(class048322.N(class04802.iU)), 1.0f);
        this.N((class06249)new class08477((class06252)this, class048322.R()));
    }

    public class08268 method_55269() {
        return new class08268();
    }

    public class01894 N(class08268 class082682) {
        int n = class04995.y((float)class082682.L);
        if (n <= 0 || n <= 80 && n / 5 % 2 == 1) {
            return i;
        }
        return N;
    }

    protected void y(class08268 class082682, class01421 class014212) {
        float f = 2.0f;
        if (class082682.L > 0.0f) {
            f -= class082682.L / 220.0f * 0.5f;
        }
        class014212.y(f, f, f);
    }

    public void method_62354(class00680 class006802, class08268 class082682, float f) {
        super.method_62354((class07438)class006802, (class08476)class082682, f);
        int n = class006802.m();
        class082682.L = n > 0 ? (float)n - f : 0.0f;
        System.arraycopy(class006802.W(), 0, class082682.N, 0, class082682.N.length);
        System.arraycopy(class006802.E(), 0, class082682.y, 0, class082682.y.length);
        class082682.u = class006802.v();
    }

    protected int method_24087(class00680 class006802, class07209 class072092) {
        return 15;
    }
}

