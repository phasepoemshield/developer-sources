/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08247
 *  minecraft.class08280
 *  minecraft.class08829
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 */
package net.irisshaders.iris.targets.backed;

import minecraft.class08247;
import minecraft.class08280;
import minecraft.class08829;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;

public class NativeImageBackedSingleColorTexture
extends class08829 {
    private static class08280 create(int n) {
        class08280 class082802 = new class08280(class08247.field_4997, 1, 1, false);
        class082802.y(0, 0, n);
        return class082802;
    }

    public NativeImageBackedSingleColorTexture(int n, int n2, int n3, int n4) {
        super(() -> "Single color texture", NativeImageBackedSingleColorTexture.create(ColorARGB.pack((int)n, (int)n2, (int)n3, (int)n4)));
    }

    public NativeImageBackedSingleColorTexture(int n) {
        this(n >> 24 & 0xFF, n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF);
    }
}

