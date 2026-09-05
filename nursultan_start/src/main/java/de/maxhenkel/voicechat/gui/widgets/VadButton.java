/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry
 *  de.maxhenkel.voicechat.natives.RNNoiseManager
 *  minecraft.class00392
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.gui.widgets.BooleanConfigButton;
import de.maxhenkel.voicechat.natives.RNNoiseManager;
import minecraft.class00392;

public class VadButton
extends BooleanConfigButton {
    private static final class00392 AUTO = class00392.L((String)"message.voicechat.voice_activation_detection.auto");
    private static final class00392 MANUAL = class00392.L((String)"message.voicechat.voice_activation_detection.manual");

    public VadButton(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4, (ConfigEntry<Boolean>)VoicechatClient.CLIENT_CONFIG.vad, bl -> class00392.N((String)"message.voicechat.voice_activation_detection", (Object[])new Object[]{bl != false ? AUTO : MANUAL}));
        if (!RNNoiseManager.canUseDenoiser()) {
            this.field_22763 = false;
            this.method_25355((class00392)this.component.apply(false));
        }
    }
}

