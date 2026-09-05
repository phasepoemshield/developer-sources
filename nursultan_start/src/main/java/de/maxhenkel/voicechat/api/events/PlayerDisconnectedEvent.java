/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.events.ServerEvent;
import java.util.UUID;

public interface PlayerDisconnectedEvent
extends ServerEvent {
    public UUID getPlayerUuid();
}

