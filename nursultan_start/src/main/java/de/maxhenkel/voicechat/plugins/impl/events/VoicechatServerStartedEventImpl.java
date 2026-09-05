/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.VoicechatServerStartedEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.VoicechatServerStartedEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl;

public class VoicechatServerStartedEventImpl
extends ServerEventImpl
implements VoicechatServerStartedEvent {
    public boolean isCancellable() {
        return false;
    }
}

