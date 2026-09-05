/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection
 *  minecraft.class02796
 *  minecraft.class05623
 */
package de.maxhenkel.voicechat.intercompatibility;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.intercompatibility.CrossSideManager;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection;
import minecraft.class02796;
import minecraft.class05623;

public class ClientCrossSideManager
extends CrossSideManager {
    @Override
    public boolean shouldRunVoiceChatServer(class02796 class027962) {
        return class027962 instanceof class05623 || VoicechatClient.CLIENT_CONFIG == null || (Boolean)VoicechatClient.CLIENT_CONFIG.runLocalServer.get() != false;
    }

    @Override
    public boolean useNatives() {
        if (VoicechatClient.CLIENT_CONFIG == null) {
            return (Boolean)Voicechat.SERVER_CONFIG.useNatives.get();
        }
        return (Boolean)VoicechatClient.CLIENT_CONFIG.useNatives.get();
    }

    @Override
    public int getMtuSize() {
        ClientVoicechatConnection clientVoicechatConnection;
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat != null && (clientVoicechatConnection = clientVoicechat.getConnection()) != null) {
            return clientVoicechatConnection.getData().getMtuSize();
        }
        return (Integer)Voicechat.SERVER_CONFIG.voiceChatMtuSize.get();
    }
}

