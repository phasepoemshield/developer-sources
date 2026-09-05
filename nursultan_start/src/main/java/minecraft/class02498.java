/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02159
 *  minecraft.class02671
 *  minecraft.class02840
 *  minecraft.class02858
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06959
 *  minecraft.class07438
 *  minecraft.class07871
 *  minecraft.class08466
 *  minecraft.class08476
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02159;
import minecraft.class02671;
import minecraft.class02840;
import minecraft.class02858;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06959;
import minecraft.class07438;
import minecraft.class07871;
import minecraft.class08466;
import minecraft.class08476;
import minecraft.class08800;

public class class02498
extends class02840<class07871, class08466, class06078<class08800>> {
    private static final class01894 N = class01894.y((String)"textures/entity/fish/pufferfish.png");
    private final class06078<class08800> i;
    private final class06078<class08800> R;
    private final class06078<class08800> M = this.L();

    public class02498(class04832 class048322) {
        super(class048322, (class06078)new class02858(class048322.N(class04802.LX)), 0.2f);
        this.R = new class02159(class048322.N(class04802.La));
        this.i = new class02671(class048322.N(class04802.Lp));
    }

    public class08466 method_55269() {
        return new class08466();
    }

    protected float u(class08466 class084662) {
        return 0.1f + 0.1f * (float)class084662.N;
    }

    public void method_62354(class07871 class078712, class08466 class084662, float f) {
        super.method_62354((class07438)class078712, (class08476)class084662, f);
        class084662.N = class078712.v();
    }

    protected void y(class08466 class084662, class01421 class014212, float f, float f2) {
        class014212.N(0.0f, class04995.P((double)(class084662.P * 0.05f)) * 0.08f, 0.0f);
        super.y((class08476)class084662, class014212, f, f2);
    }

    public class01894 N(class08466 class084662) {
        return N;
    }

    public void method_3936(class08466 class084662, class01421 class014212, class01237 class012372, class06959 class069592) {
        this.y = switch (class084662.N) {
            case 0 -> this.i;
            case 1 -> this.R;
            default -> this.M;
        };
        super.method_3936((class08476)class084662, class014212, class012372, class069592);
    }
}

