/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import minecraft.class07211;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import org.jspecify.annotations.Nullable;

public interface SidedStorageBlockEntity {
    default public @Nullable Storage<FluidVariant> getFluidStorage(@Nullable class07211 class072112) {
        return null;
    }

    default public @Nullable Storage<ItemVariant> getItemStorage(@Nullable class07211 class072112) {
        return null;
    }
}

