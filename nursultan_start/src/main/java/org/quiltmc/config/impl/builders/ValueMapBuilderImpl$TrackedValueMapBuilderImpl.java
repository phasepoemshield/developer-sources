/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.TrackedValue
 */
package org.quiltmc.config.impl.builders;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueMap$TrackedBuilder;
import org.quiltmc.config.impl.values.ValueMapImpl;

public class ValueMapBuilderImpl$TrackedValueMapBuilderImpl
implements ValueMap$TrackedBuilder {
    private final Object defaultValue;
    private final Map values;
    private final Function trackedValueFactory;

    public ValueMapBuilderImpl$TrackedValueMapBuilderImpl(Object object, Function function) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        v1.values = linkedHashMap2;
        v1.defaultValue = object;
        v1.trackedValueFactory = function;
    }

    @Override
    public ValueMap$TrackedBuilder put(String string, Object object) {
        ValueMapBuilderImpl$TrackedValueMapBuilderImpl valueMapBuilderImpl$TrackedValueMapBuilderImpl = this;
        valueMapBuilderImpl$TrackedValueMapBuilderImpl.values.put(string, object);
        return valueMapBuilderImpl$TrackedValueMapBuilderImpl;
    }

    @Override
    public TrackedValue build() {
        ValueMapBuilderImpl$TrackedValueMapBuilderImpl valueMapBuilderImpl$TrackedValueMapBuilderImpl = object;
        Object object = valueMapBuilderImpl$TrackedValueMapBuilderImpl.defaultValue;
        return (TrackedValue)((ValueMapBuilderImpl$TrackedValueMapBuilderImpl)object).trackedValueFactory.apply(new ValueMapImpl(object, valueMapBuilderImpl$TrackedValueMapBuilderImpl.values));
    }
}

