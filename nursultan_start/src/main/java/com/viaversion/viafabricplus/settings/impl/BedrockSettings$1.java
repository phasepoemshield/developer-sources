/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.settings.SettingGroup
 *  com.viaversion.viafabricplus.api.settings.type.ButtonSetting
 *  minecraft.class00392
 *  minecraft.class05216
 *  net.raphimc.minecraftauth.bedrock.BedrockAuthManager
 *  net.raphimc.minecraftauth.bedrock.model.MinecraftMultiplayerToken
 */
package com.viaversion.viafabricplus.settings.impl;

import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.api.settings.type.ButtonSetting;
import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.settings.impl.BedrockSettings;
import minecraft.class00392;
import minecraft.class05216;
import net.raphimc.minecraftauth.bedrock.BedrockAuthManager;
import net.raphimc.minecraftauth.bedrock.model.MinecraftMultiplayerToken;

class BedrockSettings$1
extends ButtonSetting {
    BedrockSettings$1(BedrockSettings bedrockSettings, SettingGroup settingGroup, class05216 class052162, Runnable runnable) {
        super(settingGroup, class052162, runnable);
    }

    public class05216 displayValue() {
        BedrockAuthManager bedrockAuthManager = SaveManager.INSTANCE.getAccountsSave().getBedrockAccount();
        if (bedrockAuthManager != null && bedrockAuthManager.getMinecraftMultiplayerToken().hasValue()) {
            return class00392.N((String)"click_to_set_bedrock_account.viafabricplus.display", (Object[])new Object[]{((MinecraftMultiplayerToken)bedrockAuthManager.getMinecraftMultiplayerToken().getCached()).getDisplayName()});
        }
        return super.displayValue();
    }
}

