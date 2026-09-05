/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.JoinGroupEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.JoinGroupEvent;
import de.maxhenkel.voicechat.plugins.impl.events.GroupEventImpl;

public class JoinGroupEventImpl
extends GroupEventImpl
implements JoinGroupEvent {
    public JoinGroupEventImpl(Group group, VoicechatConnection voicechatConnection) {
        super(group, voicechatConnection);
    }
}

