/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.events.ClientEvent;

public interface MergeClientSoundEvent
extends ClientEvent {
    public void mergeAudio(short[] var1);
}

