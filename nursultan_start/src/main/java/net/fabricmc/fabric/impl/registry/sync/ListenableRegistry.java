/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
 *  net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback
 */
package net.fabricmc.fabric.impl.registry.sync;

import minecraft.class00751;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback;

public interface ListenableRegistry<T> {
    public static <T> ListenableRegistry<T> get(class00751<T> class007512) {
        if (!(class007512 instanceof ListenableRegistry)) {
            throw new IllegalArgumentException("Unsupported registry: " + String.valueOf(class007512.i().N()));
        }
        return (ListenableRegistry)class007512;
    }

    public Event<RegistryIdRemapCallback<T>> fabric_getRemapEvent();

    public Event<RegistryEntryAddedCallback<T>> fabric_getAddObjectEvent();
}

