/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05368
 *  minecraft.class07209
 */
package net.caffeinemc.mods.lithium.common.world.interests;

import java.util.Comparator;
import java.util.List;
import minecraft.class05368;
import minecraft.class07209;

public interface PoiOrdering {
    default public boolean isOrdered(class07209 class072092, class05368 class053682, List<class07209> list) {
        if (!list.isEmpty()) {
            class07209 class072093 = (class07209)list.getFirst();
            for (int i = 1; i < list.size(); ++i) {
                class07209 class072094 = list.get(i);
                int n = this.compare(class072092, class053682, class072093, class072094);
                if (n != 1) {
                    return false;
                }
                class072093 = class072094;
            }
        }
        return true;
    }

    public int compare(class07209 var1, class05368 var2, class07209 var3, class07209 var4);

    default public void checkOrderOrThrow(class07209 class072092, class05368 class053682, List<class07209> list) {
        if (!list.isEmpty()) {
            class07209 class072093 = (class07209)list.getFirst();
            for (int i = 1; i < list.size(); ++i) {
                class07209 class072094 = list.get(i);
                int n = this.compare(class072092, class053682, class072093, class072094);
                if (n != -1) {
                    if (n == 0) {
                        n = this.compare(class072092, class053682, class072093, class072094);
                        throw new IllegalStateException("Positions are equal at index " + i + ": " + String.valueOf(class072093) + " == " + String.valueOf(class072094));
                    }
                    n = this.compare(class072092, class053682, class072093, class072094);
                    throw new IllegalStateException("Positions are ordered incorrectly at index " + i + ": " + String.valueOf(class072093) + " < " + String.valueOf(class072094) + "! Offsets: curr=(" + (class072093.method_10263() - class072092.method_10263()) + ", " + (class072093.method_10264() - class072092.method_10264()) + ", " + (class072093.method_10260() - class072092.method_10260()) + "), next=(" + (class072094.method_10263() - class072092.method_10263()) + ", " + (class072094.method_10264() - class072092.method_10264()) + ", " + (class072094.method_10260() - class072092.method_10260()) + ")");
                }
                class072093 = class072094;
            }
        }
    }

    default public Comparator<class07209> getAsComparator(class07209 class072092, class05368 class053682) {
        return (class072093, class072094) -> this.compare(class072092, class053682, (class07209)class072093, (class07209)class072094);
    }
}

