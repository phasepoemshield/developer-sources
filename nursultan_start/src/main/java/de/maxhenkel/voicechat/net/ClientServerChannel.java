/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class04453
 *  minecraft.class06202
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.net.Channel;
import de.maxhenkel.voicechat.net.ClientServerNetManager$ClientReceiver;
import de.maxhenkel.voicechat.net.Packet;
import javax.annotation.Nullable;
import minecraft.class04453;
import minecraft.class06202;

public class ClientServerChannel<T extends Packet<T>>
extends Channel<T> {
    @Nullable
    private ClientServerNetManager$ClientReceiver<T> clientListener;

    public void onClientPacket(class04453 class044532, T t) {
        class06202.Nq().execute(() -> {
            if (this.clientListener != null) {
                this.clientListener.onPacket(class044532, (Packet)t);
            }
        });
    }

    public void setClientListener(ClientServerNetManager$ClientReceiver<T> clientServerNetManager$ClientReceiver) {
        this.clientListener = clientServerNetManager$ClientReceiver;
    }
}

