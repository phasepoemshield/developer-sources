/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.VoicechatServerStoppedEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.VoicechatServerStoppedEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl;

public class VoicechatServerStoppedEventImpl
extends ServerEventImpl
implements VoicechatServerStoppedEvent {
    public boolean isCancellable() {
        return false;
    }
}

