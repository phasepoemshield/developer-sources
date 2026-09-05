/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.configbuilder.CommentedPropertyConfig
 *  javax.annotation.Nullable
 */
package de.maxhenkel.configbuilder;

import de.maxhenkel.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.configbuilder.MigratableConfig;
import java.util.Map;
import javax.annotation.Nullable;

class MigratableConfigImpl
implements MigratableConfig {
    private final CommentedPropertyConfig config;
    private boolean frozen;

    public MigratableConfigImpl(CommentedPropertyConfig config) {
        this.config = config;
    }

    @Override
    @Nullable
    public String get(String key) {
        this.checkFrozen();
        return this.config.get(key);
    }

    @Override
    public boolean has(String key) {
        this.checkFrozen();
        return this.config.has(key);
    }

    @Override
    public void set(String key, String value) {
        this.checkFrozen();
        this.config.set(key, value, new String[0]);
    }

    public Map<String, String> getEntries() {
        this.checkFrozen();
        return this.config.getEntries();
    }

    public void freeze() {
        this.frozen = true;
    }

    private void checkFrozen() {
        if (this.frozen) {
            throw new IllegalStateException("ConfigBuilder is frozen");
        }
    }
}

