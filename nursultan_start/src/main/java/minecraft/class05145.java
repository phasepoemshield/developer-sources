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

class class05145
implements class05159 {
    class05145() {
    }

    @Override
    public void N() {
    }

    @Override
    public boolean N(class01224 class012242, int n, class05180 class051802, class07209 class072092, List<class04890> list, class06069 class060692) {
        if (n > 8) {
            return false;
        }
        class06993 class069932 = class051802.U().u();
        class05180 class051803 = class05160.N(list, class05160.N(class012242, class051802, class072092, "base_floor", class069932, true));
        int n2 = class060692.y(3);
        if (n2 == 0) {
            class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(-1, 4, -1), "base_roof", class069932, true));
        } else if (n2 == 1) {
            class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(-1, 0, -1), "second_floor_2", class069932, false));
            class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(-1, 8, -1), "second_roof", class069932, false));
            class05160.N(class012242, class05160.L, n + 1, class051803, null, list, class060692);
        } else if (n2 == 2) {
            class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(-1, 0, -1), "second_floor_2", class069932, false));
            class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(-1, 4, -1), "third_floor_2", class069932, false));
            class051803 = class05160.N(list, class05160.N(class012242, class051803, new class07209(-1, 8, -1), "third_roof", class069932, true));
            class05160.N(class012242, class05160.L, n + 1, class051803, null, list, class060692);
        }
        return true;
    }
}

