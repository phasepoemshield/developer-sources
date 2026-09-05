/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.configuration.Config
 *  com.viaversion.viaversion.api.configuration.ConfigurationProvider
 */
package com.viaversion.viaversion.configuration;

import com.viaversion.viaversion.api.configuration.Config;
import com.viaversion.viaversion.api.configuration.ConfigurationProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConfigurationProviderImpl
implements ConfigurationProvider {
    private final List<Config> configs = new ArrayList<Config>();

    public Collection<Config> configs() {
        return Collections.unmodifiableCollection(this.configs);
    }

    public void register(Config config) {
        this.configs.add(config);
    }

    public void reloadConfigs() {
        for (Config config : this.configs) {
            config.reload();
        }
    }
}

