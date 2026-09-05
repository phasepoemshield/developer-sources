/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.GroupEvent;

public interface JoinGroupEvent
extends GroupEvent {
    @Override
    public VoicechatConnection getConnection();

    @Override
    public Group getGroup();
}

