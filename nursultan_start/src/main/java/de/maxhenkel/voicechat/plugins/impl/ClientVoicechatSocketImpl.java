/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.ClientVoicechatSocket
 *  de.maxhenkel.voicechat.api.RawUdpPacket
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.ClientVoicechatSocket;
import de.maxhenkel.voicechat.api.RawUdpPacket;
import de.maxhenkel.voicechat.plugins.impl.VoicechatSocketBase;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;

public class ClientVoicechatSocketImpl
extends VoicechatSocketBase
implements ClientVoicechatSocket {
    private DatagramSocket socket;

    public RawUdpPacket read() throws Exception {
        if (this.socket == null) {
            throw new IllegalStateException("Socket not opened yet");
        }
        return this.read(this.socket);
    }

    public void close() {
        if (this.socket != null) {
            this.socket.close();
        }
    }

    public void open() throws Exception {
        this.socket = new DatagramSocket();
    }

    public void send(byte[] byArray, SocketAddress socketAddress) throws Exception {
        if (this.socket == null) {
            return;
        }
        this.socket.send(new DatagramPacket(byArray, byArray.length, socketAddress));
    }

    public boolean isClosed() {
        return this.socket == null;
    }
}

