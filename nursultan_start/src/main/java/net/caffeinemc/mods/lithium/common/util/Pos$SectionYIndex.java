/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class05474
 */
package net.caffeinemc.mods.lithium.common.util;

import minecraft.class01296;
import minecraft.class05474;
import net.caffeinemc.mods.lithium.common.util.Pos$SectionYCoord;

public class Pos$SectionYIndex {
    public static int getMaxYSectionIndexExclusive(class05474 class054742) {
        return class054742.method_32890();
    }

    public static int getMinYSectionIndex(class05474 class054742) {
        return 0;
    }

    public static int fromBlockCoord(class05474 class054742, int n) {
        return Pos$SectionYIndex.fromSectionCoord(class054742, class01296.N((int)n));
    }

    public static int getMaxYSectionIndexInclusive(class05474 class054742) {
        return class054742.method_32890() - 1;
    }

    public static int fromSectionCoord(class05474 class054742, int n) {
        return n - Pos$SectionYCoord.getMinYSection(class054742);
    }

    public static int getNumYSections(class05474 class054742) {
        return class054742.method_32890();
    }
}

