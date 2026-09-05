/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectOpenHashMap
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.Unit
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.data;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectOpenHashMap;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.Unit;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class StructuredDataContainer
implements Copyable {
    private final Map<StructuredDataKey<?>, StructuredData<?>> data;
    private FullMappings lookup;
    private boolean mappedNames;

    public boolean has(StructuredDataKey<?> key) {
        return this.data.containsKey(key);
    }

    public StructuredDataContainer(Map<StructuredDataKey<?>, StructuredData<?>> data) {
        this.data = data;
    }

    public StructuredDataContainer() {
        this((Map<StructuredDataKey<?>, StructuredData<?>>)new Reference2ObjectOpenHashMap(0));
    }

    public StructuredDataContainer(StructuredData<?>[] dataArray) {
        this((Map<StructuredDataKey<?>, StructuredData<?>>)new Reference2ObjectOpenHashMap(dataArray.length));
        for (StructuredData<?> data : dataArray) {
            this.data.put(data.key(), data);
        }
    }

    public void remove(Collection<StructuredDataKey<?>> keys) {
        for (StructuredDataKey<?> key : keys) {
            this.data.remove(key);
        }
    }

    public void remove(StructuredDataKey<?> key) {
        this.data.remove(key);
    }

    public <T> @Nullable T get(StructuredDataKey<T> key) {
        StructuredData<?> data = this.data.get(key);
        if (data == null || data.isEmpty()) {
            return null;
        }
        return (T)data.value();
    }

    public String toString() {
        return "StructuredDataContainer{data=" + String.valueOf(this.data) + ", lookup=" + String.valueOf(this.lookup) + ", mappedNames=" + this.mappedNames + "}";
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    public <T, V> void replace(StructuredDataKey<T> key, StructuredDataKey<V> toKey, Function<T, @Nullable V> valueMapper, Runnable emptyValueHandler) {
        StructuredData<?> data = this.data.remove(key);
        if (data == null) {
            return;
        }
        if (data.isPresent()) {
            Object value = data.value();
            V replacement = valueMapper.apply(value);
            if (replacement != null) {
                this.set(toKey, replacement);
            }
        } else {
            this.setEmpty(toKey);
            if (emptyValueHandler != null) {
                emptyValueHandler.run();
            }
        }
    }

    public <T> void replace(StructuredDataKey<T> key, Function<T, @Nullable T> valueMapper) {
        StructuredData<T> data = this.getNonEmptyData(key);
        if (data == null) {
            return;
        }
        T replacement = valueMapper.apply(data.value());
        if (replacement != null) {
            data.setValue(replacement);
        } else {
            this.data.remove(key);
        }
    }

    public <T, V> void replace(StructuredDataKey<T> key, StructuredDataKey<V> toKey, Function<T, @Nullable V> valueMapper) {
        this.replace(key, toKey, valueMapper, null);
    }

    public Map<StructuredDataKey<?>, StructuredData<?>> data() {
        return this.data;
    }

    public void set(StructuredDataKey<Unit> key) {
        this.set(key, Unit.INSTANCE);
    }

    public <T> void set(StructuredDataKey<T> key, T value) {
        int id = this.serializerId(key);
        if (id != -1) {
            this.data.put(key, StructuredData.of(key, value, id));
        }
    }

    public StructuredDataContainer copy() {
        Reference2ObjectOpenHashMap map = new Reference2ObjectOpenHashMap();
        for (StructuredData<?> value : this.data.values()) {
            map.put(value.key(), value.copy());
        }
        StructuredDataContainer copy = new StructuredDataContainer((Map<StructuredDataKey<?>, StructuredData<?>>)map);
        copy.lookup = this.lookup;
        return copy;
    }

    public boolean hasValue(StructuredDataKey<?> key) {
        StructuredData<?> data = this.data.get(key);
        return data != null && data.isPresent();
    }

    public <T> @Nullable StructuredData<T> getData(StructuredDataKey<T> key) {
        return this.data.get(key);
    }

    public void setIdLookup(Protocol<?, ?, ?, ?> protocol, boolean mappedNames) {
        this.lookup = protocol.getMappingData().getDataComponentSerializerMappings();
        Preconditions.checkNotNull((Object)this.lookup, (Object)"Data component serializer mappings are null");
        this.mappedNames = mappedNames;
    }

    public <T> void replaceKey(StructuredDataKey<T> key, StructuredDataKey<T> toKey) {
        this.replace(key, toKey, Function.identity());
    }

    public void updateIds(Protocol<?, ?, ?, ?> protocol, Int2IntFunction rewriter) {
        for (StructuredData<?> data : this.data.values()) {
            int mappedId = rewriter.applyAsInt(data.id());
            if (mappedId == -1) continue;
            data.setId(mappedId);
        }
    }

    public void setEmpty(StructuredDataKey<?> key) {
        this.data.put(key, StructuredData.empty(key, this.serializerId(key)));
    }

    public <T> @Nullable StructuredData<T> getNonEmptyData(StructuredDataKey<T> key) {
        StructuredData<?> data = this.data.get(key);
        return data != null && data.isPresent() ? data : null;
    }

    public boolean hasEmpty(StructuredDataKey<?> key) {
        StructuredData<?> data = this.data.get(key);
        return data != null && data.isEmpty();
    }

    private int serializerId(StructuredDataKey<?> key) {
        int id;
        int n = id = this.mappedNames ? this.lookup.mappedId(key.identifier()) : this.lookup.id(key.identifier());
        if (id == -1) {
            Via.getPlatform().getLogger().severe("Could not find item data serializer for type " + String.valueOf(key));
        }
        return id;
    }
}

