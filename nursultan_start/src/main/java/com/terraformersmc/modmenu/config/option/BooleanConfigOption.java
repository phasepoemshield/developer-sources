/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04344
 *  minecraft.class04370
 *  minecraft.class05220
 */
package com.terraformersmc.modmenu.config.option;

import com.terraformersmc.modmenu.config.option.ConfigOptionStorage;
import com.terraformersmc.modmenu.config.option.OptionConvertible;
import com.terraformersmc.modmenu.util.TranslationUtil;
import minecraft.class00392;
import minecraft.class04344;
import minecraft.class04370;
import minecraft.class05220;

public class BooleanConfigOption
implements OptionConvertible {
    private final String key;
    private final String translationKey;
    private final boolean defaultValue;
    private final class00392 enabledText;
    private final class00392 disabledText;

    public BooleanConfigOption(String string, boolean bl, String string2, String string3) {
        ConfigOptionStorage.setBoolean(string, bl);
        this.key = string;
        this.translationKey = TranslationUtil.translationKeyOf("option", string);
        this.defaultValue = bl;
        this.enabledText = class00392.L((String)(this.translationKey + "." + string2));
        this.disabledText = class00392.L((String)(this.translationKey + "." + string3));
    }

    public BooleanConfigOption(String string, boolean bl) {
        this(string, bl, "true", "false");
    }

    public boolean getValue() {
        return ConfigOptionStorage.getBoolean(this.key);
    }

    public String getKey() {
        return this.key;
    }

    public void setValue(boolean bl) {
        ConfigOptionStorage.setBoolean(this.key, bl);
    }

    public boolean getDefaultValue() {
        return this.defaultValue;
    }

    public class00392 getButtonText() {
        return class05220.N((class00392)class00392.L((String)this.translationKey), (class00392)(this.getValue() ? this.enabledText : this.disabledText));
    }

    public void toggleValue() {
        ConfigOptionStorage.toggleBoolean(this.key);
    }

    public class04370<Boolean> asOption() {
        if (this.enabledText != null && this.disabledText != null) {
            return new class04370(this.translationKey, class04370.method_42399(), (class003922, bl) -> bl != false ? this.enabledText : this.disabledText, (class04344)class04370.field_38278, (Object)this.getValue(), bl -> ConfigOptionStorage.setBoolean(this.key, bl));
        }
        return class04370.method_41751((String)this.translationKey, (boolean)this.getValue(), bl -> ConfigOptionStorage.setBoolean(this.key, bl));
    }
}

