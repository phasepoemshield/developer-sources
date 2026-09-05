/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00240
 *  minecraft.class00265
 *  minecraft.class00311
 *  minecraft.class00392
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class02429
 *  minecraft.class02741
 *  minecraft.class05287
 *  minecraft.class05306
 *  minecraft.class05322
 *  minecraft.class06923
 *  minecraft.class06937
 *  minecraft.class07476
 */
package minecraft;

import java.util.List;
import minecraft.class00240;
import minecraft.class00265;
import minecraft.class00311;
import minecraft.class00392;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class02429;
import minecraft.class02741;
import minecraft.class05287;
import minecraft.class05306;
import minecraft.class05322;
import minecraft.class06923;
import minecraft.class06937;
import minecraft.class07476;

public class class05055
extends class05306<class07476> {
    private static final class01883 B = new class01883(class01894.y((String)"recipe_book/furnace_filter_enabled"), class01894.y((String)"recipe_book/furnace_filter_disabled"), class01894.y((String)"recipe_book/furnace_filter_enabled_highlighted"), class01894.y((String)"recipe_book/furnace_filter_disabled_highlighted"));
    private final class00392 Z;

    public class05055(class07476 class074762, class00392 class003922, List<class05322> list) {
        super((class06923)class074762, list);
        this.Z = class003922;
    }

    protected class01883 y() {
        return B;
    }

    protected void N(class05287 class052872, class02741 class027412) {
        class052872.N(class027412, class002652 -> class002652 instanceof class00240);
    }

    protected void N(class02429 class024292, class00265 class002652, class00311 class003112) {
        class024292.y(((class07476)this.R).E(), class003112, class002652.u());
        if (class002652 instanceof class00240) {
            class00240 class002402 = (class00240)class002652;
            class024292.N((class06937)((class07476)this.R).T.get(0), class003112, class002402.y());
            class06937 class069372 = (class06937)((class07476)this.R).T.get(1);
            if (class069372.i().R()) {
                class024292.N(class069372, class003112, class002402.L());
            }
        }
    }

    protected boolean N(class06937 class069372) {
        return switch (class069372.u) {
            case 0, 1, 2 -> true;
            default -> false;
        };
    }

    protected class00392 R() {
        return this.Z;
    }
}

