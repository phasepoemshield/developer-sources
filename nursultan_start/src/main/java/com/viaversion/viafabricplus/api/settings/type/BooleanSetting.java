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

public class BooleanSetting
extends AbstractSetting<Boolean> {
    public BooleanSetting(SettingGroup settingGroup, class05216 class052162, Boolean bl) {
        super(settingGroup, class052162, bl);
    }

    @Override
    public void write(JsonObject jsonObject) {
        jsonObject.addProperty(this.getTranslationKey(), (Boolean)this.getCurrentValue());
    }

    @Override
    public void read(JsonObject jsonObject) {
        this.setValue(jsonObject.get(this.getTranslationKey()).getAsBoolean());
    }
}

