/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package dev.isxander.yacl3.config.v3;

import com.mojang.serialization.Codec;
import dev.isxander.yacl3.config.v3.CodecConfig;
import dev.isxander.yacl3.config.v3.ConfigEntry;
import dev.isxander.yacl3.config.v3.ReadonlyConfigEntry;

public interface EntryAddable {
    public <T> ConfigEntry<T> register(String var1, T var2, Codec<T> var3);

    public <T extends CodecConfig<T>> ReadonlyConfigEntry<T> register(String var1, T var2);
}

