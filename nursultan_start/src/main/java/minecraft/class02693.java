/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class00207
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06032
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class06959
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class07627
 *  minecraft.class08470
 *  minecraft.class08476
 *  minecraft.class08598
 *  minecraft.class08603
 *  minecraft.class08637
 *  minecraft.class08642
 *  minecraft.class08719
 *  minecraft.class08923
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class00207;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06032;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class06959;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class07627;
import minecraft.class08470;
import minecraft.class08476;
import minecraft.class08598;
import minecraft.class08603;
import minecraft.class08637;
import minecraft.class08642;
import minecraft.class08719;
import minecraft.class08923;

public class class02693
extends class02840<class07627, class08470, class06032> {
    private final Map<class08603, class08637<class06032>> N;

    public class02693(class04832 class048322) {
        super(class048322, (class06078)new class06032(class048322.N(class04802.Lj)), 0.7f);
        this.N = class02693.N(class048322);
        this.N((class06249)new class00207((class06252)this, class048322.B(), class08719.field_56123, class084702 -> class084702.N, (class06078)new class06032(class048322.N(class04802.LQ)), (class06078)new class06032(class048322.N(class04802.LY))));
    }

    public class08470 method_55269() {
        return new class08470();
    }

    private static Map<class08603, class08637<class06032>> N(class04832 class048322) {
        return Maps.newEnumMap(Map.of(class08603.field_55688, new class08637((class06271)new class06032(class048322.N(class04802.Lj)), (class06271)new class06032(class048322.N(class04802.Lk))), class08603.field_55689, new class08637((class06271)new class08598(class048322.N(class04802.NM)), (class06271)new class08598(class048322.N(class04802.NB)))));
    }

    public class01894 N(class08470 class084702) {
        return class084702.y == null ? class08923.L() : class084702.y.y().y().y();
    }

    public void method_3936(class08470 class084702, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class084702.y == null) {
            return;
        }
        this.y = (class06078)this.N.get(class084702.y.y().N()).N(class084702.NB);
        super.method_3936((class08476)class084702, class014212, class012372, class069592);
    }

    public void method_62354(class07627 class076272, class08470 class084702, float f) {
        super.method_62354((class07438)class076272, (class08476)class084702, f);
        class084702.N = class076272.method_6118(class07085.field_55946).t();
        class084702.y = (class08642)class076272.m().N();
    }
}

