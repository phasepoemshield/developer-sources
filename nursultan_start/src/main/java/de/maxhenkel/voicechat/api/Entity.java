/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.Position;
import java.util.UUID;

public interface Entity {
    public Position getPosition();

    public Object getEntity();

    public UUID getUuid();
}

