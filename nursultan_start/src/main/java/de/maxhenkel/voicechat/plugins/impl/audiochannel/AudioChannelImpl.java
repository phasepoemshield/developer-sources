/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.ServerPlayer
 *  de.maxhenkel.voicechat.api.audiochannel.AudioChannel
 *  de.maxhenkel.voicechat.voice.server.Server
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.audiochannel;

import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.audiochannel.AudioChannel;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class AudioChannelImpl
implements AudioChannel {
    protected UUID channelId;
    protected Server server;
    protected AtomicLong sequenceNumber;
    @Nullable
    protected Predicate<ServerPlayer> filter;
    @Nullable
    protected String category;

    public void setFilter(Predicate<ServerPlayer> predicate) {
        this.filter = predicate;
    }

    public void setCategory(@Nullable String string) {
        this.category = string;
    }

    @Nullable
    public String getCategory() {
        return this.category;
    }

    public AudioChannelImpl(UUID uUID, Server server) {
        this.channelId = uUID;
        this.server = server;
        this.sequenceNumber = new AtomicLong();
    }

    public UUID getId() {
        return this.channelId;
    }

    public boolean isClosed() {
        return this.server.isClosed();
    }
}

