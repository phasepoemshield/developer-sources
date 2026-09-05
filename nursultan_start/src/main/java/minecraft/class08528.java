/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class04535
 *  minecraft.class04539
 *  minecraft.class04802
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06563
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class04535;
import minecraft.class04539;
import minecraft.class04802;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06563;
import minecraft.class08442;
import minecraft.class08476;

public class class08528
extends class06249<class08442, class04535> {
    private static final class01894 N = class01894.y((String)"textures/entity/sheep/sheep_wool_undercoat.png");
    private final class06078<class08442> y;
    private final class06078<class08442> L;

    public class08528(class06252<class08442, class04535> class062522, class01140 class011402) {
        super(class062522);
        this.y = new class04539(class011402.N(class04802.uy));
        this.L = new class04539(class011402.N(class04802.uL));
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08442 class084422, float f, float f2) {
        if (class084422.v || !class084422.i && class084422.u == class06563.field_7952) {
            return;
        }
        class08528.N(class084422.NB ? this.L : this.y, (class01894)N, (class01421)class014212, (class01237)class012372, (int)n, (class08476)class084422, (int)class084422.N(), (int)1);
    }
}

