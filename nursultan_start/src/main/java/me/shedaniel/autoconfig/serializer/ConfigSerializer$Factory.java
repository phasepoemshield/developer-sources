/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.serializer;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.ConfigSerializer;

@FunctionalInterface
public interface ConfigSerializer$Factory<T extends ConfigData> {
    public ConfigSerializer<T> create(Config var1, Class<T> var2);
}

