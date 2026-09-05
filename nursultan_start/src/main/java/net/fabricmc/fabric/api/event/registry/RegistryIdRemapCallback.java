/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.impl.registry.sync.ListenableRegistry
 */
package net.fabricmc.fabric.api.event.registry;

import minecraft.class00751;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback$RemapState;
import net.fabricmc.fabric.impl.registry.sync.ListenableRegistry;

@FunctionalInterface
public interface RegistryIdRemapCallback<T> {
    public static <T> Event<RegistryIdRemapCallback<T>> event(class00751<T> class007512) {
        return ListenableRegistry.get(class007512).fabric_getRemapEvent();
    }

    public void onRemap(RegistryIdRemapCallback$RemapState<T> var1);
}

