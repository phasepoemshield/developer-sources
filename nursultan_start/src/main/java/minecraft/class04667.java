/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class04802
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class06563
 *  minecraft.class08476
 *  minecraft.class08796
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class04660;
import minecraft.class04802;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class06563;
import minecraft.class08476;
import minecraft.class08796;

public class class04667
extends class06249<class08796, class04660> {
    private static final class01894 N = class01894.y((String)"textures/entity/cat/cat_collar.png");
    private final class04660 y;
    private final class04660 L;

    public class04667(class06252<class08796, class04660> class062522, class01140 class011402) {
        super(class062522);
        this.y = new class04660(class011402.N(class04802.f));
        this.L = new class04660(class011402.N(class04802.A));
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08796 class087962, float f, float f2) {
        class06563 class065632 = class087962.L;
        if (class065632 == null) {
            return;
        }
        int n2 = class065632.L();
        class04667.N((class06271)(class087962.NB ? this.L : this.y), (class01894)N, (class01421)class014212, (class01237)class012372, (int)n, (class08476)class087962, (int)n2, (int)1);
    }
}

