/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class05946
 */
package net.fabricmc.fabric.api.event.registry;

import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class05946;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;

public interface DynamicRegistryView {
    public Stream<class00751<?>> stream();

    public <T> Optional<class00751<T>> getOptional(class05946<? extends class00751<? extends T>> var1);

    public class01042 asDynamicRegistryManager();

    public <T> void registerEntryAdded(class05946<? extends class00751<? extends T>> var1, RegistryEntryAddedCallback<T> var2);
}

