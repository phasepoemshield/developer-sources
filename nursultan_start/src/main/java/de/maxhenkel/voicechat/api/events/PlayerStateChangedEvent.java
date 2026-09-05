/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.ServerEvent;
import java.util.UUID;
import javax.annotation.Nullable;

public interface PlayerStateChangedEvent
extends ServerEvent {
    @Nullable
    public VoicechatConnection getConnection();

    public boolean isDisabled();

    public boolean isDisconnected();

    public UUID getPlayerUuid();
}

