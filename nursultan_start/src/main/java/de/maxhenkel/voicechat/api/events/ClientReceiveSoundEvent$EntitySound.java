/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent;
import java.util.UUID;

public interface ClientReceiveSoundEvent$EntitySound
extends ClientReceiveSoundEvent {
    public boolean isWhispering();

    public float getDistance();

    public UUID getEntityId();
}

