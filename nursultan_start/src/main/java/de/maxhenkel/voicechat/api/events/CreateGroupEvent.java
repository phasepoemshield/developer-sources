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
import de.maxhenkel.voicechat.api.events.GroupEvent;
import javax.annotation.Nullable;

public interface CreateGroupEvent
extends GroupEvent {
    @Override
    @Nullable
    public VoicechatConnection getConnection();

    @Override
    public Group getGroup();
}

