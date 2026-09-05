/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package de.maxhenkel.voicechat.voice.client.speaker;

import minecraft.class00392;

public enum AudioType {
    NORMAL((class00392)class00392.L((String)"message.voicechat.audio_type.normal")),
    REDUCED((class00392)class00392.L((String)"message.voicechat.audio_type.reduced")),
    OFF((class00392)class00392.L((String)"message.voicechat.audio_type.off"));

    private final class00392 component;

    public class00392 getText() {
        return this.component;
    }

    private AudioType(class00392 class003922) {
        this.component = class003922;
    }
}

