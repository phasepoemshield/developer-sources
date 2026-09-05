/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.event.registry.DynamicRegistryView
 *  net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
 */
package net.fabricmc.fabric.impl.registry.sync;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class05946;
import net.fabricmc.fabric.api.event.registry.DynamicRegistryView;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.impl.registry.sync.DynamicRegistryViewImpl$1;

public final class DynamicRegistryViewImpl
implements DynamicRegistryView {
    final Map<class05946<? extends class00751<?>>, class00751<?>> registries;

    public DynamicRegistryViewImpl(Map<class05946<? extends class00751<?>>, class00751<?>> map) {
        this.registries = map;
    }

    public Stream<class00751<?>> stream() {
        return this.registries.values().stream();
    }

    public <T> Optional<class00751<T>> getOptional(class05946<? extends class00751<? extends T>> class059462) {
        return Optional.ofNullable(this.registries.get(class059462));
    }

    public class01042 asDynamicRegistryManager() {
        return new DynamicRegistryViewImpl$1(this);
    }

    public <T> void registerEntryAdded(class05946<? extends class00751<? extends T>> class059462, RegistryEntryAddedCallback<T> registryEntryAddedCallback) {
        class00751<?> class007512 = this.registries.get(class059462);
        if (class007512 != null) {
            RegistryEntryAddedCallback.event(class007512).register(registryEntryAddedCallback);
        }
    }
}

