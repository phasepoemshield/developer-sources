/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.ExclusionStrategy
 *  com.google.gson.FieldNamingPolicy
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class03748
 *  minecraft.class06581
 */
package dev.isxander.yacl3.config;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.isxander.yacl3.config.GsonConfigInstance;
import dev.isxander.yacl3.config.GsonConfigInstance$ColorTypeAdapter;
import dev.isxander.yacl3.config.GsonConfigInstance$ConfigExclusionStrategy;
import dev.isxander.yacl3.config.GsonConfigInstance$ItemTypeAdapter;
import dev.isxander.yacl3.config.util.CodecSerializerAdapter;
import dev.isxander.yacl3.config.v2.impl.serializer.GsonConfigSerializer$StyleTypeAdapter;
import java.awt.Color;
import java.nio.file.Path;
import java.util.function.UnaryOperator;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class03748;
import minecraft.class06581;

public class GsonConfigInstance$Builder<T> {
    private final Class<T> configClass;
    private Path path;
    private UnaryOperator<GsonBuilder> gsonBuilder = gsonBuilder -> gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).serializeNulls().registerTypeHierarchyAdapter(class00392.class, new CodecSerializerAdapter(class03748.N)).registerTypeHierarchyAdapter(class00405.class, (Object)new GsonConfigSerializer$StyleTypeAdapter()).registerTypeHierarchyAdapter(Color.class, (Object)new GsonConfigInstance$ColorTypeAdapter()).registerTypeHierarchyAdapter(class06581.class, (Object)new GsonConfigInstance$ItemTypeAdapter());

    public GsonConfigInstance$Builder<T> appendGsonBuilder(UnaryOperator<GsonBuilder> unaryOperator) {
        UnaryOperator<GsonBuilder> unaryOperator2 = this.gsonBuilder;
        this.gsonBuilder = gsonBuilder -> (GsonBuilder)unaryOperator.apply((GsonBuilder)unaryOperator2.apply((GsonBuilder)gsonBuilder));
        return this;
    }

    GsonConfigInstance$Builder(Class<T> clazz) {
        this.configClass = clazz;
    }

    public GsonConfigInstance<T> build() {
        UnaryOperator unaryOperator = gsonBuilder -> ((GsonBuilder)this.gsonBuilder.apply((GsonBuilder)gsonBuilder)).addSerializationExclusionStrategy((ExclusionStrategy)new GsonConfigInstance$ConfigExclusionStrategy()).addDeserializationExclusionStrategy((ExclusionStrategy)new GsonConfigInstance$ConfigExclusionStrategy());
        return new GsonConfigInstance<T>(this.configClass, this.path, ((GsonBuilder)unaryOperator.apply(new GsonBuilder())).create(), true);
    }

    public GsonConfigInstance$Builder<T> setPath(Path path) {
        this.path = path;
        return this;
    }

    public GsonConfigInstance$Builder<T> overrideGsonBuilder(Gson gson) {
        return this.overrideGsonBuilder(gson.newBuilder());
    }

    public GsonConfigInstance$Builder<T> overrideGsonBuilder(GsonBuilder gsonBuilder) {
        this.gsonBuilder = gsonBuilder2 -> gsonBuilder;
        return this;
    }
}

