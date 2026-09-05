/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.ClothConfigInitializer
 */
package me.shedaniel.clothconfig2.gui.widget;

import me.shedaniel.clothconfig2.ClothConfigInitializer;

public class DynamicNewSmoothScrollingEntryListWidget$Interpolation {
    public static double expoEase(double d, double d2, double d3) {
        return d + (d2 - d) * ClothConfigInitializer.getEasingMethod().apply(d3);
    }
}

