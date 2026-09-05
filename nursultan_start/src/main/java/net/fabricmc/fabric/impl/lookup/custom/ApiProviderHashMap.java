/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.lookup.custom;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.Map;
import java.util.Objects;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap;
import org.jspecify.annotations.Nullable;

public final class ApiProviderHashMap<K, V>
implements ApiProviderMap<K, V> {
    private volatile Map<K, V> lookups = new Reference2ReferenceOpenHashMap();

    public @Nullable V get(K k) {
        Objects.requireNonNull(k, "Key may not be null.");
        return this.lookups.get(k);
    }

    public synchronized V putIfAbsent(K k, V v) {
        Objects.requireNonNull(k, "Key may not be null.");
        Objects.requireNonNull(v, "Provider may not be null.");
        Reference2ReferenceOpenHashMap reference2ReferenceOpenHashMap = new Reference2ReferenceOpenHashMap(this.lookups);
        V v2 = reference2ReferenceOpenHashMap.putIfAbsent(k, v);
        this.lookups = reference2ReferenceOpenHashMap;
        return v2;
    }
}

