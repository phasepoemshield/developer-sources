/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.ReferenceSet
 *  minecraft.class00891
 *  minecraft.class01587
 *  minecraft.class04750
 */
package net.caffeinemc.mods.sodium.client.model.color.interop;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.ReferenceSet;
import minecraft.class00891;
import minecraft.class01587;
import minecraft.class04750;

public interface BlockColorsExtension {
    public static Reference2ReferenceMap<class00891, class04750> getProviders(class01587 class015872) {
        return ((BlockColorsExtension)class015872).sodium$getProviders();
    }

    public Reference2ReferenceMap<class00891, class04750> sodium$getProviders();

    public static ReferenceSet<class00891> getOverridenVanillaBlocks(class01587 class015872) {
        return ((BlockColorsExtension)class015872).sodium$getOverridenVanillaBlocks();
    }

    public ReferenceSet<class00891> sodium$getOverridenVanillaBlocks();
}

