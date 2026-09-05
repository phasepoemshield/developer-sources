/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.audiolistener.AudioListener
 */
package de.maxhenkel.voicechat.api.audiolistener;

import de.maxhenkel.voicechat.api.audiolistener.AudioListener;
import java.util.UUID;

public interface PlayerAudioListener
extends AudioListener {
    public UUID getPlayerUuid();
}

