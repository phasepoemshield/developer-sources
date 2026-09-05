/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class03529
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.impl.registry.sync.ListenableRegistry
 */
package net.fabricmc.fabric.api.event.registry;

import java.util.function.Consumer;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class03529;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.impl.registry.sync.ListenableRegistry;

@FunctionalInterface
public interface RegistryEntryAddedCallback<T> {
    public void onEntryAdded(int var1, class01894 var2, T var3);

    public static <T> Event<RegistryEntryAddedCallback<T>> event(class00751<T> class007512) {
        return ListenableRegistry.get(class007512).fabric_getAddObjectEvent();
    }

    public static <T> void allEntries(class00751<T> class007512, Consumer<class03529<T>> consumer) {
        RegistryEntryAddedCallback.event(class007512).register((n, class018942, object) -> consumer.accept((class03529)class007512.L(class018942).orElseThrow()));
        class007512.z().toList().forEach(consumer);
    }
}

