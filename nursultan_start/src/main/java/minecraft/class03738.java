/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class01105
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06271
 *  minecraft.class06959
 *  minecraft.class07438
 *  minecraft.class07628
 *  minecraft.class08423
 *  minecraft.class08424
 *  minecraft.class08435
 *  minecraft.class08476
 *  minecraft.class08637
 *  minecraft.class08794
 *  minecraft.class08923
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class01105;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06271;
import minecraft.class06959;
import minecraft.class07438;
import minecraft.class07628;
import minecraft.class08423;
import minecraft.class08424;
import minecraft.class08435;
import minecraft.class08476;
import minecraft.class08637;
import minecraft.class08794;
import minecraft.class08923;

public class class03738
extends class02840<class07628, class08794, class01105> {
    private final Map<class08435, class08637<class01105>> N;

    public class03738(class04832 class048322) {
        super(class048322, (class06078)new class01105(class048322.N(class04802.r)), 0.3f);
        this.N = class03738.N(class048322);
    }

    public class08794 method_55269() {
        return new class08794();
    }

    public void method_62354(class07628 class076282, class08794 class087942, float f) {
        super.method_62354((class07438)class076282, (class08476)class087942, f);
        class087942.N = class04995.B((float)f, (float)class076282.u, (float)class076282.N);
        class087942.y = class04995.B((float)f, (float)class076282.L, (float)class076282.y);
        class087942.L = (class08423)class076282.W().N();
    }

    private static Map<class08435, class08637<class01105>> N(class04832 class048322) {
        return Maps.newEnumMap(Map.of(class08435.field_56542, new class08637((class06271)new class01105(class048322.N(class04802.r)), (class06271)new class01105(class048322.N(class04802.NN))), class08435.field_56543, new class08637((class06271)new class08424(class048322.N(class04802.NL)), (class06271)new class08424(class048322.N(class04802.Nu)))));
    }

    public void method_3936(class08794 class087942, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class087942.L == null) {
            return;
        }
        this.y = (class06078)this.N.get(class087942.L.y().N()).N(class087942.NB);
        super.method_3936((class08476)class087942, class014212, class012372, class069592);
    }

    public class01894 N(class08794 class087942) {
        return class087942.L == null ? class08923.L() : class087942.L.y().y().y();
    }
}

