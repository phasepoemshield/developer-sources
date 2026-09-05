/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package de.maxhenkel.voicechat.voice.client;

import minecraft.class00392;

public enum MicrophoneActivationType {
    PTT((class00392)class00392.L((String)"message.voicechat.activation_type.ptt")),
    VOICE((class00392)class00392.L((String)"message.voicechat.activation_type.voice"));

    private final class00392 component;

    public class00392 getText() {
        return this.component;
    }

    private MicrophoneActivationType(class00392 class003922) {
        this.component = class003922;
    }
}

