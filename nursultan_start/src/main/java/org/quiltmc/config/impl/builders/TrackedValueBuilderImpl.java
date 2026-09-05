/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Constraint
 *  org.quiltmc.config.api.metadata.MetadataType
 *  org.quiltmc.config.api.metadata.MetadataType$Builder
 *  org.quiltmc.config.api.values.TrackedValue
 *  org.quiltmc.config.api.values.TrackedValue$Builder
 *  org.quiltmc.config.api.values.TrackedValue$UpdateCallback
 */
package org.quiltmc.config.impl.builders;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import org.quiltmc.config.api.Constraint;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.impl.tree.TrackedValueImpl;
import org.quiltmc.config.impl.values.ValueKeyImpl;

public class TrackedValueBuilderImpl
implements TrackedValue.Builder {
    private final Object defaultValue;
    private final Set key;
    final Map metadata;
    private final List callbacks;
    private final List constraints;

    public TrackedValue.Builder constraint(Constraint constraint) {
        TrackedValueBuilderImpl trackedValueBuilderImpl = this;
        trackedValueBuilderImpl.constraints.add(constraint);
        return trackedValueBuilderImpl;
    }

    public TrackedValue.Builder metadata(MetadataType metadataType, Consumer consumer) {
        MetadataType metadataType3 = metadataType;
        consumer.accept((MetadataType.Builder)this.metadata.computeIfAbsent(metadataType3, metadataType2 -> metadataType3.newBuilder()));
        return this;
    }

    public TrackedValue.Builder callback(TrackedValue.UpdateCallback updateCallback) {
        TrackedValueBuilderImpl trackedValueBuilderImpl = this;
        trackedValueBuilderImpl.callbacks.add(updateCallback);
        return trackedValueBuilderImpl;
    }

    public TrackedValueBuilderImpl(Object object, String string) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        LinkedHashSet<String> linkedHashSet;
        LinkedHashSet<String> linkedHashSet2 = linkedHashSet;
        TrackedValueBuilderImpl trackedValueBuilderImpl = object2;
        TrackedValueBuilderImpl trackedValueBuilderImpl2 = object2;
        linkedHashSet2();
        trackedValueBuilderImpl2.key = linkedHashSet2;
        Object object2 = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        trackedValueBuilderImpl2.metadata = object2;
        object2 = arrayList2;
        arrayList2 = new ArrayList();
        trackedValueBuilderImpl2.callbacks = object2;
        object2 = arrayList;
        arrayList = new ArrayList();
        trackedValueBuilderImpl2.constraints = object2;
        Objects.requireNonNull(string);
        trackedValueBuilderImpl.defaultValue = object;
        linkedHashSet.add(string);
    }

    public TrackedValue.Builder key(String string) {
        TrackedValueBuilderImpl trackedValueBuilderImpl = this;
        trackedValueBuilderImpl.key.add(string);
        return trackedValueBuilderImpl;
    }

    public Object getDefaultValue() {
        return this.defaultValue;
    }

    public TrackedValue build() {
        ValueKeyImpl valueKeyImpl;
        Object object3;
        LinkedHashMap<MetadataType, Object> linkedHashMap;
        LinkedHashMap<MetadataType, Object> linkedHashMap2 = linkedHashMap;
        linkedHashMap = new LinkedHashMap<MetadataType, Object>();
        for (Map.Entry object2 : ((TrackedValueBuilderImpl)object3).metadata.entrySet()) {
            linkedHashMap2.put((MetadataType)object2.getKey(), ((MetadataType.Builder)object2.getValue()).build());
        }
        TrackedValueBuilderImpl trackedValueBuilderImpl = object3;
        ValueKeyImpl valueKeyImpl2 = valueKeyImpl;
        valueKeyImpl = new ValueKeyImpl(((TrackedValueBuilderImpl)object3).key.toArray(new String[0]));
        object3 = trackedValueBuilderImpl.defaultValue;
        List list = trackedValueBuilderImpl.callbacks;
        List list2 = trackedValueBuilderImpl.constraints;
        return new TrackedValueImpl(valueKeyImpl2, object3, linkedHashMap2, list, list2);
    }
}

