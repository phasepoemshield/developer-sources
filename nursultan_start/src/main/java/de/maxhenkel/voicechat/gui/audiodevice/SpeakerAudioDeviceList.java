/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.SoundManager
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01894
 */
package de.maxhenkel.voicechat.gui.audiodevice;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.audiodevice.AudioDeviceEntry;
import de.maxhenkel.voicechat.gui.audiodevice.AudioDeviceList;
import de.maxhenkel.voicechat.gui.audiodevice.SpeakerAudioDeviceEntry;
import de.maxhenkel.voicechat.voice.client.SoundManager;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01894;

public class SpeakerAudioDeviceList
extends AudioDeviceList {
    public static final class01894 SPEAKER_ICON = class01894.N((String)"voicechat", (String)"icons/speaker");
    public static final class00392 DEFAULT_SPEAKER = class00392.L((String)"message.voicechat.default_speaker");

    public SpeakerAudioDeviceList(int n, int n2, int n3) {
        super(n, n2, n3);
        this.defaultDeviceText = DEFAULT_SPEAKER;
        this.icon = SPEAKER_ICON;
        this.configEntry = VoicechatClient.CLIENT_CONFIG.speaker;
        this.setAudioDevices(SoundManager.getAllSpeakers());
    }

    @Override
    public AudioDeviceEntry createAudioDeviceEntry(String string, class00392 class003922, @Nullable class01894 class018942, Supplier<Boolean> supplier) {
        return new SpeakerAudioDeviceEntry(string, class003922, class018942, supplier);
    }
}

