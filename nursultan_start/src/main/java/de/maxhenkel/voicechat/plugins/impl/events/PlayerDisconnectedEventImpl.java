/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.PlayerDisconnectedEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.PlayerDisconnectedEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl;
import java.util.UUID;

public class PlayerDisconnectedEventImpl
extends ServerEventImpl
implements PlayerDisconnectedEvent {
    protected UUID player;

    public PlayerDisconnectedEventImpl(UUID uUID) {
        this.player = uUID;
    }

    public UUID getPlayerUuid() {
        return this.player;
    }
}

