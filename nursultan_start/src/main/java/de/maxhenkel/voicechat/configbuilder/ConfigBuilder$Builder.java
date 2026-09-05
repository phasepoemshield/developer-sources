/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder;

import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.voicechat.configbuilder.ConfigBuilder;
import de.maxhenkel.voicechat.configbuilder.ConfigBuilder$1;
import de.maxhenkel.voicechat.configbuilder.ConfigBuilderImpl;
import de.maxhenkel.voicechat.configbuilder.MigratableConfig;
import de.maxhenkel.voicechat.configbuilder.MigratableConfigImpl;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ConfigBuilder$Builder<C> {
    @Nonnull
    private final Function<ConfigBuilder, C> builderConsumer;
    @Nullable
    private Path path;
    private final Map<Class<?>, ValueSerializer<?>> valueSerializers;
    private boolean removeUnused;
    private boolean strict;
    private boolean keepOrder;
    private boolean saveAfterBuild;
    private boolean saveSyncAfterBuild;
    @Nullable
    private Consumer<MigratableConfig> migration;

    public ConfigBuilder$Builder<C> strict(boolean bl) {
        this.strict = bl;
        return this;
    }

    /* synthetic */ ConfigBuilder$Builder(Function function, ConfigBuilder$1 configBuilder$1) {
        this(function);
    }

    private ConfigBuilder$Builder(@Nonnull Function<ConfigBuilder, C> function) {
        this.builderConsumer = function;
        this.valueSerializers = new HashMap();
        this.removeUnused = true;
        this.strict = false;
        this.keepOrder = true;
        this.saveAfterBuild = true;
        this.saveSyncAfterBuild = false;
    }

    public ConfigBuilder$Builder<C> path(Path path) {
        this.path = path;
        return this;
    }

    public C build() {
        Object object;
        CommentedPropertyConfig commentedPropertyConfig = CommentedPropertyConfig.builder().path(this.path).strict(this.strict).build();
        if (this.migration != null && this.path != null && Files.exists(this.path, new LinkOption[0])) {
            object = new MigratableConfigImpl(commentedPropertyConfig);
            this.migration.accept((MigratableConfig)object);
            ((MigratableConfigImpl)object).freeze();
        }
        object = new ConfigBuilderImpl(commentedPropertyConfig, this.valueSerializers);
        C c = this.builderConsumer.apply((ConfigBuilder)object);
        ((ConfigBuilderImpl)object).freeze();
        if (this.removeUnused) {
            ((ConfigBuilderImpl)object).removeUnused();
        }
        if (this.keepOrder) {
            ((ConfigBuilderImpl)object).sortEntries();
        }
        if (this.saveAfterBuild) {
            ((ConfigBuilderImpl)object).config.save();
        } else if (this.saveSyncAfterBuild) {
            ((ConfigBuilderImpl)object).config.saveSync();
        }
        return c;
    }

    public ConfigBuilder$Builder<C> removeUnused(boolean bl) {
        this.removeUnused = bl;
        return this;
    }

    public ConfigBuilder$Builder<C> saveSyncAfterBuild(boolean bl) {
        this.saveSyncAfterBuild = bl;
        if (bl) {
            this.saveAfterBuild = false;
        }
        return this;
    }

    public <T> ConfigBuilder$Builder<C> addValueSerializer(Class<T> clazz, ValueSerializer<T> valueSerializer) {
        this.valueSerializers.put(clazz, valueSerializer);
        return this;
    }

    public ConfigBuilder$Builder<C> saveAfterBuild(boolean bl) {
        this.saveAfterBuild = bl;
        if (bl) {
            this.saveSyncAfterBuild = false;
        }
        return this;
    }

    public ConfigBuilder$Builder<C> migration(Consumer<MigratableConfig> consumer) {
        this.migration = consumer;
        return this;
    }

    public ConfigBuilder$Builder<C> keepOrder(boolean bl) {
        this.keepOrder = bl;
        return this;
    }
}

