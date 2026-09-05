/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class05096
 */
package de.maxhenkel.voicechat.gui.onboarding;

import de.maxhenkel.voicechat.gui.audiodevice.AudioDeviceList;
import de.maxhenkel.voicechat.gui.onboarding.OnboardingScreenBase;
import java.util.Objects;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class05096;

public abstract class DeviceOnboardingScreen
extends OnboardingScreenBase {
    protected AudioDeviceList deviceList;

    public DeviceOnboardingScreen(class00392 class003922, @Nullable class05096 class050962) {
        super(class003922, class050962);
    }

    public abstract AudioDeviceList createAudioDeviceList(int var1, int var2, int var3);

    @Override
    public void method_25426() {
        super.method_25426();
        if (this.deviceList != null) {
            Objects.requireNonNull(this.field_22793);
            Objects.requireNonNull(this.field_22793);
            this.deviceList.updateSize(this.field_22789, this.contentHeight - 9 - 20 - 16, 0, this.guiTop + 9 + 8);
        } else {
            Objects.requireNonNull(this.field_22793);
            Objects.requireNonNull(this.field_22793);
            this.deviceList = this.createAudioDeviceList(this.field_22789, this.contentHeight - 9 - 20 - 16, this.guiTop + 9 + 8);
        }
        this.method_25429((class04654)this.deviceList);
        this.addBackOrCancelButton();
        this.addNextButton();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.deviceList.method_25394(class010542, n, n2, f);
        this.renderTitle(class010542, this.field_22785);
    }

    @Override
    public abstract class05096 getNextScreen();
}

