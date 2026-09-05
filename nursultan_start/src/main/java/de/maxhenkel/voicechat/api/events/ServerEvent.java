/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatServerApi
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.api.events.Event;

public interface ServerEvent
extends Event {
    public VoicechatServerApi getVoicechat();
}

