/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06581
 *  minecraft.class07310
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup$ItemApiProvider
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage$CombinedItemApiProvider
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedStorage
 */
package net.fabricmc.fabric.impl.transfer.fluid;

import java.util.ArrayList;
import minecraft.class06581;
import minecraft.class07310;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedStorage;
import net.fabricmc.fabric.impl.transfer.fluid.CombinedProvidersImpl$Provider;

public class CombinedProvidersImpl {
    public static Event<FluidStorage.CombinedItemApiProvider> createEvent(boolean bl) {
        return EventFactory.createArrayBacked(FluidStorage.CombinedItemApiProvider.class, combinedItemApiProviderArray -> containerItemContext -> {
            ArrayList<Storage> arrayList = new ArrayList<Storage>();
            Storage storage2 = combinedItemApiProviderArray;
            int n = ((FluidStorage.CombinedItemApiProvider[])storage2).length;
            for (int i = 0; i < n; ++i) {
                FluidStorage.CombinedItemApiProvider combinedItemApiProvider = storage2[i];
                Storage storage3 = combinedItemApiProvider.find(containerItemContext);
                if (storage3 == null) continue;
                arrayList.add(storage3);
            }
            if (!arrayList.isEmpty() && bl && (storage2 = ((FluidStorage.CombinedItemApiProvider)FluidStorage.GENERAL_COMBINED_PROVIDER.invoker()).find(containerItemContext)) != null) {
                arrayList.add(storage2);
            }
            return arrayList.isEmpty() ? null : new CombinedStorage(arrayList);
        });
    }

    public static Event<FluidStorage.CombinedItemApiProvider> getOrCreateItemEvent(class06581 class065812) {
        ItemApiLookup.ItemApiProvider itemApiProvider = FluidStorage.ITEM.getProvider(class065812);
        if (itemApiProvider == null) {
            FluidStorage.ITEM.registerForItems((ItemApiLookup.ItemApiProvider)new CombinedProvidersImpl$Provider(), new class07310[]{class065812});
            itemApiProvider = FluidStorage.ITEM.getProvider(class065812);
        }
        if (itemApiProvider instanceof CombinedProvidersImpl$Provider) {
            CombinedProvidersImpl$Provider combinedProvidersImpl$Provider = (CombinedProvidersImpl$Provider)itemApiProvider;
            return combinedProvidersImpl$Provider.event;
        }
        String string = String.format("An incompatible provider was already registered for item %s. Provider: %s.", class065812, itemApiProvider);
        throw new IllegalStateException(string);
    }
}

