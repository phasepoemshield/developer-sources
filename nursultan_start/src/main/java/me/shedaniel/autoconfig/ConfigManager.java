/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07082
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package me.shedaniel.autoconfig;

import java.util.ArrayList;
import java.util.List;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.ConfigData$ValidationException;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.event.ConfigSerializeEvent$Load;
import me.shedaniel.autoconfig.event.ConfigSerializeEvent$Save;
import me.shedaniel.autoconfig.serializer.ConfigSerializer;
import me.shedaniel.autoconfig.serializer.ConfigSerializer$SerializationException;
import minecraft.class07082;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigManager<T extends ConfigData>
implements ConfigHolder<T> {
    private final Logger logger;
    private final Config definition;
    private final Class<T> configClass;
    private final ConfigSerializer<T> serializer;
    private final List<ConfigSerializeEvent$Save<T>> saveEvent = new ArrayList<ConfigSerializeEvent$Save<T>>();
    private final List<ConfigSerializeEvent$Load<T>> loadEvent = new ArrayList<ConfigSerializeEvent$Load<T>>();
    private T config;

    public Config getDefinition() {
        return this.definition;
    }

    ConfigManager(Config config, Class<T> clazz, ConfigSerializer<T> configSerializer) {
        this.logger = LogManager.getLogger();
        this.definition = config;
        this.configClass = clazz;
        this.serializer = configSerializer;
        if (this.load()) {
            this.save();
        }
    }

    @Override
    public boolean load() {
        try {
            T t = this.serializer.deserialize();
            for (ConfigSerializeEvent$Load<T> configSerializeEvent$Load : this.loadEvent) {
                class07082 class070822 = configSerializeEvent$Load.onLoad(this, t);
                if (class070822 == class07082.u) {
                    this.config = this.serializer.createDefault();
                    this.config.validatePostLoad();
                    return false;
                }
                if (class070822 == class07082.i) continue;
                break;
            }
            this.config = t;
            this.config.validatePostLoad();
            return true;
        }
        catch (ConfigData$ValidationException | ConfigSerializer$SerializationException exception) {
            this.logger.error("Failed to load config '{}', using default!", this.configClass, (Object)exception);
            this.resetToDefault();
            return false;
        }
    }

    @Override
    public void save() {
        for (ConfigSerializeEvent$Save<T> configSerializeEvent$Save : this.saveEvent) {
            class07082 class070822 = configSerializeEvent$Save.onSave(this, this.config);
            if (class070822 == class07082.u) {
                return;
            }
            if (class070822 == class07082.i) continue;
            break;
        }
        try {
            this.serializer.serialize(this.config);
        }
        catch (ConfigSerializer$SerializationException configSerializer$SerializationException) {
            this.logger.error("Failed to save config '{}'", this.configClass, (Object)configSerializer$SerializationException);
        }
    }

    public ConfigSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override
    public T getConfig() {
        return this.config;
    }

    @Override
    public void registerSaveListener(ConfigSerializeEvent$Save<T> configSerializeEvent$Save) {
        this.saveEvent.add(configSerializeEvent$Save);
    }

    @Override
    public void registerLoadListener(ConfigSerializeEvent$Load<T> configSerializeEvent$Load) {
        this.loadEvent.add(configSerializeEvent$Load);
    }

    @Override
    public Class<T> getConfigClass() {
        return this.configClass;
    }

    @Override
    public void resetToDefault() {
        this.config = this.serializer.createDefault();
        try {
            this.config.validatePostLoad();
        }
        catch (ConfigData$ValidationException configData$ValidationException) {
            throw new RuntimeException("result of createDefault() was invalid!", configData$ValidationException);
        }
    }

    @Override
    public void setConfig(T t) {
        this.config = t;
    }
}

