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

public class Pos$BlockCoord {
    public static int getMaxYExclusive(class05474 class054742) {
        return class054742.method_31600() + 1;
    }

    public static int getMaxYInclusive(class05474 class054742) {
        return class054742.method_31600();
    }

    public static int getMinYInSectionIndex(class05474 class054742, int n) {
        return Pos$BlockCoord.getMinInSectionCoord(Pos$SectionYCoord.fromSectionIndex(class054742, n));
    }

    public static int getMinInSectionCoord(int n) {
        return class01296.L((int)n);
    }

    public static int getMaxYInSectionIndex(class05474 class054742, int n) {
        return Pos$BlockCoord.getMaxInSectionCoord(Pos$SectionYCoord.fromSectionIndex(class054742, n));
    }

    public static int getMaxInSectionCoord(int n) {
        return 15 + Pos$BlockCoord.getMinInSectionCoord(n);
    }

    public static int getYSize(class05474 class054742) {
        return class054742.method_31605();
    }

    public static int getMinY(class05474 class054742) {
        return class054742.method_31607();
    }
}

