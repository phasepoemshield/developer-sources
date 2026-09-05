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
import de.maxhenkel.voicechat.gui.audiodevice.MicrophoneAudioDeviceList;
import de.maxhenkel.voicechat.gui.onboarding.ActivationOnboardingScreen;
import de.maxhenkel.voicechat.gui.onboarding.DeviceOnboardingScreen;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class06541;

public class MicOnboardingScreen
extends DeviceOnboardingScreen {
    private static final class00392 TITLE = class00392.L((String)"message.voicechat.onboarding.microphone").N(class06541.field_1067);

    public MicOnboardingScreen(@Nullable class05096 class050962) {
        super(TITLE, class050962);
    }

    @Override
    public AudioDeviceList createAudioDeviceList(int n, int n2, int n3) {
        return new MicrophoneAudioDeviceList(this, n, n2, n3);
    }

    @Override
    public class05096 getNextScreen() {
        return new ActivationOnboardingScreen(this);
    }
}

