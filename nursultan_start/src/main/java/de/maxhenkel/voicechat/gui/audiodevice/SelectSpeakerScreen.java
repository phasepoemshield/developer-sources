/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class06541
 */
package de.maxhenkel.voicechat.gui.audiodevice;

import de.maxhenkel.voicechat.gui.audiodevice.AudioDeviceList;
import de.maxhenkel.voicechat.gui.audiodevice.SelectDeviceScreen;
import de.maxhenkel.voicechat.gui.audiodevice.SpeakerAudioDeviceList;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class06541;

public class SelectSpeakerScreen
extends SelectDeviceScreen {
    public static final class00392 TITLE = class00392.L((String)"gui.voicechat.select_speaker.title");
    public static final class00392 NO_SPEAKER = class00392.L((String)"message.voicechat.no_speaker").N(class06541.field_1080);

    public SelectSpeakerScreen(@Nullable class05096 class050962) {
        super(TITLE, class050962);
    }

    @Override
    public class00392 getEmptyListComponent() {
        return NO_SPEAKER;
    }

    @Override
    public AudioDeviceList createAudioDeviceList(int n, int n2, int n3) {
        return new SpeakerAudioDeviceList(n, n2, n3);
    }
}

