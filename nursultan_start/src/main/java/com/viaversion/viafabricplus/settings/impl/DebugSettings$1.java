/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.settings.SettingGroup
 *  com.viaversion.viafabricplus.api.settings.type.BooleanSetting
 *  com.viaversion.viafabricplus.features.font.FontCacheReload
 *  minecraft.class05216
 */
package com.viaversion.viafabricplus.settings.impl;

import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.api.settings.type.BooleanSetting;
import com.viaversion.viafabricplus.features.font.FontCacheReload;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import minecraft.class05216;

class DebugSettings$1
extends BooleanSetting {
    DebugSettings$1(DebugSettings debugSettings, SettingGroup settingGroup, class05216 class052162, Boolean bl) {
        super(settingGroup, class052162, bl);
    }

    public void onValueChanged() {
        FontCacheReload.reload();
    }
}

