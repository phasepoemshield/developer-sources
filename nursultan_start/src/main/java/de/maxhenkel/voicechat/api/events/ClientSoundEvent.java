/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.events.ClientEvent;

public interface ClientSoundEvent
extends ClientEvent {
    public boolean isWhispering();

    public short[] getRawAudio();

    public void setRawAudio(short[] var1);
}

