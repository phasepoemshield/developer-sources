/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  de.maxhenkel.voicechat.voice.client.SoundManager
 *  minecraft.class00392
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.widgets.DebouncedSlider;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.SoundManager;
import minecraft.class00392;

public class VoiceSoundSlider
extends DebouncedSlider {
    protected float maxVolume;

    public VoiceSoundSlider(int n, int n2, int n3, int n4, float f) {
        super(n, n2, n3, n4, (class00392)class00392.i(), ((Double)VoicechatClient.CLIENT_CONFIG.voiceChatVolume.get()).floatValue() / f);
        this.maxVolume = f;
        this.method_25346();
    }

    public VoiceSoundSlider(int n, int n2, int n3, int n4) {
        this(n, n2, n3, n4, VoiceSoundSlider.getMaxGain());
    }

    private static float getMaxGain() {
        float f = ((Double)VoicechatClient.CLIENT_CONFIG.voiceChatVolume.getMax()).floatValue();
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat == null) {
            return f;
        }
        SoundManager soundManager = clientVoicechat.getSoundManager();
        if (soundManager == null) {
            return f;
        }
        return Math.min(f, soundManager.getMaxGain());
    }

    @Override
    public void applyDebounced() {
        VoicechatClient.CLIENT_CONFIG.voiceChatVolume.set((Object)(this.field_22753 * (double)this.maxVolume)).save();
    }

    public void method_25346() {
        this.method_25355(this.getMsg());
    }

    public class00392 getMsg() {
        return class00392.N((String)"message.voicechat.voice_chat_volume", (Object[])new Object[]{Math.round(this.field_22753 * (double)this.maxVolume * 100.0) + "%"});
    }
}

