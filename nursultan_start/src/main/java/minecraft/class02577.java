/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class04802
 *  minecraft.class04817
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class08278
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class04802;
import minecraft.class04817;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class08278;
import minecraft.class08476;

public class class02577
extends class06249<class08278, class04817> {
    private static final class01894 N = class01894.y((String)"textures/entity/zombie/drowned_outer_layer.png");
    private final class04817 y;
    private final class04817 L;

    public class02577(class06252<class08278, class04817> class062522, class01140 class011402) {
        super(class062522);
        this.y = new class04817(class011402.N(class04802.NA));
        this.L = new class04817(class011402.N(class04802.Np));
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08278 class082782, float f, float f2) {
        class02577.N((class06271)(class082782.NB ? this.L : this.y), (class01894)N, (class01421)class014212, (class01237)class012372, (int)n, (class08476)class082782, (int)-1, (int)1);
    }
}

