/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup$ItemApiProvider
 *  net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage$CombinedItemApiProvider
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.transfer.fluid;

import minecraft.class06584;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.impl.transfer.fluid.CombinedProvidersImpl;
import org.jspecify.annotations.Nullable;

class CombinedProvidersImpl$Provider
implements ItemApiLookup.ItemApiProvider<Storage<FluidVariant>, ContainerItemContext> {
    final Event<FluidStorage.CombinedItemApiProvider> event = CombinedProvidersImpl.createEvent(true);

    CombinedProvidersImpl$Provider() {
    }

    public @Nullable Storage<FluidVariant> find(class06584 class065842, ContainerItemContext containerItemContext) {
        if (!containerItemContext.getItemVariant().matches(class065842)) {
            String string = String.format("Query stack %s and ContainerItemContext variant %s don't match.", class065842, containerItemContext.getItemVariant());
            throw new IllegalArgumentException(string);
        }
        return ((FluidStorage.CombinedItemApiProvider)this.event.invoker()).find(containerItemContext);
    }
}

