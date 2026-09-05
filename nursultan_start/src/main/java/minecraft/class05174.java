/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01224
 *  minecraft.class04890
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 */
package minecraft;

import java.util.List;
import minecraft.class01224;
import minecraft.class04890;
import minecraft.class05159;
import minecraft.class05160;
import minecraft.class05180;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;

class class05174
implements class05159 {
    public boolean N;

    class05174() {
    }

    @Override
    public void N() {
        this.N = false;
    }

    @Override
    public boolean N(class01224 class012242, int n, class05180 class051802, class07209 class072092, List<class04890> list, class06069 class060692) {
        class06993 class069932 = class051802.U().u();
        int n2 = class060692.y(4) + 1;
        class05180 class051803 = class05160.N(list, class05160.N(class012242, class051802, new class07209(0, 0, -4), "bridge_piece", class069932, true));
        class051803.y(-1);
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            if (class060692.Z()) {
                class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(0, n3, -4), "bridge_piece", class069932, true));
                n3 = 0;
                continue;
            }
            class051803 = class060692.Z() ? class05160.N(list, class05160.N(class012242, class051803, new class07209(0, n3, -4), "bridge_steep_stairs", class069932, true)) : class05160.N(list, class05160.N(class012242, class051803, new class07209(0, n3, -8), "bridge_gentle_stairs", class069932, true));
            n3 = 4;
        }
        if (this.N || class060692.y(10 - n) != 0) {
            if (!class05160.N(class012242, class05160.N, n + 1, class051803, new class07209(-3, n3 + 1, -11), list, class060692)) {
                return false;
            }
        } else {
            class05160.N(list, class05160.N(class012242, class051803, new class07209(-8 + class060692.y(8), n3, -70 + class060692.y(10)), "ship", class069932, true));
            this.N = true;
        }
        class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(4, n3, 0), "bridge_end", class069932.N(class06993.field_11464), true));
        class051803.y(-1);
        return true;
    }
}

