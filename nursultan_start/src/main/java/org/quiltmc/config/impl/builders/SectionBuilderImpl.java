/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Config$SectionBuilder
 *  org.quiltmc.config.api.metadata.MetadataType
 *  org.quiltmc.config.api.metadata.MetadataType$Builder
 *  org.quiltmc.config.api.values.TrackedValue
 */
package org.quiltmc.config.impl.builders;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueKey;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.builders.ConfigBuilderImpl;
import org.quiltmc.config.impl.tree.SectionTreeNode;
import org.quiltmc.config.impl.tree.TrackedValueImpl;
import org.quiltmc.config.impl.tree.Trie$Node;

public class SectionBuilderImpl
implements Config.SectionBuilder {
    private final ValueKey key;
    private final ConfigBuilderImpl builder;
    final Map metadata;
    private final Map values;

    public Config.SectionBuilder metadata(MetadataType metadataType, Consumer consumer) {
        MetadataType metadataType3 = metadataType;
        consumer.accept((MetadataType.Builder)this.metadata.computeIfAbsent(metadataType3, metadataType2 -> metadataType3.newBuilder()));
        return this;
    }

    public SectionBuilderImpl(ValueKey valueKey, ConfigBuilderImpl configBuilderImpl) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Object object = linkedHashMap2;
        linkedHashMap2 = new LinkedHashMap();
        v1.metadata = object;
        object = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        v1.values = object;
        v1.key = valueKey;
        v1.builder = configBuilderImpl;
    }

    public Config.SectionBuilder field(TrackedValue trackedValue) {
        SectionBuilderImpl sectionBuilderImpl = valueKey;
        ValueKey valueKey = sectionBuilderImpl.key.child(trackedValue.key());
        sectionBuilderImpl.values.put(valueKey, ((TrackedValueImpl)trackedValue).setKey(valueKey));
        return sectionBuilderImpl;
    }

    public void build(Trie$Node object) {
        ((Trie$Node)((Object)object)).setValue(new SectionTreeNode((Trie$Node)((Object)object), this.buildMetadata()));
        for (Map.Entry entry : this.values.entrySet()) {
            this.builder.values.put((Iterable)entry.getKey(), (ValueTreeNode)entry.getValue());
        }
    }

    public Config.SectionBuilder section(String object, Consumer object2) {
        SectionBuilderImpl sectionBuilderImpl;
        SectionBuilderImpl sectionBuilderImpl2 = this;
        Consumer consumer = object2;
        object = this.key.child((String)object);
        object2 = sectionBuilderImpl;
        consumer.accept(new SectionBuilderImpl((ValueKey)object, this.builder));
        sectionBuilderImpl2.builder.values.put((Iterable)object, (SectionBuilderImpl)object2);
        return sectionBuilderImpl2;
    }

    public Map buildMetadata() {
        LinkedHashMap linkedHashMap;
        SectionBuilderImpl sectionBuilderImpl = linkedHashMap2;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : sectionBuilderImpl.metadata.entrySet()) {
            linkedHashMap2.put((MetadataType)entry.getKey(), ((MetadataType.Builder)entry.getValue()).build());
        }
        return linkedHashMap2;
    }
}

