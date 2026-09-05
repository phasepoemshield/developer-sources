/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02721
 *  minecraft.class04802
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class08232
 *  minecraft.class08468
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02721;
import minecraft.class04802;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class08232;
import minecraft.class08468;

public class class02440
extends class06249<class08468, class02721> {
    public static final class01894 N = class01894.y((String)"textures/entity/trident_riptide.png");
    private final class08232 y;

    public class02440(class06252<class08468, class02721> class062522, class01140 class011402) {
        super(class062522);
        this.y = new class08232(class011402.N(class04802.Le));
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08468 class084682, float f, float f2) {
        if (!class084682.Nz) {
            return;
        }
        class012372.N((class06271)this.y, (Object)class084682, class014212, this.y.method_23500(N), n, class01384.u, class084682.l, null);
    }
}

