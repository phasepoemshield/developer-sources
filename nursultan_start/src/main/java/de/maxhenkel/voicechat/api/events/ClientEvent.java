/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatClientApi
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.VoicechatClientApi;
import de.maxhenkel.voicechat.api.events.Event;

public interface ClientEvent
extends Event {
    public VoicechatClientApi getVoicechat();
}

