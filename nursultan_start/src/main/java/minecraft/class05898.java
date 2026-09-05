/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01174
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02842
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class08476
 *  minecraft.class08479
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01174;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02842;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class08476;
import minecraft.class08479;

public class class05898
extends class06249<class08479, class01174> {
    private static final Map<class02842, class01894> N = ImmutableMap.of((Object)class02842.field_21082, (Object)class01894.y((String)"textures/entity/iron_golem/iron_golem_crackiness_low.png"), (Object)class02842.field_21083, (Object)class01894.y((String)"textures/entity/iron_golem/iron_golem_crackiness_medium.png"), (Object)class02842.field_21084, (Object)class01894.y((String)"textures/entity/iron_golem/iron_golem_crackiness_high.png"));

    public class05898(class06252<class08479, class01174> class062522) {
        super(class062522);
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08479 class084792, float f, float f2) {
        if (class084792.v) {
            return;
        }
        class02842 class028422 = class084792.L;
        if (class028422 == class02842.field_21081) {
            return;
        }
        class01894 class018942 = N.get(class028422);
        class05898.y((class06271)this.u(), (class01894)class018942, (class01421)class014212, (class01237)class012372, (int)n, (class08476)class084792, (int)-1, (int)1);
    }
}

