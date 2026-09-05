/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.Player;
import de.maxhenkel.voicechat.api.ServerLevel;

public interface ServerPlayer
extends Player {
    public ServerLevel getServerLevel();
}

