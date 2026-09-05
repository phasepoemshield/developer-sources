/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Config
 *  org.quiltmc.config.api.Config$Creator
 *  org.quiltmc.config.api.ReflectiveConfig
 */
package org.quiltmc.config.implementor_api;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.impl.ConfigImpl;
import org.quiltmc.config.implementor_api.ConfigEnvironment;

public final class ConfigFactory {
    public static ReflectiveConfig create(ConfigEnvironment configEnvironment, String string, String string2, Path path, Class clazz, Config.Creator creator) {
        ConfigEnvironment configEnvironment2 = configEnvironment;
        configEnvironment = builder -> {};
        return ConfigFactory.create(configEnvironment2, string, string2, path, (Config.Creator)configEnvironment, clazz, creator);
    }

    public static ReflectiveConfig create(ConfigEnvironment configEnvironment, String string, String string2, Path path, Class clazz) {
        ConfigEnvironment configEnvironment2 = configEnvironment;
        String string3 = string;
        configEnvironment = builder -> {};
        string = builder -> {};
        return ConfigFactory.create(configEnvironment2, string3, string2, path, (Config.Creator)configEnvironment, clazz, (Config.Creator)string);
    }

    public static ReflectiveConfig create(ConfigEnvironment configEnvironment, String string, String string2, Config.Creator creator, Class clazz, Config.Creator creator2) {
        return ConfigFactory.create(configEnvironment, string, string2, Paths.get("", new String[0]), creator, clazz, creator2);
    }

    public static ReflectiveConfig create(ConfigEnvironment configEnvironment, String string, String string2, Config.Creator creator, Class clazz) {
        ConfigEnvironment configEnvironment2 = configEnvironment;
        configEnvironment = builder -> {};
        return ConfigFactory.create(configEnvironment2, string, string2, Paths.get("", new String[0]), creator, clazz, (Config.Creator)configEnvironment);
    }

    public static ReflectiveConfig create(ConfigEnvironment configEnvironment, String string, String string2, Class clazz) {
        ConfigEnvironment configEnvironment2 = configEnvironment;
        String string3 = string;
        configEnvironment = builder -> {};
        string = builder -> {};
        return ConfigFactory.create(configEnvironment2, string3, string2, Paths.get("", new String[0]), (Config.Creator)configEnvironment, clazz, (Config.Creator)string);
    }

    public static ReflectiveConfig create(ConfigEnvironment configEnvironment, String string, String string2, Class clazz, Config.Creator creator) {
        ConfigEnvironment configEnvironment2 = configEnvironment;
        configEnvironment = builder -> {};
        return ConfigFactory.create(configEnvironment2, string, string2, Paths.get("", new String[0]), (Config.Creator)configEnvironment, clazz, creator);
    }

    public static Config create(ConfigEnvironment configEnvironment, String string, String string2, Path path, Config.Creator ... creatorArray) {
        return ConfigImpl.create(configEnvironment, string, string2, path, creatorArray);
    }

    public static Config create(ConfigEnvironment configEnvironment, String string, String string2, Config.Creator ... creatorArray) {
        return ConfigFactory.create(configEnvironment, string, string2, Paths.get("", new String[0]), creatorArray);
    }

    public static ReflectiveConfig create(ConfigEnvironment configEnvironment, String string, String string2, Path path, Config.Creator creator, Class clazz, Config.Creator creator2) {
        return ConfigImpl.createReflective(configEnvironment, string, string2, path, creator, clazz, creator2);
    }

    public static ReflectiveConfig create(ConfigEnvironment configEnvironment, String string, String string2, Path path, Config.Creator creator, Class clazz) {
        ConfigEnvironment configEnvironment2 = configEnvironment;
        configEnvironment = builder -> {};
        return ConfigFactory.create(configEnvironment2, string, string2, path, creator, clazz, (Config.Creator)configEnvironment);
    }

    private ConfigFactory() {
    }
}

