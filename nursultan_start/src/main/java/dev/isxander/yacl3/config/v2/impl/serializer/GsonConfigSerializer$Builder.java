/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.FieldNamingPolicy
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class03748
 *  minecraft.class06581
 */
package dev.isxander.yacl3.config.v2.impl.serializer;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.isxander.yacl3.config.util.CodecSerializerAdapter;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import dev.isxander.yacl3.config.v2.impl.serializer.GsonConfigSerializer;
import dev.isxander.yacl3.config.v2.impl.serializer.GsonConfigSerializer$ColorTypeAdapter;
import dev.isxander.yacl3.config.v2.impl.serializer.GsonConfigSerializer$ItemTypeAdapter;
import dev.isxander.yacl3.config.v2.impl.serializer.GsonConfigSerializer$StyleTypeAdapter;
import java.awt.Color;
import java.nio.file.Path;
import java.util.function.UnaryOperator;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class03748;
import minecraft.class06581;

public class GsonConfigSerializer$Builder<T>
implements GsonConfigSerializerBuilder<T> {
    private final ConfigClassHandler<T> config;
    private Path path;
    private boolean json5;
    private UnaryOperator<GsonBuilder> gsonBuilder = gsonBuilder -> gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).serializeNulls().registerTypeHierarchyAdapter(class00392.class, new CodecSerializerAdapter(class03748.N)).registerTypeHierarchyAdapter(class00405.class, (Object)new GsonConfigSerializer$StyleTypeAdapter()).registerTypeHierarchyAdapter(Color.class, (Object)new GsonConfigSerializer$ColorTypeAdapter()).registerTypeHierarchyAdapter(class06581.class, (Object)new GsonConfigSerializer$ItemTypeAdapter()).setPrettyPrinting();

    @Override
    public GsonConfigSerializer$Builder<T> appendGsonBuilder(UnaryOperator<GsonBuilder> unaryOperator) {
        UnaryOperator<GsonBuilder> unaryOperator2 = this.gsonBuilder;
        this.gsonBuilder = gsonBuilder -> (GsonBuilder)unaryOperator.apply((GsonBuilder)unaryOperator2.apply((GsonBuilder)gsonBuilder));
        return this;
    }

    public GsonConfigSerializer$Builder(ConfigClassHandler<T> configClassHandler) {
        this.config = configClassHandler;
    }

    @Override
    public GsonConfigSerializer<T> build() {
        return new GsonConfigSerializer<T>(this.config, this.path, ((GsonBuilder)this.gsonBuilder.apply(new GsonBuilder())).create(), this.json5);
    }

    @Override
    public GsonConfigSerializer$Builder<T> setJson5(boolean bl) {
        this.json5 = bl;
        return this;
    }

    @Override
    public GsonConfigSerializer$Builder<T> setPath(Path path) {
        this.path = path;
        return this;
    }

    @Override
    public GsonConfigSerializer$Builder<T> overrideGsonBuilder(GsonBuilder gsonBuilder) {
        this.gsonBuilder = gsonBuilder2 -> gsonBuilder;
        return this;
    }

    @Override
    public GsonConfigSerializer$Builder<T> overrideGsonBuilder(Gson gson) {
        return this.overrideGsonBuilder(gson.newBuilder());
    }
}

