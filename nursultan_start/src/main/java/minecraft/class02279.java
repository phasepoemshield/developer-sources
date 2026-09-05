/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00700
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class04507
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class05575
 *  minecraft.class06271
 *  minecraft.class06959
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class00700;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class04507;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class05575;
import minecraft.class06271;
import minecraft.class06959;
import minecraft.class08800;

public class class02279
extends class04507<class00700, class08800> {
    private static final class01894 N = class01894.y((String)"textures/entity/lead_knot.png");
    private final class05575 y;

    public class02279(class04832 class048322) {
        super(class048322);
        this.y = new class05575(class048322.N(class04802.ye));
    }

    public void method_3936(class08800 class088002, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.y(-1.0f, -1.0f, 1.0f);
        class012372.N((class06271)this.y, (Object)class088002, class014212, this.y.method_23500(N), class088002.G, class01384.u, class088002.l, null);
        class014212.y();
        super.method_3936(class088002, class014212, class012372, class069592);
    }

    public class08800 method_55269() {
        return new class08800();
    }
}

