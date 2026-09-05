/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.api;

import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.ConfigSerializer$LoadResult;
import dev.isxander.yacl3.config.v2.api.FieldAccess;
import java.util.Map;

public abstract class ConfigSerializer<T> {
    protected final ConfigClassHandler<T> config;

    public ConfigSerializer(ConfigClassHandler<T> configClassHandler) {
        this.config = configClassHandler;
    }

    @Deprecated
    public void load() {
        throw new IllegalArgumentException("load() is deprecated, use loadSafely() instead.");
    }

    public abstract void save();

    public ConfigSerializer$LoadResult loadSafely(Map<ConfigField<?>, FieldAccess<?>> map) {
        this.load();
        return ConfigSerializer$LoadResult.NO_CHANGE;
    }
}

