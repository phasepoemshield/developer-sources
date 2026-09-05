/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.net.Packet;
import minecraft.class04770;

public interface NetManager$ServerReceiver<T extends Packet<T>> {
    public void onPacket(class04770 var1, T var2);
}

