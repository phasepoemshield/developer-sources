/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package com.terraformersmc.modmenu.config.option;

import com.terraformersmc.modmenu.config.option.ConfigOptionStorage;
import com.terraformersmc.modmenu.util.TranslationUtil;
import java.util.Set;
import minecraft.class00392;

public class StringSetConfigOption {
    private final String key;
    private final String translationKey;
    private final Set<String> defaultValue;

    public StringSetConfigOption(String string, Set<String> set) {
        ConfigOptionStorage.setStringSet(string, set);
        this.key = string;
        this.translationKey = TranslationUtil.translationKeyOf("option", string);
        this.defaultValue = set;
    }

    public Set<String> getValue() {
        return ConfigOptionStorage.getStringSet(this.key);
    }

    public String getKey() {
        return this.key;
    }

    public class00392 getMessage() {
        return class00392.L((String)this.translationKey);
    }

    public void setValue(Set<String> set) {
        ConfigOptionStorage.setStringSet(this.key, set);
    }

    public Set<String> getDefaultValue() {
        return this.defaultValue;
    }
}

