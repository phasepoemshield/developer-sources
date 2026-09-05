/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02795
 *  minecraft.class04626
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07438
 *  minecraft.class08476
 *  minecraft.class08801
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02795;
import minecraft.class04626;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class05486;
import minecraft.class06078;
import minecraft.class07438;
import minecraft.class08476;
import minecraft.class08801;

public class class05504
extends class02795<class04626, class08801, class05486> {
    private static final class01894 N = class01894.y((String)"textures/entity/bee/bee_angry.png");
    private static final class01894 i = class01894.y((String)"textures/entity/bee/bee_angry_nectar.png");
    private static final class01894 R = class01894.y((String)"textures/entity/bee/bee.png");
    private static final class01894 M = class01894.y((String)"textures/entity/bee/bee_nectar.png");

    public class05504(class04832 class048322) {
        super(class048322, (class06078)new class05486(class048322.N(class04802.t)), (class06078)new class05486(class048322.N(class04802.G)), 0.4f);
    }

    public class08801 method_55269() {
        return new class08801();
    }

    public void method_62354(class04626 class046262, class08801 class088012, float f) {
        super.method_62354((class07438)class046262, (class08476)class088012, f);
        class088012.N = class046262.u(f);
        class088012.y = !class046262.NJ();
        class088012.L = class046262.method_24828() && class046262.method_18798().B() < 1.0E-7;
        class088012.u = class046262.P_();
        class088012.i = class046262.NI();
    }

    public class01894 N(class08801 class088012) {
        if (class088012.u) {
            if (class088012.i) {
                return i;
            }
            return N;
        }
        if (class088012.i) {
            return M;
        }
        return R;
    }
}

