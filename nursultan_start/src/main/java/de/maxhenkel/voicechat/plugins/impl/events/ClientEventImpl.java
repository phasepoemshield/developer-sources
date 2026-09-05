/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatClientApi
 *  de.maxhenkel.voicechat.api.events.ClientEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatClientApi;
import de.maxhenkel.voicechat.api.events.ClientEvent;
import de.maxhenkel.voicechat.plugins.impl.VoicechatClientApiImpl;
import de.maxhenkel.voicechat.plugins.impl.events.EventImpl;

public class ClientEventImpl
extends EventImpl
implements ClientEvent {
    public VoicechatClientApi getVoicechat() {
        return VoicechatClientApiImpl.instance();
    }
}

