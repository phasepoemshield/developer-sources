/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.client.TestSoundPlayer
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 */
package de.maxhenkel.voicechat.gui.audiodevice;

import de.maxhenkel.voicechat.gui.audiodevice.AudioDeviceEntry;
import de.maxhenkel.voicechat.gui.tooltips.TestSpeakerSupplier;
import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.voice.client.TestSoundPlayer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;

public class SpeakerAudioDeviceEntry
extends AudioDeviceEntry {
    public static final class01894 SPEAKER_ICON = class01894.N((String)"voicechat", (String)"icons/test_speaker");
    private ImageButton testButton = new ImageButton(0, 0, SPEAKER_ICON, imageButton -> {
        this.testButton.field_22763 = false;
        TestSoundPlayer.playTestSound(() -> {
            this.testButton.field_22763 = true;
        });
    }, new TestSpeakerSupplier());

    public SpeakerAudioDeviceEntry(String string, class00392 class003922, @Nullable class01894 class018942, Supplier<Boolean> supplier) {
        super(string, class003922, class018942, supplier);
        this.children.add(this.testButton);
    }

    @Override
    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        super.method_25343(class010542, n, n2, bl, f);
        boolean bl2 = (Boolean)this.isSelected.get();
        if (bl2 && bl) {
            this.testButton.field_22764 = true;
            this.testButton.y(this.method_73380() + (this.method_73387() - this.testButton.method_25368() - 4), this.method_73382() + (this.method_73384() - this.testButton.method_25364()) / 2);
            this.testButton.method_25394(class010542, n, n2, f);
        } else {
            this.testButton.field_22764 = false;
        }
    }
}

