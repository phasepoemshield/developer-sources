/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.events.ClientEvent;

public interface VoicechatDisableEvent
extends ClientEvent {
    public boolean isDisabled();
}

