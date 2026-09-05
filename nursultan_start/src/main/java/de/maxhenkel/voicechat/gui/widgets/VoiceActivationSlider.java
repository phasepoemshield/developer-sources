/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.natives.RNNoiseManager
 *  de.maxhenkel.voicechat.voice.client.MicrophoneActivationType
 *  de.maxhenkel.voicechat.voice.common.AudioUtils
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class01894
 *  minecraft.class05216
 *  minecraft.class06478
 *  minecraft.class06541
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.widgets.DebouncedSlider;
import de.maxhenkel.voicechat.gui.widgets.MicTestButton$MicListener;
import de.maxhenkel.voicechat.gui.widgets.VoiceActivationSlider$SlidingMaxSmooth;
import de.maxhenkel.voicechat.natives.RNNoiseManager;
import de.maxhenkel.voicechat.voice.client.MicrophoneActivationType;
import de.maxhenkel.voicechat.voice.common.AudioUtils;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01894;
import minecraft.class05216;
import minecraft.class06478;
import minecraft.class06541;
import minecraft.class08394;

public class VoiceActivationSlider
extends DebouncedSlider
implements MicTestButton$MicListener {
    private static final class01894 SLIDER_SPRITE = class01894.y((String)"widget/slider");
    private static final class01894 HIGHLIGHTED_SPRITE = class01894.y((String)"widget/slider_highlighted");
    private static final class01894 SLIDER_HANDLE_SPRITE = class01894.y((String)"widget/slider_handle");
    private static final class01894 SLIDER_HANDLE_HIGHLIGHTED_SPRITE = class01894.y((String)"widget/slider_handle_highlighted");
    private static final class01894 VOICE_ACTIVATION_SLIDER = class01894.N((String)"voicechat", (String)"textures/gui/voice_activation_slider.png");
    private static final class00392 NO_ACTIVATION = class00392.L((String)"message.voicechat.voice_activation.disabled").N(class06541.field_1061);
    private final VoiceActivationSlider$SlidingMaxSmooth micValue;

    public VoiceActivationSlider(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4, (class00392)class00392.i(), AudioUtils.dbToPerc((double)((Double)VoicechatClient.CLIENT_CONFIG.voiceActivationThreshold.get()).floatValue()));
        this.method_25346();
        this.micValue = new VoiceActivationSlider$SlidingMaxSmooth();
    }

    private class01894 getHandle() {
        return !this.field_22762 && !this.method_25370() ? SLIDER_HANDLE_SPRITE : SLIDER_HANDLE_HIGHLIGHTED_SPRITE;
    }

    @Nullable
    public class00392 getHoverText() {
        if (!this.field_22763) {
            return null;
        }
        if (this.field_22753 >= 1.0) {
            return NO_ACTIVATION;
        }
        return null;
    }

    @Override
    public void applyDebounced() {
        VoicechatClient.CLIENT_CONFIG.voiceActivationThreshold.set((Object)AudioUtils.percToDb((double)this.field_22753)).save();
    }

    public boolean shouldShowSlider() {
        if (!MicrophoneActivationType.VOICE.equals(VoicechatClient.CLIENT_CONFIG.microphoneActivationType.get())) {
            return false;
        }
        if (!RNNoiseManager.canUseDenoiser()) {
            return true;
        }
        return (Boolean)VoicechatClient.CLIENT_CONFIG.vad.get() == false;
    }

    public void method_25346() {
        long l = Math.round(AudioUtils.percToDb((double)this.field_22753));
        class05216 class052162 = class00392.N((String)"message.voicechat.voice_activation", (Object[])new Object[]{l});
        if (l >= -10L) {
            class052162.N(class06541.field_1061);
        }
        this.method_25355((class00392)class052162);
    }

    @Override
    public void onMicValue(double d) {
        this.micValue.add(AudioUtils.dbToPerc((double)d));
    }

    @Override
    public void onStop() {
        this.micValue.reset();
    }

    private class01894 getSlider() {
        return this.method_25370() && !this.field_22762 && !this.method_25370() ? HIGHLIGHTED_SPRITE : SLIDER_SPRITE;
    }

    public boolean method_49606() {
        return this.field_22762;
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, this.getSlider(), this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364());
        int n3 = (int)((double)(this.field_22758 - 2) * this.micValue.smoothMax());
        class010542.N(class08394.Na, VOICE_ACTIVATION_SLIDER, this.method_46426() + 1, this.method_46427() + 1, 0.0f, 0.0f, n3, 18, 256, 256);
        this.field_22763 = this.shouldShowSlider();
        if (!this.field_22763) {
            return;
        }
        class010542.N(class08394.Na, this.getHandle(), this.method_46426() + (int)(this.field_22753 * (double)(this.field_22758 - 8)), this.method_46427(), 8, 20);
        this.method_75799(class010542.N((class06478)this, class01065.field_63850), this.method_25369(), 2);
    }
}

