/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.events.ClientEvent;
import java.util.UUID;
import javax.annotation.Nullable;

public interface OpenALSoundEvent
extends ClientEvent {
    @Nullable
    public String getCategory();

    public int getSource();

    @Nullable
    public Position getPosition();

    @Nullable
    public UUID getChannelId();
}

