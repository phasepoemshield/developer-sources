/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder;

import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.voicechat.configbuilder.MigratableConfig;
import java.util.Map;
import javax.annotation.Nullable;

class MigratableConfigImpl
implements MigratableConfig {
    private final CommentedPropertyConfig config;
    private boolean frozen;

    @Override
    public boolean has(String string) {
        this.checkFrozen();
        return this.config.has(string);
    }

    public MigratableConfigImpl(CommentedPropertyConfig commentedPropertyConfig) {
        this.config = commentedPropertyConfig;
    }

    @Override
    @Nullable
    public String get(String string) {
        this.checkFrozen();
        return this.config.get(string);
    }

    @Override
    public void set(String string, String string2) {
        this.checkFrozen();
        this.config.set(string, string2, new String[0]);
    }

    public void freeze() {
        this.frozen = true;
    }

    @Override
    public Map<String, String> getEntries() {
        this.checkFrozen();
        return this.config.getEntries();
    }

    private void checkFrozen() {
        if (this.frozen) {
            throw new IllegalStateException("ConfigBuilder is frozen");
        }
    }
}

