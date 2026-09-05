/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02294
 *  minecraft.class02442
 *  minecraft.class05325
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class08459
 *  minecraft.class08476
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02294;
import minecraft.class02442;
import minecraft.class05325;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class08459;
import minecraft.class08476;

public class class05088
extends class06249<class08459, class02442> {
    private static final class01894 N = class01894.y((String)"invisible");
    private static final Map<class05325, class01894> y = Maps.newEnumMap(Map.of(class05325.field_23808, N, class05325.field_23809, class01894.y((String)"textures/entity/horse/horse_markings_white.png"), class05325.field_23810, class01894.y((String)"textures/entity/horse/horse_markings_whitefield.png"), class05325.field_23811, class01894.y((String)"textures/entity/horse/horse_markings_whitedots.png"), class05325.field_23812, class01894.y((String)"textures/entity/horse/horse_markings_blackdots.png")));

    public class05088(class06252<class08459, class02442> class062522) {
        super(class062522);
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08459 class084592, float f, float f2) {
        class01894 class018942 = y.get(class084592.Z);
        if (class018942 == N || class084592.v) {
            return;
        }
        class012372.N(1).N((class06271)this.u(), (Object)class084592, class014212, class06851.z((class01894)class018942), n, class02294.N((class08476)class084592, (float)0.0f), -1, null, class084592.l, null);
    }
}

