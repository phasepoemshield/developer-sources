/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.configbuilder.custom;

import de.maxhenkel.voicechat.configbuilder.custom.AbstractValueMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class AbstractValueMap$Builder<K, V, M extends AbstractValueMap<K, V>> {
    protected final Map<K, V> map = new LinkedHashMap();

    protected AbstractValueMap$Builder() {
    }

    public AbstractValueMap$Builder<K, V, M> put(K k, V v) {
        this.map.put(k, v);
        return this;
    }

    public AbstractValueMap$Builder<K, V, M> putAll(Map<K, V> map) {
        this.map.putAll(map);
        return this;
    }

    public abstract M build();
}

