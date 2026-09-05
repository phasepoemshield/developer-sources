/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class02001
 *  minecraft.class02965
 *  minecraft.class03078
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.event.registry.DynamicRegistries$SyncOption
 */
package net.fabricmc.fabric.impl.registry.sync;

import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import minecraft.class00751;
import minecraft.class02001;
import minecraft.class02965;
import minecraft.class03078;
import minecraft.class05946;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries;

public final class DynamicRegistriesImpl {
    private static final List<class02965<?>> DYNAMIC_REGISTRIES = new ArrayList(class03078.N);
    public static final Set<class05946<?>> FABRIC_DYNAMIC_REGISTRY_KEYS = new HashSet();
    public static final Set<class05946<? extends class00751<?>>> DYNAMIC_REGISTRY_KEYS = new HashSet();
    public static final Set<class05946<? extends class00751<?>>> SKIP_EMPTY_SYNC_REGISTRIES = new HashSet();

    private DynamicRegistriesImpl() {
    }

    static {
        for (class02965 class029652 : class03078.N) {
            DYNAMIC_REGISTRY_KEYS.add(class029652.N());
        }
    }

    public static <T> class02965<T> register(class05946<? extends class00751<T>> class059462, Codec<T> codec) {
        Objects.requireNonNull(class059462, "Registry key cannot be null");
        Objects.requireNonNull(codec, "Server codec cannot be null");
        if (!DYNAMIC_REGISTRY_KEYS.add(class059462)) {
            throw new IllegalArgumentException("Dynamic registry " + String.valueOf(class059462) + " has already been registered!");
        }
        class02965 class029652 = new class02965(class059462, codec, false);
        DYNAMIC_REGISTRIES.add(class029652);
        FABRIC_DYNAMIC_REGISTRY_KEYS.add(class059462);
        return class029652;
    }

    public static List<class02965<?>> getDynamicRegistries() {
        return List.copyOf(DYNAMIC_REGISTRIES);
    }

    public static <T> void addSyncedRegistry(class05946<? extends class00751<T>> class059462, Codec<T> codec, DynamicRegistries.SyncOption ... syncOptionArray) {
        Objects.requireNonNull(class059462, "Registry key cannot be null");
        Objects.requireNonNull(codec, "Client codec cannot be null");
        Objects.requireNonNull(syncOptionArray, "Options cannot be null");
        if (!(class03078.L instanceof ArrayList)) {
            class03078.L = new ArrayList(class03078.L);
        }
        class03078.L.add(new class02965(class059462, codec, false));
        if (!(class02001.N instanceof HashSet)) {
            class02001.N = new HashSet(class02001.N);
        }
        class02001.N.add(class059462);
        for (DynamicRegistries.SyncOption syncOption : syncOptionArray) {
            if (syncOption != DynamicRegistries.SyncOption.SKIP_WHEN_EMPTY) continue;
            SKIP_EMPTY_SYNC_REGISTRIES.add(class059462);
        }
    }
}

