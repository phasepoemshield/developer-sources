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
 *  minecraft.class04529
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06959
 *  minecraft.class07438
 *  minecraft.class07861
 *  minecraft.class07870
 *  minecraft.class08471
 *  minecraft.class08476
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02840;
import minecraft.class04529;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06959;
import minecraft.class07438;
import minecraft.class07861;
import minecraft.class07870;
import minecraft.class08471;
import minecraft.class08476;
import org.joml.Quaternionfc;

public class class02322
extends class02840<class07870, class08471, class04529> {
    private static final class01894 N = class01894.y((String)"textures/entity/fish/salmon.png");
    private final class04529 i;
    private final class04529 R;
    private final class04529 M;

    public class02322(class04832 class048322) {
        super(class048322, (class06078)new class04529(class048322.N(class04802.LC)), 0.4f);
        this.i = new class04529(class048322.N(class04802.Lx));
        this.R = new class04529(class048322.N(class04802.LC));
        this.M = new class04529(class048322.N(class04802.LS));
    }

    public class08471 method_55269() {
        return new class08471();
    }

    public void method_62354(class07870 class078702, class08471 class084712, float f) {
        super.method_62354((class07438)class078702, (class08476)class084712, f);
        class084712.N = class078702.Q();
    }

    public class01894 N(class08471 class084712) {
        return N;
    }

    protected void y(class08471 class084712, class01421 class014212, float f, float f2) {
        super.y((class08476)class084712, class014212, f, f2);
        float f3 = 1.0f;
        float f4 = 1.0f;
        if (!class084712.NZ) {
            f3 = 1.3f;
            f4 = 1.7f;
        }
        float f5 = f3 * 4.3f * class04995.m((double)(f4 * 0.6f * class084712.P));
        class014212.N((Quaternionfc)class02058.u.N(f5));
        if (!class084712.NZ) {
            class014212.N(0.2f, 0.1f, 0.0f);
            class014212.N((Quaternionfc)class02058.R.N(90.0f));
        }
    }

    public void method_3936(class08471 class084712, class01421 class014212, class01237 class012372, class06959 class069592) {
        this.y = switch (class084712.N) {
            default -> throw new MatchException(null, null);
            case class07861.field_52470 -> this.i;
            case class07861.field_52471 -> this.R;
            case class07861.field_52472 -> this.M;
        };
        super.method_3936((class08476)class084712, class014212, class012372, class069592);
    }
}

