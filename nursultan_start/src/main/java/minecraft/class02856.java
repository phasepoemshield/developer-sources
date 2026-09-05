/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class01098
 *  minecraft.class01894
 *  minecraft.class02729
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class07631
 *  minecraft.class07641
 *  minecraft.class08448
 *  minecraft.class08476
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class01098;
import minecraft.class01894;
import minecraft.class02729;
import minecraft.class02795;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class07631;
import minecraft.class07641;
import minecraft.class08448;
import minecraft.class08476;

public class class02856
extends class02795<class07641, class08448, class01098> {
    private static final Map<class07631, class01894> N = (Map)class07536.N((Object)Maps.newHashMap(), (T hashMap) -> {
        hashMap.put(class07631.field_18110, class01894.y((String)"textures/entity/cow/brown_mooshroom.png"));
        hashMap.put(class07631.field_18109, class01894.y((String)"textures/entity/cow/red_mooshroom.png"));
    });

    public class02856(class04832 class048322) {
        super(class048322, new class01098(class048322.N(class04802.yS)), new class01098(class048322.N(class04802.yx)), 0.7f);
        this.N((class06249)new class02729((class06252)this, class048322.u()));
    }

    public class08448 method_55269() {
        return new class08448();
    }

    public class01894 N(class08448 class084482) {
        return N.get(class084482.N);
    }

    public void method_62354(class07641 class076412, class08448 class084482, float f) {
        super.method_62354((class07438)class076412, (class08476)class084482, f);
        class084482.N = class076412.W();
    }
}

