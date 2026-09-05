/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class05216
 *  minecraft.class06541
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.widgets.DebouncedSlider;
import minecraft.class00392;
import minecraft.class04141;
import minecraft.class05216;
import minecraft.class06541;

public class MicAmplificationSlider
extends DebouncedSlider {
    public static final int GAIN_WARNING_THRESHOLD = 10;
    private static final class04141 GAIN_WARNING = class04141.N((class00392)class00392.N((String)"message.voicechat.microphone_gain.warning", (Object[])new Object[]{10}).N(class06541.field_1061));

    public MicAmplificationSlider(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4, (class00392)class00392.i(), MicAmplificationSlider.gainToValue((Double)VoicechatClient.CLIENT_CONFIG.microphoneGain.get()));
        this.method_25346();
    }

    @Override
    public void applyDebounced() {
        VoicechatClient.CLIENT_CONFIG.microphoneGain.set((Object)MicAmplificationSlider.valueToGain(this.field_22753)).save();
    }

    private static double valueToGain(double d) {
        return d * 64.0 + -40.0;
    }

    private static double gainToValue(double d) {
        return (d - -40.0) / 64.0;
    }

    public void method_25346() {
        long l = Math.round(MicAmplificationSlider.valueToGain(this.field_22753));
        class05216 class052162 = class00392.N((String)"message.voicechat.microphone_gain", (Object[])new Object[]{l});
        if (l > 10L && this.field_22763) {
            class052162.N(class06541.field_1061);
            this.method_47400(GAIN_WARNING);
        } else {
            this.method_47400(null);
        }
        this.method_25355((class00392)class052162);
    }

    public void setActive(boolean bl) {
        this.field_22763 = bl;
        this.method_25346();
    }
}

