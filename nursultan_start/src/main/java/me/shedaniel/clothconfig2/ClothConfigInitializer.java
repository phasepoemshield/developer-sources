/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.impl.EasingMethod
 *  me.shedaniel.clothconfig2.impl.EasingMethod$EasingMethodImpl
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package me.shedaniel.clothconfig2;

import me.shedaniel.clothconfig2.api.ScrollingContainer;
import me.shedaniel.clothconfig2.impl.EasingMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClothConfigInitializer {
    public static final Logger LOGGER = LogManager.getFormatterLogger((String)"ClothConfig");
    public static final String MOD_ID = "cloth_config";

    @Deprecated
    public static double clamp(double d, double d2, double d3) {
        return ScrollingContainer.clampExtension(d, -d3, d2 + d3);
    }

    @Deprecated
    public static double clamp(double d, double d2) {
        return ScrollingContainer.clampExtension(d, d2);
    }

    @Deprecated
    public static double expoEase(double d, double d2, double d3) {
        return ScrollingContainer.ease(d, d2, d3, ClothConfigInitializer.getEasingMethod());
    }

    public static double getScrollStep() {
        return 16.0;
    }

    public static EasingMethod getEasingMethod() {
        return EasingMethod.EasingMethodImpl.NONE;
    }

    public static long getScrollDuration() {
        return 600L;
    }

    public static double getBounceBackMultiplier() {
        return -10.0;
    }

    @Deprecated
    public static double handleScrollingPosition(double[] dArray, double d, double d2, float f, double d3, double d4) {
        return ScrollingContainer.handleScrollingPosition(dArray, d, d2, f, d3, d4);
    }
}

