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

public class DenoiserButton
extends BooleanConfigButton {
    private static final class00392 ENABLED = class00392.L((String)"message.voicechat.denoiser.on");
    private static final class00392 DISABLED = class00392.L((String)"message.voicechat.denoiser.off");

    public DenoiserButton(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4, (ConfigEntry<Boolean>)VoicechatClient.CLIENT_CONFIG.denoiser, bl -> class00392.N((String)"message.voicechat.denoiser", (Object[])new Object[]{bl != false ? ENABLED : DISABLED}));
        if (!RNNoiseManager.canUseDenoiser()) {
            this.field_22763 = false;
            this.method_25355((class00392)this.component.apply(false));
        }
    }
}

