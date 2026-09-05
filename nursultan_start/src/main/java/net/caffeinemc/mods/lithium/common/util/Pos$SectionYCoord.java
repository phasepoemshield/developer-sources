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

public class Pos$SectionYCoord {
    public static int fromBlockCoord(int n) {
        return class01296.N((int)n);
    }

    public static int fromSectionIndex(class05474 class054742, int n) {
        return n + Pos$SectionYCoord.getMinYSection(class054742);
    }

    public static int getMinYSection(class05474 class054742) {
        return class054742.method_32891();
    }

    public static int getNumYSections(class05474 class054742) {
        return class054742.method_32890();
    }

    public static int getMaxYSectionInclusive(class05474 class054742) {
        return class054742.method_31597();
    }

    public static int getMaxYSectionExclusive(class05474 class054742) {
        return class054742.method_31597() + 1;
    }
}

