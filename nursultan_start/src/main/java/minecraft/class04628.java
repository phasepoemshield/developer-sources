/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class03434
 *  minecraft.class06478
 *  minecraft.class08394
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03434;
import minecraft.class04595;
import minecraft.class04610;
import minecraft.class04611;
import minecraft.class04614;
import minecraft.class04654;
import minecraft.class06478;
import minecraft.class08394;

class class04628
extends class04614 {
    private static final class01894 y = class01894.y((String)"statistics/block_mined");
    private static final class01894 L = class01894.y((String)"statistics/item_broken");
    private static final class01894 u = class01894.y((String)"statistics/item_crafted");
    private static final class01894 i = class01894.y((String)"statistics/item_used");
    private static final class01894 R = class01894.y((String)"statistics/item_picked_up");
    private static final class01894 M = class01894.y((String)"statistics/item_dropped");
    private final class04595 B;
    private final class04595 Z;
    private final class04595 z;
    private final class04595 U;
    private final class04595 E;
    private final class04595 W;
    private final List<class06478> m = new ArrayList<class06478>();
    final /* synthetic */ class04611 N;

    class04628(class04611 class046112) {
        this.N = class046112;
        this.B = new class04595(this, 0, y);
        this.Z = new class04595(this, 1, L);
        this.z = new class04595(this, 2, u);
        this.U = new class04595(this, 3, i);
        this.E = new class04595(this, 4, R);
        this.W = new class04595(this, 5, M);
        this.m.addAll(List.of(this.B, this.Z, this.z, this.U, this.E, this.W));
    }

    public List<? extends class04654> method_25396() {
        return this.m;
    }

    public List<? extends class03434> method_37025() {
        return this.m;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.B.y(this.method_73380() + this.N.N(0) - 18, this.method_73382() + 1);
        this.B.method_25394(class010542, n, n2, f);
        this.Z.y(this.method_73380() + this.N.N(1) - 18, this.method_73382() + 1);
        this.Z.method_25394(class010542, n, n2, f);
        this.z.y(this.method_73380() + this.N.N(2) - 18, this.method_73382() + 1);
        this.z.method_25394(class010542, n, n2, f);
        this.U.y(this.method_73380() + this.N.N(3) - 18, this.method_73382() + 1);
        this.U.method_25394(class010542, n, n2, f);
        this.E.y(this.method_73380() + this.N.N(4) - 18, this.method_73382() + 1);
        this.E.method_25394(class010542, n, n2, f);
        this.W.y(this.method_73380() + this.N.N(5) - 18, this.method_73382() + 1);
        this.W.method_25394(class010542, n, n2, f);
        if (this.N.u != null) {
            int n3 = this.N.N(this.N.N(this.N.u)) - 36;
            class01894 class018942 = this.N.i == 1 ? class04610.L : class04610.u;
            class010542.N(class08394.Na, class018942, this.method_73380() + n3, this.method_73382() + 1, 18, 18);
        }
    }
}

