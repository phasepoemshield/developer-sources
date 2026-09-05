/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.ServerEvent;
import javax.annotation.Nullable;

public interface GroupEvent
extends ServerEvent {
    @Nullable
    public VoicechatConnection getConnection();

    @Nullable
    public Group getGroup();
}

