/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.GroupEvent
 *  de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.GroupEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl;
import javax.annotation.Nullable;

public class GroupEventImpl
extends ServerEventImpl
implements GroupEvent {
    @Nullable
    protected Group group;
    protected VoicechatConnection connection;

    public VoicechatConnection getConnection() {
        return this.connection;
    }

    public GroupEventImpl(@Nullable Group group, VoicechatConnection voicechatConnection) {
        this.group = group;
        this.connection = voicechatConnection;
    }

    @Nullable
    public Group getGroup() {
        return this.group;
    }
}

