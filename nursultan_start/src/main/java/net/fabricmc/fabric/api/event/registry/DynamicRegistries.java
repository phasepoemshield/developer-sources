/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class02965
 *  minecraft.class05946
 *  net.fabricmc.fabric.impl.registry.sync.DynamicRegistriesImpl
 */
package net.fabricmc.fabric.api.event.registry;

import com.mojang.serialization.Codec;
import java.util.List;
import minecraft.class00751;
import minecraft.class02965;
import minecraft.class05946;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries$SyncOption;
import net.fabricmc.fabric.impl.registry.sync.DynamicRegistriesImpl;

public final class DynamicRegistries {
    private DynamicRegistries() {
    }

    public static <T> void register(class05946<? extends class00751<T>> class059462, Codec<T> codec) {
        DynamicRegistriesImpl.register(class059462, codec);
    }

    public static List<class02965<?>> getDynamicRegistries() {
        return DynamicRegistriesImpl.getDynamicRegistries();
    }

    public static <T> void registerSynced(class05946<? extends class00751<T>> class059462, Codec<T> codec, DynamicRegistries$SyncOption ... dynamicRegistries$SyncOptionArray) {
        DynamicRegistries.registerSynced(class059462, codec, codec, dynamicRegistries$SyncOptionArray);
    }

    public static <T> void registerSynced(class05946<? extends class00751<T>> class059462, Codec<T> codec, Codec<T> codec2, DynamicRegistries$SyncOption ... dynamicRegistries$SyncOptionArray) {
        DynamicRegistriesImpl.register(class059462, codec);
        DynamicRegistriesImpl.addSyncedRegistry(class059462, codec2, (DynamicRegistries$SyncOption[])dynamicRegistries$SyncOptionArray);
    }
}

