/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02796
 */
package net.fabricmc.fabric.api.message.v1;

import minecraft.class00392;
import minecraft.class02796;

@FunctionalInterface
public interface ServerMessageEvents$GameMessage {
    public void onGameMessage(class02796 var1, class00392 var2, boolean var3);
}

