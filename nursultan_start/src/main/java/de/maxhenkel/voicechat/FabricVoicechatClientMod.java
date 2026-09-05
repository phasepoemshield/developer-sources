/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.integration.clothconfig.ClothConfig
 *  net.fabricmc.api.ClientModInitializer
 */
package de.maxhenkel.voicechat;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.integration.clothconfig.ClothConfig;
import net.fabricmc.api.ClientModInitializer;

public class FabricVoicechatClientMod
extends VoicechatClient
implements ClientModInitializer {
    public void onInitializeClient() {
        this.initializeClient();
        ClothConfig.init();
    }
}

