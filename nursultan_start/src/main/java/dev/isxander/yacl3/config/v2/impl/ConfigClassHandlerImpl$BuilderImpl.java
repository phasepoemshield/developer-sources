/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.config.v2.impl;

import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler$Builder;
import dev.isxander.yacl3.config.v2.api.ConfigSerializer;
import dev.isxander.yacl3.config.v2.impl.ConfigClassHandlerImpl;
import java.util.function.Function;
import minecraft.class01894;
import org.apache.commons.lang3.Validate;

public class ConfigClassHandlerImpl$BuilderImpl<T>
implements ConfigClassHandler$Builder<T> {
    private final Class<T> configClass;
    private class01894 id;
    private Function<ConfigClassHandler<T>, ConfigSerializer<T>> serializerFactory;

    @Override
    public ConfigClassHandler$Builder<T> serializer(Function<ConfigClassHandler<T>, ConfigSerializer<T>> function) {
        this.serializerFactory = function;
        return this;
    }

    public ConfigClassHandlerImpl$BuilderImpl(Class<T> clazz) {
        this.configClass = clazz;
    }

    @Override
    public ConfigClassHandler$Builder<T> id(class01894 class018942) {
        this.id = class018942;
        return this;
    }

    @Override
    public ConfigClassHandler<T> build() {
        Validate.notNull(this.serializerFactory, (String)"serializerFactory must not be null", (Object[])new Object[0]);
        Validate.notNull(this.configClass, (String)"configClass must not be null", (Object[])new Object[0]);
        return new ConfigClassHandlerImpl<T>(this.configClass, this.id, this.serializerFactory);
    }
}

