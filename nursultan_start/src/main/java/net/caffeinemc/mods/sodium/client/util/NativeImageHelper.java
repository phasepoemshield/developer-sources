/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08247
 *  minecraft.class08280
 */
package net.caffeinemc.mods.sodium.client.util;

import java.util.Locale;
import minecraft.class08247;
import minecraft.class08280;
import net.caffeinemc.mods.sodium.mixin.features.textures.NativeImageAccessor;

public class NativeImageHelper {
    public static long getPointerRGBA(class08280 class082802) {
        if (class082802.L() != class08247.field_4997) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Tried to get pointer to RGBA pixel data on NativeImage of wrong format; have %s", class082802.L()));
        }
        return ((NativeImageAccessor)class082802).sodium$getPixels();
    }
}

