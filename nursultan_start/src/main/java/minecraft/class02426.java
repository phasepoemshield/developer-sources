/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02294
 *  minecraft.class04535
 *  minecraft.class04539
 *  minecraft.class04802
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06851
 *  minecraft.class08442
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02294;
import minecraft.class04535;
import minecraft.class04539;
import minecraft.class04802;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06851;
import minecraft.class08442;
import minecraft.class08476;

public class class02426
extends class06249<class08442, class04535> {
    private static final class01894 N = class01894.y((String)"textures/entity/sheep/sheep_wool.png");
    private final class06078<class08442> y;
    private final class06078<class08442> L;

    public class02426(class06252<class08442, class04535> class062522, class01140 class011402) {
        super(class062522);
        this.y = new class04539(class011402.N(class04802.uN));
        this.L = new class04539(class011402.N(class04802.Lr));
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08442 class084422, float f, float f2) {
        class06078<class08442> var7;
        if (class084422.L) {
            return;
        }
        class06078<class08442> class060782 = var7 = class084422.NB ? this.L : this.y;
        if (class084422.v) {
            if (class084422.y()) {
                class012372.N(var7, (Object)class084422, class014212, class06851.j((class01894)N), n, class02294.N((class08476)class084422, (float)0.0f), -16777216, null, class084422.l, null);
            }
            return;
        }
        class02426.N(var7, (class01894)N, (class01421)class014212, (class01237)class012372, (int)n, (class08476)class084422, (int)class084422.N(), (int)0);
    }
}

