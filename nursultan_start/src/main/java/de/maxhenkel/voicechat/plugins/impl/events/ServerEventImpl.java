/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatServerApi
 *  de.maxhenkel.voicechat.api.events.ServerEvent
 *  de.maxhenkel.voicechat.plugins.impl.VoicechatServerApiImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.EventImpl
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.events.ServerEvent;
import de.maxhenkel.voicechat.plugins.impl.VoicechatServerApiImpl;
import de.maxhenkel.voicechat.plugins.impl.events.EventImpl;

public class ServerEventImpl
extends EventImpl
implements ServerEvent {
    public VoicechatServerApi getVoicechat() {
        return VoicechatServerApiImpl.instance();
    }
}

