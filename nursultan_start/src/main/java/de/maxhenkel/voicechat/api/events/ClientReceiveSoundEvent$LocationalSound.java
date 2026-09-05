/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent;

public interface ClientReceiveSoundEvent$LocationalSound
extends ClientReceiveSoundEvent {
    public Position getPosition();

    public float getDistance();
}

