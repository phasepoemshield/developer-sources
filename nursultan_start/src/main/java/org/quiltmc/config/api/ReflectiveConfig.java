/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.ValueList
 *  org.quiltmc.config.api.values.ValueMap$TrackedBuilder
 *  org.quiltmc.config.api.values.ValueTreeNode
 *  org.quiltmc.config.impl.builders.ValueMapBuilderImpl$TrackedValueMapBuilderImpl
 *  org.quiltmc.config.impl.tree.TrackedValueImpl
 *  org.quiltmc.config.impl.util.ConfigUtils
 */
package org.quiltmc.config.api;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.Config$UpdateCallback;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueList;
import org.quiltmc.config.api.values.ValueMap;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.builders.ValueMapBuilderImpl;
import org.quiltmc.config.impl.tree.TrackedValueImpl;
import org.quiltmc.config.impl.util.ConfigUtils;

public abstract class ReflectiveConfig
implements Config {
    private Config wrapped;

    @Override
    public final Iterable nodes() {
        return this.wrapped.nodes();
    }

    @Override
    public final String family() {
        return this.wrapped.family();
    }

    @Override
    public Map metadata() {
        return this.wrapped.metadata();
    }

    @Override
    public final Object metadata(MetadataType metadataType) {
        return this.wrapped.metadata(metadataType);
    }

    public final TrackedValue value(Object object) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        ConfigUtils.assertValueType((Object)object);
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap = new LinkedHashMap(0);
        ArrayList arrayList3 = arrayList2;
        arrayList2 = new ArrayList(0);
        ArrayList arrayList4 = arrayList;
        arrayList = new ArrayList(0);
        return new TrackedValueImpl(null, object, (Map)linkedHashMap2, arrayList3, arrayList4);
    }

    @Override
    public final Iterable values() {
        return this.wrapped.values();
    }

    @Override
    public final TrackedValue getValue(Iterable iterable) {
        return this.wrapped.getValue(iterable);
    }

    public final ValueMap.TrackedBuilder map(Object object) {
        return new ValueMapBuilderImpl.TrackedValueMapBuilderImpl(object, this::value);
    }

    public final TrackedValue list(Object object, Object ... objectArray) {
        return this.value(ValueList.create((Object)object, (Object[])objectArray));
    }

    @Override
    public final String id() {
        return this.wrapped.id();
    }

    @Override
    public final void save() {
        this.wrapped.save();
    }

    @Override
    public final ValueTreeNode getNode(Iterable iterable) {
        return this.wrapped.getNode(iterable);
    }

    @Override
    public final Path savePath() {
        return this.wrapped.savePath();
    }

    @Override
    public final boolean hasMetadata(MetadataType metadataType) {
        return this.wrapped.hasMetadata(metadataType);
    }

    final void setWrappedConfig(Config config) {
        this.wrapped = config;
    }

    @Override
    public final void registerCallback(Config$UpdateCallback config$UpdateCallback) {
        this.wrapped.registerCallback(config$UpdateCallback);
    }
}

