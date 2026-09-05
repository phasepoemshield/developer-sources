/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class01894
 *  minecraft.class02795
 *  minecraft.class04528
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07879
 *  minecraft.class07897
 *  minecraft.class08476
 *  minecraft.class08481
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02795;
import minecraft.class04528;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07879;
import minecraft.class07897;
import minecraft.class08476;
import minecraft.class08481;

public class class02354
extends class02795<class07879, class08481, class04528> {
    private static final class01894 N = class01894.y((String)"textures/entity/rabbit/brown.png");
    private static final class01894 i = class01894.y((String)"textures/entity/rabbit/white.png");
    private static final class01894 R = class01894.y((String)"textures/entity/rabbit/black.png");
    private static final class01894 M = class01894.y((String)"textures/entity/rabbit/gold.png");
    private static final class01894 B = class01894.y((String)"textures/entity/rabbit/salt.png");
    private static final class01894 Z = class01894.y((String)"textures/entity/rabbit/white_splotched.png");
    private static final class01894 z = class01894.y((String)"textures/entity/rabbit/toast.png");
    private static final class01894 U = class01894.y((String)"textures/entity/rabbit/caerbannog.png");

    public class02354(class04832 class048322) {
        super(class048322, (class06078)new class04528(class048322.N(class04802.LF)), (class06078)new class04528(class048322.N(class04802.LA)), 0.3f);
    }

    public class08481 method_55269() {
        return new class08481();
    }

    public void method_62354(class07879 class078792, class08481 class084812, float f) {
        super.method_62354((class07438)class078792, (class08476)class084812, f);
        class084812.N = class078792.u(f);
        class084812.y = class02354.N((class07049)class078792, (String)"Toast");
        class084812.L = class078792.v();
    }

    public class01894 N(class08481 class084812) {
        if (class084812.y) {
            return z;
        }
        return switch (class084812.L) {
            default -> throw new MatchException(null, null);
            case class07897.field_41561 -> N;
            case class07897.field_41562 -> i;
            case class07897.field_41563 -> R;
            case class07897.field_41565 -> M;
            case class07897.field_41566 -> B;
            case class07897.field_41564 -> Z;
            case class07897.field_41567 -> U;
        };
    }
}

