/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06079
 *  minecraft.class07438
 *  minecraft.class07648
 *  minecraft.class07654
 *  minecraft.class08450
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06079;
import minecraft.class07438;
import minecraft.class07648;
import minecraft.class07654;
import minecraft.class08450;
import minecraft.class08476;

public class class02714
extends class02840<class07654, class08450, class06079> {
    private static final class01894 N = class01894.y((String)"textures/entity/parrot/parrot_red_blue.png");
    private static final class01894 i = class01894.y((String)"textures/entity/parrot/parrot_blue.png");
    private static final class01894 R = class01894.y((String)"textures/entity/parrot/parrot_green.png");
    private static final class01894 M = class01894.y((String)"textures/entity/parrot/parrot_yellow_blue.png");
    private static final class01894 B = class01894.y((String)"textures/entity/parrot/parrot_grey.png");

    public class02714(class04832 class048322) {
        super(class048322, (class06078)new class06079(class048322.N(class04802.LT)), 0.3f);
    }

    public class08450 method_55269() {
        return new class08450();
    }

    public class01894 N(class08450 class084502) {
        return class02714.N(class084502.N);
    }

    public void method_62354(class07654 class076542, class08450 class084502, float f) {
        super.method_62354((class07438)class076542, (class08476)class084502, f);
        class084502.N = class076542.m();
        float f2 = class04995.B((float)f, (float)class076542.i, (float)class076542.y);
        float f3 = class04995.B((float)f, (float)class076542.u, (float)class076542.L);
        class084502.y = (class04995.m((double)f2) + 1.0f) * f3;
        class084502.L = class06079.N((class07654)class076542);
    }

    public static class01894 N(class07648 class076482) {
        return switch (class076482) {
            default -> throw new MatchException(null, null);
            case class07648.field_41550 -> N;
            case class07648.field_41551 -> i;
            case class07648.field_41552 -> R;
            case class07648.field_41553 -> M;
            case class07648.field_41554 -> B;
        };
    }
}

