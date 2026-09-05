/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10667
 *  Nursultan.class10673
 *  com.google.common.collect.Maps
 *  minecraft.class00207
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06729
 *  minecraft.class06738
 *  minecraft.class06959
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class07589
 *  minecraft.class07591
 *  minecraft.class08187
 *  minecraft.class08476
 *  minecraft.class08719
 *  minecraft.class08923
 */
package minecraft;

import Nursultan.class10667;
import Nursultan.class10673;
import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class00207;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06729;
import minecraft.class06738;
import minecraft.class06959;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class07582;
import minecraft.class07589;
import minecraft.class07591;
import minecraft.class08187;
import minecraft.class08476;
import minecraft.class08719;
import minecraft.class08923;

public class class07572
extends class02840<class08187, class06729, class06738> {
    private final Map<class07582, class06738> N;

    public class07572(class04832 class048322) {
        super(class048322, (class06078)new class06738(class048322.N(class04802.ia)), 0.7f);
        this.N((class06249)new class00207((class06252)this, class048322.B(), class08719.field_63622, class067292 -> class067292.y, (class06078)new class10667(class048322.N(class04802.Li)), null));
        this.N((class06249)new class00207((class06252)this, class048322.B(), class08719.field_63621, class067292 -> class067292.N, (class06078)new class10673(class048322.N(class04802.Lu)), null));
        this.N = class07572.N(class048322);
    }

    public class06729 method_55269() {
        return new class06729();
    }

    private static Map<class07582, class06738> N(class04832 class048322) {
        return Maps.newEnumMap(Map.of(class07582.field_64365, new class06738(class048322.N(class04802.ia)), class07582.field_64366, new class07591(class048322.N(class04802.Nj))));
    }

    public class01894 N(class06729 class067292) {
        return class067292.L == null ? class08923.L() : class067292.L.y().y().y();
    }

    public void method_3936(class06729 class067292, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class067292.L == null) {
            return;
        }
        this.y = (class06078)this.N.get(class067292.L.y().N());
        super.method_3936((class08476)class067292, class014212, class012372, class069592);
    }

    public void method_62354(class08187 class081872, class06729 class067292, float f) {
        super.method_62354((class07438)class081872, (class08476)class067292, f);
        class067292.N = class081872.method_6118(class07085.field_55946).t();
        class067292.y = class081872.NZ().t();
        class067292.L = (class07589)class081872.o().N();
    }
}

