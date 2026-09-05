/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Config
 *  org.quiltmc.config.api.Config$Builder
 *  org.quiltmc.config.api.Config$Creator
 *  org.quiltmc.config.api.Config$UpdateCallback
 *  org.quiltmc.config.api.InternalsHelper
 *  org.quiltmc.config.api.ReflectiveConfig
 *  org.quiltmc.config.api.WrappedConfig
 *  org.quiltmc.config.api.metadata.MetadataType
 *  org.quiltmc.config.api.values.TrackedValue
 */
package org.quiltmc.config.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.InternalsHelper;
import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.api.WrappedConfig;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.AbstractMetadataContainer;
import org.quiltmc.config.impl.ConfigImpl$1;
import org.quiltmc.config.impl.builders.ConfigBuilderImpl;
import org.quiltmc.config.impl.builders.ReflectiveConfigCreator;
import org.quiltmc.config.impl.builders.WrappedConfigCreator;
import org.quiltmc.config.impl.tree.Trie;
import org.quiltmc.config.impl.util.ImmutableIterable;
import org.quiltmc.config.implementor_api.ConfigEnvironment;

public final class ConfigImpl
extends AbstractMetadataContainer
implements Config {
    private final ConfigEnvironment environment;
    private final String family;
    private final String id;
    private final Path path;
    private final List callbacks;
    private final Trie values;
    private final String defaultFileType;

    public static WrappedConfig create(ConfigEnvironment object, String config, String string, Path path, Config.Creator creator, Class clazz, Config.Creator creator2) {
        ConfigEnvironment configEnvironment = object;
        Config config2 = config;
        object = WrappedConfigCreator.of(clazz);
        Config config3 = new Config.Creator[3];
        config = config3;
        config3[0] = creator;
        config3[1] = object;
        config3[2] = creator2;
        config = ConfigImpl.create(configEnvironment, (String)config2, string, path, (Config.Creator[])config);
        WrappedConfig wrappedConfig = (WrappedConfig)((WrappedConfigCreator)object).getInstance();
        wrappedConfig.setWrappedConfig(config);
        return wrappedConfig;
    }

    public static Config create(ConfigEnvironment configEnvironment, String string, String string2, Config.Creator ... creatorArray) {
        return ConfigImpl.create(configEnvironment, string, string2, Paths.get("", new String[0]), creatorArray);
    }

    public static Config create(ConfigEnvironment configEnvironment, String string, String string2, Path path, Config.Creator ... creatorArray) {
        ConfigBuilderImpl configBuilderImpl;
        ConfigBuilderImpl configBuilderImpl2 = configBuilderImpl;
        configBuilderImpl = new ConfigBuilderImpl(configEnvironment, string, string2, path);
        int n = creatorArray.length;
        for (int i = 0; i < n; ++i) {
            creatorArray[i].create((Config.Builder)configBuilderImpl2);
        }
        return configBuilderImpl2.build();
    }

    public Iterable nodes() {
        return new ImmutableIterable(this.values.nodes());
    }

    public String family() {
        return this.family;
    }

    static /* synthetic */ Trie access$000(ConfigImpl configImpl) {
        return configImpl.values;
    }

    /*
     * WARNING - void declaration
     */
    public ConfigImpl(ConfigEnvironment object, String iterator, Path object22, Map map, String string, List list, Trie trie, String string2) {
        super((Map)var4_7);
        void var8_11;
        LinkedHashMap linkedHashMap;
        void var7_10;
        void var6_9;
        void var5_8;
        void var4_7;
        this.environment = object;
        this.family = var5_8;
        this.id = iterator;
        this.path = object22;
        this.callbacks = var6_9;
        this.values = var7_10;
        object = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : var4_7.entrySet()) {
            if (!((MetadataType)entry.getKey()).isInherited()) continue;
            Map.Entry entry2 = entry;
            MetadataType metadataType = (MetadataType)entry2.getKey();
            object.put(metadataType, entry2.getValue());
        }
        iterator = this.values.nodes().iterator();
        while (iterator.hasNext()) {
            ((ValueTreeNode)iterator.next()).propagateInheritedMetadata((Map)object);
        }
        this.defaultFileType = var8_11;
    }

    public Iterable values() {
        return new ConfigImpl$1(this);
    }

    public TrackedValue getValue(Iterable iterable) {
        return this.values.get(iterable);
    }

    public String id() {
        return this.id;
    }

    public void save() {
        ConfigImpl configImpl = this;
        Path path = configImpl.getPath();
        Files.createDirectories(path.getParent(), new FileAttribute[0]);
        try {
            configImpl.environment.getSerializer(this.defaultFileType).serialize((Config)this, Files.newOutputStream(path, new OpenOption[0]));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private Path getPath() {
        return this.environment.getSaveDir().resolve(this.family).resolve(this.path).resolve(this.id + "." + this.environment.getSerializer(this.defaultFileType).getFileExtension());
    }

    public ValueTreeNode getNode(Iterable iterable) {
        return this.values.getNode(iterable);
    }

    public Path savePath() {
        return this.path;
    }

    public ConfigEnvironment getEnvironment() {
        return this.environment;
    }

    public void invokeCallbacks() {
        Iterator iterator = this.callbacks.iterator();
        while (iterator.hasNext()) {
            ((Config.UpdateCallback)iterator.next()).onUpdate((Config)this);
        }
    }

    public String getDefaultFileType() {
        return this.defaultFileType;
    }

    public static ReflectiveConfig createReflective(ConfigEnvironment object, String config, String string, Path path, Config.Creator creator, Class clazz, Config.Creator creator2) {
        ConfigEnvironment configEnvironment = object;
        Config config2 = config;
        object = ReflectiveConfigCreator.of(clazz);
        Config config3 = new Config.Creator[3];
        config = config3;
        config3[0] = creator;
        config3[1] = object;
        config3[2] = creator2;
        config = ConfigImpl.create(configEnvironment, (String)config2, string, path, (Config.Creator[])config);
        ReflectiveConfig reflectiveConfig = (ReflectiveConfig)((ReflectiveConfigCreator)object).getInstance();
        InternalsHelper.setWrappedConfig((ReflectiveConfig)reflectiveConfig, (Config)config);
        return reflectiveConfig;
    }

    public void registerCallback(Config.UpdateCallback updateCallback) {
        this.callbacks.add(updateCallback);
    }
}

