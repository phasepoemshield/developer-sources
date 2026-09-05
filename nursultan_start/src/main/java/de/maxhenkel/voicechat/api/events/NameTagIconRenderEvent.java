/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.events.ClientEvent;
import java.util.UUID;

public interface NameTagIconRenderEvent
extends ClientEvent {
    public UUID getEntityId();
}

