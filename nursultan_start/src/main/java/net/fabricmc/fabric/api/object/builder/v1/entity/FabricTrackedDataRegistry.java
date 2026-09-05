/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04383
 *  net.fabricmc.fabric.impl.object.builder.FabricTrackedDataRegistryImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.object.builder.v1.entity;

import minecraft.class01894;
import minecraft.class04383;
import net.fabricmc.fabric.impl.object.builder.FabricTrackedDataRegistryImpl;
import org.jspecify.annotations.Nullable;

public final class FabricTrackedDataRegistry {
    private FabricTrackedDataRegistry() {
    }

    public static @Nullable class04383<?> get(class01894 class018942) {
        return FabricTrackedDataRegistryImpl.get((class01894)class018942);
    }

    public static void register(class01894 class018942, class04383<?> class043832) {
        FabricTrackedDataRegistryImpl.register((class01894)class018942, class043832);
    }

    public static @Nullable class01894 getId(class04383<?> class043832) {
        return FabricTrackedDataRegistryImpl.getId(class043832);
    }
}

