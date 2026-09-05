/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.NameTagIconRenderEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.NameTagIconRenderEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientEventImpl;
import java.util.UUID;

public class NameTagIconRenderEventImpl
extends ClientEventImpl
implements NameTagIconRenderEvent {
    private UUID entityId;

    public void setCancelled(boolean bl) {
        this.cancelled = bl;
    }

    public void setEntityId(UUID uUID) {
        this.entityId = uUID;
    }

    public UUID getEntityId() {
        return this.entityId;
    }
}

