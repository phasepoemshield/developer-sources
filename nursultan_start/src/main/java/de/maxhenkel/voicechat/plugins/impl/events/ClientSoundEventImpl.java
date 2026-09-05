/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.ClientSoundEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.ClientSoundEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientEventImpl;

public class ClientSoundEventImpl
extends ClientEventImpl
implements ClientSoundEvent {
    private short[] rawAudio;
    private boolean whispering;

    public ClientSoundEventImpl(short[] sArray, boolean bl) {
        this.rawAudio = sArray;
        this.whispering = bl;
    }

    public boolean isWhispering() {
        return this.whispering;
    }

    public short[] getRawAudio() {
        return this.rawAudio;
    }

    public void setRawAudio(short[] sArray) {
        this.rawAudio = sArray;
    }
}

