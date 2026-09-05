/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class05216
 */
package com.viaversion.viafabricplus.api.settings.type;

import com.google.gson.JsonObject;
import com.viaversion.viafabricplus.api.settings.AbstractSetting;
import com.viaversion.viafabricplus.api.settings.SettingGroup;
import minecraft.class05216;

public class ButtonSetting
extends AbstractSetting<Runnable> {
    public ButtonSetting(SettingGroup settingGroup, class05216 class052162, Runnable runnable) {
        super(settingGroup, class052162, runnable);
    }

    @Override
    public void write(JsonObject jsonObject) {
    }

    @Override
    public void read(JsonObject jsonObject) {
    }

    public class05216 displayValue() {
        return this.getName();
    }
}

