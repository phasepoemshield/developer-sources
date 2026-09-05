/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config;

import java.lang.reflect.InvocationTargetException;

@Deprecated
public abstract class ConfigInstance<T> {
    private final Class<T> configClass;
    private final T defaultInstance;
    private T instance;

    public ConfigInstance(Class<T> clazz) {
        this.configClass = clazz;
        try {
            this.instance = clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
            this.defaultInstance = this.instance;
        }
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            throw new IllegalStateException(String.format("Could not create default instance of config for %s. Make sure there is a default constructor!", this.configClass.getSimpleName()));
        }
    }

    public abstract void load();

    public abstract void save();

    public T getDefaults() {
        return this.defaultInstance;
    }

    public T getConfig() {
        return this.instance;
    }

    public Class<T> getConfigClass() {
        return this.configClass;
    }

    protected void setConfig(T t) {
        this.instance = t;
    }
}

