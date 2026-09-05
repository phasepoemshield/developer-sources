/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.CreateGroupEvent
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.CreateGroupEvent;
import de.maxhenkel.voicechat.plugins.impl.events.GroupEventImpl;
import javax.annotation.Nullable;

public class CreateGroupEventImpl
extends GroupEventImpl
implements CreateGroupEvent {
    public CreateGroupEventImpl(Group group, @Nullable VoicechatConnection voicechatConnection) {
        super(group, voicechatConnection);
    }
}

