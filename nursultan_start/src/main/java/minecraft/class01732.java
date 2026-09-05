/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class01098
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06271
 *  minecraft.class06959
 *  minecraft.class07438
 *  minecraft.class08403
 *  minecraft.class08426
 *  minecraft.class08438
 *  minecraft.class08476
 *  minecraft.class08583
 *  minecraft.class08637
 *  minecraft.class08923
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class01098;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06271;
import minecraft.class06959;
import minecraft.class07438;
import minecraft.class08403;
import minecraft.class08426;
import minecraft.class08438;
import minecraft.class08476;
import minecraft.class08583;
import minecraft.class08637;
import minecraft.class08923;

public class class01732
extends class02840<class08583, class08426, class01098> {
    private final Map<class08438, class08637<class01098>> N;

    public class01732(class04832 class048322) {
        super(class048322, (class06078)new class01098(class048322.N(class04802.Nv)), 0.7f);
        this.N = class01732.N(class048322);
    }

    public class08426 method_55269() {
        return new class08426();
    }

    public void method_3936(class08426 class084262, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class084262.N == null) {
            return;
        }
        this.y = (class06078)this.N.get(class084262.N.y().N()).N(class084262.NB);
        super.method_3936((class08476)class084262, class014212, class012372, class069592);
    }

    private static Map<class08438, class08637<class01098>> N(class04832 class048322) {
        return Maps.newEnumMap(Map.of(class08438.field_56429, new class08637((class06271)new class01098(class048322.N(class04802.Nv)), (class06271)new class01098(class048322.N(class04802.Nn))), class08438.field_56431, new class08637((class06271)new class01098(class048322.N(class04802.iM)), (class06271)new class01098(class048322.N(class04802.iB))), class08438.field_56430, new class08637((class06271)new class01098(class048322.N(class04802.Ni)), (class06271)new class01098(class048322.N(class04802.NR)))));
    }

    public class01894 N(class08426 class084262) {
        return class084262.N == null ? class08923.L() : class084262.N.y().y().y();
    }

    public void method_62354(class08583 class085832, class08426 class084262, float f) {
        super.method_62354((class07438)class085832, (class08476)class084262, f);
        class084262.N = (class08403)class085832.N().N();
    }
}

