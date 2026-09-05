/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02180
 *  minecraft.class02294
 *  minecraft.class04390
 *  minecraft.class04802
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class08473
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02180;
import minecraft.class02294;
import minecraft.class04390;
import minecraft.class04802;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class08473;
import minecraft.class08476;

public class class02407
extends class06249<class08473, class04390> {
    private final class04390 N;

    public class02407(class06252<class08473, class04390> class062522, class01140 class011402) {
        super(class062522);
        this.N = new class04390(class011402.N(class04802.uT));
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08473 class084732, float f, float f2) {
        boolean bl;
        boolean bl2 = bl = class084732.y() && class084732.v;
        if (class084732.v && !bl) {
            return;
        }
        int n2 = class02294.N((class08476)class084732, (float)0.0f);
        if (bl) {
            class012372.N(1).N((class06271)this.N, (Object)class084732, class014212, class06851.j((class01894)class02180.N), n, n2, -1, null, class084732.l, null);
        } else {
            class012372.N(1).N((class06271)this.N, (Object)class084732, class014212, class06851.z((class01894)class02180.N), n, n2, -1, null, class084732.l, null);
        }
    }
}

