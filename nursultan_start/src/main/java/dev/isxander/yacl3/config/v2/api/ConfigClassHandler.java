/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.YetAnotherConfigLib
 *  minecraft.class01894
 */
package dev.isxander.yacl3.config.v2.api;

import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler$Builder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.ConfigSerializer;
import dev.isxander.yacl3.config.v2.impl.ConfigClassHandlerImpl$BuilderImpl;
import minecraft.class01894;

public interface ConfigClassHandler<T> {
    @Deprecated
    public ConfigSerializer<T> serializer();

    public boolean load();

    public ConfigField<?>[] fields();

    public class01894 id();

    public T defaults();

    public void save();

    public T instance();

    public boolean supportsAutoGen();

    public YetAnotherConfigLib generateGui();

    public static <T> ConfigClassHandler$Builder<T> createBuilder(Class<T> clazz) {
        return new ConfigClassHandlerImpl$BuilderImpl<T>(clazz);
    }

    public Class<T> configClass();
}

