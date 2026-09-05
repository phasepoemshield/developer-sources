/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02260
 *  minecraft.class04507
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class06959
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01767;
import minecraft.class01894;
import minecraft.class02260;
import minecraft.class04507;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class06959;
import minecraft.class08800;

public class class01771
extends class04507<class02260, class08800> {
    private static final class01894 N = class01894.y((String)"textures/entity/projectiles/wind_charge.png");
    private final class01767 y;

    public class01771(class04832 class048322) {
        super(class048322);
        this.y = new class01767(class048322.N(class04802.iZ));
    }

    protected float N(float f) {
        return f * 0.03f;
    }

    public void method_3936(class08800 class088002, class01421 class014212, class01237 class012372, class06959 class069592) {
        class012372.N((class06271)this.y, (Object)class088002, class014212, class06851.N((class01894)N, (float)(this.N(class088002.P) % 1.0f), (float)0.0f), class088002.G, class01384.u, class088002.l, null);
        super.method_3936(class088002, class014212, class012372, class069592);
    }

    public class08800 method_55269() {
        return new class08800();
    }
}

