/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Player
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  minecraft.class07049
 *  minecraft.class08036
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.Player;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.plugins.impl.EntityImpl;
import minecraft.class07049;
import minecraft.class08036;

public class PlayerImpl
extends EntityImpl
implements Player {
    public PlayerImpl(class08036 class080362) {
        super((class07049)class080362);
    }

    public class08036 getRealPlayer() {
        return (class08036)this.entity;
    }

    public Object getPlayer() {
        return CommonCompatibilityManager.INSTANCE.createRawApiPlayer(this.getRealPlayer());
    }
}

