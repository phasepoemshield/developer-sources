/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.LeaveGroupEvent
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.LeaveGroupEvent;
import de.maxhenkel.voicechat.plugins.impl.events.GroupEventImpl;
import javax.annotation.Nullable;

public class LeaveGroupEventImpl
extends GroupEventImpl
implements LeaveGroupEvent {
    public LeaveGroupEventImpl(@Nullable Group group, VoicechatConnection voicechatConnection) {
        super(group, voicechatConnection);
    }
}

