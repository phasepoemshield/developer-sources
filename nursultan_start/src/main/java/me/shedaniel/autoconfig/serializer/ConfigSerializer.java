/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.serializer;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.serializer.ConfigSerializer$SerializationException;

public interface ConfigSerializer<T extends ConfigData> {
    public T deserialize() throws ConfigSerializer$SerializationException;

    public void serialize(T var1) throws ConfigSerializer$SerializationException;

    public T createDefault();
}

