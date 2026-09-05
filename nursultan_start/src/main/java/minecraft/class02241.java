/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01188
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02421
 *  minecraft.class02721
 *  minecraft.class04802
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06851
 *  minecraft.class08468
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01188;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02294;
import minecraft.class02421;
import minecraft.class02721;
import minecraft.class04802;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06851;
import minecraft.class08468;
import minecraft.class08476;

public class class02241
extends class06249<class08468, class02721> {
    private final class01188<class08468> N;

    public class02241(class06252<class08468, class02721> class062522, class01140 class011402) {
        super(class062522);
        this.N = new class02421(class011402.N(class04802.LJ));
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08468 class084682, float f, float f2) {
        if (!class084682.Ng || class084682.v) {
            return;
        }
        int n2 = class02294.N((class08476)class084682, 0.0f);
        class012372.N(this.N, (Object)class084682, class014212, class06851.u((class01894)class084682.N.N().y()), n, n2, class084682.l, null);
    }
}

