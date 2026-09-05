/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06379
 *  minecraft.class07438
 *  minecraft.class07523
 *  minecraft.class08462
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06379;
import minecraft.class07438;
import minecraft.class07523;
import minecraft.class08462;
import minecraft.class08476;

public class class03838
extends class02840<class07523, class08462, class06379> {
    private static final class01894 N = class01894.y((String)"textures/entity/ghast/ghast.png");
    private static final class01894 i = class01894.y((String)"textures/entity/ghast/ghast_shooting.png");

    public class03838(class04832 class048322) {
        super(class048322, (class06078)new class06379(class048322.N(class04802.yM)), 1.5f);
    }

    public class08462 method_55269() {
        return new class08462();
    }

    public void method_62354(class07523 class075232, class08462 class084622, float f) {
        super.method_62354((class07438)class075232, (class08476)class084622, f);
        class084622.N = class075232.M();
    }

    public class01894 N(class08462 class084622) {
        if (class084622.N) {
            return i;
        }
        return N;
    }
}

