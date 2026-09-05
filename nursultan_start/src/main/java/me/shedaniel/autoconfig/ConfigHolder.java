/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig;

import java.util.function.Supplier;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.event.ConfigSerializeEvent$Load;
import me.shedaniel.autoconfig.event.ConfigSerializeEvent$Save;

public interface ConfigHolder<T extends ConfigData>
extends Supplier<T> {
    @Override
    default public T get() {
        return this.getConfig();
    }

    public boolean load();

    public void save();

    public T getConfig();

    public void registerSaveListener(ConfigSerializeEvent.Save<T> var1);

    public void registerLoadListener(ConfigSerializeEvent.Load<T> var1);

    public Class<T> getConfigClass();

    public void resetToDefault();

    public void setConfig(T var1);
}

