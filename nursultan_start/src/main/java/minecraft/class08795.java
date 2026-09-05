/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class03853
 *  minecraft.class03858
 *  minecraft.class04802
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class07865
 *  minecraft.class07892
 *  minecraft.class08266
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class03853;
import minecraft.class03858;
import minecraft.class04802;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class07865;
import minecraft.class07892;
import minecraft.class08266;
import minecraft.class08476;

public class class08795
extends class06249<class08266, class06078<class08266>> {
    private static final class01894 N = class01894.y((String)"textures/entity/fish/tropical_a_pattern_1.png");
    private static final class01894 y = class01894.y((String)"textures/entity/fish/tropical_a_pattern_2.png");
    private static final class01894 L = class01894.y((String)"textures/entity/fish/tropical_a_pattern_3.png");
    private static final class01894 u = class01894.y((String)"textures/entity/fish/tropical_a_pattern_4.png");
    private static final class01894 i = class01894.y((String)"textures/entity/fish/tropical_a_pattern_5.png");
    private static final class01894 R = class01894.y((String)"textures/entity/fish/tropical_a_pattern_6.png");
    private static final class01894 M = class01894.y((String)"textures/entity/fish/tropical_b_pattern_1.png");
    private static final class01894 B = class01894.y((String)"textures/entity/fish/tropical_b_pattern_2.png");
    private static final class01894 Z = class01894.y((String)"textures/entity/fish/tropical_b_pattern_3.png");
    private static final class01894 z = class01894.y((String)"textures/entity/fish/tropical_b_pattern_4.png");
    private static final class01894 U = class01894.y((String)"textures/entity/fish/tropical_b_pattern_5.png");
    private static final class01894 E = class01894.y((String)"textures/entity/fish/tropical_b_pattern_6.png");
    private final class03853 W;
    private final class03858 m;

    public class08795(class06252<class08266, class06078<class08266>> class062522, class01140 class011402) {
        super(class062522);
        this.W = new class03853(class011402.N(class04802.ua));
        this.m = new class03858(class011402.N(class04802.uc));
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08266 class082662, float f, float f2) {
        class07892 class078922 = class082662.N;
        class03853 class038532 = switch (class078922.N()) {
            default -> throw new MatchException(null, null);
            case class07865.field_41574 -> this.W;
            case class07865.field_41575 -> this.m;
        };
        class01894 class018942 = switch (class078922) {
            default -> throw new MatchException(null, null);
            case class07892.field_6881 -> N;
            case class07892.field_6880 -> y;
            case class07892.field_6882 -> L;
            case class07892.field_6890 -> u;
            case class07892.field_6891 -> i;
            case class07892.field_6892 -> R;
            case class07892.field_6893 -> M;
            case class07892.field_6887 -> B;
            case class07892.field_6883 -> Z;
            case class07892.field_6884 -> z;
            case class07892.field_6888 -> U;
            case class07892.field_6889 -> E;
        };
        class08795.N((class06271)class038532, (class01894)class018942, (class01421)class014212, (class01237)class012372, (int)n, (class08476)class082662, (int)class082662.L, (int)1);
    }
}

