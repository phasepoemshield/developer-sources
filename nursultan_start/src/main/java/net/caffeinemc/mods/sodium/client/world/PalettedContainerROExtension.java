/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03925
 */
package net.caffeinemc.mods.sodium.client.world;

import minecraft.class03925;

public interface PalettedContainerROExtension<T> {
    public static <T> class03925<T> clone(class03925<T> class039252) {
        if (class039252 == null) {
            return null;
        }
        return PalettedContainerROExtension.of(class039252).sodium$copy();
    }

    public static <T> PalettedContainerROExtension<T> of(class03925<T> class039252) {
        return (PalettedContainerROExtension)class039252;
    }

    public class03925<T> sodium$copy();

    public void sodium$unpack(T[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

    public void sodium$unpack(T[] var1);
}

