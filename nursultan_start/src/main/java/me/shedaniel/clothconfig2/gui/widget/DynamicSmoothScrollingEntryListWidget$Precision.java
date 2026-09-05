/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.gui.widget;

public class DynamicSmoothScrollingEntryListWidget$Precision {
    public static final float FLOAT_EPSILON = 0.001f;
    public static final double DOUBLE_EPSILON = 1.0E-7;

    public static boolean almostEquals(float f, float f2, float f3) {
        return Math.abs(f - f2) <= f3;
    }

    public static boolean almostEquals(double d, double d2, double d3) {
        return Math.abs(d - d2) <= d3;
    }
}

