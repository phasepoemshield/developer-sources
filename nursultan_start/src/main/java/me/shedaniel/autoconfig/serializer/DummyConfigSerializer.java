/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.serializer;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.ConfigSerializer;
import me.shedaniel.autoconfig.util.Utils;

public class DummyConfigSerializer<T extends ConfigData>
implements ConfigSerializer<T> {
    private final Class<T> configClass;

    @Override
    public T deserialize() {
        return this.createDefault();
    }

    public DummyConfigSerializer(Config config, Class<T> clazz) {
        this.configClass = clazz;
    }

    @Override
    public void serialize(T t) {
    }

    @Override
    public T createDefault() {
        return (T)((ConfigData)Utils.constructUnsafely(this.configClass));
    }
}

