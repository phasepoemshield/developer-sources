/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.api.events.OpenALSoundEvent
 *  de.maxhenkel.voicechat.api.events.OpenALSoundEvent$Post
 *  de.maxhenkel.voicechat.api.events.OpenALSoundEvent$Pre
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.events.OpenALSoundEvent;
import de.maxhenkel.voicechat.plugins.impl.PositionImpl;
import de.maxhenkel.voicechat.plugins.impl.events.ClientEventImpl;
import java.util.UUID;
import javax.annotation.Nullable;

public class OpenALSoundEventImpl
extends ClientEventImpl
implements OpenALSoundEvent,
OpenALSoundEvent.Post,
OpenALSoundEvent.Pre {
    @Nullable
    protected PositionImpl position;
    @Nullable
    protected UUID channelId;
    @Nullable
    protected String category;
    protected int source;

    public String getCategory() {
        return this.category;
    }

    public OpenALSoundEventImpl(@Nullable UUID uUID, @Nullable PositionImpl positionImpl, @Nullable String string, int n) {
        this.channelId = uUID;
        this.position = positionImpl;
        this.category = string;
        this.source = n;
    }

    public int getSource() {
        return this.source;
    }

    @Nullable
    public Position getPosition() {
        return this.position;
    }

    @Override
    public boolean isCancellable() {
        return false;
    }

    @Nullable
    public UUID getChannelId() {
        return this.channelId;
    }
}

