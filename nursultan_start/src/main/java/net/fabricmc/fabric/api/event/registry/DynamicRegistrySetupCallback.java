/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.event.registry;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.registry.DynamicRegistryView;

@FunctionalInterface
public interface DynamicRegistrySetupCallback {
    public static final Event<DynamicRegistrySetupCallback> EVENT = EventFactory.createArrayBacked(DynamicRegistrySetupCallback.class, dynamicRegistrySetupCallbackArray -> dynamicRegistryView -> {
        for (DynamicRegistrySetupCallback dynamicRegistrySetupCallback : dynamicRegistrySetupCallbackArray) {
            dynamicRegistrySetupCallback.onRegistrySetup(dynamicRegistryView);
        }
    });

    public void onRegistrySetup(DynamicRegistryView var1);
}

