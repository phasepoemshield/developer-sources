/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package dev.isxander.yacl3.config.v2.api.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.ConfigSerializer;
import dev.isxander.yacl3.config.v2.impl.serializer.GsonConfigSerializer$Builder;
import java.nio.file.Path;
import java.util.function.UnaryOperator;

public interface GsonConfigSerializerBuilder<T> {
    public static <T> GsonConfigSerializerBuilder<T> create(ConfigClassHandler<T> configClassHandler) {
        return new GsonConfigSerializer$Builder<T>(configClassHandler);
    }

    public GsonConfigSerializerBuilder<T> appendGsonBuilder(UnaryOperator<GsonBuilder> var1);

    public ConfigSerializer<T> build();

    public GsonConfigSerializerBuilder<T> setJson5(boolean var1);

    public GsonConfigSerializerBuilder<T> setPath(Path var1);

    public GsonConfigSerializerBuilder<T> overrideGsonBuilder(Gson var1);

    public GsonConfigSerializerBuilder<T> overrideGsonBuilder(GsonBuilder var1);
}

