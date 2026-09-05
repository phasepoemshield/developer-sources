/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02840
 *  minecraft.class03853
 *  minecraft.class03858
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06959
 *  minecraft.class07438
 *  minecraft.class07865
 *  minecraft.class07899
 *  minecraft.class08266
 *  minecraft.class08476
 *  minecraft.class08795
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02840;
import minecraft.class03853;
import minecraft.class03858;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06959;
import minecraft.class07438;
import minecraft.class07865;
import minecraft.class07899;
import minecraft.class08266;
import minecraft.class08476;
import minecraft.class08795;
import org.joml.Quaternionfc;

public class class02663
extends class02840<class07899, class08266, class06078<class08266>> {
    private final class06078<class08266> N = this.L();
    private final class06078<class08266> i;
    private static final class01894 R = class01894.y((String)"textures/entity/fish/tropical_a.png");
    private static final class01894 M = class01894.y((String)"textures/entity/fish/tropical_b.png");

    public class02663(class04832 class048322) {
        super(class048322, (class06078)new class03853(class048322.N(class04802.uX)), 0.15f);
        this.i = new class03858(class048322.N(class04802.uH));
        this.N((class06249)new class08795((class06252)this, class048322.R()));
    }

    public class08266 method_55269() {
        return new class08266();
    }

    protected int M(class08266 class082662) {
        return class082662.y;
    }

    public class01894 N(class08266 class082662) {
        return switch (class082662.N.N()) {
            default -> throw new MatchException(null, null);
            case class07865.field_41574 -> R;
            case class07865.field_41575 -> M;
        };
    }

    public void method_62354(class07899 class078992, class08266 class082662, float f) {
        super.method_62354((class07438)class078992, (class08476)class082662, f);
        class082662.N = class078992.I();
        class082662.y = class078992.Q().L();
        class082662.L = class078992.O().L();
    }

    public void method_3936(class08266 class082662, class01421 class014212, class01237 class012372, class06959 class069592) {
        this.y = switch (class082662.N.N()) {
            default -> throw new MatchException(null, null);
            case class07865.field_41574 -> this.N;
            case class07865.field_41575 -> this.i;
        };
        super.method_3936((class08476)class082662, class014212, class012372, class069592);
    }

    protected void y(class08266 class082662, class01421 class014212, float f, float f2) {
        super.y((class08476)class082662, class014212, f, f2);
        float f3 = 4.3f * class04995.m((double)(0.6f * class082662.P));
        class014212.N((Quaternionfc)class02058.u.N(f3));
        if (!class082662.NZ) {
            class014212.N(0.2f, 0.1f, 0.0f);
            class014212.N((Quaternionfc)class02058.R.N(90.0f));
        }
    }
}

