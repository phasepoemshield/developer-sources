/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection;

public class ClientUtils {
    public static float getDefaultDistanceClient() {
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat == null) {
            return 48.0f;
        }
        ClientVoicechatConnection clientVoicechatConnection = clientVoicechat.getConnection();
        if (clientVoicechatConnection == null) {
            return 48.0f;
        }
        return (float)clientVoicechatConnection.getData().getVoiceChatDistance();
    }
}

