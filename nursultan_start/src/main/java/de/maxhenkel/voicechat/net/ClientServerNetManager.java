/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  minecraft.class01683
 *  minecraft.class06202
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.net.Channel;
import de.maxhenkel.voicechat.net.ClientServerChannel;
import de.maxhenkel.voicechat.net.ClientServerNetManager$ClientReceiver;
import de.maxhenkel.voicechat.net.NetManager;
import de.maxhenkel.voicechat.net.Packet;
import minecraft.class01683;
import minecraft.class06202;

public abstract class ClientServerNetManager
extends NetManager {
    public static void sendToServer(Packet<?> packet) {
        class01683 class016832 = class06202.Nq().NE();
        if (class016832 != null && class016832.P() != null) {
            CommonCompatibilityManager.INSTANCE.getNetManager().sendToServerInternal(packet);
        }
    }

    public static <T extends Packet<T>> void setClientListener(Channel<T> channel, ClientServerNetManager$ClientReceiver<T> clientServerNetManager$ClientReceiver) {
        if (!(channel instanceof ClientServerChannel)) {
            throw new IllegalStateException("Channel is not a ClientServerChannel");
        }
        ClientServerChannel clientServerChannel = (ClientServerChannel)channel;
        clientServerChannel.setClientListener(clientServerNetManager$ClientReceiver);
    }
}

