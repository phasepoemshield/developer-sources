/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl.builders;

import java.util.LinkedHashMap;
import java.util.Map;
import org.quiltmc.config.api.values.ValueMap;
import org.quiltmc.config.api.values.ValueMap$Builder;
import org.quiltmc.config.impl.values.ValueMapImpl;

public class ValueMapBuilderImpl
implements ValueMap$Builder {
    private final Object defaultValue;
    private final Map values;

    public ValueMapBuilderImpl(Object object) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        v1.values = linkedHashMap2;
        v1.defaultValue = object;
    }

    @Override
    public ValueMap$Builder put(String string, Object object) {
        ValueMapBuilderImpl valueMapBuilderImpl = this;
        valueMapBuilderImpl.values.put(string, object);
        return valueMapBuilderImpl;
    }

    @Override
    public ValueMap build() {
        ValueMapBuilderImpl valueMapBuilderImpl = object;
        Object object = valueMapBuilderImpl.defaultValue;
        return new ValueMapImpl(object, valueMapBuilderImpl.values);
    }
}

