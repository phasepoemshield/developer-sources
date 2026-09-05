/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00649
 *  minecraft.class03926
 *  minecraft.class04770
 */
package net.fabricmc.fabric.api.message.v1;

import minecraft.class00649;
import minecraft.class03926;
import minecraft.class04770;

@FunctionalInterface
public interface ServerMessageEvents$ChatMessage {
    public void onChatMessage(class03926 var1, class04770 var2, class00649 var3);
}

