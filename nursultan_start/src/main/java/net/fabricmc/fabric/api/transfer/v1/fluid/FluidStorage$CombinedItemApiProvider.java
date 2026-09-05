/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.fluid;

import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface FluidStorage$CombinedItemApiProvider {
    public @Nullable Storage<FluidVariant> find(ContainerItemContext var1);
}

