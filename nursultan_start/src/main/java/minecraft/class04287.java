/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class00207
 *  minecraft.class00236
 *  minecraft.class01660
 *  minecraft.class01894
 *  minecraft.class02442
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class05088
 *  minecraft.class05289
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07862
 *  minecraft.class07901
 *  minecraft.class08459
 *  minecraft.class08490
 *  minecraft.class08719
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class00207;
import minecraft.class00236;
import minecraft.class01660;
import minecraft.class01894;
import minecraft.class02442;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class05088;
import minecraft.class05289;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07862;
import minecraft.class07901;
import minecraft.class08459;
import minecraft.class08490;
import minecraft.class08719;

public final class class04287
extends class01660<class07901, class08459, class02442> {
    private static final Map<class05289, class01894> N = Maps.newEnumMap(Map.of(class05289.field_23816, class01894.y((String)"textures/entity/horse/horse_white.png"), class05289.field_23817, class01894.y((String)"textures/entity/horse/horse_creamy.png"), class05289.field_23818, class01894.y((String)"textures/entity/horse/horse_chestnut.png"), class05289.field_23819, class01894.y((String)"textures/entity/horse/horse_brown.png"), class05289.field_23820, class01894.y((String)"textures/entity/horse/horse_black.png"), class05289.field_23821, class01894.y((String)"textures/entity/horse/horse_gray.png"), class05289.field_23822, class01894.y((String)"textures/entity/horse/horse_darkbrown.png")));

    public class04287(class04832 class048322) {
        super(class048322, (class06078)new class02442(class048322.N(class04802.yl)), (class06078)new class02442(class048322.N(class04802.yk)));
        this.N((class06249)new class05088((class06252)this));
        this.N((class06249)new class00207((class06252)this, class048322.B(), class08719.field_54129, class084592 -> class084592.L, (class06078)new class02442(class048322.N(class04802.yd)), (class06078)new class02442(class048322.N(class04802.yY)), 2));
        this.N((class06249)new class00207((class06252)this, class048322.B(), class08719.field_56126, class084592 -> class084592.y, (class06078)new class00236(class048322.N(class04802.yw)), (class06078)new class00236(class048322.N(class04802.yQ)), 2));
    }

    public class08459 method_55269() {
        return new class08459();
    }

    public class01894 N(class08459 class084592) {
        return N.get(class084592.N);
    }

    public void method_62354(class07901 class079012, class08459 class084592, float f) {
        super.method_62354((class07862)class079012, (class08490)class084592, f);
        class084592.N = class079012.W();
        class084592.Z = class079012.v();
        class084592.L = class079012.NZ().t();
    }
}

