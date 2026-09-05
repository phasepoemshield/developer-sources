/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00240
 *  minecraft.class00265
 *  minecraft.class00311
 *  minecraft.class00329
 *  minecraft.class01894
 *  minecraft.class05299
 *  minecraft.class05303
 */
package minecraft;

import java.util.List;
import minecraft.class00240;
import minecraft.class00265;
import minecraft.class00311;
import minecraft.class00329;
import minecraft.class01894;
import minecraft.class05299;
import minecraft.class05303;
import minecraft.class05328;

class class05311
extends class05328 {
    private static final class01894 L = class01894.y((String)"recipe_book/furnace_overlay");
    private static final class01894 u = class01894.y((String)"recipe_book/furnace_overlay_highlighted");
    private static final class01894 i = class01894.y((String)"recipe_book/furnace_overlay_disabled");
    private static final class01894 R = class01894.y((String)"recipe_book/furnace_overlay_disabled_highlighted");

    public class05311(class05299 class052992, int n, int n2, class00329 class003292, class00265 class002652, class00311 class003112, boolean bl) {
        super(class052992, n, n2, class003292, bl, class05311.N(class002652, class003112));
    }

    private static List<class05303> N(class00265 class002652, class00311 class003112) {
        List var3;
        if (class002652 instanceof class00240 && !(var3 = ((class00240)class002652).y().N(class003112)).isEmpty()) {
            return List.of(class05311.N(1, 1, var3));
        }
        return List.of();
    }

    @Override
    protected class01894 N(boolean bl) {
        if (bl) {
            return this.method_25367() ? u : L;
        }
        return this.method_25367() ? R : i;
    }
}

