/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.gui.volume;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumeSlider$AdjustVolumeEntry;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import java.util.UUID;
import javax.annotation.Nullable;

public class PlayerVolumeEntry$AdjustPlayerVolumeEntry
implements AdjustVolumeSlider$AdjustVolumeEntry {
    private final UUID playerUUID;
    @Nullable
    private final String playerName;

    public PlayerVolumeEntry$AdjustPlayerVolumeEntry(UUID uUID, @Nullable String string) {
        this.playerUUID = uUID;
        this.playerName = string;
    }

    @Override
    public double get() {
        return VoicechatClient.PLAYER_VOLUME_CONFIG.getVolume((Object)this.playerUUID);
    }

    @Override
    public void save(double d) {
        VoicechatClient.PLAYER_VOLUME_CONFIG.setVolume((Object)this.playerUUID, d, new String[]{this.playerName == null ? "All other volumes" : String.format("Volume of %s", this.playerName)});
        VoicechatClient.PLAYER_VOLUME_CONFIG.save();
    }

    @Override
    public double getAudioLevel() {
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat == null) {
            return -127.0;
        }
        return clientVoicechat.getTalkCache().getPlayerAudioLevel(this.playerUUID);
    }
}

