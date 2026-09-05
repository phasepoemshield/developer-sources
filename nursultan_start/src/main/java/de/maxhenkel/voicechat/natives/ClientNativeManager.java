/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.intercompatibility.CrossSideManager
 *  de.maxhenkel.voicechat.voice.client.ChatUtils
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.intercompatibility.CrossSideManager;
import de.maxhenkel.voicechat.natives.LameManager;
import de.maxhenkel.voicechat.natives.OpusManager;
import de.maxhenkel.voicechat.natives.RNNoiseManager;
import de.maxhenkel.voicechat.natives.SpeexManager;
import de.maxhenkel.voicechat.voice.client.ChatUtils;

public class ClientNativeManager {
    public static void onConnecting() {
        if (!CrossSideManager.get().useNatives()) {
            Voicechat.LOGGER.info("Not informing player about natives, since the user has disabled them", new Object[0]);
            return;
        }
        if (!(OpusManager.isFailed() || RNNoiseManager.isFailed() || SpeexManager.isFailed() || LameManager.isFailed())) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (OpusManager.isFailed()) {
            stringBuilder.append("Opus: ").append(OpusManager.getFailedMessage()).append("\n");
        }
        if (RNNoiseManager.isFailed()) {
            stringBuilder.append("RNNoise: ").append(RNNoiseManager.getFailedMessage()).append("\n");
        }
        if (SpeexManager.isFailed()) {
            stringBuilder.append("Speex: ").append(SpeexManager.getFailedMessage()).append("\n");
        }
        if (LameManager.isFailed()) {
            stringBuilder.append("LAME: ").append(LameManager.getFailedMessage()).append("\n");
        }
        ChatUtils.sendModErrorMessage((String)"message.voicechat.native_error", (String)stringBuilder.toString().trim());
    }
}

