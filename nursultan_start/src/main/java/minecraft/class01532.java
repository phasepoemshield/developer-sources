/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class01140
 *  minecraft.class01188
 *  minecraft.class01238
 *  minecraft.class01894
 *  minecraft.class02221
 *  minecraft.class02562
 *  minecraft.class04256
 *  minecraft.class04832
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class08118
 *  minecraft.class08447
 *  minecraft.class08467
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01134;
import minecraft.class01140;
import minecraft.class01188;
import minecraft.class01238;
import minecraft.class01486;
import minecraft.class01894;
import minecraft.class02221;
import minecraft.class02562;
import minecraft.class04256;
import minecraft.class04832;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class08118;
import minecraft.class08447;
import minecraft.class08467;
import minecraft.class08476;

public class class01532
extends class04256<class01238, class08447, class01486> {
    private static final class01894 i = class01894.y((String)"textures/entity/piglin/piglin.png");
    private static final class01894 R = class01894.y((String)"textures/entity/piglin/piglin_brute.png");
    public static final class02221 N = new class02221(0.0f, 0.0f, 1.0019531f);

    public class01532(class04832 class048322, class01134 class011342, class01134 class011343, class08118<class01134> class081182, class08118<class01134> class081183) {
        super(class048322, (class01188)new class01486(class048322.N(class011342)), (class01188)new class01486(class048322.N(class011343)), 0.5f, N);
        this.N((class06249)new class02562((class06252)this, class08118.N(class081182, (class01140)class048322.R(), class01486::new), class08118.N(class081183, (class01140)class048322.R(), class01486::new), class048322.B()));
    }

    protected boolean L(class08447 class084472) {
        return super.L((class08476)class084472) || class084472.y;
    }

    public class08447 method_55269() {
        return new class08447();
    }

    public class01894 N(class08447 class084472) {
        return class084472.N ? R : i;
    }

    public void method_62354(class01238 class012382, class08447 class084472, float f) {
        super.method_62354((class07079)class012382, (class08467)class084472, f);
        class084472.N = class012382.method_5864() == class07078.yN;
        class084472.p = class012382.E();
        class084472.a = class06593.y((class06584)class012382.method_6030(), (class07438)class012382);
        class084472.y = class012382.G();
    }
}

