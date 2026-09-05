/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.PlayerStateChangedEvent
 *  de.maxhenkel.voicechat.plugins.impl.VoicechatConnectionImpl
 *  javax.annotation.Nullable
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.PlayerStateChangedEvent;
import de.maxhenkel.voicechat.plugins.impl.VoicechatConnectionImpl;
import de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.UUID;
import javax.annotation.Nullable;
import minecraft.class04770;

public class PlayerStateChangedEventImpl
extends ServerEventImpl
implements PlayerStateChangedEvent {
    protected final PlayerState state;
    @Nullable
    protected VoicechatConnectionImpl connection;

    @Nullable
    public VoicechatConnection getConnection() {
        if (this.connection == null) {
            Server server = Voicechat.SERVER.getServer();
            if (server == null) {
                return null;
            }
            class04770 class047702 = server.getServer().Nm().y(this.state.getUuid());
            if (class047702 == null) {
                return null;
            }
            this.connection = VoicechatConnectionImpl.fromPlayer((class04770)class047702);
        }
        return this.connection;
    }

    public PlayerStateChangedEventImpl(PlayerState playerState) {
        this.state = playerState;
    }

    public boolean isDisabled() {
        return this.state.isDisabled();
    }

    public boolean isDisconnected() {
        return this.state.isDisconnected();
    }

    public UUID getPlayerUuid() {
        return this.state.getUuid();
    }
}

