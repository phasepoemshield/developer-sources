/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientEventImpl;
import java.util.UUID;
import javax.annotation.Nullable;

public class ClientReceiveSoundEventImpl
extends ClientEventImpl
implements ClientReceiveSoundEvent {
    private UUID id;
    private short[] rawAudio;

    public ClientReceiveSoundEventImpl(UUID uUID, short[] sArray) {
        this.id = uUID;
        this.rawAudio = sArray;
    }

    public UUID getId() {
        return this.id;
    }

    @Override
    public boolean isCancellable() {
        return false;
    }

    @Nullable
    public short[] getRawAudio() {
        return this.rawAudio;
    }

    public void setRawAudio(@Nullable short[] sArray) {
        this.rawAudio = sArray;
    }
}

