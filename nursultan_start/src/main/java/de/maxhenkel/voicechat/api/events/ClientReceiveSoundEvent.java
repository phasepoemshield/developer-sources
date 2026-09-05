/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.events.ClientEvent;
import java.util.UUID;
import javax.annotation.Nullable;

public interface ClientReceiveSoundEvent
extends ClientEvent {
    public UUID getId();

    public short[] getRawAudio();

    public void setRawAudio(@Nullable short[] var1);
}

