/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01224
 *  minecraft.class04890
 *  minecraft.class05034
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 */
package minecraft;

import java.util.List;
import minecraft.class01224;
import minecraft.class04890;
import minecraft.class05034;
import minecraft.class05159;
import minecraft.class05160;
import minecraft.class05180;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;

class class05161
implements class05159 {
    class05161() {
    }

    @Override
    public void N() {
    }

    @Override
    public boolean N(class01224 class012242, int n, class05180 class051802, class07209 class072092, List<class04890> list, class06069 class060692) {
        class06993 class069932 = class051802.U().u();
        class05180 class051803 = class051802;
        class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(3 + class060692.y(2), -3, 3 + class060692.y(2)), "tower_base", class069932, true));
        class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(0, 7, 0), "tower_piece", class069932, true));
        class05180 class051804 = class060692.y(3) == 0 ? class051803 : null;
        int n2 = 1 + class060692.y(3);
        for (int i = 0; i < n2; ++i) {
            class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(0, 4, 0), "tower_piece", class069932, true));
            if (i >= n2 - 1 || !class060692.Z()) continue;
            class051804 = class051803;
        }
        if (class051804 != null) {
            for (class05034<class06993, class07209> var12 : class05160.y) {
                if (!class060692.Z()) continue;
                class05180 class051805 = class05160.N(list, class05160.N(class012242, class051804, (class07209)var12.y(), "bridge_end", class069932.N((class06993)var12.N()), true));
                class05160.N(class012242, class05160.u, n + 1, class051805, null, list, class060692);
            }
            class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(-1, 4, -1), "tower_top", class069932, true));
        } else if (n == 7) {
            class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(-1, 4, -1), "tower_top", class069932, true));
        } else {
            return class05160.N(class012242, class05160.R, n + 1, class051803, null, list, class060692);
        }
        return true;
    }
}

