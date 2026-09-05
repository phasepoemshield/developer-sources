/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent$EntitySound
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientReceiveSoundEventImpl;
import java.util.UUID;

public class ClientReceiveSoundEventImpl$EntitySoundImpl
extends ClientReceiveSoundEventImpl
implements ClientReceiveSoundEvent.EntitySound {
    private UUID entity;
    private boolean whispering;
    private float distance;

    public ClientReceiveSoundEventImpl$EntitySoundImpl(UUID uUID, UUID uUID2, short[] sArray, boolean bl, float f) {
        super(uUID, sArray);
        this.entity = uUID2;
        this.whispering = bl;
        this.distance = f;
    }

    public boolean isWhispering() {
        return this.whispering;
    }

    public float getDistance() {
        return this.distance;
    }

    public UUID getEntityId() {
        return this.entity;
    }
}

