/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00265
 *  minecraft.class00299
 *  minecraft.class00311
 *  minecraft.class00315
 *  minecraft.class00326
 *  minecraft.class00329
 *  minecraft.class01894
 *  minecraft.class02604
 *  minecraft.class05299
 *  minecraft.class05303
 */
package minecraft;

import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class00265;
import minecraft.class00299;
import minecraft.class00311;
import minecraft.class00315;
import minecraft.class00326;
import minecraft.class00329;
import minecraft.class01894;
import minecraft.class02604;
import minecraft.class05299;
import minecraft.class05303;
import minecraft.class05328;

class class05319
extends class05328 {
    private static final class01894 L = class01894.y((String)"recipe_book/crafting_overlay");
    private static final class01894 u = class01894.y((String)"recipe_book/crafting_overlay_highlighted");
    private static final class01894 i = class01894.y((String)"recipe_book/crafting_overlay_disabled");
    private static final class01894 R = class01894.y((String)"recipe_book/crafting_overlay_disabled_highlighted");
    private static final int M = 3;
    private static final int B = 3;

    public class05319(class05299 class052992, int n, int n2, class00329 class003292, class00265 class002652, class00311 class003112, boolean bl) {
        super(class052992, n, n2, class003292, bl, class05319.N(class002652, class003112));
    }

    private static List<class05303> N(class00265 class002652, class00311 class003112) {
        ArrayList<class05303> arrayList = new ArrayList<class05303>();
        class00265 class002653 = class002652;
        Objects.requireNonNull(class002653);
        class00265 class002654 = class002653;
        int n4 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00326.class, class00315.class}, (Object)class002654, (int)n4)) {
            case 0: {
                class00326 class003262 = (class00326)class002654;
                class02604.N((int)3, (int)3, (int)class003262.y(), (int)class003262.L(), (Iterable)class003262.R(), (class002992, n, n2, n3) -> {
                    List var6 = class002992.N(class003112);
                    if (!var6.isEmpty()) {
                        arrayList.add(class05319.N(n2, n3, var6));
                    }
                });
                break;
            }
            case 1: {
                List var7 = ((class00315)class002654).y();
                for (int i = 0; i < var7.size(); ++i) {
                    List var9 = ((class00299)var7.get(i)).N(class003112);
                    if (var9.isEmpty()) continue;
                    arrayList.add(class05319.N(i % 3, i / 3, var9));
                }
                break;
            }
        }
        return arrayList;
    }

    @Override
    protected class01894 N(boolean bl) {
        if (bl) {
            return this.method_25367() ? u : L;
        }
        return this.method_25367() ? R : i;
    }
}

