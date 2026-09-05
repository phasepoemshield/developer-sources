/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.ValueTreeNode
 */
package org.quiltmc.config.api;

import java.nio.file.Path;
import java.util.Map;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.Config$UpdateCallback;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueTreeNode;

public abstract class WrappedConfig
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
    public final Object metadata(MetadataType metadataType) {
        return this.wrapped.metadata(metadataType);
    }

    @Override
    public Map metadata() {
        return this.wrapped.metadata();
    }

    @Override
    public final Iterable values() {
        return this.wrapped.values();
    }

    @Override
    public final TrackedValue getValue(Iterable iterable) {
        return this.wrapped.getValue(iterable);
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

    public final void setWrappedConfig(Config config) {
        this.wrapped = config;
    }

    @Override
    public final void registerCallback(Config$UpdateCallback config$UpdateCallback) {
        this.wrapped.registerCallback(config$UpdateCallback);
    }
}

