/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.MicrophoneActivationType
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class06478
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.widgets.EnumButton;
import de.maxhenkel.voicechat.voice.client.MicrophoneActivationType;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class06478;

public class MicActivationButton
extends EnumButton<MicrophoneActivationType> {
    protected Consumer<MicrophoneActivationType> onChange;

    @Override
    protected class00392 getText(MicrophoneActivationType microphoneActivationType) {
        return class00392.N((String)"message.voicechat.activation_type", (Object[])new Object[]{microphoneActivationType.getText()});
    }

    public MicActivationButton(int n, int n2, int n3, int n4, Consumer<MicrophoneActivationType> consumer) {
        super(n, n2, n3, n4, VoicechatClient.CLIENT_CONFIG.microphoneActivationType);
        this.onChange = consumer;
        this.updateText();
        consumer.accept((MicrophoneActivationType)this.entry.get());
    }

    @Override
    protected void onUpdate(MicrophoneActivationType microphoneActivationType) {
        this.onChange.accept(microphoneActivationType);
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        this.method_75794(class010542);
        this.method_75793(class010542.N((class06478)this, class01065.field_63850));
    }
}

