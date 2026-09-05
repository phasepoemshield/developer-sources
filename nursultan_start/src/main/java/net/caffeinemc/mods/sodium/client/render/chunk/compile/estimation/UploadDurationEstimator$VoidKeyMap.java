/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

class UploadDurationEstimator$VoidKeyMap<T>
implements Map<Void, T> {
    private T value;

    UploadDurationEstimator$VoidKeyMap() {
    }

    @Override
    public T remove(Object object) {
        if (object == null) {
            T t = this.value;
            this.value = null;
            return t;
        }
        return null;
    }

    @Override
    public int size() {
        return this.value == null ? 0 : 1;
    }

    @Override
    public T get(Object object) {
        if (object == null) {
            return this.value;
        }
        return null;
    }

    @Override
    public @Nullable T put(Void void_, T t) {
        T t2 = this.value;
        this.value = t;
        return t2;
    }

    @Override
    public @NonNull Collection<T> values() {
        if (this.value != null) {
            return Collections.singleton(this.value);
        }
        return Collections.emptyList();
    }

    @Override
    public void clear() {
        this.value = null;
    }

    @Override
    public boolean isEmpty() {
        return this.value == null;
    }

    @Override
    public @NonNull Set<Map.Entry<Void, T>> entrySet() {
        if (this.value != null) {
            return Collections.singleton(new AbstractMap.SimpleEntry<Object, T>(null, this.value));
        }
        return Collections.emptySet();
    }

    @Override
    public void putAll(@NonNull Map<? extends Void, ? extends T> map) {
        if (map.containsKey(null)) {
            this.value = map.get(null);
        }
    }

    @Override
    public boolean containsKey(Object object) {
        return object == null;
    }

    @Override
    public @NonNull Set<Void> keySet() {
        if (this.value != null) {
            return Collections.singleton(null);
        }
        return Set.of();
    }

    @Override
    public boolean containsValue(Object object) {
        return this.value != null && this.value.equals(object);
    }
}

