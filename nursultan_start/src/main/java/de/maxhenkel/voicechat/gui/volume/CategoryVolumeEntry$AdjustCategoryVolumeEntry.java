/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 */
package de.maxhenkel.voicechat.gui.volume;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumeSlider$AdjustVolumeEntry;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;

class CategoryVolumeEntry$AdjustCategoryVolumeEntry
implements AdjustVolumeSlider$AdjustVolumeEntry {
    private final String category;

    public CategoryVolumeEntry$AdjustCategoryVolumeEntry(String string) {
        this.category = string;
    }

    @Override
    public double get() {
        return VoicechatClient.CATEGORY_VOLUME_CONFIG.getVolume((Object)this.category);
    }

    @Override
    public void save(double d) {
        VoicechatClient.CATEGORY_VOLUME_CONFIG.setVolume((Object)this.category, d, new String[0]);
        VoicechatClient.CATEGORY_VOLUME_CONFIG.save();
    }

    @Override
    public double getAudioLevel() {
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat == null) {
            return -127.0;
        }
        return clientVoicechat.getTalkCache().getCategoryAudioLevel(this.category);
    }
}

