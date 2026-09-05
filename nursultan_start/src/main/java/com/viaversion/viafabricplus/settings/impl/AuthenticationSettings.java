/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.settings.SettingGroup
 *  com.viaversion.viafabricplus.api.settings.type.BooleanSetting
 *  minecraft.class00392
 */
package com.viaversion.viafabricplus.settings.impl;

import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.api.settings.type.BooleanSetting;
import minecraft.class00392;

public final class AuthenticationSettings
extends SettingGroup {
    public static final AuthenticationSettings INSTANCE = new AuthenticationSettings();
    public final BooleanSetting useBetaCraftAuthentication = new BooleanSetting((SettingGroup)this, class00392.L((String)"authentication_settings.viafabricplus.use_beta_craft_authentication"), Boolean.valueOf(true));
    public final BooleanSetting verifySessionForOnlineModeServers = new BooleanSetting((SettingGroup)this, class00392.L((String)"authentication_settings.viafabricplus.verify_session_for_online_mode"), Boolean.valueOf(true));
    public final BooleanSetting automaticallySelectCPEInClassiCubeServerList = new BooleanSetting((SettingGroup)this, class00392.L((String)"authentication_settings.viafabricplus.automatically_select_cpe_when_using_classicube"), Boolean.valueOf(true));
    public final BooleanSetting setSessionNameToClassiCubeNameInServerList = new BooleanSetting((SettingGroup)this, class00392.L((String)"authentication_settings.viafabricplus.set_session_name_to_classicube_name"), Boolean.valueOf(true));

    public AuthenticationSettings() {
        super((class00392)class00392.L((String)"setting_group_name.viafabricplus.authentication"));
    }
}

