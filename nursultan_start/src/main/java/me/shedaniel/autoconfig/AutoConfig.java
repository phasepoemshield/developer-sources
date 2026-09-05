/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 */
package me.shedaniel.autoconfig;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import me.shedaniel.autoconfig.AutoConfigClient;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.ConfigManager;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.gui.registry.GuiRegistry;
import me.shedaniel.autoconfig.serializer.ConfigSerializer;
import me.shedaniel.autoconfig.serializer.ConfigSerializer$Factory;
import minecraft.class05096;

public class AutoConfig {
    public static final String MOD_ID = "autoconfig1u";
    private static final Map<Class<? extends ConfigData>, ConfigHolder<?>> holders = new HashMap();

    private AutoConfig() {
    }

    public static <T extends ConfigData> ConfigHolder<T> register(Class<T> clazz, ConfigSerializer$Factory<T> configSerializer$Factory) {
        Objects.requireNonNull(clazz);
        Objects.requireNonNull(configSerializer$Factory);
        if (holders.containsKey(clazz)) {
            throw new RuntimeException(String.format("Config '%s' already registered", clazz));
        }
        Config config = clazz.getAnnotation(Config.class);
        if (config == null) {
            throw new RuntimeException(String.format("No @Config annotation on %s!", clazz));
        }
        ConfigSerializer<T> configSerializer = configSerializer$Factory.create(config, clazz);
        ConfigManager<T> configManager = new ConfigManager<T>(config, clazz, configSerializer);
        holders.put(clazz, configManager);
        return configManager;
    }

    @Deprecated(forRemoval=true)
    public static <T extends ConfigData> GuiRegistry getGuiRegistry(Class<T> clazz) {
        return AutoConfigClient.getGuiRegistry(clazz);
    }

    @Deprecated(forRemoval=true)
    public static <T extends ConfigData> Supplier<class05096> getConfigScreen(Class<T> clazz, class05096 class050962) {
        return AutoConfigClient.getConfigScreen(clazz, class050962);
    }

    public static <T extends ConfigData> ConfigHolder<T> getConfigHolder(Class<T> clazz) {
        Objects.requireNonNull(clazz);
        if (holders.containsKey(clazz)) {
            return holders.get(clazz);
        }
        throw new RuntimeException(String.format("Config '%s' has not been registered", clazz));
    }
}

