/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Config
 *  org.quiltmc.config.api.exceptions.ConfigCreationException
 */
package org.quiltmc.config.impl.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.exceptions.ConfigCreationException;
import org.quiltmc.config.impl.util.ConfigsImpl$AllConfigsIterator;
import org.quiltmc.config.impl.util.ImmutableIterable;

public final class ConfigsImpl {
    private static final Map CONFIGS = new TreeMap();

    static /* synthetic */ Map access$100() {
        return CONFIGS;
    }

    public static Iterable getAll() {
        return ConfigsImpl::itr;
    }

    private ConfigsImpl() {
    }

    public static void put(String string2, Config config) {
        Map map = CONFIGS;
        if (map.containsKey(string2) && ((Map)map.get(string2)).containsKey(config.id())) {
            throw new ConfigCreationException("Config '" + string2 + ':' + config.id() + "' already exists");
        }
        ((Map)map.computeIfAbsent(string2, string -> new TreeMap())).put(config.id(), config);
    }

    public static void removeAll() {
        CONFIGS.clear();
    }

    private static Iterator itr() {
        return new ConfigsImpl$AllConfigsIterator(null);
    }

    public static Config getConfig(String string, String string2) {
        return (Config)CONFIGS.getOrDefault(string, Collections.emptyMap()).get(string2);
    }

    public static Iterable getConfigs(String string) {
        return new ImmutableIterable(CONFIGS.getOrDefault(string, Collections.emptyMap()).values());
    }
}

