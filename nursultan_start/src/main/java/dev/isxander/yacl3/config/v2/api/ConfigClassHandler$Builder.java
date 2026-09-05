/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package dev.isxander.yacl3.config.v2.api;

import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.ConfigSerializer;
import java.util.function.Function;
import minecraft.class01894;

public interface ConfigClassHandler$Builder<T> {
    public ConfigClassHandler$Builder<T> serializer(Function<ConfigClassHandler<T>, ConfigSerializer<T>> var1);

    public ConfigClassHandler$Builder<T> id(class01894 var1);

    public ConfigClassHandler<T> build();
}

