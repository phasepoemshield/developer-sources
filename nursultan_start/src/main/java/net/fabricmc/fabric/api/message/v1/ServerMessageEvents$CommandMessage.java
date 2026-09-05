/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00649
 *  minecraft.class03926
 *  minecraft.class07701
 */
package net.fabricmc.fabric.api.message.v1;

import minecraft.class00649;
import minecraft.class03926;
import minecraft.class07701;

@FunctionalInterface
public interface ServerMessageEvents$CommandMessage {
    public void onCommandMessage(class03926 var1, class07701 var2, class00649 var3);
}

