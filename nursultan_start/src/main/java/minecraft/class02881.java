/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class05569
 *  minecraft.class07140
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08473
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class05569;
import minecraft.class07140;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08473;
import minecraft.class08476;

public class class02881
extends class02840<class07140, class08473, class05569> {
    private static final class01894 N = class01894.y((String)"textures/entity/slime/magmacube.png");

    public class02881(class04832 class048322) {
        super(class048322, new class05569(class048322.N(class04802.yF)), 0.25f);
    }

    public class08473 method_55269() {
        return new class08473();
    }

    protected float u(class08473 class084732) {
        return (float)class084732.y * 0.25f;
    }

    public class01894 N(class08473 class084732) {
        return N;
    }

    public void method_62354(class07140 class071402, class08473 class084732, float f) {
        super.method_62354((class07438)class071402, (class08476)class084732, f);
        class084732.N = class04995.B((float)f, (float)class071402.R, (float)class071402.i);
        class084732.y = class071402.t();
    }

    protected void y(class08473 class084732, class01421 class014212) {
        int n = class084732.y;
        float f = class084732.N / ((float)n * 0.5f + 1.0f);
        float f2 = 1.0f / (f + 1.0f);
        class014212.y(f2 * (float)n, 1.0f / f2 * (float)n, f2 * (float)n);
    }

    protected int method_24087(class07140 class071402, class07209 class072092) {
        return 15;
    }
}

