/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.config.ConfigAccessor
 *  de.maxhenkel.voicechat.configbuilder.Config
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.config;

import de.maxhenkel.voicechat.api.config.ConfigAccessor;
import de.maxhenkel.voicechat.configbuilder.Config;
import javax.annotation.Nullable;

public class ConfigAccessorImpl
implements ConfigAccessor {
    private Config config;

    public ConfigAccessorImpl(Config config) {
        this.config = config;
    }

    @Nullable
    public String getValue(String string) {
        return (String)this.config.getEntries().get(string);
    }

    public boolean hasKey(String string) {
        return this.config.getEntries().containsKey(string);
    }
}

