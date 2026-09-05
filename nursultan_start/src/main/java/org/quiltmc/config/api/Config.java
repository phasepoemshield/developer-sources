/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.ValueTreeNode
 *  org.quiltmc.config.impl.ConfigImpl
 *  org.quiltmc.config.implementor_api.ConfigEnvironment
 */
package org.quiltmc.config.api;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.quiltmc.config.api.Config$Creator;
import org.quiltmc.config.api.Config$UpdateCallback;
import org.quiltmc.config.api.ConfigEnvironment;
import org.quiltmc.config.api.WrappedConfig;
import org.quiltmc.config.api.metadata.MetadataContainer;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.ConfigImpl;

public interface Config
extends MetadataContainer {
    public static WrappedConfig create(ConfigEnvironment object, String object2, String string, Path path, Class clazz) {
        ConfigEnvironment configEnvironment = object;
        String string2 = object2;
        object = config$Builder -> {};
        object2 = config$Builder -> {};
        return Config.create(configEnvironment, string2, string, path, (Config$Creator)object, clazz, (Config$Creator)object2);
    }

    public static WrappedConfig create(ConfigEnvironment configEnvironment, String string, String string2, Config$Creator config$Creator, Class clazz, Config$Creator config$Creator2) {
        return Config.create(configEnvironment, string, string2, Paths.get("", new String[0]), config$Creator, clazz, config$Creator2);
    }

    public static WrappedConfig create(ConfigEnvironment object, String string, String string2, Config$Creator config$Creator, Class clazz) {
        ConfigEnvironment configEnvironment = object;
        object = config$Builder -> {};
        return Config.create(configEnvironment, string, string2, Paths.get("", new String[0]), config$Creator, clazz, (Config$Creator)object);
    }

    public static WrappedConfig create(ConfigEnvironment object, String string, String string2, Class clazz, Config$Creator config$Creator) {
        ConfigEnvironment configEnvironment = object;
        object = config$Builder -> {};
        return Config.create(configEnvironment, string, string2, Paths.get("", new String[0]), (Config$Creator)object, clazz, config$Creator);
    }

    public static WrappedConfig create(ConfigEnvironment object, String object2, String string, Class clazz) {
        ConfigEnvironment configEnvironment = object;
        String string2 = object2;
        object = config$Builder -> {};
        object2 = config$Builder -> {};
        return Config.create(configEnvironment, string2, string, Paths.get("", new String[0]), (Config$Creator)object, clazz, (Config$Creator)object2);
    }

    public static Config create(ConfigEnvironment configEnvironment, String string, String string2, Path path, Config$Creator ... config$CreatorArray) {
        return ConfigImpl.create((org.quiltmc.config.implementor_api.ConfigEnvironment)configEnvironment, (String)string, (String)string2, (Path)path, (Config$Creator[])config$CreatorArray);
    }

    public static Config create(ConfigEnvironment configEnvironment, String string, String string2, Config$Creator ... config$CreatorArray) {
        return Config.create(configEnvironment, string, string2, Paths.get("", new String[0]), config$CreatorArray);
    }

    public static WrappedConfig create(ConfigEnvironment configEnvironment, String string, String string2, Path path, Config$Creator config$Creator, Class clazz, Config$Creator config$Creator2) {
        return ConfigImpl.create((org.quiltmc.config.implementor_api.ConfigEnvironment)configEnvironment, (String)string, (String)string2, (Path)path, (Config$Creator)config$Creator, (Class)clazz, (Config$Creator)config$Creator2);
    }

    public static WrappedConfig create(ConfigEnvironment object, String string, String string2, Path path, Config$Creator config$Creator, Class clazz) {
        ConfigEnvironment configEnvironment = object;
        object = config$Builder -> {};
        return Config.create(configEnvironment, string, string2, path, config$Creator, clazz, (Config$Creator)object);
    }

    public static WrappedConfig create(ConfigEnvironment object, String string, String string2, Path path, Class clazz, Config$Creator config$Creator) {
        ConfigEnvironment configEnvironment = object;
        object = config$Builder -> {};
        return Config.create(configEnvironment, string, string2, path, (Config$Creator)object, clazz, config$Creator);
    }

    public Iterable nodes();

    public String family();

    @Override
    public Object metadata(MetadataType var1);

    public Iterable values();

    public TrackedValue getValue(Iterable var1);

    public String id();

    public void save();

    public ValueTreeNode getNode(Iterable var1);

    public Path savePath();

    @Override
    public boolean hasMetadata(MetadataType var1);

    public void registerCallback(Config$UpdateCallback var1);
}

