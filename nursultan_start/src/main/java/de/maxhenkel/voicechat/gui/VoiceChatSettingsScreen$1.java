/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  de.maxhenkel.voicechat.voice.client.speaker.AudioType
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class06478
 */
package de.maxhenkel.voicechat.gui;

import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.gui.VoiceChatSettingsScreen;
import de.maxhenkel.voicechat.gui.widgets.EnumButton;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.speaker.AudioType;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class06478;

class VoiceChatSettingsScreen$1
extends EnumButton<AudioType> {
    final /* synthetic */ VoiceChatSettingsScreen this$0;

    @Override
    protected class00392 getText(AudioType audioType) {
        return class00392.N((String)"message.voicechat.audio_type", (Object[])new Object[]{audioType.getText()});
    }

    VoiceChatSettingsScreen$1(VoiceChatSettingsScreen voiceChatSettingsScreen, int n, int n2, int n3, int n4, ConfigEntry configEntry) {
        this.this$0 = voiceChatSettingsScreen;
        super(n, n2, n3, n4, configEntry);
    }

    @Override
    protected void onUpdate(AudioType audioType) {
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat != null) {
            this.this$0.micTestButton.stop();
            clientVoicechat.reloadAudio();
        }
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        this.method_75794(class010542);
        this.method_75793(class010542.N((class06478)this, class01065.field_63850));
    }
}

