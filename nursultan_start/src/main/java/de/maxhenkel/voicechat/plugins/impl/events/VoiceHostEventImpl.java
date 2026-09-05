/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.ServerPlayer
 *  de.maxhenkel.voicechat.api.events.VoiceHostEvent
 *  de.maxhenkel.voicechat.plugins.impl.ServerPlayerImpl
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.events.VoiceHostEvent;
import de.maxhenkel.voicechat.plugins.impl.ServerPlayerImpl;
import de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl;
import minecraft.class04770;

public class VoiceHostEventImpl
extends ServerEventImpl
implements VoiceHostEvent {
    private final ServerPlayerImpl player;
    private String voiceHost;

    public VoiceHostEventImpl(class04770 class047702, String string) {
        this.player = new ServerPlayerImpl(class047702);
        this.voiceHost = string;
    }

    public String getVoiceHost() {
        return this.voiceHost;
    }

    public ServerPlayer getPlayer() {
        return this.player;
    }

    public void setVoiceHost(String string) {
        this.voiceHost = string;
    }
}

