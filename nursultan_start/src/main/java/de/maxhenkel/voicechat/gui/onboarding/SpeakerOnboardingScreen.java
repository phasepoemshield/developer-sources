/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class06541
 */
package de.maxhenkel.voicechat.gui.onboarding;

import de.maxhenkel.voicechat.gui.audiodevice.AudioDeviceList;
import de.maxhenkel.voicechat.gui.audiodevice.SpeakerAudioDeviceList;
import de.maxhenkel.voicechat.gui.onboarding.DeviceOnboardingScreen;
import de.maxhenkel.voicechat.gui.onboarding.MicOnboardingScreen;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class06541;

public class SpeakerOnboardingScreen
extends DeviceOnboardingScreen {
    private static final class00392 TITLE = class00392.L((String)"message.voicechat.onboarding.speaker").N(class06541.field_1067);

    public SpeakerOnboardingScreen(@Nullable class05096 class050962) {
        super(TITLE, class050962);
    }

    @Override
    public AudioDeviceList createAudioDeviceList(int n, int n2, int n3) {
        return new SpeakerAudioDeviceList(n, n2, n3);
    }

    @Override
    public class05096 getNextScreen() {
        return new MicOnboardingScreen(this);
    }
}

