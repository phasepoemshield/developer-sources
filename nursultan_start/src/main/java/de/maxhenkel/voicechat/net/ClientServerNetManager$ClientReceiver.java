/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04453
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.net.Packet;
import minecraft.class04453;

public interface ClientServerNetManager$ClientReceiver<T extends Packet<T>> {
    public void onPacket(class04453 var1, T var2);
}

