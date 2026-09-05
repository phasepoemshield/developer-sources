/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.configbuilder.entry;

import de.maxhenkel.voicechat.configbuilder.Config;

public interface ConfigEntry<T> {
    public ConfigEntry<T> reset();

    public T get();

    public T getDefault();

    public String getKey();

    public ConfigEntry<T> set(T var1);

    public ConfigEntry<T> save();

    public ConfigEntry<T> comment(String ... var1);

    public Config getConfig();

    public String[] getComments();

    public ConfigEntry<T> saveSync();
}

