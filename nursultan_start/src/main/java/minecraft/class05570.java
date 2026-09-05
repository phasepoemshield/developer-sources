/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class01894
 *  minecraft.class02795
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class05538
 *  minecraft.class05541
 *  minecraft.class06078
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class08476
 *  minecraft.class08788
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import minecraft.class01894;
import minecraft.class02795;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class05538;
import minecraft.class05541;
import minecraft.class05562;
import minecraft.class06078;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class08476;
import minecraft.class08788;

public class class05570
extends class02795<class05538, class08788, class05562> {
    private static final Map<class05541, class01894> N = (Map)class07536.N((Object)Maps.newHashMap(), hashMap -> {
        for (class05541 class055412 : class05541.values()) {
            hashMap.put(class055412, class01894.y((String)String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", class055412.y())));
        }
    });

    public class05570(class04832 class048322) {
        super(class048322, (class06078)new class05562(class048322.N(class04802.U)), (class06078)new class05562(class048322.N(class04802.E)), 0.5f);
    }

    public class08788 method_55269() {
        return new class08788();
    }

    public class01894 N(class08788 class087882) {
        return N.get(class087882.N);
    }

    public void method_62354(class05538 class055382, class08788 class087882, float f) {
        super.method_62354((class07438)class055382, (class08476)class087882, f);
        class087882.N = class055382.m();
        class087882.y = class055382.M.N(f);
        class087882.u = class055382.B.N(f);
        class087882.i = class055382.Z.N(f);
        class087882.L = class055382.X.N(f);
    }
}

