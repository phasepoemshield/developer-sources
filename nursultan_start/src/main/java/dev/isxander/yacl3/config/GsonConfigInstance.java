/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.ExclusionStrategy
 *  com.google.gson.FieldNamingPolicy
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  dev.isxander.yacl3.impl.utils.YACLConstants
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
import dev.isxander.yacl3.config.ConfigInstance;
import dev.isxander.yacl3.config.GsonConfigInstance$Builder;
import dev.isxander.yacl3.config.GsonConfigInstance$ColorTypeAdapter;
import dev.isxander.yacl3.config.GsonConfigInstance$ConfigExclusionStrategy;
import dev.isxander.yacl3.config.GsonConfigInstance$ItemTypeAdapter;
import dev.isxander.yacl3.config.util.CodecSerializerAdapter;
import dev.isxander.yacl3.config.v2.impl.serializer.GsonConfigSerializer$StyleTypeAdapter;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.function.UnaryOperator;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class03748;
import minecraft.class06581;

@Deprecated
public class GsonConfigInstance<T>
extends ConfigInstance<T> {
    private final Gson gson;
    private final Path path;

    GsonConfigInstance(Class<T> clazz, Path path, Gson gson, boolean bl) {
        super(clazz);
        this.path = path;
        this.gson = gson;
    }

    @Deprecated
    public GsonConfigInstance(Class<T> clazz, Path path, GsonBuilder gsonBuilder) {
        super(clazz);
        this.path = path;
        this.gson = gsonBuilder.setExclusionStrategies(new ExclusionStrategy[]{new GsonConfigInstance$ConfigExclusionStrategy()}).registerTypeHierarchyAdapter(class00392.class, new CodecSerializerAdapter(class03748.N)).registerTypeHierarchyAdapter(class00405.class, (Object)new GsonConfigSerializer$StyleTypeAdapter()).registerTypeHierarchyAdapter(Color.class, (Object)new GsonConfigInstance$ColorTypeAdapter()).registerTypeHierarchyAdapter(class06581.class, (Object)new GsonConfigInstance$ItemTypeAdapter()).serializeNulls().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    }

    @Deprecated
    public GsonConfigInstance(Class<T> clazz, Path path, UnaryOperator<GsonBuilder> unaryOperator) {
        this(clazz, path, (GsonBuilder)unaryOperator.apply(new GsonBuilder()));
    }

    @Deprecated
    public GsonConfigInstance(Class<T> clazz, Path path, Gson gson) {
        this(clazz, path, gson.newBuilder());
    }

    @Deprecated
    public GsonConfigInstance(Class<T> clazz, Path path) {
        this(clazz, path, new GsonBuilder());
    }

    @Override
    public void load() {
        try {
            if (Files.notExists(this.path, new LinkOption[0])) {
                this.save();
                return;
            }
            YACLConstants.LOGGER.info("Loading {}...", (Object)this.getConfigClass().getSimpleName());
            this.setConfig(this.gson.fromJson(Files.readString(this.path), this.getConfigClass()));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    @Override
    public void save() {
        try {
            YACLConstants.LOGGER.info("Saving {}...", (Object)this.getConfigClass().getSimpleName());
            Files.writeString(this.path, (CharSequence)this.gson.toJson(this.getConfig()), StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public Path getPath() {
        return this.path;
    }

    public static <T> GsonConfigInstance$Builder<T> createBuilder(Class<T> clazz) {
        return new GsonConfigInstance$Builder<T>(clazz);
    }
}

