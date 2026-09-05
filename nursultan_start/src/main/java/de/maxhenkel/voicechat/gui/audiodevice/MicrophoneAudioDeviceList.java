/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.microphone.MicrophoneManager
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class05096
 */
package de.maxhenkel.voicechat.gui.audiodevice;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.audiodevice.AudioDeviceEntry;
import de.maxhenkel.voicechat.gui.audiodevice.AudioDeviceList;
import de.maxhenkel.voicechat.gui.audiodevice.MicrophoneAudioDeviceEntry;
import de.maxhenkel.voicechat.gui.widgets.MicTestButton;
import de.maxhenkel.voicechat.voice.client.microphone.MicrophoneManager;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class05096;

public class MicrophoneAudioDeviceList
extends AudioDeviceList {
    public static final class01894 MICROPHONE_ICON = class01894.N((String)"voicechat", (String)"icons/microphone");
    public static final class00392 DEFAULT_MICROPHONE = class00392.L((String)"message.voicechat.default_microphone");
    private final MicTestButton micTestButton;

    public MicrophoneAudioDeviceList(class05096 class050962, int n, int n2, int n3) {
        super(n, n2, n3);
        this.defaultDeviceText = DEFAULT_MICROPHONE;
        this.icon = MICROPHONE_ICON;
        this.configEntry = VoicechatClient.CLIENT_CONFIG.microphone;
        this.micTestButton = new MicTestButton(0, 0, true);
        class050962.method_25396().add(this.micTestButton);
        this.setAudioDevices(MicrophoneManager.deviceNames());
    }

    @Override
    public AudioDeviceEntry createAudioDeviceEntry(String string, class00392 class003922, @Nullable class01894 class018942, Supplier<Boolean> supplier) {
        return new MicrophoneAudioDeviceEntry(string, class003922, class018942, supplier, this.micTestButton);
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        super.method_48579(class010542, n, n2, f);
        this.micTestButton.updateLastRender();
    }
}

