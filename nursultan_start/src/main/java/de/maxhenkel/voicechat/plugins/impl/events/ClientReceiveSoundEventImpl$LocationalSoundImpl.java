/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent$LocationalSound
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientReceiveSoundEventImpl;
import java.util.UUID;

public class ClientReceiveSoundEventImpl$LocationalSoundImpl
extends ClientReceiveSoundEventImpl
implements ClientReceiveSoundEvent.LocationalSound {
    private Position position;
    private float distance;

    public ClientReceiveSoundEventImpl$LocationalSoundImpl(UUID uUID, short[] sArray, Position position, float f) {
        super(uUID, sArray);
        this.position = position;
        this.distance = f;
    }

    public Position getPosition() {
        return this.position;
    }

    public float getDistance() {
        return this.distance;
    }
}

