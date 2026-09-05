/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.impl.lookup.custom.ApiProviderHashMap
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.lookup.v1.custom;

import net.fabricmc.fabric.impl.lookup.custom.ApiProviderHashMap;
import org.jspecify.annotations.Nullable;

public interface ApiProviderMap<K, V> {
    public static <K, V> ApiProviderMap<K, V> create() {
        return new ApiProviderHashMap();
    }

    public @Nullable V get(K var1);

    public V putIfAbsent(K var1, V var2);
}

