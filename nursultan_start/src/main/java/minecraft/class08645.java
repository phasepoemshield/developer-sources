/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00032
 *  minecraft.class00066
 *  minecraft.class00207
 *  minecraft.class00734
 *  minecraft.class01894
 *  minecraft.class02795
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class08476
 *  minecraft.class08670
 *  minecraft.class08684
 *  minecraft.class08719
 */
package minecraft;

import minecraft.class00032;
import minecraft.class00066;
import minecraft.class00207;
import minecraft.class00734;
import minecraft.class01894;
import minecraft.class02795;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class08476;
import minecraft.class08644;
import minecraft.class08670;
import minecraft.class08684;
import minecraft.class08719;

public class class08645
extends class02795<class00032, class08670, class08684> {
    private static final class01894 N = class01894.y((String)"textures/entity/ghast/happy_ghast.png");
    private static final class01894 i = class01894.y((String)"textures/entity/ghast/happy_ghast_baby.png");
    private static final class01894 R = class01894.y((String)"textures/entity/ghast/happy_ghast_ropes.png");

    public class08645(class04832 class048322) {
        super(class048322, (class06078)new class08684(class048322.N(class04802.yP)), (class06078)new class08684(class048322.N(class04802.ys)), 2.0f);
        this.N((class06249)new class00207((class06252)this, class048322.B(), class08719.field_59984, class086702 -> class086702.N, (class06078)new class08644(class048322.N(class04802.yT)), (class06078)new class08644(class048322.N(class04802.yb))));
        this.N((class06249)new class00066((class06252)this, class048322.R(), R));
    }

    public class08670 method_55269() {
        return new class08670();
    }

    protected class00734 y(class00032 class000322) {
        class00734 class007342 = super.method_62358((class07438)class000322);
        float f = class000322.method_17682();
        return class007342.y(class007342.y - (double)(f / 2.0f));
    }

    public void method_62354(class00032 class000322, class08670 class086702, float f) {
        super.method_62354((class07438)class000322, (class08476)class086702, f);
        class086702.N = class000322.method_6118(class07085.field_48824).t();
        class086702.y = class000322.method_5782();
        class086702.L = class000322.W();
    }

    public class01894 N(class08670 class086702) {
        if (class086702.NB) {
            return i;
        }
        return N;
    }
}

