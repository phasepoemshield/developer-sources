/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 */
package de.maxhenkel.voicechat.gui.audiodevice;

import de.maxhenkel.voicechat.gui.audiodevice.AudioDeviceEntry;
import de.maxhenkel.voicechat.gui.widgets.MicTestButton;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;

public class MicrophoneAudioDeviceEntry
extends AudioDeviceEntry {
    private final MicTestButton testButton;

    public MicrophoneAudioDeviceEntry(String string, class00392 class003922, @Nullable class01894 class018942, Supplier<Boolean> supplier, MicTestButton micTestButton) {
        super(string, class003922, class018942, supplier);
        this.testButton = micTestButton;
    }

    @Override
    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        super.method_25343(class010542, n, n2, bl, f);
        boolean bl2 = (Boolean)this.isSelected.get();
        if (bl2 && (bl || this.testButton.isMicActive())) {
            this.testButton.y(this.method_73380() + (this.method_73387() - this.testButton.method_25368() - 4), this.method_73382() + (this.method_73384() - this.testButton.method_25364()) / 2);
            this.testButton.method_25394(class010542, n, n2, f);
        }
    }
}

