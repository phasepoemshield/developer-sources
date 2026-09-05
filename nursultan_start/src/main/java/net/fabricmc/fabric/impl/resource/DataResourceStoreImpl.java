/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.resource.v1.DataResourceStore$Key
 *  net.fabricmc.fabric.api.resource.v1.DataResourceStore$Mutable
 */
package net.fabricmc.fabric.impl.resource;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import net.fabricmc.fabric.api.resource.v1.DataResourceStore;

public final class DataResourceStoreImpl
implements DataResourceStore.Mutable {
    private final Map<DataResourceStore.Key<?>, Object> store = new IdentityHashMap();

    public <T> void put(DataResourceStore.Key<T> key, T t) {
        this.store.put(key, t);
    }

    public <T> T getOrThrow(DataResourceStore.Key<T> key) {
        return (T)Objects.requireNonNull(this.store.get(key));
    }
}

