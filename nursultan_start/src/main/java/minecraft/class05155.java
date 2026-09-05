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

class class05155
implements class05159 {
    class05155() {
    }

    @Override
    public void N() {
    }

    @Override
    public boolean N(class01224 class012242, int n, class05180 class051802, class07209 class072092, List<class04890> list, class06069 class060692) {
        class06993 class069932 = class051802.U().u();
        class05180 class051803 = class05160.N(list, class05160.N(class012242, class051802, new class07209(-3, 4, -3), "fat_tower_base", class069932, true));
        class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(0, 4, 0), "fat_tower_middle", class069932, true));
        for (int i = 0; i < 2 && class060692.y(3) != 0; ++i) {
            class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(0, 8, 0), "fat_tower_middle", class069932, true));
            for (class05034<class06993, class07209> var11 : class05160.i) {
                if (!class060692.Z()) continue;
                class05180 class051804 = class05160.N(list, class05160.N(class012242, class051803, (class07209)var11.y(), "bridge_end", class069932.N((class06993)var11.N()), true));
                class05160.N(class012242, class05160.u, n + 1, class051804, null, list, class060692);
            }
        }
        class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(-2, 8, -2), "fat_tower_top", class069932, true));
        return true;
    }
}

