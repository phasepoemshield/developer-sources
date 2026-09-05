/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.ServerLevel
 *  de.maxhenkel.voicechat.api.ServerPlayer
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class08036
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.ServerLevel;
import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.plugins.impl.PlayerImpl;
import de.maxhenkel.voicechat.plugins.impl.ServerLevelImpl;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class08036;

public class ServerPlayerImpl
extends PlayerImpl
implements ServerPlayer {
    public ServerPlayerImpl(class04770 class047702) {
        super((class08036)class047702);
    }

    public class04770 getRealServerPlayer() {
        return (class04770)this.entity;
    }

    public ServerLevel getServerLevel() {
        return new ServerLevelImpl((class04782)this.entity.method_73183());
    }
}

