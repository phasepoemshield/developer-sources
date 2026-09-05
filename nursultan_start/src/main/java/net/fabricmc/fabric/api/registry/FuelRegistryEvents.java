/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.registry;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents$BuildCallback;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents$ExclusionsCallback;

public interface FuelRegistryEvents {
    public static final Event<FuelRegistryEvents$BuildCallback> BUILD = EventFactory.createArrayBacked(FuelRegistryEvents$BuildCallback.class, fuelRegistryEvents$BuildCallbackArray -> (class098822, fuelRegistryEvents$Context) -> {
        for (FuelRegistryEvents$BuildCallback fuelRegistryEvents$BuildCallback : fuelRegistryEvents$BuildCallbackArray) {
            fuelRegistryEvents$BuildCallback.build(class098822, fuelRegistryEvents$Context);
        }
    });
    public static final Event<FuelRegistryEvents$ExclusionsCallback> EXCLUSIONS = EventFactory.createArrayBacked(FuelRegistryEvents$ExclusionsCallback.class, fuelRegistryEvents$ExclusionsCallbackArray -> (class098822, fuelRegistryEvents$Context) -> {
        for (FuelRegistryEvents$ExclusionsCallback fuelRegistryEvents$ExclusionsCallback : fuelRegistryEvents$ExclusionsCallbackArray) {
            fuelRegistryEvents$ExclusionsCallback.buildExclusions(class098822, fuelRegistryEvents$Context);
        }
    });
}

