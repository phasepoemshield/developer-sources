/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00410
 *  minecraft.class00483
 *  minecraft.class00500
 *  minecraft.class00513
 *  minecraft.class00643
 *  minecraft.class00650
 *  minecraft.class00730
 *  minecraft.class00739
 *  minecraft.class00860
 *  minecraft.class00891
 *  minecraft.class00902
 *  minecraft.class04206
 *  minecraft.class05476
 *  minecraft.class06772
 *  minecraft.class06999
 *  minecraft.class07100
 *  minecraft.class07123
 *  minecraft.class07131
 *  minecraft.class07188
 *  minecraft.class07189
 *  minecraft.class07200
 *  minecraft.class07207
 *  minecraft.class07208
 *  minecraft.class07789
 *  minecraft.class07804
 *  minecraft.class08612
 */
package com.viaversion.viafabricplus.features.block.shape;

import minecraft.class00410;
import minecraft.class00483;
import minecraft.class00500;
import minecraft.class00513;
import minecraft.class00643;
import minecraft.class00650;
import minecraft.class00730;
import minecraft.class00739;
import minecraft.class00860;
import minecraft.class00891;
import minecraft.class00902;
import minecraft.class04206;
import minecraft.class05476;
import minecraft.class06772;
import minecraft.class06999;
import minecraft.class07100;
import minecraft.class07123;
import minecraft.class07131;
import minecraft.class07188;
import minecraft.class07189;
import minecraft.class07200;
import minecraft.class07207;
import minecraft.class07208;
import minecraft.class07789;
import minecraft.class07804;
import minecraft.class08612;

public final class CollisionShapes {
    public static void reloadBlockShapes() {
        for (class00891 class008912 : class04206.i) {
            if (!(class008912 instanceof class07804) && !(class008912 instanceof class07789) && !(class008912 instanceof class00902) && !(class008912 instanceof class00410) && !(class008912 instanceof class05476) && !(class008912 instanceof class00860) && !(class008912 instanceof class07189) && !(class008912 instanceof class07207) && !(class008912 instanceof class07200) && !(class008912 instanceof class07208) && !(class008912 instanceof class00730) && !(class008912 instanceof class07188) && !(class008912 instanceof class00739) && !(class008912 instanceof class07123) && !(class008912 instanceof class07131) && !(class008912 instanceof class00643) && !(class008912 instanceof class07100) && !(class008912 instanceof class00513) && !(class008912 instanceof class00483) && !(class008912 instanceof class06999) && !(class008912 instanceof class00650) && !(class008912 instanceof class06772) && !(class008912 instanceof class08612)) continue;
            for (class00500 class005002 : class008912.E().N()) {
                class005002.u();
            }
        }
    }
}

