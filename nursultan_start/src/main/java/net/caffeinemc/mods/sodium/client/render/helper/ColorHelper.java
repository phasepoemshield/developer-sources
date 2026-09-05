/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 */
package net.caffeinemc.mods.sodium.client.render.helper;

import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;

public abstract class ColorHelper {
    public static int maxBrightness(int n, int n2) {
        return Math.max(n & 0xFFFF, n2 & 0xFFFF) | Math.max(n & 0xFFFF0000, n2 & 0xFFFF0000);
    }

    public static int fromVanillaColor(int n) {
        return ColorARGB.fromABGR((int)ColorABGR.fromNativeByteOrder((int)n));
    }

    public static int toVanillaColor(int n) {
        return ColorABGR.toNativeByteOrder((int)ColorARGB.toABGR((int)n));
    }
}

