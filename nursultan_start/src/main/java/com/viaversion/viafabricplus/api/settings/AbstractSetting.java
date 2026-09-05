/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.viaversion.viafabricplus.util.ChatUtil
 *  minecraft.class00392
 *  minecraft.class05216
 */
package com.viaversion.viafabricplus.api.settings;

import com.google.gson.JsonObject;
import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.util.ChatUtil;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class05216;

public abstract class AbstractSetting<T> {
    private final class05216 name;
    private final T defaultValue;
    private T value;
    private Supplier<class00392> tooltip;
    private boolean locked;
    private T lockedValue;

    public AbstractSetting(SettingGroup settingGroup, class05216 class052162, T t) {
        this.name = class052162;
        this.defaultValue = t;
        this.value = t;
        settingGroup.getSettings().add(this);
    }

    public class05216 getName() {
        return this.name;
    }

    public T getValue() {
        if (!this.locked) {
            return this.value;
        }
        if (this.lockedValue == null) {
            this.lockedValue = this.defaultValue;
        }
        return this.lockedValue;
    }

    public abstract void write(JsonObject var1);

    public abstract void read(JsonObject var1);

    public void setValue(T t) {
        if (this.locked && this.lockedValue == null) {
            this.lockedValue = t;
        }
        this.value = t;
        this.onValueChanged();
    }

    public T getDefaultValue() {
        return this.defaultValue;
    }

    public static String mapTranslationKey(String string) {
        return string.split("viafabricplus.")[1];
    }

    public T getCurrentValue() {
        return this.value;
    }

    public void onValueChanged() {
    }

    public class00392 getTooltip() {
        if (this.tooltip == null) {
            return null;
        }
        return this.tooltip.get();
    }

    public String getTranslationKey() {
        return AbstractSetting.mapTranslationKey(ChatUtil.uncoverTranslationKey((class00392)this.name));
    }

    public void lockValue() {
        this.locked = true;
        this.setTooltip((class00392)class00392.L((String)"base.viafabricplus.this_will_require_a_restart"));
    }

    public void setTooltip(class00392 class003922) {
        this.tooltip = () -> class003922;
    }

    public void setTooltip(Supplier<class00392> supplier) {
        this.tooltip = supplier;
    }
}

